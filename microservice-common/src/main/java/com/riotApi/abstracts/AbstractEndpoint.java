package com.riotApi.abstracts;

import com.fasterxml.jackson.core.type.TypeReference;
import com.riotApi.requestResponse.RequestResponseModel;
import com.riotApi.utils.CustomObjectMapper;
import java.util.Objects;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.function.Supplier;



public abstract class AbstractEndpoint {

  private final RestTemplate restTemplate;

  private final CustomObjectMapper mapper;


  protected AbstractEndpoint(RestTemplate restTemplate, CustomObjectMapper mapper) {
    this.restTemplate = restTemplate;
    this.mapper = mapper;
  }


  protected <T> T handleConnectionException(Supplier<T> supplier) {
        try {
            return supplier.get();
        } catch (ResourceAccessException ex) {
            throw new RuntimeException(ex) {
            };
        }
    }

    protected URI createUri(final String uriPath) {
        try {
            return new URI(uriPath);
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex) {
            };
        }
    }


    protected <T> T extractResponseData(final ResponseEntity<T> responseEntity) {
        return responseEntity.getBody();
    }

  protected HttpHeaders addDefaultHeaders(final String auth) {
    HttpHeaders httpHeaders = new HttpHeaders();
    httpHeaders.add("X-Riot-Token", auth); //"Bearer " + auth);
    httpHeaders.add("Content-Type", "application/json");
    return httpHeaders;
  }


//  protected <T> T extractResponseInternalData(final ResponseEntity<RequestResponseModel<T>> responseEntity, final TypeReference<T> responseTypeReference) {
//    RequestResponseModel<T> body = Objects.requireNonNull(responseEntity.getBody());
//    T data = body.getData();
//
//    return mapper.convertValue(data, responseTypeReference);
//  }


    protected <T> T doCall(final String path, final HttpMethod httpMethod, final HttpHeaders httpHeaders, final Object body,
                         final Class<T> responseClass){
        return handleConnectionException(
                () ->
                     extractResponseData(restTemplate.exchange(new RequestEntity<>(body, httpHeaders, httpMethod, createUri(path)), responseClass)));



    }
}
