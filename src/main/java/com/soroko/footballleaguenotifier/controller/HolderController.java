package com.soroko.footballleaguenotifier.controller;

import com.soroko.footballleaguenotifier.entity.Holder;
import com.soroko.footballleaguenotifier.service.HolderService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author yuriy.soroko
 */
@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/holder")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class HolderController {

    final HolderService holderService;

    @GetMapping("/all")
    public List<Holder> getAllHolders() {
        return holderService.getAllHolders();
    }

    @GetMapping("/{id}")
    public Holder getHolderById(int id) {
        return holderService.getHolderById(id);
    }

    @PostMapping
    public Holder addHolder(@RequestBody Holder holder) {
        return holderService.saveHolder(holder);
    }
}
