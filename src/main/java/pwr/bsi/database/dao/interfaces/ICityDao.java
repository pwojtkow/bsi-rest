package pwr.bsi.database.dao.interfaces;

import pwr.bsi.database.entities.CityEntity;

import java.util.List;

public interface ICityDao {

    CityEntity getCity(Integer id);
    List<CityEntity> getCities();

}
