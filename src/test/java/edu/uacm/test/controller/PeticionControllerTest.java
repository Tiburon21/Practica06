package edu.uacm.test.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import edu.uacm.Application;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class PeticionControllerTest {

	@Autowired
	private WebApplicationContext wac;
	
	private MockMvc mvc;
	
	@Before
	public void setUp(){
		mvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}
	
	@Test
	public void peticionRedirTest() throws Exception{
		mvc.perform(MockMvcRequestBuilders.post("/peticion/redir"));
	}
	
	@Test
	public void peticionRecibirParametrosTest() throws Exception{
		mvc.perform(MockMvcRequestBuilders.post("/peticion/recibir").param("nombre", "gustavo").param("edad", "31")); //puedo poner n parametros
	}
}
