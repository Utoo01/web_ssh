package org.gdcp.unit29.entity;

public class Employee {
	private Integer id;// Ա��ID
	private String code;// Ա�����
	private String name;// Ա������
	private String birthday;// ��������
	private boolean sex;// �Ա�(0-Ů��1-��)
	private String telephone;// �绰
	private String email;// ��������

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		if (birthday != null && birthday.length() >= 10) {
			birthday = birthday.substring(0, 10);
		}
		this.birthday = birthday;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
