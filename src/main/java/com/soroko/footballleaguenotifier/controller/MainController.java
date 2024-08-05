package com.soroko.footballleaguenotifier.controller;

import com.soroko.footballleaguenotifier.service.MailSenderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author yuriy.soroko
 */
@Controller
@RequiredArgsConstructor
public class MainController {

    @Value("${spring.mail.sendto")
    private String sendTo;

    private final MailSenderService mailSender;

    @GetMapping("/paid")
    public void register() {
        mailSender.send(sendTo,
                "Team payment",
                "Your payment was successfully posted"
         );
    }
}
