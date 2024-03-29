package com.hxh_environment.api.infrastructure.gateways;

import com.hxh_environment.api.application.gateways.CharacterSheetGateway;
import com.hxh_environment.api.domain.sheets.CharacterSheet;
import com.hxh_environment.api.infrastructure.persistence.CharacterSheetModel;
import com.hxh_environment.api.infrastructure.persistence.CharacterSheetRepository;

public class CharacterSheetRepositoryGateway implements CharacterSheetGateway {

  private final CharacterSheetRepository repository;
  private final CharacterSheetEntityMapper entityMapper;

  public CharacterSheetRepositoryGateway(CharacterSheetRepository repository, CharacterSheetEntityMapper entityMapper) {
    this.repository = repository;
    this.entityMapper = entityMapper;
  }

  @Override
  public CharacterSheet createCharacterSheet(CharacterSheet characterSheet) {

    CharacterSheetModel entity = entityMapper.toEntity(characterSheet);

    // TODO: change by a throwing exception
    if (entity == null) {
      return null;
    }
    CharacterSheetModel newEntity = repository.save(entity);
    return entityMapper.toDomainObj(newEntity);

  }

}
