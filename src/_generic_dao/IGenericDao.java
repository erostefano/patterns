package _generic_dao;

public interface IGenericDao<T> {
    T save(T entity);
}
