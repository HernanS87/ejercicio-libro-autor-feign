package com.todocode.libros.service;

import com.todocode.libros.entity.Libro;
import com.todocode.libros.repository.ILibroRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroService implements ILibroService{
   
   @Autowired
   ILibroRepository libroRepository;

   @Override
   public List<Libro> getLibros() {
      return libroRepository.findAll();
   }

   @Override
   public void saveLibro(Libro l) {
      libroRepository.save(l);
   }

   @Override
   public void deleteLibro(Long id) {
      libroRepository.deleteById(id);
   }

   @Override
   public Libro findLibro(Long id) {
      return libroRepository.findById(id).orElse(null);
   }
}
