package edu.cqie.shiyan5.service;

import edu.cqie.shiyan5.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
* @author wenzhi gao
* @description 针对表【user】的数据库操作Service
* @createDate 2024-04-29 11:03:36
*/
public interface UserService extends IService<User> {
    User loadUserByUsername(String username,String password) throws UsernameNotFoundException;

}
