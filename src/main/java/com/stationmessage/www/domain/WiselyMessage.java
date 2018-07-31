package com.stationmessage.www.domain;

/**
 * Created by bonismo@hotmail.com on 2018/4/23 下午6:02
 *
 * @Version: V1.0.0
 * <p>
 * Description: Receive message from browser
 */
public class WiselyMessage {

    private String name;

    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}


