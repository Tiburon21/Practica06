package edu.uacm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import edu.uacm.domain.User;
import edu.uacm.service.PeticionService;

@Service
public class PeticionServiceimpl implements PeticionService {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	public void recibirPeticion(User user) {
		
		log.debug("entre a recibir peticion (USER user)");
		log.debug(user.toString()); /*  */

	}

	@Override
	public List<User> obtenerUsuarios() {
		List<User> usuarios = new ArrayList<User>();
		
		for (int i = 0; i < 5 ; i++) {
			User u = new User();
			u.setEdad(i);
			u.setNombre("Pablo");
			usuarios.add(u);
		}		
		return usuarios;
	}

}
