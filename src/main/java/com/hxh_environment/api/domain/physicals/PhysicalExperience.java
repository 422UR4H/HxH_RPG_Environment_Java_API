package com.hxh_environment.api.domain.physicals;

import com.hxh_environment.api.domain.experience.CharacterExperience;
import com.hxh_environment.api.domain.experience.TypeExperience;

import lombok.Getter;

public class PhysicalExperience extends TypeExperience {

  @Getter
  private static final double COEFFICIENT = 20.0;

  public PhysicalExperience(CharacterExperience characterExp, int exp) {
    super(characterExp, exp, COEFFICIENT);
  }

  public PhysicalExperience(CharacterExperience characterExp) {
    super(characterExp, COEFFICIENT);
  }

}
