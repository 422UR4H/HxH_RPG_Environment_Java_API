package com.hxh_environment.api.infrastructure.gateways;

import com.hxh_environment.api.application.gateways.CharacterProfileGateway;
import com.hxh_environment.api.domain.entity.Profile;
import com.hxh_environment.api.infrastructure.persistence.CharacterProfileModel;
import com.hxh_environment.api.infrastructure.persistence.CharacterProfileRepository;

public class CharacterProfileRepositoryGateway implements CharacterProfileGateway {

  private final CharacterProfileRepository repository;
  private final CharacterProfileEntityMapper entityMapper;

  public CharacterProfileRepositoryGateway(
      CharacterProfileRepository repository,
      CharacterProfileEntityMapper entityMapper) {

    this.repository = repository;
    this.entityMapper = entityMapper;
  }

  @Override
  public Profile createProfile(Profile profileDomainObj) {

    CharacterProfileModel entity = entityMapper.toEntity(profileDomainObj);

    // TODO: change by a throwing exception
    if (entity == null) {
      return null;
    }
    CharacterProfileModel newEntity = repository.save(entity);
    return entityMapper.toDomainObj(newEntity);

  }

}
