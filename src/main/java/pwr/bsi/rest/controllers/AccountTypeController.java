package pwr.bsi.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pwr.bsi.database.entities.AccountTypeEntity;
import pwr.bsi.rest.services.AccountTypeService;

@RestController
@RequestMapping(path = "/acctype")
public class AccountTypeController {

	@Autowired
	AccountTypeService service;

	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<AccountTypeEntity> getAccountType(@PathVariable("id") Integer id) {
		AccountTypeEntity accountType = service.getOne(id);
		if (accountType == null) {
			return new ResponseEntity<AccountTypeEntity>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<AccountTypeEntity>(accountType, HttpStatus.OK);
	}

	@RequestMapping(params = { "name" }, method = RequestMethod.GET)
	public RequestEntity<AccountTypeEntity> getAccountTypeByName(String name) {
		return null;
	}

}
