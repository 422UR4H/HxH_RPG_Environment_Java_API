package com.hxh_environment.api.domain.spirituals;

import java.util.HashMap;
import java.util.Map;

import com.hxh_environment.api.domain.attributes.PrimaryAttribute;
import com.hxh_environment.api.domain.enums.AttributeName;
import com.hxh_environment.api.domain.experience.IUpgradable;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;

@Data
public class SpiritualAttributes implements IUpgradable {
  private final int exp;

  @Getter(AccessLevel.NONE)
  private final Map<AttributeName, PrimaryAttribute> attributes = new HashMap<>();

  private final void initAttributes() {
    attributes.put(AttributeName.SPR, new PrimaryAttribute());

    attributes.put(AttributeName.COA, new PrimaryAttribute());

    attributes.put(AttributeName.TEN, new PrimaryAttribute());
    attributes.put(AttributeName.ZTS, new PrimaryAttribute());
    attributes.put(AttributeName.REN, new PrimaryAttribute());
    attributes.put(AttributeName.GYO, new PrimaryAttribute());
    attributes.put(AttributeName.HTS, new PrimaryAttribute());

    attributes.put(AttributeName.RYU, new PrimaryAttribute());
    attributes.put(AttributeName.KOU, new PrimaryAttribute());
    attributes.put(AttributeName.AOP, new PrimaryAttribute());
    attributes.put(AttributeName.MOP, new PrimaryAttribute());
    attributes.put(AttributeName.EN, new PrimaryAttribute());
    attributes.put(AttributeName.IN, new PrimaryAttribute());
  }

  public SpiritualAttributes() {
    this.exp = 0;
    initAttributes();
  }

  public final int test(AttributeName name) {
    return attributes.get(name).test(getLvl());
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
