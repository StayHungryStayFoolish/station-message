package com.stationmessage.www.domain;

/**
 * Created by bonismo@hotmail.com on 2018/4/23 下午6:05
 *
 * @Version: V1.0.0
 * <p>
 * Description: server client send the message to browser client
 */
public class WiselyResponse {

    private String responseMessage;

    public WiselyResponse(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}


