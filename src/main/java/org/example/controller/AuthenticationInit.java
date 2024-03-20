/* 
	Description:
		ZK Essentials
	History:
		Created by dennis

Copyright (C) 2012 Potix Corporation. All Rights Reserved.
*/
package org.example.controller;


import org.example.entity.UserCredential;
import org.example.services.AuthenticationService;
import org.example.services.impl.AuthenticationServiceImplChapter7;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Page;
import org.zkoss.zk.ui.util.Initiator;

import java.util.Map;

public class AuthenticationInit implements Initiator {

	//services
	AuthenticationService authService = new AuthenticationServiceImplChapter7();
	
	public void doInit(Page page, Map<String, Object> args) throws Exception {
		
		UserCredential cre = authService.getUserCredential();
		if(cre==null || cre.isAnonymous()){
			Executions.sendRedirect("/login.zul");
			return;
		}
	}
}