package org.gdcp.unit29.action;

import java.util.Iterator;
import java.util.List;

import org.gdcp.unit29.entity.Employee;
import org.gdcp.unit29.service.IEmployeeService;

public class EmployeeAction {
	private IEmployeeService employeeService;// 员工档案业务处理接口
	private Employee employee;// 作为条件的对象
	private List<Employee> employees;// 查询结果
	private String finish_Url;// 操作完成跳转的地址
	private String[] employeeId;// 要删除员工的Id

	/**
	 * 员工档案查询
	 * 
	 * @return
	 */
	public String findEmployee() {
		employees = employeeService.findEmployee(employee);
		return "findEmployee";
	}

	/**
	 * 根据编号查询员工档案
	 * 
	 * @param code
	 * @return
	 */
	public int findEmployeeByCode(String code) {
		employee = new Employee();
		employee.setCode(code);
		employees = employeeService.findEmployee(employee);
		System.out.println("你好"+employees.size());
		return employees.size();
	}

	/**
	 * 新增员工档案
	 * 
	 * @return
	 */
	public String saveEmployee() {
		employeeService.saveEmployee(employee);
		// 添加成功页面显示完后跳转的页面，显示Employee表中所有信息
		finish_Url = "employeeAction!findEmployee.action";
		employee = null;
		return "finish";
	}

	/**
	 * 员工档案更新前查询
	 * 
	 * @return
	 */
	public String preUpdateEmployee() {
		employee = employeeService.findEmployee(employee).get(0);
		return "updateEmployee";
	}

	/**
	 * 员工档案更新
	 * 
	 * @return
	 */
	public String updateEmployee() {
		employeeService.updateEmployee(employee);
		// 更新成功页面显示完后跳转的页面，显示Employee表中所有信息
		finish_Url = "employeeAction!findEmployee.action";
		employee = null;
		return "finish";
	}

	/**
	 * 删除员工档案
	 * 
	 * @return
	 */
	public String deleteEmployee() {
		employeeService.deleteEmployee(employeeId);
		// 删除成功页面显示完后跳转的页面，显示Employee表中所有信息
		finish_Url = "employeeAction!findEmployee.action";
		return "finish";
	}

	public IEmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public String getFinish_Url() {
		return finish_Url;
	}

	public void setFinish_Url(String finish_Url) {
		this.finish_Url = finish_Url;
	}

	public String[] getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String[] employeeId) {
		this.employeeId = employeeId;
	}

}
