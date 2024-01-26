package com.hxh_environment.api.infrastructure.gateways;

import com.hxh_environment.api.domain.entity.CharacterSheet;
import com.hxh_environment.api.infrastructure.persistence.CharacterSheetEntity;

public class CharacterSheetEntityMapper {
  CharacterSheetEntity toEntity(CharacterSheet characterSheetDomainObj) {
    return new CharacterSheetEntity(characterSheetDomainObj.getDescription(),
        characterSheetDomainObj.getCharacterClass());
  }

  CharacterSheet toDomainObj(CharacterSheetEntity entity) {
    return new CharacterSheet(entity.getDescription(), entity.getCharacterClass());
  }
}
