package hrsm.hrsm.dataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrsm.hrsm.entities.Concretes.Personnel;

public interface PersonnelDao extends JpaRepository<Personnel, Integer>{

}
