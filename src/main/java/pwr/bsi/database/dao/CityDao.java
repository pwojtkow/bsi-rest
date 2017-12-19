package pwr.bsi.database.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pwr.bsi.database.entities.CityEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Transactional
@Repository
public class CityDao implements ICityDao {

    //TODO:SQL injection secure need to be added

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public CityEntity getCity(Integer id) {
        return entityManager.find(CityEntity.class, id);
    }

    @Override
    public List<CityEntity> getCities() {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<CityEntity> criteriaQuery = builder.createQuery(CityEntity.class);
        criteriaQuery.from(CityEntity.class);
        TypedQuery<CityEntity> query = entityManager.createQuery(criteriaQuery);
        return query.getResultList();
    }
}
