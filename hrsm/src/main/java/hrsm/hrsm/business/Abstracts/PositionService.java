package hrsm.hrsm.business.Abstracts;

import java.util.List;

import hrsm.hrsm.core.utitilies.results.DataResult;
import hrsm.hrsm.core.utitilies.results.Result;
import hrsm.hrsm.entities.Concretes.Position;

public interface PositionService {
    DataResult<List<Position>> getAll();
    Result add(Position position);
    Result delete(Position position);
    Result update(Position position);

}
