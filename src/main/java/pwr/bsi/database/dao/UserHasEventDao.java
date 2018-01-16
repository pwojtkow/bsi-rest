package pwr.bsi.database.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pwr.bsi.database.dao.interfaces.IUserHasEventDao;
import pwr.bsi.database.entities.UserHasEventEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Transactional
@Repository
public class UserHasEventDao implements IUserHasEventDao {

    @PersistenceContext
    protected EntityManager entityManager;

    @Override
    public List<UserHasEventEntity> getAllUserEvents(Integer userId) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<UserHasEventEntity> criteriaQuery = builder.createQuery(UserHasEventEntity.class);
        criteriaQuery.from(UserHasEventEntity.class);
        TypedQuery<UserHasEventEntity> query = entityManager.createQuery(criteriaQuery);
        return query.getResultList();
    }

    @Override
    public UserHasEventEntity getOne(Integer id) {
        return entityManager.find(UserHasEventEntity.class, id);
    }

}
