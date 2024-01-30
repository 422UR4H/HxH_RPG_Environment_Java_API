package com.hxh_environment.api.domain.entity;

import lombok.Getter;

public class Experience {
  @Getter
  private int points;

  // TODO: Implement exp table in constructors
  public Experience(int points) {
    this.points = points;
  }

  public Experience() {
    this.points = 0;
  }

  public int getLvl() {
    // TODO: Implement this
    return points;
  }

  public int getExpByLvl(int lvl) {
    // TODO: Implement this
    return points;
  }

  public int getCurrentExp() {
    // TODO: Implement this
    return points;
  }

  public int getExpToEvolve() {
    // TODO: Implement this
    return points;
  }

  public int increasePoints(int exp) {
    // TODO: Implement this
    this.points += exp;
    return this.points;
  }

  public void upgreade() {
    // TODO: Implement this

  }
}
