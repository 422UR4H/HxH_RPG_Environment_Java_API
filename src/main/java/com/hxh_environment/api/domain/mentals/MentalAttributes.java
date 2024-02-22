package com.hxh_environment.api.domain.mentals;

import java.util.HashMap;
import java.util.Map;

import com.hxh_environment.api.domain.enums.AttributeName;

public class MentalAttributes {

  private final Map<AttributeName, MentalAttribute> attributes = new HashMap<>();

  public MentalAttributes(MentalExperience mentalExp) {
    attributes.put(AttributeName.INT, new MentalAttribute(mentalExp));
    attributes.put(AttributeName.CHA, new MentalAttribute(mentalExp));
    attributes.put(AttributeName.SEN, new MentalAttribute(mentalExp));
    attributes.put(AttributeName.RES, new MentalAttribute(mentalExp));
    attributes.put(AttributeName.WIS, new MentalAttribute(mentalExp));

    for (AttributeName name : attributes.keySet()) {
      attributes.get(name).init(0);
    }
  }

  public final MentalAttribute get(AttributeName name) {
    return attributes.get(name);
  }

}
