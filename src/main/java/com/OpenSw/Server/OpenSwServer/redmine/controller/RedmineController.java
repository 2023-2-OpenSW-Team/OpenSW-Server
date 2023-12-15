package com.OpenSw.Server.OpenSwServer.redmine.controller;

import com.OpenSw.Server.OpenSwServer.redmine.service.RedmineService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@CrossOrigin
@RequiredArgsConstructor
public class RedmineController {

    private final RedmineService redmineService;

    @ResponseBody
    @PostMapping("/initIssue")
    public Map<String, Object> initIssue(){

        return null;
    }

}
