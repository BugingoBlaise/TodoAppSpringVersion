/* 
	Description:
		ZK Essentials
	History:
		Created by dennis

Copyright (C) 2012 Potix Corporation. All Rights Reserved.
*/
package org.example.viewModels;


import org.example.services.SidebarPage;
import org.example.services.SidebarPageConfig;
import org.example.services.impl.SidebarPageConfigAjaxBasedImpl;

import java.util.List;

public class SidebarAjaxbasedViewModel {

	//todo: wire service
	private SidebarPageConfig pageConfig = new SidebarPageConfigAjaxBasedImpl();
	
	public List<SidebarPage> getSidebarPages() {
		return pageConfig.getPages();
	}
}
