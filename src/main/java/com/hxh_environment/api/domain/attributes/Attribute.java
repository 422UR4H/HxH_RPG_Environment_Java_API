package com.hxh_environment.api.domain.attributes;

import java.util.ArrayList;
import java.util.List;

import com.hxh_environment.api.domain.experience.IUpgradable;
import com.hxh_environment.api.domain.experience.Level;

import lombok.Getter;

public abstract class Attribute extends Level {
  @Getter
  private int exp;

  @Getter
  private final ArrayList<Integer> expTable = new ArrayList<>();

  private final ArrayList<IUpgradable> upgradables;

  public Attribute(ArrayList<IUpgradable> upgradables, double coefficient) {
    super(0, coefficient);
    this.upgradables = upgradables;
    this.exp = 0;
  }

  public Attribute(IUpgradable upgradable, double coefficient) {
    super(0, coefficient);
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

  // public int test(int lvl) {
  // return Dice.attributeTest() + (int) Math.floor((lvl + getExp().getLvl() - 10)
  // / 2);
  // }
}
