package pwr.bsi.database.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pwr.bsi.database.dao.interfaces.ICommentDao;
import pwr.bsi.database.entities.CommentEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Transactional
@Repository
public class CommentDao implements ICommentDao{


    @PersistenceContext
    protected EntityManager entityManager;

    @Override
    public List<CommentEntity> getAllComments() {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<CommentEntity> criteriaQuery = builder.createQuery(CommentEntity.class);
        criteriaQuery.from(CommentEntity.class);
        TypedQuery<CommentEntity> query = entityManager.createQuery(criteriaQuery);
        return query.getResultList();
    }
}
