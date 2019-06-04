package hello.world.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

/**
 * 
 * Tutorial
 * 
 * @see https://docs.micronaut.io/latest/guide/index.html#ioc
 * 
 * @author leonardorm
 *
 */
@Controller("/hello")
public class HomeController {

	@Get("/")
	@Produces(MediaType.TEXT_PLAIN)
	public String index() {
		return "Hello World";
	}
	
}
