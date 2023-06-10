package com.blog.controller;

import com.blog.entities.payload.CommentDto;
import com.blog.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/posts/")
public class CommentController {
    private  CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    //http://localhost:8080/api/posts/1/comments
    @PostMapping("{postId}/comments")
    public ResponseEntity<CommentDto> createComment(
            @PathVariable Long postId, @RequestBody CommentDto commentDto) {
        CommentDto createdCommentdto = commentService.createComment(postId, commentDto);
        return new ResponseEntity<>(createdCommentdto, HttpStatus.CREATED);
    }
}

