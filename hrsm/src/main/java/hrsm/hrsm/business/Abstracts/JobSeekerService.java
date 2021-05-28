package hrsm.hrsm.business.Abstracts;

import java.util.List;

import hrsm.hrsm.core.utitilies.results.DataResult;
import hrsm.hrsm.core.utitilies.results.Result;
import hrsm.hrsm.entities.Concretes.JobSeeker;

public interface JobSeekerService {

	DataResult<List<JobSeeker>> getAll();
	Result add(JobSeeker jobSeeker);
	Result delete(JobSeeker jobSeeker);
	Result update(JobSeeker jobSeeker);
}
