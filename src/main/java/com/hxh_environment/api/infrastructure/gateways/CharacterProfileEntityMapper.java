package com.hxh_environment.api.infrastructure.gateways;

import com.hxh_environment.api.domain.entity.Profile;
import com.hxh_environment.api.infrastructure.persistence.CharacterProfileModel;

public class CharacterProfileEntityMapper {

  public CharacterProfileModel toEntity(Profile profileDomainObj) {
    return new CharacterProfileModel(profileDomainObj);
  }

  public Profile toDomainObj(CharacterProfileModel entity) {

    return new Profile(
        entity.getNickname(),
        entity.getFullname(),
        entity.getDescription(),
        entity.getBriefDescription(),
        entity.getBirthday());

  }

}
