
package lti.pojo.one2one;

import javax.persistence.*;

@Entity
@Table(name = "users_jpa")
public class User {
	@Id
	@GeneratedValue
	private int id;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	@OneToOne(mappedBy = "user", cascade = { /*CascadeType.PERSIST, CascadeType.REMOVE */CascadeType.ALL})
	private Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}