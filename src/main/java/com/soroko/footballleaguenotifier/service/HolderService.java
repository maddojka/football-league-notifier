package com.soroko.footballleaguenotifier.service;

import com.soroko.footballleaguenotifier.entity.Holder;
import com.soroko.footballleaguenotifier.repository.HolderRepository;
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
public class HolderService {
    final HolderRepository holderRepository;

    public List<Holder> getAllHolders() {
        return holderRepository.findAll();
    }

    public Holder getHolderById(int id) {
        return holderRepository.findById(id).orElseThrow();
    }

    public Holder getHolderByTeamName(String teamName) {
        return holderRepository.findByTeamName(teamName);
    }

    public Holder saveHolder(Holder holder) {
        return holderRepository.save(holder);
    }

}
