package pwr.bsi.rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pwr.bsi.database.dao.IAccountTypeDao;
import pwr.bsi.database.entities.AccountTypeEntity;

import java.util.List;

@Service
public class AccountTypeService implements IAccountTypeService{

	@Autowired
	IAccountTypeDao dao;

	@Override public AccountTypeEntity getOne(Integer id) {
		return dao.getOne(id);
	}

	@Override public AccountTypeEntity getOneByName(String name) {
		return null;
	}

	@Override public List<AccountTypeEntity> getAll() {
		return null;
	}

	@Override public AccountTypeEntity createAccountType(AccountTypeEntity entity) {
		return null;
	}

	@Override public AccountTypeEntity deleteAccountType(Integer id) {
		return null;
	}
}
