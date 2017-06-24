package org.gdcp.unit29.service;

import java.util.List;

import org.gdcp.unit29.dao.IEmployeeDao;
import org.gdcp.unit29.entity.Employee;

public class EmployeeService implements IEmployeeService {
	private IEmployeeDao employeeDao;

	/*
	 * 员工档案查询
	 */
	@Override
	public List<Employee> findEmployee(Employee employee) {
		return employeeDao.findEmployee(employee);
	}

	/*
	 * 新增员工档案
	 */
	@Override
	public void saveEmployee(Employee employee) {
		employeeDao.saveEmployee(employee);
	}

	/*
	 * 员工档案更新
	 */
	@Override
	public void updateEmployee(Employee employee) {
		employeeDao.updateEmployee(employee);
	}

	/*
	 * 删除员工档案
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
