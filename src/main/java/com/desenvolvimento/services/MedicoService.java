package com.desenvolvimento.services;


import com.desenvolvimento.domains.dtos.MedicoDTO;
import com.desenvolvimento.repositories.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MedicoService {

@Autowired
    private MedicoRepository medicoRepository;

public List<MedicoDTO> findAll(){
return medicoRepository.findAll().stream().map(obj-> new MedicoDTO(obj)).
        collect(Collectors.toList());

}
}
