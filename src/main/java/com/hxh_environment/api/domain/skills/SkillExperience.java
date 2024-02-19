package com.hxh_environment.api.domain.skills;

import java.util.ArrayList;

import com.hxh_environment.api.domain.experience.IUpgradable;

import lombok.Data;

@Data
public class SkillExperience implements IUpgradable {

  private int exp;
  private final ArrayList<PrimarySkill> primarySkills = new ArrayList<>();
  // private Experience exp;

  private final int getPrimaryAttrSum() {
    int sum = 0;
    for (PrimarySkill attr : this.primarySkills) {
      sum += attr.getExp();
    }
    return sum;
  }

  public void update(int points) {
    increasePoints(points);
  }

  public void addPrimarySkill(PrimarySkill skill) {
    primarySkills.add(skill);
  }

  public void removePrimarySkill(PrimarySkill skill) {
    primarySkills.remove(skill);
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
