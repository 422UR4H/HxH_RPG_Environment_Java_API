package com.hxh_environment.api.domain.skills;

import com.hxh_environment.api.domain.experience.CharacterExperience;
import com.hxh_environment.api.domain.experience.TypeExperience;

import lombok.Getter;

public class SkillExperience extends TypeExperience {

  @Getter
  private static final double COEFFICIENT = 5.0;

  public SkillExperience(CharacterExperience characterExp, int exp) {
    super(characterExp, exp, COEFFICIENT);
  }

  public SkillExperience(CharacterExperience characterExp) {
    super(characterExp, COEFFICIENT);
  }

  // TODO: Override initExpTable

}
