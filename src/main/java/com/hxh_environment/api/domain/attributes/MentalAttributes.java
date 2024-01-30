package com.hxh_environment.api.domain.attributes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hxh_environment.api.domain.entity.Experience;
import com.hxh_environment.api.domain.enums.AttributeName;

import lombok.Data;
import lombok.Getter;

@Data
public class MentalAttributes {
  @Getter
  private Experience exp;

  private Map<AttributeName, MentalAttribute> attributes = new HashMap<>();

  private final void initAttributes() {
    attributes.put(AttributeName.INT, new MentalAttribute(AttributeName.INT));
    attributes.put(AttributeName.CAR, new MentalAttribute(AttributeName.CAR));
    attributes.put(AttributeName.SEN, new MentalAttribute(AttributeName.SEN));
    attributes.put(AttributeName.RES, new MentalAttribute(AttributeName.RES));
  }

  private final void init() {
    this.exp = new Experience();
    initAttributes();
  }

  // TODO: implement skills here
  public MentalAttributes(List<Skill> skills) {
    init();
  }

  public int test(AttributeName name) {
    return attributes.get(name).test(exp.getLvl());
  }

  public MentalAttribute get(AttributeName name) {
    return attributes.get(name);
  }
}
