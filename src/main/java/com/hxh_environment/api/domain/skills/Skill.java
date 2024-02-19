package com.hxh_environment.api.domain.skills;

import com.hxh_environment.api.domain.enums.SkillName;
import com.hxh_environment.api.domain.experience.IUpgradable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Skill implements IUpgradable {
  private final int exp;
  private final SkillName name;

  public Skill(SkillName name) {
    this.exp = 0;
    this.name = name;
  }
}
