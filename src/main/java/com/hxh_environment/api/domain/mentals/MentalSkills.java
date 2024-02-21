package com.hxh_environment.api.domain.mentals;

import java.util.HashMap;
import java.util.Map;

import com.hxh_environment.api.domain.enums.AttributeName;
import com.hxh_environment.api.domain.enums.SkillName;
import com.hxh_environment.api.domain.experience.IUpgradable;
import com.hxh_environment.api.domain.skills.PrimarySkill;

import lombok.Getter;

public class MentalSkills implements IUpgradable {
  @Getter
  private final int exp;

  private final Map<SkillName, PrimarySkill> skills = new HashMap<>();

  public MentalSkills(MentalAttributes attr) {

    this.exp = 0;

    skills.put(SkillName.HISTORY, new PrimarySkill(SkillName.HISTORY, attr.get(AttributeName.WIS)));
    skills.put(SkillName.NATURE, new PrimarySkill(SkillName.NATURE, attr.get(AttributeName.WIS)));
    skills.put(SkillName.MEMORY, new PrimarySkill(SkillName.MEMORY, attr.get(AttributeName.WIS)));

    skills.put(SkillName.REASONING, new PrimarySkill(SkillName.REASONING, attr.get(AttributeName.INT)));
    skills.put(SkillName.INVESTIGATION, new PrimarySkill(SkillName.INVESTIGATION, attr.get(AttributeName.INT)));

    skills.put(SkillName.INSIGHT, new PrimarySkill(SkillName.INSIGHT, attr.get(AttributeName.SEN)));
    skills.put(SkillName.PERCEPTION, new PrimarySkill(SkillName.PERCEPTION, attr.get(AttributeName.SEN)));

    skills.put(SkillName.DECEPTION, new PrimarySkill(SkillName.DECEPTION, attr.get(AttributeName.CHA)));
    skills.put(SkillName.INTIMIDATION, new PrimarySkill(SkillName.INTIMIDATION, attr.get(AttributeName.CHA)));
    skills.put(SkillName.PERFORMANCE, new PrimarySkill(SkillName.PERFORMANCE, attr.get(AttributeName.CHA)));
    skills.put(SkillName.PERSUASION, new PrimarySkill(SkillName.PERSUASION, attr.get(AttributeName.CHA)));

    skills.put(SkillName.MEDICINE, new PrimarySkill(SkillName.MEDICINE, null));
    skills.put(SkillName.SURVIVAL, new PrimarySkill(SkillName.SURVIVAL, null));
    skills.put(SkillName.ANIMAL_HANDLER, new PrimarySkill(SkillName.ANIMAL_HANDLER, null));
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
  public int increaseExp(int exp) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'increasePoints'");
  }

  @Override
  public void upgrade() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'upgreade'");
  }

}
