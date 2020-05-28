package com.bankaya.challenge.pokemon.entity.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GameIndexInDto {

    private Integer game_index;
    private NameUrlInDto version;
}
