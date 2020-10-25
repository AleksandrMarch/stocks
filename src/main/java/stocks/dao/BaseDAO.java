package stocks.dao;

import java.util.*;

public interface BaseDAO <T,K> {

  T getById(K id);

  void save(K id, T object);

  void delete(K id);

  Collection<T> getAll();

}
