package com.hxh_environment.api.domain.spirituals;

import com.hxh_environment.api.domain.experience.CharacterExperience;
import com.hxh_environment.api.domain.experience.TypeExperience;

import lombok.Getter;

public class SpiritualExperience extends TypeExperience {

  @Getter
  private static final double COEFFICIENT = 5.0;

  public SpiritualExperience(CharacterExperience characterExp, int exp) {
    super(characterExp, exp, COEFFICIENT);
  }

  public SpiritualExperience(CharacterExperience characterExp) {
    super(characterExp, COEFFICIENT);
  }

}
