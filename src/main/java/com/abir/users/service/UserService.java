package com.abir.users.service;

import com.abir.users.entities.Role;
import com.abir.users.entities.User;


public interface UserService {
User saveUser(User user);
User findUserByUsername (String username);
Role addRole(Role role);
User addRoleToUser(String username, String rolename);
}