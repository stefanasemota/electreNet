package ch.albertlegrand.persistence.dao;

import org.springframework.dao.DataAccessException;

import java.io.Serializable;
import java.util.List;


public interface IGenericDao<T, ID extends Serializable>  {

	T findById(ID id, boolean lock);

	T getById(ID id, boolean lock);

	List<T> findAll();

	List<T> findByExample(T exampleInstance, String... excludeProperty);

	T makePersistent(T entity);

	void makeTransient(T entity);

	void update(Object o) throws DataAccessException;

	public T save(T entity);

}
