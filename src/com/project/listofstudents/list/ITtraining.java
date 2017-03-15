package com.project.listofstudents.list;

import java.util.ArrayList;
import java.util.List;

public class ITtraining{
	//StudentsDetails sde;
	List<StudentsDetails> stdetail=new ArrayList<>(); //how to accept object of StudentsDetails???
	public ITtraining(StudentsDetails sde){  //always this??
		stdetail.add(sde);
	}
	//stdetail.add(sde);
	//stdetail.add(StudentsDetails sde);  only when constructor used?
}
