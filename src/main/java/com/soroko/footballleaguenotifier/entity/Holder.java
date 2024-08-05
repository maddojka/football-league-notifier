package com.soroko.footballleaguenotifier.entity;

import jakarta.persistence.*;

/**
 * @author yuriy.soroko
 */
@Entity
@Table(name = "holder")
public class Holder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
}
