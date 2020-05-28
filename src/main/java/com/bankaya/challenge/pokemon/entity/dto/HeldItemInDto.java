package com.bankaya.challenge.pokemon.entity.dto;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HeldItemInDto {

    private NameUrlInDto item;
    private List<VersionDetailIntDto> version_details;
}
