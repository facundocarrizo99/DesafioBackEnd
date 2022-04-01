package com.facuCarrizo.herosAPI.Services;

import com.facuCarrizo.herosAPI.Entities.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Profile({"dev", "default"})
public class HeroSQLDAO implements IHeroDAO {

        @Autowired
        HeroRepository heroRepository;

        @Override
        public Hero save(Hero specimen) throws Exception {
            Hero createdHero = heroRepository.save(specimen);
            return createdHero;
        }

        @Override
        public List<Hero> fetchAll() {
            List<Hero> allSpecimens = new ArrayList<>();
            Iterable<Hero> specimens = heroRepository.findAll();
            for (Hero specimen : specimens) {
                allSpecimens.add(specimen);
            }
            return allSpecimens;
        }

        @Override
        public Hero fetch(int id) {
            return  heroRepository.findById(id).get();
        }

        @Override
        public void delete(int id) {
            heroRepository.deleteById(id);
        }

        @Override
        public List<Hero> fetchSpecimensByPlantId(int plantId) {
            return heroRepository.findByHeroID(plantId);
        }
}

