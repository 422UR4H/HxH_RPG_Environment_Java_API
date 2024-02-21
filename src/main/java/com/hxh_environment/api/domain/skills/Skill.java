package com.hxh_environment.api.domain.skills;

import java.util.ArrayList;

import com.hxh_environment.api.domain.enums.SkillName;
import com.hxh_environment.api.domain.experience.Level;

import lombok.Getter;

public abstract class Skill extends Level {
  @Getter
  private final SkillName name;

  @Getter
  private final ArrayList<Integer> expTable = new ArrayList<>();

  public Skill(SkillName name) {
    super(0);
    this.name = name;
  }
}
