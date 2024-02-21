package com.hxh_environment.api.domain.experience;

import java.util.ArrayList;

import com.hxh_environment.api.domain.mentals.MentalExperience;
import com.hxh_environment.api.domain.physicals.PhysicalExperience;
import com.hxh_environment.api.domain.skills.SkillExperience;
import com.hxh_environment.api.domain.spirituals.SpiritualExperience;

import lombok.Getter;

public final class CharacterExperience extends Level {

  @Getter
  private int exp;
  @Getter
  private int talent;
  @Getter
  private final ArrayList<Integer> expTable = new ArrayList<>();
  @Getter
  private final SpiritualExperience spiritualExperience;
  @Getter
  private final PhysicalExperience physicalExperience;
  @Getter
  private final MentalExperience mentalExperience;
  @Getter
  private final SkillExperience skillExperience;

  public CharacterExperience(
      SpiritualExperience spiritual,
      PhysicalExperience physical,
      MentalExperience mental,
      SkillExperience skill) {

    super(1);

    // this.exp = spiritual.getExp() + physical.getExp() + mental.getExp() + skill.getExp();

    this.spiritualExperience = spiritual;
    this.physicalExperience = physical;
    this.mentalExperience = mental;
    this.skillExperience = skill;
    this.talent = 0;
    this.exp = 0;
  }

  // TODO: refactor to upgrade event
  @Override
  public final boolean increaseExp(int exp) {
    this.exp += exp;

    if (upgrade()) {
      return true;
    }
    return false;
  }

  // TODO: parameterize expTable to implement initExpTable

}
