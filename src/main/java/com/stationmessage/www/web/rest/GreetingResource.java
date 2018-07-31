package com.stationmessage.www.web.rest;

import com.stationmessage.www.domain.WiselyMessage;
import com.stationmessage.www.domain.WiselyResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

/**
 * Created by bonismo@hotmail.com on 2018/4/22 下午9:57
 *
 * @Version: V1.0.0
 * <p>
 * Description: Simple WebScoket Test
 */
@RestController
@RequestMapping("/api")
public class GreetingResource {

    @Resource
    private SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public WiselyResponse say(WiselyMessage message) throws InterruptedException {
        Thread.sleep(3000);
        return new WiselyResponse(" 欢迎使用 WebSocket : " + message);
    }



    @GetMapping("/get/uuid")
    public String get() {
        return getUid().get("uuid").toString();
    }

    private static Map getUid() {
        Map<String, String> map = new HashMap<>();
         final String UUID = java.util.UUID.randomUUID().toString();
        map.put("uuid", UUID);
        return map;
    }
}


