package edu.uacm.service;

import java.util.List;

import edu.uacm.domain.User;

public interface PeticionService {
	
	void recibirPeticion(User user);
	
	List<User> obtenerUsuarios();

}
