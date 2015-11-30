package edu.iut.app;

import java.util.ArrayList;

public class CriteriaPersonnes implements Criteria {
	private String test;
	@Override
	public ArrayList<ExamEvent> meetCriteria(ArrayList<ExamEvent> examEvents) {
		// TODO Auto-generated method stub
		
		ArrayList<ExamEvent>CriteriaPersonnes=new ArrayList<ExamEvent>();
		
		for(ExamEvent exam: examEvents){
			if(exam.student.getFirstname().equals(test)){
				CriteriaPersonnes.add(exam);
			}
		}
		return CriteriaPersonnes;
	}

}
