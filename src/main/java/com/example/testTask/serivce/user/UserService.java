package com.example.testTask.serivce.user;

import com.example.testTask.dao.user.UserRepository;
import com.example.testTask.dto.user.UserDto;
import com.example.testTask.mapper.user.UserMapper;
import com.example.testTask.serivce.base.AbstractService;
import com.example.testTask.serivce.base.CRUDService;
import com.example.testTask.serivce.base.SearchingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService extends AbstractService<UserRepository, UserMapper>
        implements CRUDService<UserDto>,
        SearchingService<UserDto> {

    @Override
    public Long create(UserDto createDto) {
       return repository.save(mapper.toEntity(createDto)).getId();
    }

    @Override
    public UserDto update(UserDto updateDto) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }

    @Override
    public UserDto get(Long id) {
        return null;
    }

    @Override
    public List<UserDto> getAll() {
        return null;
    }
}
