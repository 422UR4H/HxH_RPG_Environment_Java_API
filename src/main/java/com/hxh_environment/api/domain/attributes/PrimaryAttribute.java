package com.hxh_environment.api.domain.attributes;

import java.util.ArrayList;
import java.util.List;

import com.hxh_environment.api.domain.experience.IUpgradable;

import lombok.Getter;

public class PrimaryAttribute extends Attribute {
  @Getter
  private int exp;

  @Getter
  private final ArrayList<Integer> expTable = new ArrayList<>();

  private final ArrayList<IUpgradable> upgradables;

  public PrimaryAttribute(ArrayList<IUpgradable> upgradables, int exp) {
    super();
    this.upgradables = upgradables;
    this.exp = exp;
  }

  public PrimaryAttribute(ArrayList<IUpgradable> upgradables) {
    super();
    this.upgradables = upgradables;
    this.exp = 0;
  }

  public PrimaryAttribute(IUpgradable upgradable) {
    super();
    this.upgradables = new ArrayList<>(List.of(upgradable));
    this.exp = 0;
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

}
