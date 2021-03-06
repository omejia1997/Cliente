package ec.edu.espe.arquitectura.client.client.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import ec.edu.espe.arquitectura.client.client.dto.Cliente;

@Service
public class ClientService{

    private static final String BASE_URL = "http://localhost:8080/cliente";

    private final RestTemplate restTemplate;

    public ClientService() {
        this.restTemplate = new RestTemplate(getClientHttpRequestFactory());
    }

    public void addCliente(Cliente cliente) {
        HttpEntity<Cliente> request = new HttpEntity<Cliente>(cliente);
        this.restTemplate.postForObject(BASE_URL, request, Cliente.class);
    }

    private ClientHttpRequestFactory getClientHttpRequestFactory() {
        HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
        int connectTimeout = 5000;
        int readTimeout = 5000;
        clientHttpRequestFactory.setConnectTimeout(connectTimeout);
        clientHttpRequestFactory.setReadTimeout(readTimeout);
        return clientHttpRequestFactory;
    }
}
