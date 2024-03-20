/* 
	Description:
		ZK Essentials
	History:
		Created by dennis

Copyright (C) 2012 Potix Corporation. All Rights Reserved.
*/
package org.example.services;


import org.example.entity.User;

public interface UserInfoService {

	/** find user by account **/
	public User findUser(String account);
	
	/** update user **/
	public User updateUser(User user);
}
