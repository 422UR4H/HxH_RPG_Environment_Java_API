package com.hxh_environment.api.domain.experience;

import java.util.ArrayList;

import lombok.Getter;

public abstract class TypeExperience extends Level {
  @Getter
  private int exp;

  @Getter
  private final ArrayList<Integer> expTable = new ArrayList<>();

  private final CharacterExperience characterExp;

  public TypeExperience(CharacterExperience characterExp, int exp, double coefficient) {
    super(0, coefficient);
    this.characterExp = characterExp;
    this.exp = exp;
  }

  public TypeExperience(CharacterExperience characterExp, double coefficient) {
    super(0, coefficient);
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

}
