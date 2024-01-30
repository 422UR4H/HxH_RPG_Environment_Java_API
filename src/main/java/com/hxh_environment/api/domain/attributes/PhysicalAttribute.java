package com.hxh_environment.api.domain.attributes;

import java.util.HashMap;

import com.hxh_environment.api.domain.entity.Experience;
import com.hxh_environment.api.domain.enums.AttributeName;

public class PhysicalAttribute extends Attribute {
  public PhysicalAttribute(Experience exp, AttributeName name, HashMap<String, Skill> skills) {
    super(exp, name, skills);
  }

  public PhysicalAttribute(AttributeName name, HashMap<String, Skill> skills) {
    super(new Experience(), name, skills);
  }

  public PhysicalAttribute(AttributeName name) {
    super(new Experience(), name, new HashMap<String, Skill>());
  }
}
