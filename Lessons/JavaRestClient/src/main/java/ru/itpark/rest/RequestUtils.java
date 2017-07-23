package ru.itpark.rest;

import org.omg.PortableServer.SERVANT_RETENTION_POLICY_ID;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import ru.itpark.dto.UserDto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RequestUtils {

    private String serverApiUrl;
    private RestTemplate restTemplate;

    public RequestUtils(String serverApiUrl) {
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        List<HttpMessageConverter<?>> converters = new ArrayList<HttpMessageConverter<?>>();
        converters.add(converter);
        restTemplate = new RestTemplate(converters);
        this.serverApiUrl = serverApiUrl;
    }

    public <T> List<T> getForList(String resource, Class<T[]> responseType) {
        ResponseEntity<T[]> response = restTemplate.getForEntity(serverApiUrl + resource, responseType);
        T[] resultAsArray= response.getBody();
        return new ArrayList<T>(Arrays.asList(resultAsArray));
    }

    public <T> void postObject(T object,  String resource) {
        restTemplate.postForLocation(serverApiUrl + "/users", object);
    }
}
