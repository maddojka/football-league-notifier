package com.soroko.footballleaguenotifier;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class FootballLeagueNotifierApplicationTests {

    @Test
    void contextLoads() {
    }

}
