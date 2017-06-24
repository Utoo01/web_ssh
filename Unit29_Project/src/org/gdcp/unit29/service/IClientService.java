package org.gdcp.unit29.service;

import java.util.List;

import org.gdcp.unit29.entity.Client;

public interface IClientService {

	// 客户档案查询
	public List<Client> findClient(Client client);

	// 新增客户档案
	public void saveClient(Client client);

	// 客户档案更新
	public void updateClient(Client client);

	// 删除客户档案
	public void deleteClient(String[] clientId);
}
