package com.hxh_environment.api.domain.mentals;

import java.util.HashMap;
import java.util.Map;

import com.hxh_environment.api.domain.enums.AttributeName;
import com.hxh_environment.api.domain.enums.SkillName;
import com.hxh_environment.api.domain.skills.PrimarySkill;
import com.hxh_environment.api.domain.skills.SkillExperience;
import com.hxh_environment.api.domain.skills.TypeSkills;

public class MentalSkills extends TypeSkills {

  private final Map<SkillName, PrimarySkill> skills = new HashMap<>();
  private final static double COEFFICIENT = 2.0;

  public MentalSkills(MentalAttributes attr, SkillExperience skillExp, MentalExperience mentalExp) {

    super(COEFFICIENT, skillExp, mentalExp);

    MentalAttribute wis = attr.get(AttributeName.WIS);
    skills.put(SkillName.HISTORY, new PrimarySkill(SkillName.HISTORY, wis, this));
    skills.put(SkillName.NATURE, new PrimarySkill(SkillName.NATURE, wis, this));
    skills.put(SkillName.MEMORY, new PrimarySkill(SkillName.MEMORY, wis, this));

    MentalAttribute _int = attr.get(AttributeName.INT);
    skills.put(SkillName.REASONING, new PrimarySkill(SkillName.REASONING, _int, this));
    skills.put(SkillName.INVESTIGATION, new PrimarySkill(SkillName.INVESTIGATION, _int, this));

    MentalAttribute sen = attr.get(AttributeName.SEN);
    skills.put(SkillName.INSIGHT, new PrimarySkill(SkillName.INSIGHT, sen, this));
    skills.put(SkillName.PERCEPTION, new PrimarySkill(SkillName.PERCEPTION, sen, this));

    MentalAttribute cha = attr.get(AttributeName.CHA);
    skills.put(SkillName.DECEPTION, new PrimarySkill(SkillName.DECEPTION, cha, this));
    skills.put(SkillName.INTIMIDATION, new PrimarySkill(SkillName.INTIMIDATION, cha, this));
    skills.put(SkillName.PERFORMANCE, new PrimarySkill(SkillName.PERFORMANCE, cha, this));
    skills.put(SkillName.PERSUASION, new PrimarySkill(SkillName.PERSUASION, cha, this));

    skills.put(SkillName.MEDICINE, new PrimarySkill(SkillName.MEDICINE, null, this));
    skills.put(SkillName.SURVIVAL, new PrimarySkill(SkillName.SURVIVAL, null, this));
    skills.put(SkillName.ANIMAL_HANDLER, new PrimarySkill(SkillName.ANIMAL_HANDLER, null, this));

    for (SkillName name : skills.keySet()) {
      skills.get(name).init(0);
    }

  }

  public final PrimarySkill get(SkillName name) {
    return skills.get(name);
  }

}
