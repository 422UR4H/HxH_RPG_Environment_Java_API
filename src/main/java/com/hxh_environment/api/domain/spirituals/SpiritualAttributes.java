package com.hxh_environment.api.domain.spirituals;

import java.util.HashMap;
import java.util.Map;

import com.hxh_environment.api.domain.attributes.PrimaryAttribute;
import com.hxh_environment.api.domain.enums.AttributeName;

public class SpiritualAttributes {

  private final Map<AttributeName, PrimaryAttribute> attributes = new HashMap<>();

  private SpiritualAttributes(SpiritualExperience spiritualExp) {
    attributes.put(AttributeName.SPR, new PrimaryAttribute(spiritualExp));

    attributes.put(AttributeName.COA, new PrimaryAttribute(spiritualExp));

    attributes.put(AttributeName.TEN, new PrimaryAttribute(spiritualExp));
    attributes.put(AttributeName.ZTS, new PrimaryAttribute(spiritualExp));
    attributes.put(AttributeName.REN, new PrimaryAttribute(spiritualExp));
    attributes.put(AttributeName.GYO, new PrimaryAttribute(spiritualExp));
    attributes.put(AttributeName.HTS, new PrimaryAttribute(spiritualExp));

    attributes.put(AttributeName.RYU, new PrimaryAttribute(spiritualExp));
    attributes.put(AttributeName.KOU, new PrimaryAttribute(spiritualExp));
    attributes.put(AttributeName.AOP, new PrimaryAttribute(spiritualExp));
    attributes.put(AttributeName.MOP, new PrimaryAttribute(spiritualExp));
    attributes.put(AttributeName.EN, new PrimaryAttribute(spiritualExp));
    attributes.put(AttributeName.IN, new PrimaryAttribute(spiritualExp));
  }

  // public final int test(AttributeName name) {
  //   return attributes.get(name).test(getLvl());
  // }

  public final PrimaryAttribute get(AttributeName name) {
    return attributes.get(name);
  }

}
