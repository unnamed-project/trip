package com.unnamed.trip.user.resource;

import com.unnamed.trip.user.entity.UserEntity;
import com.unnamed.trip.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flaviu.fildan on 6/25/2018.
 */
@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<UserEntity> getUsers() {

        List<UserEntity> userList = new ArrayList<>(  );

        Iterable<UserEntity> users = userRepository.findAll();

        for (UserEntity userEntity : users) {
            userList.add( userEntity );
        }

        return userList;
    }
}
