package pwr.bsi.database.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pwr.bsi.database.entities.EventEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Transactional
@Repository
//public class EventDao extends AbstractDao<EventEntity, Long> implements IEventDao {
public class EventDao implements IEventDao {

    @PersistenceContext
    protected EntityManager entityManager;

    public List<EventEntity> findAll() {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<EventEntity> criteriaQuery = builder.createQuery(EventEntity.class);
        criteriaQuery.from(EventEntity.class);
        TypedQuery<EventEntity> query = entityManager.createQuery(criteriaQuery);
        return query.getResultList();
    }

    @Override
    public EventEntity getOne(Integer id) {
        return entityManager.find(EventEntity.class, id);
    }
}
