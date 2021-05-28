package hrsm.hrsm.business.Abstracts;

import java.util.List;

import hrsm.hrsm.core.utitilies.results.DataResult;
import hrsm.hrsm.entities.Concretes.Employer;
import hrsm.hrsm.core.utitilies.results.Result;

public interface EmployerService {
	
	DataResult<List<Employer>> getAll();
	Result add(Employer employer);
	Result delete(Employer employer);
	Result update(Employer employer);

}
