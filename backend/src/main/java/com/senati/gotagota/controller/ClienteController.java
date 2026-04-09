package com.senati.gotagota.controller;
import com.senati.gotagota.entity.Cliente;
import org.hibernate.mapping.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 3 ANOTACIONES
// Indica que esta clase maneja peticiones HTTPS y DEVUELVA JSON
@RestController
// Define la URL Base de todos los END-POINT de esta clase
@RequestMapping
//  Esta anotacion permite que el front-end pueda llamar a esta API
// Si no ponemos esto, el navegador bloque las peticiones por politicas  CORS
@CrossOrigin(origins = "*")

public class ClienteController {
    //DECLARAMOS UNA VARIABLE DEFINIDA
    // Inyectamos el servicio para acceder a la logica del negocio
    private final Clienteservice clienteservice;
    public ClienteController(ClienteService ClienteService) {
        this.clienteservice = clienteservice;
    }
    //GET/api/Clientes
    @GetMapping
    public List<Cliente> Listar() {return clienteservice.ListarTodos();}
}

