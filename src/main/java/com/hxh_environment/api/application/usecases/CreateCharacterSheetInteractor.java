package com.hxh_environment.api.application.usecases;

import com.hxh_environment.api.application.gateways.CharacterSheetGateway;
import com.hxh_environment.api.domain.sheet.CharacterSheet;

public class CreateCharacterSheetInteractor {
  private CharacterSheetGateway gateway;

  public CreateCharacterSheetInteractor(CharacterSheetGateway gateway) {
    this.gateway = gateway;
  }

  public CharacterSheet createCharacterSheet(CharacterSheet characterSheet) {
    return gateway.createCharacterSheet(characterSheet);
  }
}
