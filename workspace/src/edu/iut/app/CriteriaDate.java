package edu.iut.app;

import java.util.ArrayList;
import java.util.Date;

public class CriteriaDate implements Criteria {
 private Date test;
	@Override
	public ArrayList<ExamEvent> meetCriteria(ArrayList<ExamEvent> examEvents) {
		ArrayList<ExamEvent> CriteriaDate=new ArrayList<ExamEvent>();
		// TODO Auto-generated method stub

		for(ExamEvent exam: examEvents){
			if(exam.getClass().equals(test)){
				CriteriaDate.add(exam);
			}
		}
		return CriteriaDate;
	}
}
