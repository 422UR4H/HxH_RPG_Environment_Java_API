package com.hxh_environment.api.domain.attributes;

import com.hxh_environment.api.domain.entity.Dice;
import com.hxh_environment.api.domain.enums.AttributeName;
import com.hxh_environment.api.domain.experience.Experience;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Attribute {
  private Experience exp;
  private final AttributeName name;

  public int test(int lvl) {
    return Dice.attributeTest() + (int) Math.floor((lvl + getExp().getLvl() - 10) / 2);
  }
}
