package com.desenvolvimento.services;


import com.desenvolvimento.domains.Medico;
import com.desenvolvimento.domains.Paciente;
import com.desenvolvimento.repositories.MedicoRepository;
import com.desenvolvimento.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class DBService {

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private MedicoRepository medicoRepository;

    public void initDB(){

        Paciente paciente01 = new Paciente(0, "Maria Eduarda da Silva", LocalDate.now(), new BigDecimal("450.00"));
        Paciente paciente02 = new Paciente(0, "Gustavo Borges", LocalDate.now(), new BigDecimal("650.00"));
        Paciente paciente03 = new Paciente(0, "Larissa de Assis", LocalDate.now(), new BigDecimal("350.00"));

        Medico medico01 = new Medico(0, "José Carlos Almeida", LocalDate.now(), new BigDecimal("12.500"));
        Medico medico02 = new Medico(0, "Larissa de Nobrega", LocalDate.now(), new BigDecimal("12.500"));
        Medico medico03 = new Medico(0, "Beatriz Brigatti", LocalDate.now(), new BigDecimal("15.500"));

        pacienteRepository.save(paciente01);
        pacienteRepository.save(paciente02);
        pacienteRepository.save(paciente03);
        medicoRepository.save(medico01);
        medicoRepository.save(medico02);
        medicoRepository.save(medico03);

    }
}
