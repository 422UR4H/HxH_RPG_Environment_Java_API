package com.hxh_environment.api.domain.attributes;

import java.util.HashMap;
import java.util.Map;

import com.hxh_environment.api.domain.entity.Experience;
import com.hxh_environment.api.domain.enums.AttributeName;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public abstract class Attribute {
  @Getter
  private Experience exp;

  @Getter
  private AttributeName name;

  private Map<String, Skill> skills = new HashMap<>();

  public Skill getSkill(String name) {
    return skills.get(name);
  }
}
