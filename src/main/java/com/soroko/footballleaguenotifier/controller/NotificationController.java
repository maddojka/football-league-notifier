package com.soroko.footballleaguenotifier.controller;

import com.soroko.footballleaguenotifier.entity.Holder;
import com.soroko.footballleaguenotifier.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yuriy.soroko
 */
@RestController("/api/notify")
@RequiredArgsConstructor
public class NotificationController {

    private final MailSenderService mailSender;

    private final HolderService holderService;

    private final MessageService messageService;


    @GetMapping("/paid")
    public void register(@RequestParam String teamName) {
        Holder holder = holderService.getHolderByTeamName(teamName);
        mailSender.send(
                holder.getEmail(),
                "Team " + holder.getTeamName() + " payment",
                "Dear " + holder.getFullName() + "\n"
                        + "Your payment was successfully posted"
        );
    }

    @GetMapping("/matchweek")
    public void notifyAboutNewMatchWeek(@RequestParam int id) {
        List<Holder> holders = holderService.getAllHolders();
        StringBuilder emails = null;
        for (Holder holder : holders) {
            emails.append(holder.getEmail()).append(", ");
        }
        mailSender.send(emails.toString(),
                "New match week begins",
                messageService.getMessageById(id).getWeeklyMessage()
        );
    }
}
