package org.example.services.impl;

import org.example.entity.User;
import org.example.entity.UserCredential;
import org.example.services.UserInfoService;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;

public class AuthenticationServiceImplChapter7 extends AuthenticationServiceImpl {
    private static final long serialVersionUID = 1L;

    UserInfoService userInfoService = new UserInfoServiceImpl();

    @Override
    public boolean login(String nm, String pd) {
        User user = userInfoService.findUser(nm);
        //a simple plan text password verification
        if(user==null || !user.getPassword().equals(pd)){
            return false;
        }

        Session sess = Sessions.getCurrent();
        UserCredential cre = new UserCredential(user.getAccount(),user.getFullName());
        //just in case for this demo.
        if(cre.isAnonymous()){
            return false;
        }
        sess.setAttribute("userCredential",cre);

        //TODO handle the role here for authorization
        return true;
    }

    @Override
    public void logout() {
        Session sess = Sessions.getCurrent();
        sess.removeAttribute("userCredential");
    }
}
