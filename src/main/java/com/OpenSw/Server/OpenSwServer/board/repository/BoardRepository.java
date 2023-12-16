package com.OpenSw.Server.OpenSwServer.board.repository;


import com.OpenSw.Server.OpenSwServer.board.entity.NoticeBoard;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardRepository {

    @PersistenceContext
    EntityManager em;

    public void saveBoard(NoticeBoard noticeBoard){
        em.persist(noticeBoard);
    }

    public List<NoticeBoard> findbyAllBoard(){
        String jpql = "SELECT nb FROM NoticeBoard nb";
        return em.createQuery(jpql, NoticeBoard.class).getResultList();
    }

}
