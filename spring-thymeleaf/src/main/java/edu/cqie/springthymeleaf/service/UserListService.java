package edu.cqie.springthymeleaf.service;

import edu.cqie.springthymeleaf.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserListService {
    List<User> getUserList();
}
