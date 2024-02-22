package com.hxh_environment.api.domain.spirituals;

import java.util.HashMap;
import java.util.Map;

import com.hxh_environment.api.domain.enums.AttributeName;

public class SpiritualAttributes {

  private final Map<AttributeName, SpiritualAttribute> attributes = new HashMap<>();

  public SpiritualAttributes(SpiritualExperience spiritualExp) {
    attributes.put(AttributeName.SPR, new SpiritualAttribute(spiritualExp));

    attributes.put(AttributeName.COA, new SpiritualAttribute(spiritualExp));
    attributes.put(AttributeName.TEN, new SpiritualAttribute(spiritualExp));
    attributes.put(AttributeName.ZTS, new SpiritualAttribute(spiritualExp));
    attributes.put(AttributeName.REN, new SpiritualAttribute(spiritualExp));
    attributes.put(AttributeName.GYO, new SpiritualAttribute(spiritualExp));

    attributes.put(AttributeName.HTS, new Hatsu(spiritualExp));

    attributes.put(AttributeName.RYU, new SpiritualAttribute(spiritualExp));
    attributes.put(AttributeName.KOU, new SpiritualAttribute(spiritualExp));
    attributes.put(AttributeName.AOP, new SpiritualAttribute(spiritualExp));
    attributes.put(AttributeName.MOP, new SpiritualAttribute(spiritualExp));
    attributes.put(AttributeName.EN, new SpiritualAttribute(spiritualExp));
    attributes.put(AttributeName.IN, new SpiritualAttribute(spiritualExp));

    for (AttributeName name : attributes.keySet()) {
      attributes.get(name).init(0);
    }
  }

  // public final int test(AttributeName name) {
  //  return attributes.get(name).test(getLvl());
  // }

  public final SpiritualAttribute get(AttributeName name) {
    return attributes.get(name);
  }

}
