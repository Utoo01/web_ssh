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
	 * Ա��������ѯ
	 */
	@Override
	public List<Employee> findEmployee(Employee employee) {
		// �����������
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
	 * ����Ա������
	 */
	@Override
	public void saveEmployee(Employee employee) {
		this.getHibernateTemplate().save(employee);
		//this.getSession().beginTransaction().commit();
	}

	/*
	 * Ա����������
	 */
	@Override
	public void updateEmployee(Employee employee) {
		HibernateTemplate hibernateTemplate = this.getHibernateTemplate();
		Integer eid = employee.getId();
		// ����id����Employee����
		Employee perstEmployee = (Employee) hibernateTemplate.load(
				Employee.class, eid);
		perstEmployee.setName(employee.getName());// ����
		perstEmployee.setBirthday(employee.getBirthday());// ��������
		perstEmployee.setSex(employee.isSex());// �Ա�
		perstEmployee.setTelephone(employee.getTelephone());// �绰
		perstEmployee.setEmail(employee.getEmail());// Email
		// ����
		hibernateTemplate.update(perstEmployee);

	}

	/*
	 * ɾ��Ա������
	 */
	@Override
	public void deleteEmployee(String[] employeeId) {
		List<Employee> entities = new ArrayList<Employee>();
		HibernateTemplate hibernateTemplate = this.getHibernateTemplate();
		for (String eid : employeeId) {
			entities.add((Employee) hibernateTemplate.load(Employee.class,
					Integer.valueOf(eid)));
		}
		// ����ɾ��
		hibernateTemplate.deleteAll(entities);
	}

}
