package com.hxh_environment.api.domain.enums;

public enum AttributeName {
  STR("Strength", AttributeType.PHYSICAL),
  DEX("Dexteriry", AttributeType.PHYSICAL),
  CON("Constitution", AttributeType.PHYSICAL),
  VEL("Velocity", AttributeType.PHYSICAL),

  INT("Intelligence", AttributeType.MENTAL),
  CAR("Charisma", AttributeType.MENTAL),
  SEN("Sense", AttributeType.MENTAL),
  RES("Resilience", AttributeType.MENTAL),

  SPR("Spirit", AttributeType.SPIRITUAL),
  TEN("Ten", AttributeType.SPIRITUAL),
  ZTS("Zetsu", AttributeType.SPIRITUAL),
  REN("Ren", AttributeType.SPIRITUAL),
  GYO("Gyo", AttributeType.SPIRITUAL),
  HTS("Hatsu", AttributeType.SPIRITUAL),
  RYU("Ryu", AttributeType.SPIRITUAL),
  COA("Control of Aura", AttributeType.SPIRITUAL),
  IN("In", AttributeType.SPIRITUAL),
  EN("En", AttributeType.SPIRITUAL),
  KOU("Kou", AttributeType.SPIRITUAL),
  AOP("AOP", AttributeType.SPIRITUAL),
  MOP("MOP", AttributeType.SPIRITUAL),

  REF("Reinforcement", AttributeType.NEN_CATEGORY),
  TRS("Transformation", AttributeType.NEN_CATEGORY),
  EMS("Emission", AttributeType.NEN_CATEGORY),
  MAT("Materialization", AttributeType.NEN_CATEGORY),
  MAN("Manipulation", AttributeType.NEN_CATEGORY),
  ESP("Specialization", AttributeType.NEN_CATEGORY);

  private final AttributeType type;

  AttributeName(String name, AttributeType type) {
    this.type = type;
  }

  public AttributeType getType() {
    return type;
  }
}
