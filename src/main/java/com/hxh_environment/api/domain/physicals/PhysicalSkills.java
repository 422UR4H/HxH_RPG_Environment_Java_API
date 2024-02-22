package com.hxh_environment.api.domain.physicals;

import java.util.HashMap;
import java.util.Map;

import com.hxh_environment.api.domain.enums.AttributeName;
import com.hxh_environment.api.domain.enums.SkillName;
import com.hxh_environment.api.domain.skills.PrimarySkill;
import com.hxh_environment.api.domain.skills.SkillExperience;
import com.hxh_environment.api.domain.skills.TypeSkills;

public class PhysicalSkills extends TypeSkills {

  private final Map<SkillName, PrimarySkill> skills = new HashMap<>();
  private final static double COEFFICIENT = 1.0;

  public PhysicalSkills(PhysicalAttributes attr, SkillExperience skillExp, PhysicalExperience physExp) {

    super(COEFFICIENT, skillExp, physExp);

    PhysicalAttribute str = attr.get(AttributeName.STR);
    skills.put(SkillName.CLIMB, new PrimarySkill(SkillName.CLIMB, str, this));
    skills.put(SkillName.PUSH, new PrimarySkill(SkillName.PUSH, str, this));
    skills.put(SkillName.PULL, new PrimarySkill(SkillName.PULL, str, this));
    skills.put(SkillName.GRAB, new PrimarySkill(SkillName.GRAB, str, this));

    PhysicalAttribute con = attr.get(AttributeName.CON);
    skills.put(SkillName.BREATH, new PrimarySkill(SkillName.BREATH, con, this));
    skills.put(SkillName.RESISTANCE, new PrimarySkill(SkillName.RESISTANCE, con, this));

    PhysicalAttribute vel = attr.get(AttributeName.VEL);
    skills.put(SkillName.JUMP, new PrimarySkill(SkillName.JUMP, vel, this));
    skills.put(SkillName.SWIM, new PrimarySkill(SkillName.SWIM, vel, this));

    PhysicalAttribute dex = attr.get(AttributeName.DEX);
    skills.put(SkillName.STEALTH, new PrimarySkill(SkillName.STEALTH, dex, this));
    skills.put(SkillName.SNEAK, new PrimarySkill(SkillName.SNEAK, dex, this));
    skills.put(SkillName.REFLEX, new PrimarySkill(SkillName.REFLEX, dex, this));
    skills.put(SkillName.ACCURACY, new PrimarySkill(SkillName.ACCURACY, dex, this));
    skills.put(SkillName.SLEIGHT_OF_HAND, new PrimarySkill(SkillName.SLEIGHT_OF_HAND, dex, this));

    skills.put(SkillName.ACROBATICS, new PrimarySkill(SkillName.ACROBATICS, null, this));

    for (SkillName name : skills.keySet()) {
      skills.get(name).init(0);
    }

  }

  public final PrimarySkill get(SkillName name) {
    return skills.get(name);
  }

}
