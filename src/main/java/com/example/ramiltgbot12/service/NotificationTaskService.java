package com.example.ramiltgbot12.service;

import com.example.ramiltgbot12.entity.NotificationTask;
import com.example.ramiltgbot12.repository.NotificationTaskRepository;
import com.example.ramiltgbot12.entity.NotificationTask;
import com.example.ramiltgbot12.repository.NotificationTaskRepository;
import org.springframework.stereotype.Service;

@Service
public class NotificationTaskService {
    private final NotificationTaskRepository notificationTaskRepository;

    public NotificationTaskService(NotificationTaskRepository notificationTaskRepository) {
        this.notificationTaskRepository = notificationTaskRepository;
    }

    public void save(NotificationTask notificationTask) {
        notificationTaskRepository.save(notificationTask);
    }
}
