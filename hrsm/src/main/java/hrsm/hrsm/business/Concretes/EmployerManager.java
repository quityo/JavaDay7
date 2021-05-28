package hrsm.hrsm.business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import hrsm.hrsm.business.Abstracts.EmployerService;
import hrsm.hrsm.core.utitilies.results.DataResult;
import hrsm.hrsm.core.utitilies.results.Result;
import hrsm.hrsm.core.utitilies.results.SuccessDataResult;
import hrsm.hrsm.core.utitilies.results.SuccessResult;
import hrsm.hrsm.dataAccess.Abstracts.EmployerDao;
import hrsm.hrsm.entities.Concretes.Employer;

public class EmployerManager implements EmployerService{
	
	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAll(){ 
		return new SuccessDataResult<List<Employer>>
		(this.employerDao.findAll(),"Tüm Patronların Listesi");	
		}
	

	@Override
	public Result add(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult("Yeni Patron eklendi");
		}

	@Override
	public Result delete(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult("Patron  silindi");
		}

	@Override
	public Result update(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult("Patronun bilgileri guncellendi");
		}


}
