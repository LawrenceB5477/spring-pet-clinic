package com.example.petclinic.service;

import com.example.petclinic.model.Vet;

import java.util.Set;

public interface IVetService {
    Vet findById(Long id);
    Vet save(Vet owner);
    Set<Vet> findAll();
}
