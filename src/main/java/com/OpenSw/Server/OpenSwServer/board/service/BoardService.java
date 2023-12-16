package com.OpenSw.Server.OpenSwServer.board.service;

import com.OpenSw.Server.OpenSwServer.board.entity.NoticeBoard;
import com.OpenSw.Server.OpenSwServer.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public void saveBoard(NoticeBoard noticeBoard){
        boardRepository.saveBoard(noticeBoard);
    }

    public List<NoticeBoard> searchBoard() {
        return  boardRepository.findbyAllBoard();
    }
}
