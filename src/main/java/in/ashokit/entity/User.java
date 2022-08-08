package in.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users_dtls")
public class User {

	@Id
	@Column(name="USER_ID")
	private Integer userId;
	
	@Column(name="USER_NAME")
	private String username;
	
	@Column(name="USER_PHNO")
	private int userPhno;
	
	@Column(name="USER_AGE")
	private Integer userAge;
	
	@Column(name="USER_COUNTRY")
	private String userCountry;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public long getUserPhno() {
		return userPhno;
	}

	public void setUserPhno(int userPhno) {
		this.userPhno = userPhno;
	}

	public Integer getUserAge() {
		return userAge;
	}

	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}

	public String getUserCountry() {
		return userCountry;
	}

	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", userPhno=" + userPhno + ", userAge=" + userAge
				+ ", userCountry=" + userCountry + "]";
	}
	
}
