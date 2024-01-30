package com.hxh_environment.api.domain.attributes;

import java.util.Map;

import com.hxh_environment.api.domain.entity.Experience;
import com.hxh_environment.api.domain.enums.AttributeName;

public class Hatsu extends Attribute {
  private Map<AttributeName, Attribute> categories;

  private final void init() {
    categories.put(AttributeName.REF, new NenCategory(new Experience(), AttributeName.REF));
    categories.put(AttributeName.TRS, new NenCategory(new Experience(), AttributeName.TRS));
    categories.put(AttributeName.EMS, new NenCategory(new Experience(), AttributeName.EMS));
    categories.put(AttributeName.MAN, new NenCategory(new Experience(), AttributeName.MAN));
    categories.put(AttributeName.MAT, new NenCategory(new Experience(), AttributeName.MAT));
    categories.put(AttributeName.ESP, new NenCategory(new Experience(), AttributeName.ESP));
  }

  public Hatsu(Experience exp, AttributeName name) {
    super(exp, name);
    init();
  }

  public Hatsu(AttributeName name) {
    super(new Experience(), name);
    init();
  }

}
