package com.hxh_environment.api.domain.skills;

import java.util.ArrayList;

import com.hxh_environment.api.domain.experience.Level;
import com.hxh_environment.api.domain.experience.TypeExperience;

import lombok.Getter;

public abstract class TypeSkills extends Level {

  @Getter
  private int exp;

  @Getter
  private final ArrayList<Integer> expTable = new ArrayList<>();

  private final SkillExperience skillExp;

  private final TypeExperience typeExp;

  public TypeSkills(double coefficient, SkillExperience skillExp, TypeExperience typeExp) {
    super(0, coefficient);
    this.skillExp = skillExp;
    this.typeExp = typeExp;
    this.exp = 0;
  }

  public TypeSkills(SkillExperience skillExp, TypeExperience typeExp) {
    super(0);
    this.skillExp = skillExp;
    this.typeExp = typeExp;
    this.exp = 0;
  }

  // TODO: refactor to upgrade event
  @Override
  public final boolean increaseExp(int exp) {
    this.exp += exp;
    this.skillExp.increaseExp(exp);
    this.typeExp.increaseExp(exp);

    if (upgrade()) {
      return true;
    }
    return false;
  }

  // TODO: refactor to upgrade event
  public final boolean onlyIncreaseSkillExp(int exp) {
    this.exp += exp;
    this.skillExp.increaseExp(exp);

    if (upgrade()) {
      return true;
    }
    return false;
  }

}
