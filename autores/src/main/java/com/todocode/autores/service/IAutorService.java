package com.todocode.autores.service;

import com.todocode.autores.entity.Autor;
import java.util.List;


public interface IAutorService {
   
   public List<Autor> getAutores();

   public void saveAutor(Autor a);

   public void deleteAutor(Long id);

   public Autor findAutor(Long id);
}
