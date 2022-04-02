package com.example.springbootnetty.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author zhooke
 * @since 2022/4/2 17:36
 **/
@Component
@Slf4j
public class RunClient {

    @PostConstruct
    public void run() {
        try {
            WebsocketClient.getInstance().startClient();
        } catch (Exception e) {
            log.error("websocket启动失败,失败原因：{}", e.getMessage());
        }

    }
}
