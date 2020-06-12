package com.campusriddles.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.campusriddles.entities.Explorer;
import com.campusriddles.repos.ExplorerRepository;

@RestController
public class ExplorerRestController {

	@Autowired //create the repo at runtime and inject it
	ExplorerRepository explorerRepository;
	
	@RequestMapping(value="/auth",method=RequestMethod.GET) //binding method gives the uri to call crud
	public List<Explorer> authExplorer(){
		return explorerRepository.findAll();		//will fetch from sql and convert to JSON then return to show on uri
	}
	
	@RequestMapping(value="/t")
	public void test() {
		System.out.println("tester");
	}
	
}
