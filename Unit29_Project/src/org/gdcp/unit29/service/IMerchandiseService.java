package org.gdcp.unit29.service;

import java.util.List;

import org.gdcp.unit29.entity.Merchandise;

public interface IMerchandiseService {

	// 商品档案查询
	public List<Merchandise> findMerchandise(Merchandise merchandise);

	// 新增商品档案
	public void saveMerchandise(Merchandise merchandise);

	// 商品档案更新
	public void updateMerchandise(Merchandise merchandise);

	// 删除商品档案
	public void deleteMerchandise(String[] merchandiseId);
}
