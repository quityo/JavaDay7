package hrsm.hrsm.business.Abstracts;

import java.util.List;

import hrsm.hrsm.core.utitilies.results.DataResult;
import hrsm.hrsm.core.utitilies.results.Result;
import hrsm.hrsm.entities.Concretes.User;

public interface UserService {
	DataResult<List<User>> getAll();
    Result add(User user);
    Result delete(User user);
    Result update(User user);
}
