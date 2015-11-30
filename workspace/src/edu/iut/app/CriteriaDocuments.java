package edu.iut.app;

import java.util.ArrayList;

public class CriteriaDocuments implements Criteria {
	private String test;
	@Override
	public ArrayList<ExamEvent> meetCriteria(ArrayList<ExamEvent> examEvents) {
		ArrayList<ExamEvent>CriteriaDocuments=new ArrayList<ExamEvent>();
		for(ExamEvent exam: examEvents){
			if(exam.documents.contains(test)){
				CriteriaDocuments.add(exam);
			}
		}
		return CriteriaDocuments;
	}

}
