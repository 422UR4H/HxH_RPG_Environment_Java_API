package com.hxh_environment.api.domain.sheets;

import com.hxh_environment.api.domain.classes.CharacterClass;
import com.hxh_environment.api.domain.entity.Profile;
import com.hxh_environment.api.domain.experience.CharacterExperience;
import com.hxh_environment.api.domain.mentals.MentalAttributes;
import com.hxh_environment.api.domain.physicals.PhysicalAttributes;
import com.hxh_environment.api.domain.skills.CharacterSkills;
import com.hxh_environment.api.domain.spirituals.SpiritualAttributes;

import lombok.AllArgsConstructor;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
public class CharacterSheet {
  private String description;
  private CharacterClass characterClass;
  private Profile profile;
  private CharacterExperience exp;
  private CharacterSkills skills;

  @Getter(AccessLevel.NONE)
  @Setter(AccessLevel.NONE)
  private SpiritualAttributes spiritAttributes;

  @Getter(AccessLevel.NONE)
  @Setter(AccessLevel.NONE)
  private PhysicalAttributes physAttributes;

  @Getter(AccessLevel.NONE)
  @Setter(AccessLevel.NONE)
  private MentalAttributes mentalAttributes;

  // public int spiritualTest(AttributeName name) {
  // return spiritAttributes.test(name);
  // }
}
