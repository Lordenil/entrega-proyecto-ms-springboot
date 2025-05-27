package com.manage.appointment.service;

import com.manage.appointment.dto.UserDTO;
import com.manage.appointment.entity.User;

public interface IUserService {
    public User registerUser(UserDTO user);

}