package com.todocode.libros.controller;

import com.todocode.libros.entity.Libro;
import com.todocode.libros.service.ILibroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/libros")
public class LibroController {
   
   @Autowired
   ILibroService libroService;
   
   @GetMapping("/traer")
   public List<Libro> traerLibroes () {
      return libroService.getLibros();
   }
   
   @PostMapping("/crear")
   public String crearLibro(@RequestBody Libro l){
      libroService.saveLibro(l);
      return "El libro " + l.getTitulo()+ " fue creado correctamente";
   }
   
   @DeleteMapping("/borrar/{id}")
   public String deleteLibro(@PathVariable Long id) {
      libroService.deleteLibro(id);
      return "El libro fue eliminado correctamente";
   }
}
