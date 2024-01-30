package com.hxh_environment.api.domain.tools;

import java.util.ArrayList;

import com.hxh_environment.api.domain.entity.Dice;
import com.hxh_environment.api.domain.enums.EDice;

import lombok.Getter;

public class Weapon extends Tool implements IDamage {
  @Getter
  private int fixedDamage;

  public Weapon(String name, ArrayList<EDice> dices, int fixedDamage) {
    super(dices, name);
    this.fixedDamage = fixedDamage;
  }

  public int damage() {
    int diceDamage = 0;

    for (EDice dice : this.getDices()) {
      diceDamage += Dice.roll(dice);
    }
    return this.fixedDamage + diceDamage;
  }
}
