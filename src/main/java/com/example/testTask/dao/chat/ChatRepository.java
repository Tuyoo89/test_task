package com.example.testTask.dao.chat;

import com.example.testTask.dao.base.BaseDao;
import com.example.testTask.entity.chat.Chat;
import com.example.testTask.entity.message.Message;
import com.example.testTask.entity.user.User;
import org.hibernate.annotations.NamedQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatRepository extends JpaRepository<Chat, Long>, BaseDao {

    @Query("select u from User u where u.id in (:idList)")
    List<User> getUserListById(List<Long> idList);

    @Query("select c.messageList from Chat c where c.id = :id")
    List<Message> getChatMessages(Long id);

}
