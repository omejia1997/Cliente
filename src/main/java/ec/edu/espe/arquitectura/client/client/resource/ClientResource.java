package ec.edu.espe.arquitectura.client.client.resource;

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

    @GetMapping( path = "/add")
    public ResponseEntity addProduct() {
        Cliente cliente = new Cliente();
        cliente.setCedula("1726434507");
        cliente.setNombreCompleto("Omar Mejia");
        cliente.setEstado("ACT");
        this.service.addCliente(cliente);
        return ResponseEntity.ok().build();
    }
}
