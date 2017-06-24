package org.gdcp.unit29.dao;

import java.util.List;

import org.gdcp.unit29.entity.Stockin;

public interface IStockinDao {

	// ��������ѯ
	public List<Stockin> findStockin(Stockin stockin);

	// ����������
	public void saveStockin(Stockin stockin);

	// ����������
	public void updateStockin(Stockin stockin);

	// ������ɾ��
	public void deleteStockin(String[] stockinId);

}
