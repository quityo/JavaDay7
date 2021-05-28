package hrsm.hrsm.business.Abstracts;

import hrsm.hrsm.entities.Concretes.JobSeeker;
public interface UserCheckService {
	public boolean checkIfRealPerson(JobSeeker jobSeeker);
}
