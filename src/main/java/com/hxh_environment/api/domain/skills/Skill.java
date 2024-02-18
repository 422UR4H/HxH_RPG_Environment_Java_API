package com.hxh_environment.api.domain.skills;

import com.hxh_environment.api.domain.entity.Experience;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Skill {
  private final Experience exp;
  private final String name;

  public Skill(String name) {
    this.exp = new Experience();
    this.name = name;
  }
}
