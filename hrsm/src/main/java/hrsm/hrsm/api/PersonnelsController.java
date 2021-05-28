package hrsm.hrsm.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrsm.hrsm.business.Abstracts.PersonnelService;
import hrsm.hrsm.core.utitilies.results.DataResult;
import hrsm.hrsm.core.utitilies.results.Result;
import hrsm.hrsm.entities.Concretes.Personnel;

@RestController
@RequestMapping(name="/api/personnels")

public class PersonnelsController {
	private PersonnelService personnelService;
	
	@Autowired
	private PersonnelsController(PersonnelService personnelService) {
		super();
		this.personnelService = personnelService;
	};
	
	@GetMapping("/getall")
	public DataResult<List<Personnel>> getAll(){
		return this.personnelService.getAll();
	}
	
	@PostMapping
	public Result add(@RequestBody Personnel personnel) {
		return this.personnelService.add(personnel);
	}
	@PostMapping
	public Result delete(@RequestBody Personnel personnel) {
		return this.personnelService.delete(personnel);
	}
	@PostMapping
	public Result update(@RequestBody Personnel personnel) {
		return this.personnelService.update(personnel);
	}

}
