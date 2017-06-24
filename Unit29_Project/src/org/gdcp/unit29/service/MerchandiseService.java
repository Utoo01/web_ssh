package org.gdcp.unit29.service;

import java.util.List;

import org.gdcp.unit29.dao.IMerchandiseDao;
import org.gdcp.unit29.entity.Merchandise;

public class MerchandiseService implements IMerchandiseService {
	private IMerchandiseDao merchandiseDao;

	/*
	 * 商品档案查询
	 */
	@Override
	public List<Merchandise> findMerchandise(Merchandise merchandise) {
		return merchandiseDao.findMerchandise(merchandise);
	}

	/*
	 * 新增商品档案
	 */
	@Override
	public void saveMerchandise(Merchandise merchandise) {
		merchandiseDao.saveMerchandise(merchandise);
	}

	/*
	 * 商品档案更新
	 */
	@Override
	public void updateMerchandise(Merchandise merchandise) {
		merchandiseDao.updateMerchandise(merchandise);
	}

	/*
	 * 删除商品档案
	 */
	@Override
	public void deleteMerchandise(String[] merchandiseId) {
		merchandiseDao.deleteMerchandise(merchandiseId);
	}

	public IMerchandiseDao getMerchandiseDao() {
		return merchandiseDao;
	}

	public void setMerchandiseDao(IMerchandiseDao merchandiseDao) {
		this.merchandiseDao = merchandiseDao;
	}

}
