package com.hxh_environment.api.domain.skills;

import com.hxh_environment.api.domain.attributes.Attribute;
import com.hxh_environment.api.domain.enums.SkillName;

import lombok.Getter;

public class PrimarySkill extends Skill {

  @Getter
  private int exp;

  private final Attribute attribute;

  private final TypeSkills typeSkills;

  public PrimarySkill(SkillName name, Attribute attribute, TypeSkills typeSkills) {
    super(name);
    this.exp = 0;
    this.attribute = attribute;
    this.typeSkills = typeSkills;
  }

  // TODO: refactor to upgrade event
  @Override
  public final boolean increaseExp(int exp) {
    this.exp += exp;
    this.attribute.increaseExp(exp);
    this.typeSkills.onlyIncreaseSkillExp(exp);

    if (upgrade()) {
      return true;
    }
    return false;
  }

  // public int test(int lvl) {
  // return Dice.attributeTest() + attribute.getLvl() + (int) Math.floor(lvl / 2);
  // }

}
