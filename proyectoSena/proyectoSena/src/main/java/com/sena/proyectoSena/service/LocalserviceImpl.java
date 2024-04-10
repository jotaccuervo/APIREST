package com.sena.proyectoSena.service;
import com.sena.proyectoSena.entity.Local; 
import com.sena.proyectoSena.repository.LocalRepository; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class LocalserviceImpl implements LocalService{

    @Autowired
    LocalRepository repository;

    @Override
    public List<Local> findAll() {
        return repository.findAll();
    }

    
}





