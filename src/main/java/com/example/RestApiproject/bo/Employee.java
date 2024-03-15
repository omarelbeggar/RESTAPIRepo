package com.example.RestApiproject.bo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String nom;
private String prenom;
private String email;
private String adresse;
private float salaire;
}
