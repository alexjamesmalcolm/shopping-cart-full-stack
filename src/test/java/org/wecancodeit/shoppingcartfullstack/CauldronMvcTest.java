package org.wecancodeit.shoppingcartfullstack;

import javax.annotation.Resource;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest
public class CauldronMvcTest {
	
	@Resource
	private MockMvc mvc;
	
	@Test
	public void shouldRetrievePotions() throws Exception {
		mvc.perform(get("/potions")).andExpect(status().isOk());
	}
	
	@Test
	public void shouldRetrieveIndividualPotion() throws Exception {
		mvc.perform(get("/potions/42")).andExpect(status().isOk());
	}
}
