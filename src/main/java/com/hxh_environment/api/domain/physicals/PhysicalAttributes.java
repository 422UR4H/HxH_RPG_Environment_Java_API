package com.hxh_environment.api.domain.physicals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.hxh_environment.api.domain.attributes.GeneratedAttribute;
import com.hxh_environment.api.domain.attributes.PrimaryAttribute;
import com.hxh_environment.api.domain.enums.AttributeName;
import com.hxh_environment.api.domain.experience.IUpgradable;

public class PhysicalAttributes {

  private final Map<AttributeName, PrimaryAttribute> attributes = new HashMap<>();
  private final Map<AttributeName, GeneratedAttribute> genAttributes = new HashMap<>();

  public PhysicalAttributes(PhysicalExperience physicalExp) {

    genAttributes.put(AttributeName.DEF, new GeneratedAttribute(physicalExp));
    genAttributes.put(AttributeName.AGI, new GeneratedAttribute(physicalExp));
    genAttributes.put(AttributeName.ATS, new GeneratedAttribute(physicalExp));

    ArrayList<IUpgradable> dependencyListStr = new ArrayList<>();
    dependencyListStr.add(physicalExp);
    dependencyListStr.add(genAttributes.get(AttributeName.DEF));
    dependencyListStr.add(genAttributes.get(AttributeName.AGI));
    dependencyListStr.add(genAttributes.get(AttributeName.ATS));
    attributes.put(AttributeName.STR, new PrimaryAttribute(dependencyListStr));

    ArrayList<IUpgradable> dependencyListDex = new ArrayList<>();
    dependencyListDex.add(physicalExp);
    dependencyListDex.add(genAttributes.get(AttributeName.ATS));
    attributes.put(AttributeName.DEX, new PrimaryAttribute(dependencyListDex));

    ArrayList<IUpgradable> dependencyListCon = new ArrayList<>();
    dependencyListCon.add(physicalExp);
    dependencyListCon.add(genAttributes.get(AttributeName.DEF));
    attributes.put(AttributeName.CON, new PrimaryAttribute(dependencyListCon));

    ArrayList<IUpgradable> dependencyListVel = new ArrayList<>();
    dependencyListVel.add(physicalExp);
    dependencyListVel.add(genAttributes.get(AttributeName.AGI));
    attributes.put(AttributeName.VEL, new PrimaryAttribute(dependencyListVel));

    for (AttributeName name : attributes.keySet()) {
      attributes.get(name).init(0);
    }

    for (AttributeName name : genAttributes.keySet()) {
      genAttributes.get(name).init(0);
    }

  }

  public final PrimaryAttribute get(AttributeName name) {
    return attributes.get(name);
  }

  public final GeneratedAttribute getGen(AttributeName name) {
    return genAttributes.get(name);
  }
}
