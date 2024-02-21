package com.hxh_environment.api.domain.attributes;

import java.util.ArrayList;
import java.util.List;

import com.hxh_environment.api.domain.experience.IUpgradable;

import lombok.Getter;

public class PrimaryAttribute implements IAttribute {
  @Getter
  private int exp;

  @Getter
  private int lvl;

  @Getter
  private final ArrayList<Integer> expTable = new ArrayList<>();

  private final ArrayList<IUpgradable> upgradables;

  public PrimaryAttribute(ArrayList<IUpgradable> upgradables, int exp) {
    this.upgradables = upgradables;
    this.exp = exp;
    this.lvl = 0;
  }
  
  public PrimaryAttribute(ArrayList<IUpgradable> upgradables) {
    this.upgradables = upgradables;
    this.exp = 0;
    this.lvl = 0;
  }
  
  public PrimaryAttribute(IUpgradable upgradable) {
    this.upgradables = new ArrayList<>(List.of(upgradable));
    this.exp = 0;
    this.lvl = 0;
  }

  @Override
  public final boolean increaseExp(int exp) {
    this.exp += exp;
    upgradables.forEach((u) -> u.increaseExp(exp));

    if (upgrade()) {
      return true;
    }
    return false;
  }

  @Override
  public final boolean upgrade() {
    int newLvl = calculateLvl();

    if (this.lvl != newLvl) {
      this.lvl = newLvl;
      return true;
    }
    return false;
  }

}
