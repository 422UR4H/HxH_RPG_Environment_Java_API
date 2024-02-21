package com.hxh_environment.api.domain.skills;

import java.util.ArrayList;

import com.hxh_environment.api.domain.enums.SkillName;
import com.hxh_environment.api.domain.experience.IUpgradable;

import lombok.Getter;

public abstract class Skill implements IUpgradable {
  @Getter
  private final SkillName name;

  @Getter
  private final ArrayList<Integer> expTable = new ArrayList<>();

  public Skill(SkillName name) {
    this.name = name;
  }
}
