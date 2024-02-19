package com.hxh_environment.api.domain.skills;

import com.hxh_environment.api.domain.enums.SkillName;
import com.hxh_environment.api.domain.experience.Experience;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Skill {
  private final Experience exp;
  private final SkillName name;

  public Skill(SkillName name) {
    this.exp = new Experience();
    this.name = name;
  }
}
