package com.hxh_environment.api.application.usecases;

import com.hxh_environment.api.application.gateways.CharacterSheetGateway;
import com.hxh_environment.api.domain.entity.Profile;
import com.hxh_environment.api.domain.sheets.CharacterSheet;

public class CreateCharacterSheetInteractor {
  private CharacterSheetGateway gateway;

  public CreateCharacterSheetInteractor(CharacterSheetGateway gateway) {
    this.gateway = gateway;
  }

  public CharacterSheet createCharacterSheet(Profile profile) {
    CharacterSheet characterSheet = new CharacterSheet(profile);
    return gateway.createCharacterSheet(characterSheet);
  }
}
