package com.hxh_environment.api.domain.attributes;

import java.util.ArrayList;

import com.hxh_environment.api.domain.experience.IUpgradable;

import lombok.Getter;

public class MixedAttribute extends Attribute {
  @Getter
  private int exp;

  @Getter
  private final ArrayList<Integer> expTable = new ArrayList<>();

  private final ArrayList<IUpgradable> upgradables;

  public MixedAttribute(ArrayList<IUpgradable> upgradables, int exp) {
    super();
    this.upgradables = upgradables;
    this.exp = exp;
  }

  public MixedAttribute(ArrayList<IUpgradable> upgradables) {
    super();
    this.upgradables = upgradables;
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

  // TODO: parameterize expTable to double exp per level

}
