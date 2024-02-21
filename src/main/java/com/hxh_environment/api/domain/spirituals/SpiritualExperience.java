package com.hxh_environment.api.domain.spirituals;

import com.hxh_environment.api.domain.experience.CharacterExperience;
import com.hxh_environment.api.domain.experience.TypeExperience;

public class SpiritualExperience extends TypeExperience {

  public SpiritualExperience(CharacterExperience characterExp, int exp) {
    super(characterExp, exp);
  }

  public SpiritualExperience(CharacterExperience characterExp) {
    super(characterExp);
  }

}
