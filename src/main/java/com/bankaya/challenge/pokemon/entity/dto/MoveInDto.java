package com.bankaya.challenge.pokemon.entity.dto;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MoveInDto {

    private NameUrlInDto move;
    private List<VersionGroupDetailInDto> version_group_details;
}
