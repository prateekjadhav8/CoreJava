package com.CollectionFrameWorkExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestEmployeeSalaryQ2 implements Comparator<EmployeeSalaryQ2>{


	@Override
	public int compare(EmployeeSalaryQ2 o1, EmployeeSalaryQ2 o2) {
		// TODO Auto-generated method stub
		return o2.getSalary()-o1.getSalary();
	}
}