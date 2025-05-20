package com.daivesh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daivesh.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {



}
