package com.todocode.autores.controller;

import com.todocode.autores.entity.Autor;
import com.todocode.autores.service.IAutorService;
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
@RequestMapping("/autores")
public class AutorController {
   
   @Autowired
   IAutorService autorService;
   
   @GetMapping("/traer")
   public List<Autor> traerAutores () {
      return autorService.getAutores();
   }
   
   @PostMapping("/crear")
   public String crearAutor(@RequestBody Autor a){
      autorService.saveAutor(a);
      return "El autor " + a.getNombre() + " fue creado correctamente";
   }
   
   @DeleteMapping("/borrar/{id}")
   public String deleteAutor(@PathVariable Long id) {
      autorService.deleteAutor(id);
      return "El autor fue eliminado correctamente";
   }
   
}
