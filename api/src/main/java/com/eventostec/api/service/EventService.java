package com.eventostec.api.service;

import java.util.Date;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.eventostec.api.domain.event.Event;
import com.eventostec.api.domain.event.EventRequestDTO;

@Service
public class EventService {

    public Event createEvent(EventRequestDTO data) {
        String imageUrl = null;

        if (data.image() != null) {
            imageUrl = uploadImg(data.image());
        }

        Event newEvent = new Event();
        newEvent.setTitle(data.title());
        newEvent.setDescription(data.description());
        newEvent.setEventUrl(data.eventUrl());
        newEvent.setRemote(data.remote());
        newEvent.setDate(new Date(data.date()));
        newEvent.setImgUrl(imageUrl);

        return newEvent;
    }

    private String uploadImg(MultipartFile file) {
        return "";
    }
}
