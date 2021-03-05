package com.cs.heart_release_sock.base.config;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @ClassName ZegouConfig
 * @Description TODO
 * @Author QQ163
 * @Date 2021/2/6 20:10
 **/
@Data
@Component
public class ZegouConfig {
    private final String appId = "216009483";
    private final String appSign = "73fa8b7d95372a8343bf33ed990aef1c31807f47c53f2f4f82794cb91019ada8";
    private final String service = "wss://webliveroom-test.zego.im/ws";
    private final String logUrl = "https://weblogger-test.zego.im/httplog";
    private final String serverSecret = "187557c4de46866344d317526d52f1ba";
    private final String callBackSecret = "73fa8b7d95372a8343bf33ed990aef1c";
}
