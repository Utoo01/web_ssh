package org.gdcp.unit29.service;

import java.util.List;

import org.gdcp.unit29.dao.IEmployeeDao;
import org.gdcp.unit29.entity.Employee;

public class EmployeeService implements IEmployeeService {
	private IEmployeeDao employeeDao;

	/*
	 * Ա��������ѯ
	 */
	@Override
	public List<Employee> findEmployee(Employee employee) {
		return employeeDao.findEmployee(employee);
	}

	/*
	 * ����Ա������
	 */
	@Override
	public void saveEmployee(Employee employee) {
		employeeDao.saveEmployee(employee);
	}

	/*
	 * Ա����������
	 */
	@Override
	public void updateEmployee(Employee employee) {
		employeeDao.updateEmployee(employee);
	}

	/*
	 * ɾ��Ա������
	 */
	@Override
	public void deleteEmployee(String[] employeeId) {
		employeeDao.deleteEmployee(employeeId);
	}

	public IEmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(IEmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

}
