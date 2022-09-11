package com.example.testTask.dao.user;

import com.example.testTask.dao.base.BaseDao;
import com.example.testTask.dto.chat.ChatDto;
import com.example.testTask.entity.chat.Chat;
import com.example.testTask.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long>, BaseDao {

    @Query("select u.chats from User u where u.id = :id order by u.createdDate")
    List<Chat> getChatByUserId(Long id);

}
