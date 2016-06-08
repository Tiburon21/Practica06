package edu.uacm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.uacm.domain.User;
import edu.uacm.service.PeticionService;

@Controller
@RequestMapping("/peticion")
public class PeticionController {	
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PeticionService peticionService; /* se prueba la interface */

	@RequestMapping(value="/redir", method=RequestMethod.POST)
	public String redireccionar(){		
		log.debug(" --------- Estoy entrando a redirecionar () --------- ");
		
		User user = new User();
		user.setEdad(29);
		user.setNombre("Pablo H.");
		
		log.debug("valor : " + peticionService);
		
		peticionService.recibirPeticion(user);
		
		return "redirect:/redireccion.html";
	}
	
	@RequestMapping(value="/recibir", method=RequestMethod.POST)
	public String recibirParametros(@ModelAttribute User user ){
		
		log.debug(" entrando a recibirParametros() ");
		log.debug(" el valor de user es: " + user.toString() );
		
		return "redirect:/redireccion.html?ok=true";// se envian parametros por metodo GET, se esta redireccionando
	}
	
}
