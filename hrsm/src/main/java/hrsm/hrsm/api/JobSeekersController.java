package hrsm.hrsm.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrsm.hrsm.business.Abstracts.JobSeekerService;
import hrsm.hrsm.core.utitilies.results.DataResult;
import hrsm.hrsm.core.utitilies.results.Result;
import hrsm.hrsm.entities.Concretes.JobSeeker;

@RestController
@RequestMapping("/api/jobseekers")
public class JobSeekersController {
	private JobSeekerService jobSeekerService;
	
	@Autowired 
	private JobSeekersController(JobSeekerService jobSeekerService) {
		super();
		this.jobSeekerService = jobSeekerService;
	}
	
	 @GetMapping("/getall")
	 public DataResult<List<JobSeeker>> getAll(){
		 return this.jobSeekerService.getAll();
	 }
	 
	 @PostMapping("/add")
	 public Result add(@RequestBody JobSeeker jobSeeker) {
	 	return this.jobSeekerService.add(jobSeeker);
	 }
	 @PostMapping("/delete")
	 public Result delete(@RequestBody JobSeeker jobSeeker) {
	 	return this.jobSeekerService.delete(jobSeeker);
	 }
	 @PostMapping("/update")
	 public Result update(@RequestBody JobSeeker jobSeeker) {
	 	return this.jobSeekerService.update(jobSeeker);
	 }
}
