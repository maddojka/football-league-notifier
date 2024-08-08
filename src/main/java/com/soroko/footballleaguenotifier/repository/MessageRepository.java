package com.soroko.footballleaguenotifier.repository;

import com.soroko.footballleaguenotifier.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
