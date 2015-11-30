package edu.iut.app;

import java.util.ArrayList;

public class CriteriaSalles implements Criteria {
	private String test;
	@Override
	public ArrayList<ExamEvent> meetCriteria(ArrayList<ExamEvent> examEvents) {
	ArrayList<ExamEvent>CriteriaSalles=new ArrayList<ExamEvent>();
		for(ExamEvent exam: examEvents){
			if(exam.classroom.getClassRoomNumber().equals(test)){
				CriteriaSalles.add(exam);
			}
		}
		return CriteriaSalles;
	}
}
