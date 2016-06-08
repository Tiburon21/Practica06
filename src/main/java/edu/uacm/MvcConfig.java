package edu.uacm;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		/*
		 * MVC configura las vistas y hacia donde tengo que appuntar
		 * post no se ve
		 * get si se ve
		 * entra a peticion y de ah pasa a /redir y luego me redirecciona a mi html 
		 */
		registry.addViewController("/home").setViewName("home");
		registry.addViewController("/").setViewName("home");
		registry.addViewController("/redireccion.html");
	}
}
