package com.hxh_environment.api.infrastructure.gateways;

import com.hxh_environment.api.domain.sheets.CharacterSheet;
import com.hxh_environment.api.infrastructure.persistence.CharacterSheetModel;

public class CharacterSheetEntityMapper {

  private final CharacterProfileEntityMapper entityMapper;

  public CharacterSheetEntityMapper(CharacterProfileEntityMapper entityMapper) {
    this.entityMapper = entityMapper;
  }

  CharacterSheetModel toEntity(CharacterSheet characterSheetDomainObj) {
    return new CharacterSheetModel(entityMapper.toEntity(characterSheetDomainObj.getProfile()));
  }

  CharacterSheet toDomainObj(CharacterSheetModel entity) {
    return new CharacterSheet(entityMapper.toDomainObj(entity.getProfile()));
  }

  // CharacterSheetModel toEntity(CharacterSheet characterSheetDomainObj) {
  //   return new CharacterSheetModel(characterSheetDomainObj.getDescription(),
  //       characterSheetDomainObj.getCharacterClass());
  // }

  // CharacterSheet toDomainObj(CharacterSheetModel entity) {
  //   return new CharacterSheet(entity.getDescription(), entity.getCharacterClass());
  // }
}
