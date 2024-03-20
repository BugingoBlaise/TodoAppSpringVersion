/* 
	Description:
		ZK Essentials
	History:
		Created by dennis

Copyright (C) 2012 Potix Corporation. All Rights Reserved.
*/
package org.example.services.impl;

import org.example.entity.UserCredential;
import org.example.services.AuthenticationService;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;

import java.io.Serializable;

public class AuthenticationServiceImpl implements AuthenticationService,Serializable{
	private static final long serialVersionUID = 1L;

	public UserCredential getUserCredential(){
		Session sess = Sessions.getCurrent();
		UserCredential cre = (UserCredential)sess.getAttribute("userCredential");
		if(cre==null){
			cre = new UserCredential();//new a anonymous user and set to session
			sess.setAttribute("userCredential",cre);
		}
		return cre;
	}
	public boolean login(String nm, String pd) {
//		 will be implemented in chapter7
		return false;
	}

	public void logout() {
		// will be implemented in chapter7
	}
}
