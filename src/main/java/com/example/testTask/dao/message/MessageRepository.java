package com.example.testTask.dao.message;

import com.example.testTask.dao.base.BaseDao;
import com.example.testTask.entity.chat.Chat;
import com.example.testTask.entity.message.Message;
import com.example.testTask.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long>, BaseDao {

    @Query("select u from User u where u.id = :id")
    User findUserById(Long id);

    @Query("select c from Chat c where c.id = :id")
    Chat findChatById(Long id);

}
