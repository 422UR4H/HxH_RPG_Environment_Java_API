package com.hxh_environment.api.infrastructure.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hxh_environment.api.application.usecases.CreateCharacterSheetInteractor;
import com.hxh_environment.api.domain.entity.Profile;
import com.hxh_environment.api.domain.sheets.CharacterSheet;
import com.hxh_environment.api.infrastructure.dtos.CharacterProfileDTOMapper;
import com.hxh_environment.api.infrastructure.dtos.CharacterSheetDTOMapper;
import com.hxh_environment.api.infrastructure.dtos.CreateCharacterProfileDTO;
import com.hxh_environment.api.infrastructure.dtos.OutputCharacterProfileDTO;
import com.hxh_environment.api.infrastructure.dtos.OutputCharacterSheetDTO;

import jakarta.validation.Valid;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("charactersheets")
public class CharacterSheetController {

  private final CreateCharacterSheetInteractor createInteractor;
  private final CharacterProfileDTOMapper profileDTOMapper;
  private final CharacterSheetDTOMapper characterSheetDTOMapper;

  public CharacterSheetController(
      CreateCharacterSheetInteractor createInteractor,
      CharacterProfileDTOMapper profileDTOMapper,
      CharacterSheetDTOMapper characterSheetDTOMapper) {

    this.createInteractor = createInteractor;
    this.profileDTOMapper = profileDTOMapper;
    this.characterSheetDTOMapper = characterSheetDTOMapper;
  }

  @PostMapping
  public OutputCharacterSheetDTO postCharacterSheet(@RequestBody @Valid CreateCharacterProfileDTO characterProfileDTO) {
    // TODO: fix this
    characterProfileDTO.setBirthday(LocalDate.now());
    Profile profile = profileDTOMapper.toDomainObj(characterProfileDTO);
    CharacterSheet characterSheet = createInteractor.createCharacterSheet(profile);
    OutputCharacterProfileDTO newProfileDTO = profileDTOMapper.toOutput(characterSheet.getProfile());
    return characterSheetDTOMapper.toOutput(newProfileDTO);
  }

}
