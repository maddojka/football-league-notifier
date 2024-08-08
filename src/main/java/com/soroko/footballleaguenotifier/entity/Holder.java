package com.soroko.footballleaguenotifier.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

/**
 * @author yuriy.soroko
 */
@Getter
@Setter
@Entity
@Table(name = "holder")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Holder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @NonNull
    @Column(nullable = false)
    String fullName;

    @Email
    @Column(nullable = false)
    String email;

    @Column(nullable = false)
    String teamName;

    @Override
    public String toString() {
        return "Holder{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
