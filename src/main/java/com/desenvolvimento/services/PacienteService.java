package com.desenvolvimento.services;

import com.desenvolvimento.domains.dtos.PacienteDTO;
import com.desenvolvimento.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PacienteService {
    @Autowired
    private PacienteRepository pacienteRepository;

    public List<PacienteDTO> findAll(){
        return pacienteRepository.findAll().stream().map(obj -> new PacienteDTO(obj)).collect(Collectors.toList());

    }
}
