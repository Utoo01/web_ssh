package org.gdcp.unit29.service;

import java.util.List;

import org.gdcp.unit29.entity.Merchandise;

public interface IMerchandiseService {

	// ��Ʒ������ѯ
	public List<Merchandise> findMerchandise(Merchandise merchandise);

	// ������Ʒ����
	public void saveMerchandise(Merchandise merchandise);

	// ��Ʒ��������
	public void updateMerchandise(Merchandise merchandise);

	// ɾ����Ʒ����
	public void deleteMerchandise(String[] merchandiseId);
}
