package com.greatlearning.department.main;

import com.greatlearning.department.service.AdminDepartment;
import com.greatlearning.department.service.HrDepartment;
import com.greatlearning.department.service.TechDepartment;

public class Driver {
	public static void main(String[] args) {

		AdminDepartment ad = new AdminDepartment();
		System.out.println("Welcome to " + ad.departmentName() + "\n" + ad.getTodaysWork() + "\n" + ad.getWorkDeadline()
				+ "\n" + ad.isTodayAHoliday());

		System.out.println(" ");

		HrDepartment hrd = new HrDepartment();
		System.out.println("Welcome to " + hrd.departmentName() + "\n" + hrd.doActivity() + "\n" + hrd.getTodaysWork()
				+ "\n" + hrd.getWorkDeadline() + "\n" + hrd.isTodayAHoliday());

		System.out.println(" ");

		TechDepartment td = new TechDepartment();
		System.out.println("Welcome to " + td.departmentName() + "\n" + td.getTodaysWork() + "\n" + td.getWorkDeadline()
				+ "\n" + td.getTechStackInformation() + "\n" + td.isTodayAHoliday());
	}
}
