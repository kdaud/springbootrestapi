package com.kdaud.springbootrest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FelloshipResource {
	
	@RequestMapping("fellows")
	public List<Fellowship>getFellows(){
 List<Fellowship>fellows=new ArrayList<>();
 
 Fellowship ab=new Fellowship();
 ab.setId(101);
 ab.setFellowName("Daud Kakumirizi");
 ab.setCatagory("QA Engineer");
 ab.setEligibility(true);
 
 Fellowship ac=new Fellowship();
 ac.setId(102);
 ac.setFellowName("Samuel Male");
 ac.setCatagory("MF-Dev");
 ac.setEligibility(false);
 
 Fellowship ad=new Fellowship();
 ad.setId(104);
 ad.setFellowName("Daniel Kayiwa");
 ad.setCatagory("Core Contributer");
 ad.setEligibility(true);
 
 Fellowship ak=new Fellowship();
 ak.setId(105);
 ak.setFellowName("Harman Muhereza");
 ak.setCatagory("OCL Lab");
 ak.setEligibility(false);
 
 fellows.add(ab);
 fellows.add(ac);
 fellows.add(ak);
 fellows.add(ad);
 
 return fellows;
 
	}

}
