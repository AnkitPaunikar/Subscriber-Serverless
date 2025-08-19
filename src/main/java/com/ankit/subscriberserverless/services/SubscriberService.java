package com.ankit.subscriberserverless.services;

import com.ankit.subscriberserverless.models.Subscriber;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class SubscriberService {

    private List<Subscriber> subscribers = new ArrayList<>();
    private AtomicInteger id = new AtomicInteger();

    public List<Subscriber> findAll(){
        return subscribers;
    }

    public void createSubscriber(String email){
        subscribers.add(new Subscriber(id.addAndGet(1) ,email));
    }

}
