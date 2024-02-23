package com.hxh_environment.api.infrastructure.dtos;

import com.hxh_environment.api.domain.entity.Profile;

public class CharacterProfileDTOMapper {

  public Profile toDomainObj(CreateCharacterProfileDTO dto) {
    return new Profile(
        dto.getNickname(),
        dto.getFullname(),
        dto.getDescription(),
        dto.getBriefDescription(),
        dto.getBirthday());
  }

  public OutputCharacterProfileDTO toOutput(Profile domainObj) {
    return new OutputCharacterProfileDTO(
        domainObj.getNickname(),
        domainObj.getFullname(),
        domainObj.getDescription(),
        domainObj.getBriefDescription(),
        domainObj.getBirthday());
  }
}
