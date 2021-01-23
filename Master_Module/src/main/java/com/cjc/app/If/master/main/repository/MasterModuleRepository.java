package com.cjc.app.If.master.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.If.master.main.model.Branch_Details;
@Repository
public interface MasterModuleRepository extends CrudRepository<Branch_Details, Integer>{

}
