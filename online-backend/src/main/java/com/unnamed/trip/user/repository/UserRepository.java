package com.unnamed.trip.user.repository;

import com.unnamed.trip.user.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by flaviu.fildan on 8/1/2018.
 */
public interface UserRepository extends CrudRepository<UserEntity, Integer> {
}
