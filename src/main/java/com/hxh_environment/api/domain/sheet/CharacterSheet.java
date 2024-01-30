package com.hxh_environment.api.domain.sheet;

import com.hxh_environment.api.domain.attributes.MentalAttributes;
import com.hxh_environment.api.domain.attributes.PhysicalAttributes;
import com.hxh_environment.api.domain.attributes.SpiritualAttributes;
import com.hxh_environment.api.domain.classes.CharacterClass;
import com.hxh_environment.api.domain.entity.Experience;
import com.hxh_environment.api.domain.entity.Profile;
import com.hxh_environment.api.domain.enums.AttributeName;

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
  private Experience exp;

  @Getter(AccessLevel.NONE)
  @Setter(AccessLevel.NONE)
  private SpiritualAttributes spiritAttributes;

  @Getter(AccessLevel.NONE)
  @Setter(AccessLevel.NONE)
  private PhysicalAttributes physAttributes;

  @Getter(AccessLevel.NONE)
  @Setter(AccessLevel.NONE)
  private MentalAttributes mentalAttributes;

  public int spiritualTest(AttributeName name) {
    return spiritAttributes.test(name);
  }

  public int physicalTest(AttributeName name) {
    return physAttributes.test(name);
  }

  public int mentalTest(AttributeName name) {
    return mentalAttributes.test(name);
  }
}
