package com.hxh_environment.api.domain.attributes;

import java.util.HashMap;
import java.util.Map;

import com.hxh_environment.api.domain.entity.Experience;
import com.hxh_environment.api.domain.enums.AttributeName;

public class MentalAttribute extends Attribute {
  private final Map<String, Skill> skills;

  public MentalAttribute(Experience exp, AttributeName name, HashMap<String, Skill> skills) {
    super(exp, name);
    this.skills = skills;
  }

  public MentalAttribute(AttributeName name, HashMap<String, Skill> skills) {
    super(new Experience(), name);
    this.skills = skills;
  }

  public MentalAttribute(AttributeName name) {
    super(new Experience(), name);
    this.skills = new HashMap<>();
  }

  public final Skill getSkill(String name) {
    return skills.get(name);
  }
}
