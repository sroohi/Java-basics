package customerServicePack;

import java.util.Date;

public class Customer {
	private String name;
	private Integer id;
	private Integer age;
	private String address;
	private Date dob;

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [name  :" + name + ", id  :" + id + ", age  :" + age + ", address  :" + address + ", dob  :"
				+ dob + "]";
	}

}
