package com.example.testTask.controller.user;

import com.example.testTask.controller.base.AbstractController;
import com.example.testTask.controller.base.GenericCRUDController;
import com.example.testTask.dto.user.UserDto;
import com.example.testTask.serivce.user.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users/")
public class UserController extends AbstractController<UserService> implements GenericCRUDController<UserDto> {

    public UserController(UserService service) {
        super(service);
    }

    @Override
    public Long create(UserDto DTO) {
        return service.create(DTO);
    }

    @Override
    public UserDto update(UserDto DTO) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }
}
