package com.soroko.footballleaguenotifier.service;

import com.soroko.footballleaguenotifier.entity.Message;
import com.soroko.footballleaguenotifier.repository.MessageRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yuriy.soroko
 */
@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MessageService {

    final MessageRepository messageRepository;

    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }

    public Message getMessageById(long id) {
        return messageRepository.findById(id).orElseThrow();
    }

    public Message saveMessage(Message message) {
        return messageRepository.save(message);
    }
}
