package com.hxh_environment.api.domain.skills;

import com.hxh_environment.api.domain.enums.SkillName;
import com.hxh_environment.api.domain.experience.CharacterExperience;
import com.hxh_environment.api.domain.mentals.MentalAttributes;
import com.hxh_environment.api.domain.mentals.MentalSkills;
import com.hxh_environment.api.domain.physicals.PhysicalAttributes;
import com.hxh_environment.api.domain.physicals.PhysicalSkills;

import lombok.Getter;

public class CharacterSkills {
  @Getter
  private final PhysicalSkills physicalSkills;

  @Getter
  private final MentalSkills mentalSkills;

  public CharacterSkills(
      PhysicalAttributes physAttr,
      MentalAttributes mentalAttr,
      CharacterExperience charExp) {

    SkillExperience skillExp = charExp.getSkillExperience();
    this.physicalSkills = new PhysicalSkills(physAttr, skillExp, charExp.getPhysicalExperience());
    this.mentalSkills = new MentalSkills(mentalAttr, skillExp, charExp.getMentalExperience());

    physicalSkills.init(0);
    mentalSkills.init(0);
  }

  public final PrimarySkill get(SkillName name) {
    PrimarySkill skill = physicalSkills.get(name);

    if (skill == null) {
      skill = mentalSkills.get(name);
    }
    return skill;
  }
}
