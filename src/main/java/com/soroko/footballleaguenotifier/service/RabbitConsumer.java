package com.soroko.footballleaguenotifier.service;

import com.soroko.footballleaguenotifier.entity.Holder;
import com.soroko.footballleaguenotifier.repository.HolderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * @author yuriy.soroko
 */
@Slf4j
@Service
@EnableRabbit
@RequiredArgsConstructor
public class RabbitConsumer {

    private final HolderRepository holderRepository;

    @RabbitListener(queues = {"paymentQueue"})
    public void receive(Holder holder) {
        log.info(String.format("Received JSON message -> %s", holder.toString()));
        holderRepository.save(holder);
    }
}
