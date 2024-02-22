package com.hxh_environment.api.domain.mentals;

import java.util.ArrayList;

import com.hxh_environment.api.domain.attributes.Attribute;
import com.hxh_environment.api.domain.experience.IUpgradable;

import lombok.Getter;

public class MentalAttribute extends Attribute {

  @Getter
  private static final double COEFFICIENT = 3.0;

  public MentalAttribute(ArrayList<IUpgradable> upgradables) {
    super(upgradables, COEFFICIENT);
  }

  public MentalAttribute(IUpgradable upgradable) {
    super(upgradable, COEFFICIENT);
  }
  
}
