package com.example.testTask.dao.message;

import com.example.testTask.dao.base.BaseDao;
import com.example.testTask.entity.message.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long>, BaseDao {
}
