package org.gdcp.unit29.service;

import java.util.List;

import org.gdcp.unit29.dao.IStockinDao;
import org.gdcp.unit29.entity.Stockin;

public class StockinService implements IStockinService {
	private IStockinDao stockinDao;

	/*
	 * ��������ѯ
	 */
	@Override
	public List<Stockin> findStockin(Stockin stockin) {
		return stockinDao.findStockin(stockin);
	}

	/*
	 * ����������
	 */
	@Override
	public void saveStockin(Stockin stockin) {
		stockinDao.saveStockin(stockin);
	}

	/*
	 * ����������
	 */
	@Override
	public void updateStockin(Stockin stockin) {
		stockinDao.updateStockin(stockin);
	}

	/*
	 * ������ɾ��
	 */
	@Override
	public void deleteStockin(String[] stockinId) {
		stockinDao.deleteStockin(stockinId);
	}

	public IStockinDao getStockinDao() {
		return stockinDao;
	}

	public void setStockinDao(IStockinDao stockinDao) {
		this.stockinDao = stockinDao;
	}

}
