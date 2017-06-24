package org.gdcp.unit29.action;

import java.util.Iterator;
import java.util.List;

import org.gdcp.unit29.entity.Employee;
import org.gdcp.unit29.service.IEmployeeService;

public class EmployeeAction {
	private IEmployeeService employeeService;// Ա������ҵ����ӿ�
	private Employee employee;// ��Ϊ�����Ķ���
	private List<Employee> employees;// ��ѯ���
	private String finish_Url;// ���������ת�ĵ�ַ
	private String[] employeeId;// Ҫɾ��Ա����Id

	/**
	 * Ա��������ѯ
	 * 
	 * @return
	 */
	public String findEmployee() {
		employees = employeeService.findEmployee(employee);
		return "findEmployee";
	}

	/**
	 * ���ݱ�Ų�ѯԱ������
	 * 
	 * @param code
	 * @return
	 */
	public int findEmployeeByCode(String code) {
		employee = new Employee();
		employee.setCode(code);
		employees = employeeService.findEmployee(employee);
		System.out.println("���"+employees.size());
		return employees.size();
	}

	/**
	 * ����Ա������
	 * 
	 * @return
	 */
	public String saveEmployee() {
		employeeService.saveEmployee(employee);
		// ��ӳɹ�ҳ����ʾ�����ת��ҳ�棬��ʾEmployee����������Ϣ
		finish_Url = "employeeAction!findEmployee.action";
		employee = null;
		return "finish";
	}

	/**
	 * Ա����������ǰ��ѯ
	 * 
	 * @return
	 */
	public String preUpdateEmployee() {
		employee = employeeService.findEmployee(employee).get(0);
		return "updateEmployee";
	}

	/**
	 * Ա����������
	 * 
	 * @return
	 */
	public String updateEmployee() {
		employeeService.updateEmployee(employee);
		// ���³ɹ�ҳ����ʾ�����ת��ҳ�棬��ʾEmployee����������Ϣ
		finish_Url = "employeeAction!findEmployee.action";
		employee = null;
		return "finish";
	}

	/**
	 * ɾ��Ա������
	 * 
	 * @return
	 */
	public String deleteEmployee() {
		employeeService.deleteEmployee(employeeId);
		// ɾ���ɹ�ҳ����ʾ�����ת��ҳ�棬��ʾEmployee����������Ϣ
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
