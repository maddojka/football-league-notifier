package com.soroko.footballleaguenotifier.service;

import com.soroko.footballleaguenotifier.entity.Message;
import com.soroko.footballleaguenotifier.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author yuriy.soroko
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class KafkaConsumer {

    private final MessageRepository messageRepository;

    @KafkaListener(topics = "matchweek notifier", groupId = "matchweek")
    public void listen(String message) {
        log.info(message + " received weekly message from kafka");
        Message messageToStore = new Message();
        messageToStore.setWeeklyMessage(message);
        messageRepository.save(messageToStore);
    }
}
