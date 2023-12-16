package com.OpenSw.Server.OpenSwServer.board.entity;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Board")
@Getter
@NoArgsConstructor
public class NoticeBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    @Builder
    public NoticeBoard(String content){
        this.content = content;
    }

}
