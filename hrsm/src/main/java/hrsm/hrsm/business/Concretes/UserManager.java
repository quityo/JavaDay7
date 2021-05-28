package hrsm.hrsm.business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import hrsm.hrsm.business.Abstracts.UserService;
import hrsm.hrsm.core.utitilies.results.DataResult;
import hrsm.hrsm.core.utitilies.results.Result;
import hrsm.hrsm.core.utitilies.results.SuccessDataResult;
import hrsm.hrsm.core.utitilies.results.SuccessResult;
import hrsm.hrsm.dataAccess.Abstracts.UserDao;
import hrsm.hrsm.entities.Concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>
		(this.userDao.findAll(),"Data listelendi");	
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Kullanıcı eklendi");
	}

	@Override
	public Result delete(User user) {
		this.userDao.save(user);
		return new SuccessResult("Kullanıcı  silindi");
	}

	@Override
	public Result update(User user) {
		this.userDao.save(user);
		return new SuccessResult("Kullanıcı bilgileri güncellendi");
	}

}
