package com.hxh_environment.api.domain.attributes;

import java.util.ArrayList;

import com.hxh_environment.api.domain.experience.IUpgradable;

import lombok.Getter;

public class GeneratedAttribute extends Attribute {
  @Getter
  private int exp;

  @Getter
  private final ArrayList<Integer> expTable = new ArrayList<>();

  private final IUpgradable typeExperience;

  public GeneratedAttribute(IUpgradable typeExperience, int exp) {
    super();
    this.typeExperience = typeExperience;
    this.exp = exp;
  }

  public GeneratedAttribute(IUpgradable typeExperience) {
    super();
    this.typeExperience = typeExperience;
    this.exp = 0;
  }

  @Override
  public final boolean increaseExp(int exp) {
    this.exp += exp;
    typeExperience.increaseExp(exp);

    if (upgrade()) {
      return true;
    }
    return false;
  }

  // TODO: parameterize expTable to double exp per level

}
