package com.facuCarrizo.herosAPI.Services;

import com.facuCarrizo.herosAPI.Entities.Hero;

import java.util.List;

public interface IHeroDAO {

        Hero save(Hero specimen) throws Exception;

        List<Hero> fetchAll();

        Hero fetch(int id);

        void delete(int id);

        List<Hero> fetchSpecimensByPlantId(int plantId);
}
