package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sample")
public class SampleEntity {
//    @Id
//    @GeneratedValue(strategy= GenerationType.IDENTITY)
//    String id;
    @Id
    String uuid;
    LocalDateTime time;
}
