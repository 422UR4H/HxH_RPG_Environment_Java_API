package com.hxh_environment.api.domain.mentals;

import java.util.HashMap;
import java.util.Map;

import com.hxh_environment.api.domain.attributes.PrimaryAttribute;
import com.hxh_environment.api.domain.enums.AttributeName;

public class MentalAttributes {

  private final Map<AttributeName, PrimaryAttribute> attributes = new HashMap<>();

  public MentalAttributes(MentalExperience mentalExp) {
    attributes.put(AttributeName.INT, new PrimaryAttribute(mentalExp));
    attributes.put(AttributeName.CHA, new PrimaryAttribute(mentalExp));
    attributes.put(AttributeName.SEN, new PrimaryAttribute(mentalExp));
    attributes.put(AttributeName.RES, new PrimaryAttribute(mentalExp));
    attributes.put(AttributeName.WIS, new PrimaryAttribute(mentalExp));

    for (AttributeName name : attributes.keySet()) {
      attributes.get(name).init(0);
    }
  }

  public final PrimaryAttribute get(AttributeName name) {
    return attributes.get(name);
  }

}
