package com.hxh_environment.api.domain.attributes;

import java.util.HashMap;
import java.util.Map;

import com.hxh_environment.api.domain.entity.Experience;
import com.hxh_environment.api.domain.enums.AttributeName;
import com.hxh_environment.api.domain.skills.Skill;

public class PhysicalAttribute extends PrimaryAttribute {
  private final Map<String, Skill> skills;

  public PhysicalAttribute(Experience exp, AttributeName name, HashMap<String, Skill> skills) {
    super(exp, name);
    this.skills = skills;
  }

  public PhysicalAttribute(Experience exp, AttributeName name) {
    super(exp, name);
    this.skills = new HashMap<>();
  }

  public PhysicalAttribute(AttributeName name, HashMap<String, Skill> skills) {
    super(name);
    this.skills = skills;
  }

  public PhysicalAttribute(AttributeName name) {
    super(name);
    this.skills = new HashMap<>();
  }

  public final Skill getSkill(String name) {
    return skills.get(name);
  }
}
