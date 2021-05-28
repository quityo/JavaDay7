package hrsm.hrsm.business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import hrsm.hrsm.business.Abstracts.PersonnelService;
import hrsm.hrsm.core.utitilies.results.DataResult;
import hrsm.hrsm.core.utitilies.results.Result;
import hrsm.hrsm.core.utitilies.results.SuccessDataResult;
import hrsm.hrsm.core.utitilies.results.SuccessResult;
import hrsm.hrsm.dataAccess.Abstracts.PersonnelDao;
import hrsm.hrsm.entities.Concretes.Personnel;

public class PersonnelManager implements PersonnelService{
	
	private PersonnelDao personnelDao;
	
	@Autowired
	public PersonnelManager(PersonnelDao personnelDao) {
		super();
		this.personnelDao = personnelDao;
	}

	@Override
	public DataResult<List<Personnel>> getAll() {
		return new SuccessDataResult<List<Personnel>>
		(this.personnelDao.findAll(),"Personel Listesi");
	}

	@Override
	public Result add(Personnel personnel) {
		this.personnelDao.save(personnel);
		return new SuccessResult("Personel eklendi");
	}

	@Override
	public Result delete(Personnel personnel) {
		this.personnelDao.save(personnel);
		return new SuccessResult("Personel Kaydi Silindi");
	}

	@Override
	public Result update(Personnel personnel) {
		this.personnelDao.save(personnel);
		return new SuccessResult("Personel Kaydi Guncellendi");
	}

}
