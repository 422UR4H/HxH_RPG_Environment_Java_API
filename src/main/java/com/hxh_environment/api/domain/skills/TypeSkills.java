package com.hxh_environment.api.domain.skills;

import com.hxh_environment.api.domain.experience.Level;

import lombok.Getter;

public abstract class TypeSkills extends Level {

  @Getter
  private int exp;

  private final SkillExperience skillExp;

  public TypeSkills(double coefficient, SkillExperience skillExp) {
    super(0, coefficient);
    this.skillExp = skillExp;
    this.exp = 0;
  }
  
  public TypeSkills(SkillExperience skillExp) {
    super(0);
    this.skillExp = skillExp;
    this.exp = 0;
  }

  // TODO: refactor to upgrade event
  @Override
  public final boolean increaseExp(int exp) {
    this.exp += exp;
    this.skillExp.increaseExp(exp);

    if (upgrade()) {
      return true;
    }
    return false;
  }

}
