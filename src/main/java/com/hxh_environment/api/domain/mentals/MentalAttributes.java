package com.hxh_environment.api.domain.mentals;

import java.util.HashMap;
import java.util.Map;

import com.hxh_environment.api.domain.attributes.PrimaryAttribute;
import com.hxh_environment.api.domain.enums.AttributeName;
import com.hxh_environment.api.domain.experience.IUpgradable;

import lombok.Getter;

public class MentalAttributes implements IUpgradable {
  @Getter
  private final int exp;

  private final Map<AttributeName, PrimaryAttribute> attributes = new HashMap<>();

  public MentalAttributes(int exp) {
    this.exp = exp;

    attributes.put(AttributeName.INT, new PrimaryAttribute());
    attributes.put(AttributeName.CHA, new PrimaryAttribute());
    attributes.put(AttributeName.SEN, new PrimaryAttribute());
    attributes.put(AttributeName.RES, new PrimaryAttribute());
    attributes.put(AttributeName.WIS, new PrimaryAttribute());
  }

  public final PrimaryAttribute get(AttributeName name) {
    return attributes.get(name);
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
