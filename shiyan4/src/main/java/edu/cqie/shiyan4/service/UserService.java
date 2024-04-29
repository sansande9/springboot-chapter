package edu.cqie.shiyan4.service;

import edu.cqie.shiyan4.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2024-04-15 11:41:43
 */
public interface UserService {
    User queryByname(String username);


}
