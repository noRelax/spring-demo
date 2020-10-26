package com.relax.www.eventPublisher;

public interface CommentLikeCreateEventHandler {
    /**
     * 处理评论点赞事件
     * @param commentLikeCreateEvent
     */
    void handle(CommentLikeCreateEvent commentLikeCreateEvent);
}