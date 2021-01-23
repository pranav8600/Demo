package com.cjc.app.If.master.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.If.master.main.model.Branch_Details;
import com.cjc.app.If.master.main.service.MasterModuleService;

@RestController
public class MasterModuleController {

	@Autowired
	MasterModuleService mms;
	
	@PostMapping("/savedata")
	public String saveData(@RequestBody Branch_Details bd) {
		mms.saveData(bd);
		return "save";
	}
}
