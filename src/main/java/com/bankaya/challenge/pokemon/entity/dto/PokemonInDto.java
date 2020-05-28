package com.bankaya.challenge.pokemon.entity.dto;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PokemonInDto {
    
    private List<AbilityInDto> abilities;
    private Integer base_experience;
    private List<NameUrlInDto> forms;
    private List<GameIndexInDto> game_indices;
    private Integer height;
    private List<HeldItemInDto> held_items;
    private Integer id;
    private Boolean is_default;
    private String location_area_encounters;
    private List<MoveInDto> moves;
    private String name;
    private Integer order;
    private NameUrlInDto species;
    private SpriteInDto sprites;
    private List<StatInDto> stats; 
    private List<TypeInDto> types;
    private Integer weight;
    
}