package com.hxh_environment.api.domain.classes;

import java.util.HashMap;
import java.util.Map;

import com.hxh_environment.api.domain.enums.ClassName;
import com.hxh_environment.api.domain.physicals.PhysicalAttributes;
import com.hxh_environment.api.domain.tools.Weapon;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CharacterClass {
  private ClassName name;
  private String description;
  private PhysicalAttributes physAttributes;
  private Map<String, Weapon> weapons = new HashMap<>();
  // TODO: skillClass
}
