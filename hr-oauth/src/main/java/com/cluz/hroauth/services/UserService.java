package com.cluz.hroauth.services;

import com.cluz.hroauth.entities.User;
import com.cluz.hroauth.feignclients.UserFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private static Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserFeignClient userFeignClient;

    public User findByEmail(String email){
        User user = userFeignClient.findByEmail(email).getBody();
        if(user == null){
            logger.error("Email not found" + email);
            throw new IllegalArgumentException( "Email not found" + email);
        }
        logger.info("Email found" + email);
        return user;
    }
}
