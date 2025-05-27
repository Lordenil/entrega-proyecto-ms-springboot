package com.manage.appointment.service.serviceImp;

import com.manage.appointment.dto.UserDTO;
import com.manage.appointment.entity.User;
import com.manage.appointment.repository.UserRepository;
import com.manage.appointment.service.IUserService;
import lombok.*;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImp implements IUserService {
    private final UserRepository userRepository;

    public User registerUser(UserDTO userDTO) {
        if (userRepository.existsByEmail(userDTO.getEmail())) {
            throw new IllegalArgumentException("El correo ya está registrado");
        }

        User user = new User(null, userDTO.getName(), userDTO.getEmail(), userDTO.getPassword());
        return userRepository.save(user);
    }
}
