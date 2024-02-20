package com.hxh_environment.api.domain.experience;

import java.util.ArrayList;

import lombok.Getter;

public abstract class TypeExperience implements IUpgradable {
  @Getter
  private int exp;

  @Getter
  private int lvl;

  @Getter
  private final ArrayList<Integer> expTable = new ArrayList<>();

  private final CharacterExperience characterExp;

  public TypeExperience(CharacterExperience characterExp, int exp) {
    this.characterExp = characterExp;
    this.exp = exp;
  }

  public TypeExperience(CharacterExperience characterExp) {
    this.characterExp = characterExp;
    this.exp = 0;
  }

  // TODO: refactor to upgrade event
  @Override
  public final boolean increaseExp(int exp) {
    this.exp += exp;
    this.characterExp.increaseExp(exp);

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
