package com.hxh_environment.api.domain.experience;

import com.hxh_environment.api.domain.mentals.MentalExperience;
import com.hxh_environment.api.domain.physicals.PhysicalExperience;
import com.hxh_environment.api.domain.skills.SkillExperience;
import com.hxh_environment.api.domain.spirituals.SpiritualExperience;

import lombok.Getter;

public final class CharacterExperience implements IUpgradable {

  @Getter
  private int exp;
  @Getter
  private final SpiritualExperience spiritualExperience;
  @Getter
  private final PhysicalExperience physicalExperience;
  @Getter
  private final MentalExperience mentalExperience;
  @Getter
  private final SkillExperience skillExperience;

  public CharacterExperience() {
    this.exp = 0;

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

    this.exp = spiritual.getExp() + physical.getExp() + mental.getExp() + skill.getExp();

    this.spiritualExperience = spiritual;
    this.physicalExperience = physical;
    this.mentalExperience = mental;
    this.skillExperience = skill;
  }

  public void update(int points) {
    increasePoints(points);
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
