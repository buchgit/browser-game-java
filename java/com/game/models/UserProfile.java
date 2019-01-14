package com.game.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name="user_profile")
public class UserProfile {
//	@Id
//	@Column(name="id")
//	private int id;
	
	@Id
	@Column(name="username")
	private String username;
	
	//TODO Add bcrypt
	@Column(name="password")
	@JsonProperty(access = Access.WRITE_ONLY)
	private String password;
	
	@Column(name="email")
	private String email;
	
	@Column(name="last_login")
	private String lastLogin;
	
	@Column(name="power_rating")
	private int powerRating;
	
	@Column(name="spearmen")
	private int spearmen;
	
	@Column(name="archers")
	private int archers;
	
	@Column(name="heavy_swords")
	private int heavySwords;
	
	@Column(name="silver")
	private int silver;
	
	@Column(name="wood")
	private int wood;
	
	@Column(name="steel")
	private int steel;
	
	
	public UserProfile() {
		
	}
	
	public UserProfile(String username, String password, String lastLogin, int powerRating, String email,
					   int spearmen, int archers, int heavySwords, int silver, int wood, int steel) {
		
		this.username=username;
		this.password=password;
		this.email=email;
		this.lastLogin=lastLogin;
		this.powerRating=powerRating;
		this.spearmen=spearmen;
		this.archers=archers;
		this.heavySwords=heavySwords;
		this.silver=silver;
		this.wood=wood;
		this.steel=steel;
		
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getSpearmen() {
		return spearmen;
	}

	public void setSpearmen(int spearmen) {
		this.spearmen = spearmen;
	}

	public int getArchers() {
		return archers;
	}

	public void setArchers(int archers) {
		this.archers = archers;
	}

	public int getHeavySwords() {
		return heavySwords;
	}

	public void setHeavySwords(int heavySwords) {
		this.heavySwords = heavySwords;
	}

	public int getSilver() {
		return silver;
	}

	public void setSilver(int silver) {
		this.silver = silver;
	}

	public int getWood() {
		return wood;
	}

	public void setWood(int wood) {
		this.wood = wood;
	}

	public int getSteel() {
		return steel;
	}

	public void setSteel(int steel) {
		this.steel = steel;
	}

	public String getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}

	public int getPowerRating() {
		return powerRating;
	}

	public void setPowerRating(int powerRating) {
		this.powerRating = powerRating;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}