package com.hxh_environment.api.domain.physicals;

import java.util.HashMap;
import java.util.Map;

import com.hxh_environment.api.domain.enums.AttributeName;
import com.hxh_environment.api.domain.enums.SkillName;
import com.hxh_environment.api.domain.experience.IUpgradable;
import com.hxh_environment.api.domain.skills.PrimarySkill;

import lombok.Getter;

public class PhysicalSkills implements IUpgradable {
  @Getter
  private final int exp;

  private final Map<SkillName, PrimarySkill> skills = new HashMap<>();

  public PhysicalSkills(PhysicalAttributes attr) {

    this.exp = 0;

    skills.put(SkillName.CLIMB, new PrimarySkill(SkillName.CLIMB, attr.get(AttributeName.STR)));
    skills.put(SkillName.PUSH, new PrimarySkill(SkillName.PUSH, attr.get(AttributeName.STR)));
    skills.put(SkillName.PULL, new PrimarySkill(SkillName.PULL, attr.get(AttributeName.STR)));
    skills.put(SkillName.GRAB, new PrimarySkill(SkillName.GRAB, attr.get(AttributeName.STR)));

    skills.put(SkillName.BREATH, new PrimarySkill(SkillName.BREATH, attr.get(AttributeName.CON)));
    skills.put(SkillName.RESISTANCE, new PrimarySkill(SkillName.RESISTANCE, attr.get(AttributeName.CON)));

    skills.put(SkillName.JUMP, new PrimarySkill(SkillName.JUMP, attr.get(AttributeName.VEL)));
    skills.put(SkillName.SWIM, new PrimarySkill(SkillName.SWIM, attr.get(AttributeName.VEL)));

    skills.put(SkillName.STEALTH, new PrimarySkill(SkillName.STEALTH, attr.get(AttributeName.DEX)));
    skills.put(SkillName.SNEAK, new PrimarySkill(SkillName.SNEAK, attr.get(AttributeName.DEX)));
    skills.put(SkillName.REFLEX, new PrimarySkill(SkillName.REFLEX, attr.get(AttributeName.DEX)));
    skills.put(SkillName.ACCURACY, new PrimarySkill(SkillName.ACCURACY, attr.get(AttributeName.DEX)));
    skills.put(SkillName.SLEIGHT_OF_HAND, new PrimarySkill(SkillName.SLEIGHT_OF_HAND, attr.get(AttributeName.DEX)));

    skills.put(SkillName.ACROBATICS, new PrimarySkill(SkillName.ACROBATICS, null));

  }

  public final PrimarySkill get(SkillName name) {
    return skills.get(name);
  }

  @Override
  public int getLvl() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getLvl'");
  }

  @Override
  public int getCurrentExp() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getCurrentExp'");
  }

  @Override
  public int getExpToEvolve() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getExpToEvolve'");
  }

  @Override
  public int increasePoints(int exp) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'increasePoints'");
  }

  @Override
  public void upgreade() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'upgreade'");
  }

}
