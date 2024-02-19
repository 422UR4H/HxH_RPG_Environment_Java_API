package com.hxh_environment.api.domain.spirituals;

import java.util.HashMap;
import java.util.Map;

import com.hxh_environment.api.domain.attributes.PrimaryAttribute;
import com.hxh_environment.api.domain.enums.AttributeName;
import com.hxh_environment.api.domain.experience.Experience;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;

@Data
public class SpiritualAttributes {
  private final Experience exp;

  @Getter(AccessLevel.NONE)
  private final Map<AttributeName, PrimaryAttribute> attributes = new HashMap<>();

  private final void initAttributes() {
    attributes.put(AttributeName.SPR, new PrimaryAttribute(AttributeName.SPR));

    attributes.put(AttributeName.COA, new PrimaryAttribute(AttributeName.COA));

    attributes.put(AttributeName.TEN, new PrimaryAttribute(AttributeName.TEN));
    attributes.put(AttributeName.ZTS, new PrimaryAttribute(AttributeName.ZTS));
    attributes.put(AttributeName.REN, new PrimaryAttribute(AttributeName.REN));
    attributes.put(AttributeName.GYO, new PrimaryAttribute(AttributeName.GYO));
    attributes.put(AttributeName.HTS, new PrimaryAttribute(AttributeName.HTS));

    attributes.put(AttributeName.RYU, new PrimaryAttribute(AttributeName.RYU));
    attributes.put(AttributeName.KOU, new PrimaryAttribute(AttributeName.KOU));
    attributes.put(AttributeName.AOP, new PrimaryAttribute(AttributeName.AOP));
    attributes.put(AttributeName.MOP, new PrimaryAttribute(AttributeName.MOP));
    attributes.put(AttributeName.EN, new PrimaryAttribute(AttributeName.EN));
    attributes.put(AttributeName.IN, new PrimaryAttribute(AttributeName.IN));
  }

  public SpiritualAttributes() {
    this.exp = new Experience();
    initAttributes();
  }

  public final int test(AttributeName name) {
    return attributes.get(name).test(exp.getLvl());
  }

  public final PrimaryAttribute get(AttributeName name) {
    return attributes.get(name);
  }

}
