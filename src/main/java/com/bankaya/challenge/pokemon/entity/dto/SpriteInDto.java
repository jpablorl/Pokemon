package com.bankaya.challenge.pokemon.entity.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SpriteInDto {

    private String back_default;
    private String back_female;
    private String back_shiny;
    private String back_shiny_female;
    private String front_default;
    private String front_female;
    private String front_shiny;
    private String front_shiny_female;

}
