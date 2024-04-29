package edu.cqie.chapter1.service.impl;

import edu.cqie.chapter1.service.Userservice;
import org.springframework.stereotype.Service;

@Service
public class UserserviceImpl implements Userservice {
    @Override
    public String save() {
        return "已经保存了一个用户";
    }
//    219970206高文志
    @Override
    public String update() {
        return "已经更新了一个用户";
    }
}
