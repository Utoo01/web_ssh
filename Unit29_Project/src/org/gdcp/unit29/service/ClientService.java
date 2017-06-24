package org.gdcp.unit29.service;

import java.util.List;

import org.gdcp.unit29.dao.IClientDao;
import org.gdcp.unit29.entity.Client;

public class ClientService implements IClientService {
	private IClientDao clientDao;

	/*
	 * 客户档案查询
	 */
	@Override
	public List<Client> findClient(Client client) {
		return clientDao.findClient(client);
	}

	/*
	 * 新增客户档案
	 */
	@Override
	public void saveClient(Client client) {
		System.out.println("你好service1");
		clientDao.saveClient(client);
		System.out.println("你好service2");
	}

	/*
	 * 客户档案更新
	 */
	@Override
	public void updateClient(Client client) {
		clientDao.updateClient(client);
	}

	/*
	 * 删除客户档案
	 */
	@Override
	public void deleteClient(String[] clientId) {
		clientDao.deleteClient(clientId);
	}

	public IClientDao getClientDao() {
		return clientDao;
	}

	public void setClientDao(IClientDao clientDao) {
		this.clientDao = clientDao;
	}

}
