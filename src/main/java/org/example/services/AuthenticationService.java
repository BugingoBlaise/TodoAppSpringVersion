/* 
	Description:
		ZK Essentials
	History:
		Created by dennis

Copyright (C) 2012 Potix Corporation. All Rights Reserved.
*/
package org.example.services;

import org.example.entity.UserCredential;

public interface AuthenticationService {

	/**login with account and password**/
	public boolean login(String account, String password);
	
	/**logout current user**/
	public void logout();
	
	/**get current user credential**/
	public UserCredential getUserCredential();
	
}
