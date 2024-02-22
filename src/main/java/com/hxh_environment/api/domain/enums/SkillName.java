package com.hxh_environment.api.domain.enums;

public enum SkillName {
  CLIMB("Climb", AttributeName.STR),
  PUSH("Push", AttributeName.STR),
  PULL("Pull", AttributeName.STR),
  GRAB("Grab", AttributeName.STR),

  BREATH("Breath", AttributeName.CON),
  RESISTANCE("Resistance", AttributeName.CON),

  JUMP("Jump", AttributeName.VEL),
  SWIM("Swim", AttributeName.VEL),

  STEALTH("Stealth", AttributeName.DEX),
  SNEAK("Sneak", AttributeName.DEX),
  REFLEX("Reflex", AttributeName.DEX),
  ACCURACY("Accuracy", AttributeName.DEX),
  SLEIGHT_OF_HAND("Sleight of Hand", AttributeName.DEX),
  // HIDE("Hide", AttributeName.DEX),

  HISTORY("History", AttributeName.WIS),
  NATURE("Nature", AttributeName.WIS),
  MEMORY("Memory", AttributeName.WIS),

  REASONING("Reasoning", AttributeName.INT),
  INVESTIGATION("Investigation", AttributeName.INT),

  INSIGHT("Insight", AttributeName.SEN),
  PERCEPTION("Perception", AttributeName.SEN),

  DECEPTION("Deception", AttributeName.CHA),
  INTIMIDATION("Intimidation", AttributeName.CHA),
  PERFORMANCE("Performance", AttributeName.CHA),
  PERSUASION("Persuasion", AttributeName.CHA),

  FOCUS("Focus", AttributeName.SPR),
  CONSCIENCE("Conscience", AttributeName.SPR),

  MEDICINE("Medicine", null),
  SURVIVAL("Survival", null),
  ACROBATICS("Acrobatics", null),
  ANIMAL_HANDLER("Animal Handler", null);

  private final AttributeName attribute;

  SkillName(String name, AttributeName attribute) {
    this.attribute = attribute;
  }

  public AttributeName getAttributeName() {
    return attribute;
  }
}
