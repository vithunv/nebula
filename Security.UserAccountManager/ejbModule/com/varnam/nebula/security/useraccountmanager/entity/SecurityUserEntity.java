package com.varnam.nebula.security.useraccountmanager.entity;

@javax.persistence.Entity
public class SecurityUserEntity {
	private long userId;
	private String loginId;
	private String usernName;
	private String passwordMD5;
}
