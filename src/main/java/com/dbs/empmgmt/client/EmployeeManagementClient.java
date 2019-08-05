package com.dbs.empmgmt.client;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dbs.empmgmt.controller.EmployeeController;
import com.dbs.empmgmt.model.Employee;

public class EmployeeManagementClient {

	public static void main(String[] args)
	{
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        EmployeeController employeeController = applicationContext.getBean(EmployeeController.class);
        Employee employee = new Employee(12,"Harish", LocalDate.of(1985,5, 25));

        employeeController.saveEmployee(employee);

	}
}
