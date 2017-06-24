package org.gdcp.unit29.dao;

import java.util.ArrayList;
import java.util.List;

import org.gdcp.unit29.entity.Merchandise;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class MerchandiseDao extends HibernateDaoSupport implements
		IMerchandiseDao {

	/*
	 * 商品档案查询
	 */
	@Override
	public List<Merchandise> findMerchandise(Merchandise merchandise) {
		// 对象查找条件
		DetachedCriteria criteria = DetachedCriteria
				.forClass(Merchandise.class);
		if (merchandise != null) {
			if (merchandise.getId() != null
					&& String.valueOf(merchandise.getId()).trim().length() > 0) {
				criteria.add(Restrictions.eq("id", merchandise.getId()));
			}
			if (merchandise.getCode() != null
					&& String.valueOf(merchandise.getCode()).trim().length() > 0) {
				criteria.add(Restrictions.eq("code", merchandise.getCode()));
			}
			if (merchandise.getName() != null
					&& String.valueOf(merchandise.getName()).trim().length() > 0) {
				criteria.add(Restrictions.like("name", merchandise.getName(),
						MatchMode.ANYWHERE));
			}
		}
		return this.getHibernateTemplate().findByCriteria(criteria);
	}

	/*
	 * 新增商品档案
	 */
	@Override
	public void saveMerchandise(Merchandise merchandise) {
		this.getHibernateTemplate().save(merchandise);
	}

	/*
	 * 商品档案更新
	 */
	@Override
	public void updateMerchandise(Merchandise merchandise) {
		HibernateTemplate hibernateTemplate = this.getHibernateTemplate();
		Integer mid = merchandise.getId();
		// 根据id加载Merchandise对象
		Merchandise perstMerchandise = (Merchandise) hibernateTemplate.load(
				Merchandise.class, mid);
		perstMerchandise.setName(merchandise.getName());// 名称
		perstMerchandise.setPrice(merchandise.getPrice());// 价格
		// 更新
		hibernateTemplate.update(perstMerchandise);

	}

	/*
	 * 删除商品档案
	 */
	@Override
	public void deleteMerchandise(String[] merchandiseId) {
		List<Merchandise> entities = new ArrayList<Merchandise>();
		HibernateTemplate hibernateTemplate = this.getHibernateTemplate();
		for (String mid : merchandiseId) {
			entities.add((Merchandise) hibernateTemplate.load(
					Merchandise.class, Integer.valueOf(mid)));
		}
		// 批量删除
		hibernateTemplate.deleteAll(entities);
	}

}
