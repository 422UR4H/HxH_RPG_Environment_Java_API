package com.hxh_environment.api.domain.sheet;

import com.hxh_environment.api.domain.attributes.MentalAttributes;
import com.hxh_environment.api.domain.attributes.PhysicalAttributes;
import com.hxh_environment.api.domain.attributes.SpiritualAttributes;
import com.hxh_environment.api.domain.classes.CharacterClass;
import com.hxh_environment.api.domain.entity.Experience;
import com.hxh_environment.api.domain.entity.Profile;
import com.hxh_environment.api.domain.enums.AttributeName;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class CharacterSheet {
  @Getter
  @Setter
  private String description;

  @Getter
  @Setter
  private CharacterClass characterClass;

  @Getter
  @Setter
  private Profile profile;

  @Getter
  @Setter
  private Experience exp;

  private SpiritualAttributes spiritAttributes;
  private PhysicalAttributes physAttributes;
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
