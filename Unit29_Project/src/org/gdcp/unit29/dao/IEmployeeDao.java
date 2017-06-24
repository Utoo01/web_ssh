package org.gdcp.unit29.dao;

import java.util.List;

import org.gdcp.unit29.entity.Employee;

public interface IEmployeeDao {

	// Ա��������ѯ
	public List<Employee> findEmployee(Employee employee);

	// ����Ա������
	public void saveEmployee(Employee employee);

	// Ա����������
	public void updateEmployee(Employee employee);

	// ɾ��Ա������
	public void deleteEmployee(String[] employeeId);

}
