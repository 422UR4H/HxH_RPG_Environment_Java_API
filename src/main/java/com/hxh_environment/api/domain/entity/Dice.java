package com.hxh_environment.api.domain.entity;

import java.security.SecureRandom;

import com.hxh_environment.api.domain.enums.EDice;

public final class Dice {
  private static final SecureRandom random = new SecureRandom();

  public static final int roll(EDice d) {
    return 1 + random.nextInt(d.getSize());
  }

  public static final int attributeTest() {
    return roll(EDice.D10) + roll(EDice.D10);
  }
}
