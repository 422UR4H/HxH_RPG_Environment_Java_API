package com.hxh_environment.api.domain.physicals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.hxh_environment.api.domain.enums.AttributeName;
import com.hxh_environment.api.domain.experience.IUpgradable;

public class PhysicalAttributes {

  private final Map<AttributeName, PhysicalAttribute> attributes = new HashMap<>();

  public PhysicalAttributes(PhysicalExperience physicalExp) {

    attributes.put(AttributeName.DEF, new PhysicalAttribute(physicalExp));
    attributes.put(AttributeName.AGI, new PhysicalAttribute(physicalExp));
    attributes.put(AttributeName.ATS, new PhysicalAttribute(physicalExp));

    ArrayList<IUpgradable> dependencyListStr = new ArrayList<>();
    dependencyListStr.add(physicalExp);
    dependencyListStr.add(attributes.get(AttributeName.DEF));
    dependencyListStr.add(attributes.get(AttributeName.AGI));
    dependencyListStr.add(attributes.get(AttributeName.ATS));
    attributes.put(AttributeName.STR, new PhysicalAttribute(dependencyListStr));

    ArrayList<IUpgradable> dependencyListDex = new ArrayList<>();
    dependencyListDex.add(physicalExp);
    dependencyListDex.add(attributes.get(AttributeName.ATS));
    attributes.put(AttributeName.DEX, new PhysicalAttribute(dependencyListDex));

    ArrayList<IUpgradable> dependencyListCon = new ArrayList<>();
    dependencyListCon.add(physicalExp);
    dependencyListCon.add(attributes.get(AttributeName.DEF));
    attributes.put(AttributeName.CON, new PhysicalAttribute(dependencyListCon));

    ArrayList<IUpgradable> dependencyListVel = new ArrayList<>();
    dependencyListVel.add(physicalExp);
    dependencyListVel.add(attributes.get(AttributeName.AGI));
    attributes.put(AttributeName.VEL, new PhysicalAttribute(dependencyListVel));

    for (AttributeName name : attributes.keySet()) {
      attributes.get(name).init(0);
    }

    for (AttributeName name : attributes.keySet()) {
      attributes.get(name).init(0);
    }

  }

  public final PhysicalAttribute get(AttributeName name) {
    return attributes.get(name);
  }

}
