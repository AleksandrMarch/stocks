package stocks.dao;

import java.util.*;

public interface BaseDAO <T, K> {

  K read(T id);

  void save(T id, K object);

  void delete(T id);

  Collection<K> getAll();

}
