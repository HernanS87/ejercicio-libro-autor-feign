package com.todocode.autores.service;

import com.todocode.autores.entity.Autor;
import com.todocode.autores.repository.IAutorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorService implements IAutorService{
   
   @Autowired
   IAutorRepository autorRepository;

   @Override
   public List<Autor> getAutores() {
      return autorRepository.findAll();
   }

   @Override
   public void saveAutor(Autor a) {
      autorRepository.save(a);
   }

   @Override
   public void deleteAutor(Long id) {
      autorRepository.deleteById(id);
   }

   @Override
   public Autor findAutor(Long id) {
     return autorRepository.findById(id).orElse(null);
   }
   
}
