package com.hxh_environment.api.infrastructure.gateways;

import com.hxh_environment.api.domain.entity.CharacterSheet;
import com.hxh_environment.api.infrastructure.persistence.CharacterSheetModel;

public class CharacterSheetEntityMapper {
  CharacterSheetModel toEntity(CharacterSheet characterSheetDomainObj) {
    return new CharacterSheetModel(characterSheetDomainObj.getDescription(),
        characterSheetDomainObj.getCharacterClass());
  }

  CharacterSheet toDomainObj(CharacterSheetModel entity) {
    return new CharacterSheet(entity.getDescription(), entity.getCharacterClass());
  }
}
