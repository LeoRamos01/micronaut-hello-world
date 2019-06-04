package hello.world.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.annotation.MicronautTest;

@MicronautTest
public class HomeControllerTest {
	
	@Inject
    @Client("/")
    private RxHttpClient client;

	@Test
	public void testIndex() {
        HttpRequest<String> request = HttpRequest.GET("/hello"); 
        String body = client.toBlocking().retrieve(request);

        assertNotNull(body);
        assertEquals(body, "Hello World");
	}

}
