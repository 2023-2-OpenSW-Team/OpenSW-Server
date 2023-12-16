package com.OpenSw.Server.OpenSwServer.board.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Getter
@NoArgsConstructor
public class InsertRequest {
    String content;


    public InsertRequest(String content){
        this.content = content;
    }
}
