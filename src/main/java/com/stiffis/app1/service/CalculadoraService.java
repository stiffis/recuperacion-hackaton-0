package com.stiffis.app1.service;

import com.stiffis.app1.exceptions.HuanaException;
import com.stiffis.app1.repository.CalculadoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

	@Autowired
	private CalculadoraRepository calculatorRepository;

	public double multiplicar(Long a, Long b) {
		if (a == null || b == null) {
			throw new HuanaException("Los valores no pueden ser nulos");
		}
		if (a < 0 || b < 0) {
			throw new HuanaException("Los valores no pueden ser negativos");
		}
		return a * b;
	}

	public Long dividir(Long a, Long b) {
		if (a == null || b == null) {
			throw new HuanaException("Los valores nulos no se aceptan");
		}
		if (a < 0 || b < 0) {
			throw new HuanaException("Los valores negativos no se aceptan");
		}
		if (b == 0) {
			throw new HuanaException("División entre 0 no aceptada");
		}
		return a / b;
	}
}
