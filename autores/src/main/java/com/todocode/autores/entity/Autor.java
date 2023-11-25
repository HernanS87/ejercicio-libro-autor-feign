package com.todocode.autores.entity;

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
public class Autor {
   
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private Long id;
   private String nombre;
   @Temporal (TemporalType.DATE)
   private LocalDate fechaNacimiento;
   @ElementCollection(fetch = FetchType.EAGER)
   private List<Long> librosID;
}
