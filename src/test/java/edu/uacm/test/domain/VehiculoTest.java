   package edu.uacm.test.domain;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import edu.uacm.Application;
import edu.uacm.dao.VehiculoDao;
import edu.uacm.domain.Accesorio;
//import edu.uacm.domain.Accesorio;
import edu.uacm.domain.AccesorioRepository;
import edu.uacm.domain.Vehiculo;
import edu.uacm.domain.VehiculoRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=Application.class)
@WebAppConfiguration
public class VehiculoTest {
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	VehiculoRepository vehiculoRepository;
	
	@Autowired
	AccesorioRepository accesosrioRepository;//creamos objeto para inyeccion

	@Autowired
	
	VehiculoDao vehiculoDao;
	/*
	@Test
	public void guardarVehiculoTest(){
		// Para realizar una insercion en la BD 
		Vehiculo auto = new Vehiculo();
		auto.setModelo("PabloHdz");
		
		vehiculoRepository.save(auto);
	}*/
	/*
	@Test
	public void obtenerPrimerRegistro(){
		long id = 1;
		Vehiculo auto = vehiculoRepository.findOne(new Long(id));
		
		Assert.assertNotNull(auto);
		
		//auto.getModelo();		
	}
	*/
	/*
	@Test
	public void guardarVehiculoAccesorioTest(){
		Vehiculo auto = new Vehiculo();
		auto.setModelo("2020");
		
		vehiculoRepository.save(auto);
		
		Accesorio accesorio1 = new Accesorio();
		accesorio1.setNombre("rines cromados");		
		accesorio1.setVehiculo(auto);
		
		Accesorio accesorio2 = new Accesorio();
		accesorio2.setNombre("spoiler");		
		accesorio2.setVehiculo(auto);
		
		
		//inyectamos
		accesosrioRepository.save(accesorio1);
		accesosrioRepository.save(accesorio2);
		
		
		
	}
	*/

	@Test
	public void obtenerVehiculoidTest(){
		/*Vehiculo v =vehiculoDao.obtenerVehiculoPorId(0);
		Assert.assertNull(v);*/
		
		Vehiculo v =vehiculoDao.obtenerVehiculoPorId(2);
		//Assert.assertNotNull(v);
		log.debug("Error"+v);
		
	}
	
	
	
	

}
