package com.soroko.footballleaguenotifier.repository;

import com.soroko.footballleaguenotifier.entity.Holder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HolderRepository extends JpaRepository<Holder, Integer> {

    Holder findByTeamName(String teamName);
}
