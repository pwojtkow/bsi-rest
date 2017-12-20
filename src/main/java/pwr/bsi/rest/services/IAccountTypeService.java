package pwr.bsi.rest.services;

import pwr.bsi.database.entities.AccountTypeEntity;

import java.util.List;

public interface IAccountTypeService {

	AccountTypeEntity getOne(Integer id);
	AccountTypeEntity getOneByName(String name);
	List<AccountTypeEntity> getAll();
	AccountTypeEntity createAccountType(AccountTypeEntity entity);
	AccountTypeEntity deleteAccountType(Integer id);

}
