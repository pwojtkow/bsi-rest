package pwr.bsi.rest.services.interfaces;

import pwr.bsi.database.entities.UserEntity;

import java.util.List;

public interface IUserService {

    List<UserEntity> getAllUsers();
    UserEntity getOne(Integer id);

}
