package com.jeremy.bloggingdemo.repository;

import com.jeremy.bloggingdemo.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jeremy on 11/3/17.
 */
@Repository
@Transactional
public class UserRepo extends GenericRepo<User> {
}
