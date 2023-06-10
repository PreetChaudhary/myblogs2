package com.blog.service;

import com.blog.entities.payload.CommentDto;

public interface CommentService {
    public CommentDto createComment(long postId,CommentDto commentDto);
}
