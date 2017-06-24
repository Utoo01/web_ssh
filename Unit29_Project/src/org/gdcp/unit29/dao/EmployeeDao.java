package org.gdcp.unit29.dao;

import java.util.ArrayList;
import java.util.List;

import org.gdcp.unit29.entity.Employee;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class EmployeeDao extends HibernateDaoSupport implements IEmployeeDao {

	/*
	 * 员工档案查询
	 */
	@Override
	public List<Employee> findEmployee(Employee employee) {
		// 对象查找条件
		DetachedCriteria criteria = DetachedCriteria.forClass(Employee.class);
		if (employee != null) {
			if (employee.getId() != null
					&& String.valueOf(employee.getId()).trim().length() > 0) {
				criteria.add(Restrictions.eq("id", employee.getId()));
			}
			if (employee.getCode() != null
					&& String.valueOf(employee.getCode()).trim().length() > 0) {
				criteria.add(Restrictions.eq("code", employee.getCode()));
			}
			if (employee.getName() != null
					&& String.valueOf(employee.getName()).trim().length() > 0) {
				criteria.add(Restrictions.like("name", employee.getName(),
						MatchMode.ANYWHERE));
			}
		}
		return this.getHibernateTemplate().findByCriteria(criteria);
	}

	/*
	 * 新增员工档案
	 */
	@Override
	public void saveEmployee(Employee employee) {
		this.getHibernateTemplate().save(employee);
		//this.getSession().beginTransaction().commit();
	}

	/*
	 * 员工档案更新
	 */
	@Override
	public void updateEmployee(Employee employee) {
		HibernateTemplate hibernateTemplate = this.getHibernateTemplate();
		Integer eid = employee.getId();
		// 根据id加载Employee对象
		Employee perstEmployee = (Employee) hibernateTemplate.load(
				Employee.class, eid);
		perstEmployee.setName(employee.getName());// 名称
		perstEmployee.setBirthday(employee.getBirthday());// 出生日期
		perstEmployee.setSex(employee.isSex());// 性别
		perstEmployee.setTelephone(employee.getTelephone());// 电话
		perstEmployee.setEmail(employee.getEmail());// Email
		// 更新
		hibernateTemplate.update(perstEmployee);

	}

	/*
	 * 删除员工档案
	 */
	@Override
	public void deleteEmployee(String[] employeeId) {
		List<Employee> entities = new ArrayList<Employee>();
		HibernateTemplate hibernateTemplate = this.getHibernateTemplate();
		for (String eid : employeeId) {
			entities.add((Employee) hibernateTemplate.load(Employee.class,
					Integer.valueOf(eid)));
		}
		// 批量删除
		hibernateTemplate.deleteAll(entities);
	}

}
