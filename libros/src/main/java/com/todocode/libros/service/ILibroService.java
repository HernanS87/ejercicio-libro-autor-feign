package com.todocode.libros.service;

import com.todocode.libros.entity.Libro;
import java.util.List;


public interface ILibroService {
   
   public List<Libro> getLibros();

   public void saveLibro(Libro l);

   public void deleteLibro(Long id);

   public Libro findLibro(Long id);
}
