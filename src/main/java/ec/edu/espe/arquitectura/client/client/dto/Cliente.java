package ec.edu.espe.arquitectura.client.client.dto;

import lombok.Data;

@Data
public class Cliente {
    private String id;
    private String cedula;
    private String nombreCompleto;
    private String estado;
}