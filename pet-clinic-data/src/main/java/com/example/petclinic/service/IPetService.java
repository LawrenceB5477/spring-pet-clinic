package com.example.petclinic.service;

import com.example.petclinic.model.Pet;

import java.util.Set;

public interface IPetService {
    Pet findById(Long id);
    Pet save(Pet owner);
    Set<Pet> findAll();
}
