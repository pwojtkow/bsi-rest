package pwr.bsi.rest.services.interfaces;

import pwr.bsi.database.entities.CityEntity;

import java.util.List;

public interface ICityService {

    List<CityEntity> getAllCities();
    CityEntity getOne(Integer id);
    //TODO: Add additional features
}
