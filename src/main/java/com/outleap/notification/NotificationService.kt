package com.outleap.notification

import org.springframework.stereotype.Service

@Service
class NotificationService (
    private val notificationRepo: NotificationMongoRepo
) {

    fun createNotification(notification: Notification) {
        notificationRepo.save(notification);
    }
}