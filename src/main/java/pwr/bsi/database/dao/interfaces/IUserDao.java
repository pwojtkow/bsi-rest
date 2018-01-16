package pwr.bsi.database.dao.interfaces;

import pwr.bsi.database.entities.UserEntity;

import java.util.List;

public interface IUserDao {
    List<UserEntity> findAll();
    UserEntity getOne(Integer id);
}
