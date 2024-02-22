package com.hxh_environment.api.domain.spirituals;

import java.util.HashMap;
import java.util.Map;

import com.hxh_environment.api.domain.enums.AttributeName;

public class Hatsu extends SpiritualAttribute {

  private final Map<AttributeName, NenCategory> categories = new HashMap<>();

  private final void init() {
    categories.put(AttributeName.REF, new NenCategory(this));
    categories.put(AttributeName.TRS, new NenCategory(this));
    categories.put(AttributeName.EMS, new NenCategory(this));
    categories.put(AttributeName.MAN, new NenCategory(this));
    categories.put(AttributeName.MAT, new NenCategory(this));
    categories.put(AttributeName.ESP, new NenCategory(this));

    for (AttributeName name : categories.keySet()) {
      categories.get(name).init(0);
    }
  }

  public Hatsu(SpiritualExperience spiritualExp) {
    super(spiritualExp);
    init();
  }

  public final NenCategory get(AttributeName name) {
    return categories.get(name);
  }

}
