package com.facuCarrizo.herosAPI.Entities;

public class Vote {

    private long heroID;
    private Integer votos;


    public void votar(){
        this.votos++;
    }


    public Vote(Integer votos) {
        this.votos = votos;
    }

    public long getHeroID() {
        return heroID;
    }

    public void setHeroID(long heroID) {
        this.heroID = heroID;
    }

    public Integer getVotos() {
        return votos;
    }

    public void setVotos(Integer votos) {
        this.votos = votos;
    }
}
