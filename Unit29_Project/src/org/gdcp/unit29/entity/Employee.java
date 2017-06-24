package org.gdcp.unit29.entity;

public class Employee {
	private Integer id;// 员工ID
	private String code;// 员工编号
	private String name;// 员工名称
	private String birthday;// 出生日期
	private boolean sex;// 性别(0-女，1-男)
	private String telephone;// 电话
	private String email;// 电子邮箱

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
