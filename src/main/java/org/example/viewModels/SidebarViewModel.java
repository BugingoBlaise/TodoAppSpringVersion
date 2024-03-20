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
import org.example.services.impl.SidebarPageConfigImpl;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
 import org.zkoss.zk.ui.Executions;

import java.util.List;

public class SidebarViewModel {

    private SidebarPageConfig pageConfig = new SidebarPageConfigImpl();

    public List<SidebarPage> getSidebarPages() {
        return pageConfig.getPages();
    }

    @Command
    public void navigate(@BindingParam("page") SidebarPage page) {
        Executions.getCurrent().sendRedirect(page.getUri());
    }
}
