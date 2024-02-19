package com.hxh_environment.api.domain.mentals;

import com.hxh_environment.api.domain.experience.IUpgradable;

import lombok.Getter;

public class MentalExperience implements IUpgradable {
  @Getter
  private int exp;

  public MentalExperience(int exp) {
    this.exp = exp;
  }

  public MentalExperience() {
    this.exp = 0;
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
