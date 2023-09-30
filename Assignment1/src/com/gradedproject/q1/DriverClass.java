package com.gradedproject.q1;

public class DriverClass {

	public static void main(String[] args) {
		AdminDepartment ad = new AdminDepartment();
		HrDepartment hr = new HrDepartment();
		TechDepartment td = new TechDepartment();
        System.out.println("Welcome to the "+ad.departmentName());
        System.out.println(ad.getTodaysWork());
        System.out.println(ad.getWorkDeadline());
        System.out.println(ad.isTodayAHoliday());
        System.out.println();
        
        System.out.println("Welcome to the "+hr.departmentName());
        System.out.println(hr.doActivity());
        System.out.println(hr.getTodaysWork());
        System.out.println(hr.getWorkDeadline());
        System.out.println(hr.isTodayAHoliday());
        System.out.println();
        
        System.out.println("Welcome to the "+td.departmentName());
        System.out.println(td.getTodaysWork());
        System.out.println(td.getWorkDeadline());
        System.out.println(td.getTechStackInformation());
        System.out.println(td.isTodayAHoliday());
	}
}