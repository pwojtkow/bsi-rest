package pwr.bsi.database.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pwr.bsi.database.dao.interfaces.IDao;

import java.io.Serializable;

@Transactional
@Repository
public abstract class AbstractDao<T, K extends Serializable> implements IDao<T,K> {

//    @PersistenceContext
//    protected EntityManager entityManager;
//
//    private Class<T> domainClass;
//
//    @Override
//    public T save(T entity) {
//        entityManager.persist(entity);
//        return entity;
//    }
//
//    @Override
//    @SuppressWarnings("unchecked")
//    public T getOne(K id) {
//        return entityManager.getReference(getDomainClass(), id);
//    }
//
//    @Override
//    @SuppressWarnings("unchecked")
//    public T findOne(K id) {
//        return entityManager.find(getDomainClass(), id);
//    }
//
//    @Override
//    @SuppressWarnings("unchecked")
//    public List<T> findAll() {
//        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
//        CriteriaQuery<T> criteriaQuery = builder.createQuery(getDomainClass());
//        criteriaQuery.from(getDomainClass());
//        TypedQuery<T> query = entityManager.createQuery(criteriaQuery);
//        return query.getResultList();
//    }
//
//    @Override
//    public T update(T entity) {
//        return entityManager.merge(entity);
//    }
//
//    @Override
//    public void delete(T entity) {
//        entityManager.remove(entity);
//    }
//
//    @Override
//    public void delete(K id) {
//        entityManager.remove(getOne(id));
//    }
//
//    @Override
//    public void deleteAll() {
//        entityManager.createQuery("TRUNCATE " + getDomainClassName()).executeUpdate();
//    }
//
//    @Override
//    public long count() {
//        return (long) entityManager.createQuery("Select count(*) from " + getDomainClassName()).getSingleResult();
//    }
//
//    @Override
//    public boolean exists(K id) {
//        return findOne(id) != null;
//    }
//
//    @SuppressWarnings("unchecked")
//    protected Class<T> getDomainClass() {
//        if (domainClass == null) {
//            ParameterizedType type = (ParameterizedType) getClass().getGenericSuperclass();
//            domainClass = (Class<T>) type.getActualTypeArguments()[0];
//        }
//        return domainClass;
//    }
//
//    protected String getDomainClassName() {
//        return getDomainClass().getName();
//    }
}