package com.relax.www.eventPublisher;

import org.springframework.context.ApplicationEvent;

public class CommentLikeCreateEvent extends ApplicationEvent {
    private String  name;

    public CommentLikeCreateEvent(Object source, String name) {
        super(source);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}