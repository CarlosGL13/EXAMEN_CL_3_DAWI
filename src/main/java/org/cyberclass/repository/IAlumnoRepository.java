package org.cyberclass.repository;

import org.cyberclass.model.Alumnos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAlumnoRepository extends JpaRepository<Alumnos, String> {
	
	//crud...


}
