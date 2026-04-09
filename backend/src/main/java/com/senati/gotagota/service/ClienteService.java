package com.senati.gotagota.service;

import com.senati.gotagota.entity.Cliente;
import com.senati.gotagota.repository.ClienteRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

public List<Cliente> ClienteService(ClienteRepository clienteRepository){
    this.ClienteRepository = clienteRepository;

public List<Cliente> ListarTodos() {
        return clienteRepository.findAll();
    }
}