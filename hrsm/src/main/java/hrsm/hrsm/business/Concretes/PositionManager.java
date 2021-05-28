package hrsm.hrsm.business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import hrsm.hrsm.business.Abstracts.PositionService;
import hrsm.hrsm.core.utitilies.results.DataResult;
import hrsm.hrsm.core.utitilies.results.Result;
import hrsm.hrsm.core.utitilies.results.SuccessDataResult;
import hrsm.hrsm.core.utitilies.results.SuccessResult;
import hrsm.hrsm.dataAccess.Abstracts.PositionDao;
import hrsm.hrsm.entities.Concretes.Position;


public class PositionManager implements PositionService{

	private PositionDao positionDao;
	
	@Autowired
	public PositionManager(PositionDao positionDao) {
		super();
		this.positionDao = positionDao;
	}
	@Override
	public DataResult<List<Position>> getAll() {
		return new SuccessDataResult<List<Position>>
		(this.positionDao.findAll(),"Tüm Pozisyonlar Listesi");	
	}

	@Override
	public Result add(Position position) {
		this.positionDao.save(position);
		return new SuccessResult("Yeni Patron eklendi");
	}

	@Override
	public Result delete(Position position) {
		this.positionDao.save(position);
		return new SuccessResult("Patron  silindi");
	}

	@Override
	public Result update(Position position) {
		this.positionDao.save(position);
		return new SuccessResult("Patronun bilgileri güncellendi");
	}

	

}
