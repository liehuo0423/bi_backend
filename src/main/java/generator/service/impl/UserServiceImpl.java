package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yxr.springbootinit.model.entity.User;
import generator.service.UserService;
import com.yxr.springbootinit.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 18070429817
* @description 针对表【user(用户)】的数据库操作Service实现
* @createDate 2023-10-10 13:54:15
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




