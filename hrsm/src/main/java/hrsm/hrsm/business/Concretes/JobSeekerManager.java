package hrsm.hrsm.business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import hrsm.hrsm.business.Abstracts.JobSeekerService;
import hrsm.hrsm.core.utitilies.results.DataResult;
import hrsm.hrsm.core.utitilies.results.Result;
import hrsm.hrsm.core.utitilies.results.SuccessDataResult;
import hrsm.hrsm.core.utitilies.results.SuccessResult;
import hrsm.hrsm.dataAccess.Abstracts.JobSeekerDao;
import hrsm.hrsm.entities.Concretes.JobSeeker;

public class JobSeekerManager implements JobSeekerService{
	
	private JobSeekerDao jobSeekerDao;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerDao = jobSeekerDao;
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		return new SuccessDataResult<List<JobSeeker>>
		(this.jobSeekerDao.findAll(),"Is Basvuru Listesi");	
	}


	@Override
	public Result add(JobSeeker jobSeeker) {
		this.jobSeekerDao.save(jobSeeker);
		return new SuccessResult("Is Basvuru Islemi Tamamlandi");
		
	}

	@Override
	public Result delete(JobSeeker jobSeeker) {
		this.jobSeekerDao.save(jobSeeker);
		return new SuccessResult("Is Basvuru Islemi Silindi");
	}

	@Override
	public Result update(JobSeeker jobSeeker) {
		this.jobSeekerDao.save(jobSeeker);
		return new SuccessResult("Is Basvuru Islemi Guncellendi");
	}
}
