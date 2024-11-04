package com.javadio.DesafioPOO.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    //atributos
     String titulo;
    String descricao;
    LocalDate cargaHoraria;

    public Mentoria(){

    }

    public double calcularXP(){
        return XP_PADRAO + 20d;
    }

    public LocalDate getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(LocalDate cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    
    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo()
        + ", descricao=" + getDescricao()
        + ", cargaHoraria=" + cargaHoraria 
        + "]";
    }
    
}
