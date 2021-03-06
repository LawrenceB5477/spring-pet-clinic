package com.example.petclinic.service;

import com.example.petclinic.model.Owner;

import java.util.Set;

public interface IOwnerService {
    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
