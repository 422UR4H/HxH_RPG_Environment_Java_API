package com.hxh_environment.api.domain.attributes;

import java.util.Map;

import com.hxh_environment.api.domain.enums.AttributeName;

import lombok.Getter;

public class Hatsu implements IAttribute {
  @Getter
  private int exp;
  private Map<AttributeName, NenCategory> categories;

  private final void init() {
    categories.put(AttributeName.REF, new NenCategory());
    categories.put(AttributeName.TRS, new NenCategory());
    categories.put(AttributeName.EMS, new NenCategory());
    categories.put(AttributeName.MAN, new NenCategory());
    categories.put(AttributeName.MAT, new NenCategory());
    categories.put(AttributeName.ESP, new NenCategory());
  }

  public Hatsu(int exp) {
    this.exp = exp;
    init();
  }

  public Hatsu() {
    this.exp = 0;
    init();
  }

  public final NenCategory get(AttributeName name) {
    return categories.get(name);
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
