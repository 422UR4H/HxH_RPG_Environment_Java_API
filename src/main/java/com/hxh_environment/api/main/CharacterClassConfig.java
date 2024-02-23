package com.hxh_environment.api.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hxh_environment.api.application.gateways.CharacterProfileGateway;
import com.hxh_environment.api.application.gateways.CharacterSheetGateway;
import com.hxh_environment.api.application.usecases.CreateCharacterProfileInteractor;
import com.hxh_environment.api.application.usecases.CreateCharacterSheetInteractor;
import com.hxh_environment.api.infrastructure.dtos.CharacterProfileDTOMapper;
import com.hxh_environment.api.infrastructure.dtos.CharacterSheetDTOMapper;
import com.hxh_environment.api.infrastructure.gateways.CharacterProfileEntityMapper;
import com.hxh_environment.api.infrastructure.gateways.CharacterProfileRepositoryGateway;
import com.hxh_environment.api.infrastructure.gateways.CharacterSheetEntityMapper;
import com.hxh_environment.api.infrastructure.gateways.CharacterSheetRepositoryGateway;
import com.hxh_environment.api.infrastructure.persistence.CharacterProfileRepository;
import com.hxh_environment.api.infrastructure.persistence.CharacterSheetRepository;

@Configuration
public class CharacterClassConfig {
  @Bean
  CreateCharacterSheetInteractor createCharacterSheetCase(CharacterSheetGateway gateway) {
    return new CreateCharacterSheetInteractor(gateway);
  }
  @Bean
  CreateCharacterProfileInteractor createCharacterProfileCase(CharacterProfileGateway gateway) {
    return new CreateCharacterProfileInteractor(gateway);
  }

  @Bean
  CharacterSheetGateway characterSheetGateway(CharacterSheetRepository repository,
      CharacterSheetEntityMapper entityMapper) {
    return new CharacterSheetRepositoryGateway(repository, entityMapper);
  }

  @Bean
  CharacterProfileGateway characterProfileGateway(CharacterProfileRepository repository,
      CharacterProfileEntityMapper entityMapper) {
    return new CharacterProfileRepositoryGateway(repository, entityMapper);
  }

  @Bean
  CharacterSheetEntityMapper characterSheetEntityMapper(CharacterProfileEntityMapper entityMapper) {
    return new CharacterSheetEntityMapper(entityMapper);
  }

  @Bean
  CharacterProfileEntityMapper characterProfileEntityMapper() {
    return new CharacterProfileEntityMapper();
  }

  @Bean
  CharacterSheetDTOMapper characterSheetDtoMapper() {
    return new CharacterSheetDTOMapper();
  }

  @Bean
  CharacterProfileDTOMapper characterProfileDtoMapper() {
    return new CharacterProfileDTOMapper();
  }
}
