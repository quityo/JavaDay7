package hrsm.hrsm.dataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrsm.hrsm.entities.Concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer>{

}
