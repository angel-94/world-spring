/**
 * Copyrigth (c)
 */

package com.meltsan.app.model;

/**
 * Descripcón:
 * @author meltsansolutions
 * @version 1.0
 * date: 10-08-16
 */

import java.util.Date;

public class Users {
	private int UserId;
	private String FirstName;
	private String LastNmae;
	private Date birthdate;
	private String Email;
	private String User;
	private String Password;

	/**
	 * constructores de la clase.
	 */
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(int userId, String firstName, String lastNmae, Date birthdate, String email, String user,
			String password) {
		super();
		UserId = userId;
		FirstName = firstName;
		LastNmae = lastNmae;
		this.birthdate = birthdate;
		Email = email;
		User = user;
		Password = password;
	}

	/**
	 * métodos getter y setter de la clase.
	 * @return
	 */
	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastNmae() {
		return LastNmae;
	}

	public void setLastNmae(String lastNmae) {
		LastNmae = lastNmae;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getUser() {
		return User;
	}

	public void setUser(String user) {
		User = user;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

}
