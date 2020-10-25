package stocks.dao.impl;

import stocks.dao.BaseDAO;

import java.util.*;

public class BaseDAOImpl<K,T> implements BaseDAO<K,T> {

  private Map<T, K> elements = new HashMap<>();

  @Override
  public K getById(T id) {
    return elements.get(id);
  }

  @Override
  public void save(T id, K object) {
    elements.put(id, object);
  }

  @Override
  public void delete(T id) {
    elements.remove(id);
  }

  @Override
  public Collection<K> getAll() {
    return elements.values();
  }
}
