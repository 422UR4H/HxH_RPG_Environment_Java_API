package com.hxh_environment.api.domain.skills;

import com.hxh_environment.api.domain.experience.CharacterExperience;
import com.hxh_environment.api.domain.experience.TypeExperience;

public class SkillExperience extends TypeExperience {

  public SkillExperience(CharacterExperience characterExp, int exp) {
    super(characterExp, exp);
  }

  public SkillExperience(CharacterExperience characterExp) {
    super(characterExp);
  }

  // TODO: Override initExpTable

}
