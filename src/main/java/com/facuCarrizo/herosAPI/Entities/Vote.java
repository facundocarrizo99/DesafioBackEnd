package com.facuCarrizo.herosAPI.Entities;

public class Vote {

    private long idHero;
    private Integer votos;


    public void votar(){
        votos++;
    }



    public Hero getHero() {
        return idHero;
    }

    public void setHero(Hero hero) {
        this.idHero = idHero;
    }

    public Integer getVotos() {
        return votos;
    }

    public void setVotos(Integer votos) {
        this.votos = votos;
    }
}
