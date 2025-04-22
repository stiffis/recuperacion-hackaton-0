// INFO: This is a Java class representing a JPA entity for a calculator application.
package com.stiffis.app1.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;

@Entity
public class Calculadora {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
}
