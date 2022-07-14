package ec.edu.espe.arquitectura.client.client.resource;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.arquitectura.client.client.dto.Cliente;
import ec.edu.espe.arquitectura.client.client.service.ClientService;

@RestController
@RequestMapping(path = "/facturacion")
public class ClientResource {

    private final ClientService service;
    
    public ClientResource(ClientService service) {
        this.service = service;
    }
}
