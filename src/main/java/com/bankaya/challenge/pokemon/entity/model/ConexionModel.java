package com.bankaya.challenge.pokemon.entity.model;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ConexionModel {
    
    private Long id;
    private String ip;
    private Date fecha;
    private String metodo;
    private Date registro;
    private Boolean activo;
    
}