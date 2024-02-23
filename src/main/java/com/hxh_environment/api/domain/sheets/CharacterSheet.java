package com.hxh_environment.api.domain.sheets;

import com.hxh_environment.api.domain.entity.Profile;
import com.hxh_environment.api.domain.experience.CharacterExperience;
import com.hxh_environment.api.domain.mentals.MentalAttributes;
import com.hxh_environment.api.domain.physicals.PhysicalAttributes;
import com.hxh_environment.api.domain.skills.CharacterSkills;
import com.hxh_environment.api.domain.spirituals.SpiritualAttributes;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class CharacterSheet {

  private final Profile profile;
  private final CharacterSkills skills;
  private final CharacterExperience exp;
  // private final CharacterClass characterClass;

  @Getter(AccessLevel.NONE)
  @Setter(AccessLevel.NONE)
  private final SpiritualAttributes spiritAttributes;

  @Getter(AccessLevel.NONE)
  @Setter(AccessLevel.NONE)
  private final PhysicalAttributes physAttributes;

  @Getter(AccessLevel.NONE)
  @Setter(AccessLevel.NONE)
  private final MentalAttributes mentalAttributes;

  public CharacterSheet(Profile profile) {
    this.profile = profile;

    this.exp = new CharacterExperience();
    this.exp.init(0);

    this.physAttributes = new PhysicalAttributes(exp.getPhysicalExperience());
    this.mentalAttributes = new MentalAttributes(exp.getMentalExperience());
    this.spiritAttributes = new SpiritualAttributes(exp.getSpiritualExperience());

    this.skills = new CharacterSkills(physAttributes, mentalAttributes, exp);
  }

  // public int spiritualTest(AttributeName name) {
  // return spiritAttributes.test(name);
  // }
}
