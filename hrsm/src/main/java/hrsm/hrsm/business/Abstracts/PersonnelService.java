package hrsm.hrsm.business.Abstracts;

import java.util.List;

import hrsm.hrsm.core.utitilies.results.DataResult;
import hrsm.hrsm.core.utitilies.results.Result;
import hrsm.hrsm.entities.Concretes.Personnel;

public interface PersonnelService {
	DataResult<List<Personnel>> getAll();
	Result add(Personnel personel);
	Result delete(Personnel personnel);
	Result update(Personnel personnel);

}
