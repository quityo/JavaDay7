package hrsm.hrsm.dataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrsm.hrsm.entities.Concretes.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer> {

}
