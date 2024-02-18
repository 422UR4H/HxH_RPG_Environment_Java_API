package com.hxh_environment.api.domain.attributes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.hxh_environment.api.domain.entity.Experience;
import com.hxh_environment.api.domain.enums.AttributeName;

import lombok.Getter;

public class PhysicalAttributes {
  @Getter
  private Experience exp;

  private final Map<AttributeName, PrimaryAttribute> attributes = new HashMap<>();
  private final Map<AttributeName, GeneratedAttribute> genAttributes = new HashMap<>();

  private final void initAttributes() {
    attributes.put(AttributeName.STR, new PrimaryAttribute(AttributeName.STR));
    attributes.put(AttributeName.DEX, new PrimaryAttribute(AttributeName.DEX));
    attributes.put(AttributeName.CON, new PrimaryAttribute(AttributeName.CON));
    attributes.put(AttributeName.VEL, new PrimaryAttribute(AttributeName.VEL));

    ArrayList<PrimaryAttribute> dependencyListDef = new ArrayList<>();
    dependencyListDef.add(attributes.get(AttributeName.STR));
    dependencyListDef.add(attributes.get(AttributeName.CON));
    genAttributes.put(AttributeName.DEF, new GeneratedAttribute(AttributeName.DEF, dependencyListDef));

    ArrayList<PrimaryAttribute> dependencyListAgi = new ArrayList<>();
    dependencyListAgi.add(attributes.get(AttributeName.STR));
    dependencyListAgi.add(attributes.get(AttributeName.VEL));
    genAttributes.put(AttributeName.AGI, new GeneratedAttribute(AttributeName.AGI, dependencyListAgi));

    ArrayList<PrimaryAttribute> dependencyListAts = new ArrayList<>();
    dependencyListAts.add(attributes.get(AttributeName.STR));
    dependencyListAts.add(attributes.get(AttributeName.DEX));
    genAttributes.put(AttributeName.ATS, new GeneratedAttribute(AttributeName.ATS, dependencyListAts));
  }

  private final void init() {
    this.exp = new Experience();
    initAttributes();
  }

  public PhysicalAttributes() {
    init();
  }

  public final int test(AttributeName name) {
    return attributes.get(name).test(exp.getLvl());
  }

  public final PrimaryAttribute get(AttributeName name) {
    return attributes.get(name);
  }
}
