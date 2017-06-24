package org.gdcp.unit29.service;

import java.util.List;

import org.gdcp.unit29.dao.IClientDao;
import org.gdcp.unit29.entity.Client;

public class ClientService implements IClientService {
	private IClientDao clientDao;

	/*
	 * �ͻ�������ѯ
	 */
	@Override
	public List<Client> findClient(Client client) {
		return clientDao.findClient(client);
	}

	/*
	 * �����ͻ�����
	 */
	@Override
	public void saveClient(Client client) {
		System.out.println("���service1");
		clientDao.saveClient(client);
		System.out.println("���service2");
	}

	/*
	 * �ͻ���������
	 */
	@Override
	public void updateClient(Client client) {
		clientDao.updateClient(client);
	}

	/*
	 * ɾ���ͻ�����
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
