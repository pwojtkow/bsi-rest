package pwr.bsi.database.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pwr.bsi.database.entities.AccountTypeEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class AccountTypeDao extends AbstractDao<AccountTypeEntity, Integer> implements IAccountTypeDao{

}

//public class AccountTypeDao implements IAccountTypeDao {
//
//	@PersistenceContext EntityManager entityManager;
//
//	@Override public AccountTypeEntity getOne(Integer id) {
//		return entityManager.find(AccountTypeEntity.class, id);
//	}
//
//	@Override public List<AccountTypeEntity> getAll() {
//		return null;
//	}
//
//	@Override public AccountTypeEntity save(AccountTypeEntity entity) {
//		return null;
//	}
//
//	@Override public AccountTypeEntity delete(Integer id) {
//		return null;
//	}
//}
