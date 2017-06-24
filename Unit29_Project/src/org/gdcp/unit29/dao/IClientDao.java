package org.gdcp.unit29.dao;

import java.util.List;

import org.gdcp.unit29.entity.Client;

public interface IClientDao {

	// �ͻ�������ѯ
	public List<Client> findClient(Client client);

	// �����ͻ�����
	public void saveClient(Client client);

	// �ͻ���������
	public void updateClient(Client client);

	// ɾ���ͻ�����
	public void deleteClient(String[] clientId);

}
