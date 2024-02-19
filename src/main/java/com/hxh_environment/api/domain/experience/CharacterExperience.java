package com.hxh_environment.api.domain.experience;

import com.hxh_environment.api.domain.mentals.MentalExperience;
import com.hxh_environment.api.domain.physicals.PhysicalExperience;
import com.hxh_environment.api.domain.skills.SkillExperience;
import com.hxh_environment.api.domain.spirituals.SpiritualExperience;

import lombok.Data;

@Data
public class CharacterExperience extends Experience {

  private final SpiritualExperience spiritualExperience;
  private final PhysicalExperience physicalExperience;
  private final MentalExperience mentalExperience;
  private final SkillExperience skillExperience;

  public CharacterExperience() {
    super();

    this.spiritualExperience = new SpiritualExperience();
    this.physicalExperience = new PhysicalExperience();
    this.mentalExperience = new MentalExperience();
    this.skillExperience = new SkillExperience();
  }

  public CharacterExperience(
      SpiritualExperience spiritual,
      PhysicalExperience physical,
      MentalExperience mental,
      SkillExperience skill) {

    super(spiritual.getPoints() + physical.getPoints() + mental.getPoints() + skill.getPoints());

    this.spiritualExperience = spiritual;
    this.physicalExperience = physical;
    this.mentalExperience = mental;
    this.skillExperience = skill;
  }

  public void update(int points) {
    increasePoints(points);
  }

}
