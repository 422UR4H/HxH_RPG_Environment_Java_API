package com.hxh_environment.api.domain.attributes;

import java.util.HashMap;
import java.util.Map;

import com.hxh_environment.api.domain.entity.Experience;
import com.hxh_environment.api.domain.enums.AttributeName;

public class PhysicalAttribute extends Attribute {
  private Map<String, Skill> skills = new HashMap<>();

  public PhysicalAttribute(Experience exp, AttributeName name, HashMap<String, Skill> skills) {
    super(exp, name);
    this.skills = skills;
  }

  public PhysicalAttribute(AttributeName name, HashMap<String, Skill> skills) {
    super(new Experience(), name);
    this.skills = skills;
  }

  public PhysicalAttribute(AttributeName name) {
    super(new Experience(), name);
    this.skills = new HashMap<String, Skill>();
  }

  public Skill getSkill(String name) {
    return skills.get(name);
  }
}
