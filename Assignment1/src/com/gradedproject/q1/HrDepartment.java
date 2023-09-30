package com.gradedproject.q1;

public class HrDepartment extends AdminDepartment{
	public String departmentName() {
		return "HR Department";
	}
	public String getTodaysWork() {
		return "Fill out today's timesheet and mark your attendence";
	}
    public String doActivity() {
    	return "Team lunch";
    }
}
