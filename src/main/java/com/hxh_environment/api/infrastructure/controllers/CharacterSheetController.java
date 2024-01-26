package com.hxh_environment.api.infrastructure.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hxh_environment.api.application.usecases.CreateCharacterSheetInteractor;
import com.hxh_environment.api.domain.entity.CharacterSheet;
import com.hxh_environment.api.infrastructure.dtos.CharacterSheetDTOMapper;
import com.hxh_environment.api.infrastructure.dtos.CreateCharacterSheetDTO;
import com.hxh_environment.api.infrastructure.dtos.OutputCharacterSheetDTO;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("charactersheets")
public class CharacterSheetController {
  private CreateCharacterSheetInteractor createInteractor;
  private CharacterSheetDTOMapper dtoMapper;

  public CharacterSheetController(CreateCharacterSheetInteractor createInteractor, CharacterSheetDTOMapper dtoMapper) {
    this.createInteractor = createInteractor;
    this.dtoMapper = dtoMapper;
  }

  @PostMapping
  public OutputCharacterSheetDTO postCharacterSheet(@RequestBody @Valid CreateCharacterSheetDTO characterSheetDto) {
    CharacterSheet characterSheet = dtoMapper.toDomainObj(characterSheetDto);
    CharacterSheet newCharacterSheet = createInteractor.createCharacterSheet(characterSheet);
    return dtoMapper.toOutput(newCharacterSheet);
  }

}
