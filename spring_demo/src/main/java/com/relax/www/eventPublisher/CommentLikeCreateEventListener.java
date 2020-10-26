package com.relax.www.eventPublisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CommentLikeCreateEventListener implements ApplicationListener<CommentLikeCreateEvent> {
    @Autowired
    private List<CommentLikeCreateEventHandler> commentLikeCreateEventHandlerList;

    @Override
    public void onApplicationEvent(CommentLikeCreateEvent event) {
        commentLikeCreateEventHandlerList.forEach(commentLikeCreateEventHandler -> commentLikeCreateEventHandler.handle(event));
    }
}