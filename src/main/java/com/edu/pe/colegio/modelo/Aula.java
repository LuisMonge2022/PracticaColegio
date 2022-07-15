package com.edu.pe.colegio.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "aula")
public class Aula {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idaula;
	private Integer numeroaula;	

}