package com.hxh_environment.api.domain.attributes;

import java.util.HashMap;
import java.util.Map;

import com.hxh_environment.api.domain.entity.Experience;
import com.hxh_environment.api.domain.enums.AttributeName;

import lombok.Getter;

public class MentalAttributes {
  @Getter
  private Experience exp;

  private final Map<AttributeName, PrimaryAttribute> attributes = new HashMap<>();

  private final void initAttributes() {
    attributes.put(AttributeName.INT, new PrimaryAttribute(AttributeName.INT));
    attributes.put(AttributeName.CHA, new PrimaryAttribute(AttributeName.CHA));
    attributes.put(AttributeName.SEN, new PrimaryAttribute(AttributeName.SEN));
    attributes.put(AttributeName.RES, new PrimaryAttribute(AttributeName.RES));
    attributes.put(AttributeName.WIS, new PrimaryAttribute(AttributeName.WIS));
  }

  private final void init() {
    this.exp = new Experience();
    initAttributes();
  }

  public MentalAttributes() {
    init();
  }

  public final int test(AttributeName name) {
    return attributes.get(name).test(exp.getLvl());
  }

  public final PrimaryAttribute get(AttributeName name) {
    return attributes.get(name);
  }
}
