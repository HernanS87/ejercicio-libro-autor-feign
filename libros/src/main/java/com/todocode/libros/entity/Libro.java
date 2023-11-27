package com.todocode.libros.entity;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.time.LocalDate;
import java.util.List;
import lombok.Data;

@Data
@Entity
public class Libro {
   
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private Long id;
   private String isbn;
   private String titulo;
   @Temporal (TemporalType.DATE)
   private LocalDate anioPublicacion;
   private String descripcion;
   @ElementCollection(fetch = FetchType.EAGER)
   private List<Long> autores;
}
