package com.hxh_environment.api.domain.physicals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.hxh_environment.api.domain.attributes.GeneratedAttribute;
import com.hxh_environment.api.domain.attributes.PrimaryAttribute;
import com.hxh_environment.api.domain.enums.AttributeName;
import com.hxh_environment.api.domain.experience.IUpgradable;

import lombok.Getter;

public class PhysicalAttributes implements IUpgradable {
  @Getter
  private final int exp;

  private final Map<AttributeName, PrimaryAttribute> attributes = new HashMap<>();
  private final Map<AttributeName, GeneratedAttribute> genAttributes = new HashMap<>();

  public PhysicalAttributes(int exp) {

    this.exp = exp;

    attributes.put(AttributeName.STR, new PrimaryAttribute());
    attributes.put(AttributeName.DEX, new PrimaryAttribute());
    attributes.put(AttributeName.CON, new PrimaryAttribute());
    attributes.put(AttributeName.VEL, new PrimaryAttribute());

    ArrayList<PrimaryAttribute> dependencyListDef = new ArrayList<>();
    dependencyListDef.add(attributes.get(AttributeName.STR));
    dependencyListDef.add(attributes.get(AttributeName.CON));
    genAttributes.put(AttributeName.DEF, new GeneratedAttribute(dependencyListDef));

    ArrayList<PrimaryAttribute> dependencyListAgi = new ArrayList<>();
    dependencyListAgi.add(attributes.get(AttributeName.STR));
    dependencyListAgi.add(attributes.get(AttributeName.VEL));
    genAttributes.put(AttributeName.AGI, new GeneratedAttribute(dependencyListAgi));

    ArrayList<PrimaryAttribute> dependencyListAts = new ArrayList<>();
    dependencyListAts.add(attributes.get(AttributeName.STR));
    dependencyListAts.add(attributes.get(AttributeName.DEX));
    genAttributes.put(AttributeName.ATS, new GeneratedAttribute(dependencyListAts));

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
