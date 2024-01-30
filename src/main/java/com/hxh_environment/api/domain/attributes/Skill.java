package com.hxh_environment.api.domain.attributes;

import com.hxh_environment.api.domain.entity.Experience;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Skill {
  @Getter
  private Experience exp;

  @Getter
  private String name;

  public Skill(String name) {
    this.exp = new Experience();
    this.name = name;
  }
}
