package hrsm.hrsm.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrsm.hrsm.business.Abstracts.EmployerService;
import hrsm.hrsm.core.utitilies.results.DataResult;
import hrsm.hrsm.core.utitilies.results.Result;
import hrsm.hrsm.entities.Concretes.Employer;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {
	private EmployerService employerService;
	
	@Autowired
	private EmployersController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll(){
		return this.employerService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Employer employer) {
		return this.employerService.add(employer);
	}
	@PostMapping("/delete")
	public Result delete(@RequestBody Employer employer) {
		return this.employerService.delete(employer);
	}
	@PostMapping("/update")
	public Result update(@RequestBody Employer employer) {
		return this.employerService.update(employer);
	}
}
