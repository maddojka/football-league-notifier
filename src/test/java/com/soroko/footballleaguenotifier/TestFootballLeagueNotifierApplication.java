package com.soroko.footballleaguenotifier;

import org.springframework.boot.SpringApplication;

public class TestFootballLeagueNotifierApplication {

    public static void main(String[] args) {
        SpringApplication.from(FootballLeagueNotifierApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
