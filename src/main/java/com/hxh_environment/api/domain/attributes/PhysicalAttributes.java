package com.hxh_environment.api.domain.attributes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hxh_environment.api.domain.entity.Experience;
import com.hxh_environment.api.domain.enums.AttributeName;

import lombok.Data;
import lombok.Getter;

@Data
public class PhysicalAttributes {
  @Getter
  private Experience exp;

  private Map<AttributeName, PhysicalAttribute> attributes = new HashMap<>();

  private final void init() {
    this.exp = new Experience();
    initAttributes();
  }

  private final void initAttributes() {
    attributes.put(AttributeName.STR, new PhysicalAttribute(AttributeName.STR));
    attributes.put(AttributeName.DEX, new PhysicalAttribute(AttributeName.DEX));
    attributes.put(AttributeName.CON, new PhysicalAttribute(AttributeName.CON));
  }

  public PhysicalAttributes() {
    init();
  }

  // TODO: implement this
  public PhysicalAttributes(List<Skill> skills) {
    init();
  }

  public PhysicalAttribute get(AttributeName name) {
    return attributes.get(name);
  }
}
