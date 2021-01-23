package com.cjc.app.If.master.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.If.master.main.model.Branch_Details;
import com.cjc.app.If.master.main.repository.MasterModuleRepository;
import com.cjc.app.If.master.main.service.MasterModuleService;
@Service
public class MasterModuleServiceImpl implements MasterModuleService{

	@Autowired
	MasterModuleRepository mmr;

	@Override
	public void saveData(Branch_Details bd) {

		mmr.save(bd);
		
	}
}
