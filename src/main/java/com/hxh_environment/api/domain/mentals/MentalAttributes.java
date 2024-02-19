package com.hxh_environment.api.domain.mentals;

import java.util.HashMap;
import java.util.Map;

import com.hxh_environment.api.domain.attributes.PrimaryAttribute;
import com.hxh_environment.api.domain.enums.AttributeName;
import com.hxh_environment.api.domain.experience.Experience;

import lombok.Getter;

public class MentalAttributes {
  @Getter
  private final Experience exp;

  private final Map<AttributeName, PrimaryAttribute> attributes = new HashMap<>();

  public MentalAttributes(Experience exp) {
    this.exp = exp;

    attributes.put(AttributeName.INT, new PrimaryAttribute(AttributeName.INT));
    attributes.put(AttributeName.CHA, new PrimaryAttribute(AttributeName.CHA));
    attributes.put(AttributeName.SEN, new PrimaryAttribute(AttributeName.SEN));
    attributes.put(AttributeName.RES, new PrimaryAttribute(AttributeName.RES));
    attributes.put(AttributeName.WIS, new PrimaryAttribute(AttributeName.WIS));
  }

  public final PrimaryAttribute get(AttributeName name) {
    return attributes.get(name);
  }
}
