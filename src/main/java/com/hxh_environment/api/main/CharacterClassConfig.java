package com.hxh_environment.api.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hxh_environment.api.application.gateways.CharacterSheetGateway;
import com.hxh_environment.api.application.usecases.CreateCharacterSheetInteractor;
import com.hxh_environment.api.infrastructure.dtos.CharacterSheetDTOMapper;
import com.hxh_environment.api.infrastructure.gateways.CharacterSheetEntityMapper;
import com.hxh_environment.api.infrastructure.gateways.CharacterSheetRepositoryGateway;
import com.hxh_environment.api.infrastructure.persistence.CharacterSheetRepository;

@Configuration
public class CharacterClassConfig {
  @Bean
  CreateCharacterSheetInteractor createCharacterSheetCase(CharacterSheetGateway gateway) {
    return new CreateCharacterSheetInteractor(gateway);
  }

  @Bean
  CharacterSheetGateway characterSheetGateway(CharacterSheetRepository repository,
      CharacterSheetEntityMapper entityMapper) {
    return new CharacterSheetRepositoryGateway(repository, entityMapper);
  }

  @Bean
  CharacterSheetEntityMapper characterSheetEntityMapper() {
    return new CharacterSheetEntityMapper();
  }

  @Bean
  CharacterSheetDTOMapper characterSheetDtoMapper() {
    return new CharacterSheetDTOMapper();
  }
}
