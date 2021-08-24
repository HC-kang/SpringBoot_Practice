package com.chan.board.controller;

import com.chan.board.dto.BoardDto;
import com.chan.board.service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class BoardController {
    private BoardService boardService;

//    @GetMapping("/")
//    public String list(Model model) {
//        List<BoardDto> boardList = boardService.getBoardlist();
//
//        model.addAttribute("boardList", boardList);
//        return "board/list.html";
//    }

    @GetMapping("/")
    public String list() {
        return "board/list.html";
    }

    @GetMapping("/post")
    public String write() {
        return "board/write.html";
    }

    @PostMapping("/post")
    public String write(BoardDto boardDto) {
        boardService.savePost(boardDto);

        return "redirect:/";
    }
}