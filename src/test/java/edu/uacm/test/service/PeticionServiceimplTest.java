package edu.uacm.test.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import edu.uacm.Application;
import edu.uacm.domain.User;
import edu.uacm.service.PeticionService;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)/* Para probar la parte de Aplicaciones */
@WebAppConfiguration
public class PeticionServiceimplTest {
	
	@Autowired
	PeticionService peticionService; /* se prueba la interface */
	
	@Test
	public void recibirPeticionTest(){		
		/*
		 * Generamos un MOCK, esto es simular a un objeto Usuaio con sus atributos
		 */
		User user = new User();
		user.setEdad(29);
		user.setNombre("Pablo H.");		
		peticionService.recibirPeticion(user);		
	}
	
	@Test
	public void obtenerUsuariosTest(){
    	//PeticionServiceimpl psi = new PeticionServiceimpl();		
		Assert.assertTrue(peticionService.obtenerUsuarios().size() == 5);
	}
	

}
