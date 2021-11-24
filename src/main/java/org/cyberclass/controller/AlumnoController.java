package org.cyberclass.controller;

import org.springframework.stereotype.Controller;
import org.cyberclass.model.Alumnos;
import org.cyberclass.repository.IAlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class AlumnoController {
	
	@GetMapping("/cargar")
	public String cargarPag(Model model) {
		model.addAttribute("alumno",new Alumnos());
		return "Registro-Gonzales";
	}
	
	@Autowired
	private IAlumnoRepository repositorio;
	
	@PostMapping("/grabar")
	public String grabarPag(@ModelAttribute Alumnos alumno) {
		System.out.println(alumno);
		repositorio.save(alumno);
		return "Registro-Gonzales";
	}
	
	@GetMapping("/listar")
	public String listadoAlumno(Model model) {
		model.addAttribute("lstAlumno", repositorio.findAll());
		return "Registro-Gonzales";
	}
	

}
