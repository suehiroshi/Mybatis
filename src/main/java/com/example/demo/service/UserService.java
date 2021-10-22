package com.example.demo.service;

        import com.example.demo.entity.User;
        import com.example.demo.mapper.UserMapper;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;
        import java.util.List;

@Service
public class UserService {
    @Autowired(required=false)
    public UserMapper userMapper;

    public List<User> findAllUser(){
        return userMapper.findAllUser();
    }

    public List<User> findUserByUserId(int userid){
        return userMapper.findUserByUserId(userid);
    }

}
