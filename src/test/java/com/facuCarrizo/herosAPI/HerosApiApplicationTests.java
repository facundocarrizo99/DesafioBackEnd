package com.facuCarrizo.herosAPI;

import com.facuCarrizo.herosAPI.Entities.Hero;
import com.facuCarrizo.herosAPI.Entities.Vote;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HerosApiApplicationTests {

	Vote vote1 = new Vote(3);
	Vote vote2 = new Vote(2);
	Vote vote3 = new Vote(5);

	Hero hero1 = new Hero(1,"Batman", "DC", "Burce Wayne", "Comic 1",vote1);
	Hero hero2 = new Hero(2,"Super-Man", "DC", "Kal-El", "Comic 2", vote2);
	Hero hero3 = new Hero(3, "Iron-Man", "Marvel", "Tony Stark", "Comic 0", vote3);



	@Test
	public void voteBatman(){
		hero1.votar();
		Assert.assertEquals(4, (int) hero1.getCantVotos());
	}




}
