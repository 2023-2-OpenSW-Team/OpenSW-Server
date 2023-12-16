package com.OpenSw.Server.OpenSwServer.board.controller;


import com.OpenSw.Server.OpenSwServer.board.entity.NoticeBoard;
import com.OpenSw.Server.OpenSwServer.board.request.InsertRequest;
import com.OpenSw.Server.OpenSwServer.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@CrossOrigin
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @PostMapping("/insert")
    @ResponseBody
    public Long addBoard(@RequestBody InsertRequest request){
        String content = request.getContent();
        NoticeBoard noticeBoard = new NoticeBoard(content);
        boardService.saveBoard(noticeBoard);
        return 1L;
    }

    @GetMapping("/select")
    @ResponseBody
    public Map<String, Object> returnBoardJson(){
        HashMap<String, Object> result = new HashMap<>();
        result.put("BoardList", boardService.searchBoard());
        return result;
    }

}

