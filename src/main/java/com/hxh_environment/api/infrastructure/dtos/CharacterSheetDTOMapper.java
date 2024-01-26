package com.hxh_environment.api.infrastructure.dtos;

import com.hxh_environment.api.domain.entity.CharacterSheet;

public class CharacterSheetDTOMapper {
  public CharacterSheet toDomainObj(CreateCharacterSheetDTO dto) {
    return new CharacterSheet(dto.getDescription(), dto.getCharacterClass());
  }

  public OutputCharacterSheetDTO toOutput(CharacterSheet domainObj) {
    return new OutputCharacterSheetDTO(domainObj.getDescription(), domainObj.getCharacterClass());
  }
}
