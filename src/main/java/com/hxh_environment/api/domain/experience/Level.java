package com.hxh_environment.api.domain.experience;

import lombok.Getter;

public abstract class Level implements IUpgradable {

  @Getter
  private int lvl;

  @Getter
  private final double coefficient;

  public Level(int lvl, double coefficient) {
    this.lvl = lvl;
    this.coefficient = coefficient;
  }

  public Level(int lvl) {
    this.lvl = lvl;
    this.coefficient = 1.0;
  }

  // TODO: refactor to upgrade event
  @Override
  public final boolean upgrade() {
    int newLvl = calculateLvl();

    if (this.lvl != newLvl) {
      this.lvl = newLvl;
      return true;
    }
    return false;
  }

}
