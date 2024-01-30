package com.hxh_environment.api.domain.attributes;

import java.util.HashMap;
import java.util.Map;

import com.hxh_environment.api.domain.entity.Experience;
import com.hxh_environment.api.domain.enums.AttributeName;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;

@Data
public class SpiritualAttributes {
  private final Experience exp;

  @Getter(AccessLevel.NONE)
  private final Map<AttributeName, SpiritualAttribute> attributes = new HashMap<>();

  private final void initAttributes() {
    attributes.put(AttributeName.SPR, new SpiritualAttribute(AttributeName.SPR));
    attributes.put(AttributeName.TEN, new SpiritualAttribute(AttributeName.TEN));
    attributes.put(AttributeName.ZTS, new SpiritualAttribute(AttributeName.ZTS));
    attributes.put(AttributeName.REN, new SpiritualAttribute(AttributeName.REN));
    attributes.put(AttributeName.GYO, new SpiritualAttribute(AttributeName.GYO));
    attributes.put(AttributeName.HTS, new SpiritualAttribute(AttributeName.HTS));
    attributes.put(AttributeName.RYU, new SpiritualAttribute(AttributeName.RYU));
    attributes.put(AttributeName.COA, new SpiritualAttribute(AttributeName.COA));
    attributes.put(AttributeName.KOU, new SpiritualAttribute(AttributeName.KOU));
    attributes.put(AttributeName.AOP, new SpiritualAttribute(AttributeName.AOP));
    attributes.put(AttributeName.MOP, new SpiritualAttribute(AttributeName.MOP));
    attributes.put(AttributeName.EN, new SpiritualAttribute(AttributeName.EN));
    attributes.put(AttributeName.IN, new SpiritualAttribute(AttributeName.IN));
  }

  public SpiritualAttributes() {
    this.exp = new Experience();
    initAttributes();
  }

  public final int test(AttributeName name) {
    return attributes.get(name).test(exp.getLvl());
  }

  public final SpiritualAttribute get(AttributeName name) {
    return attributes.get(name);
  }

}
