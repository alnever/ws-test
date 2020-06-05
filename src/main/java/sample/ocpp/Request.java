package sample.ocpp;

import com.google.gson.JsonObject;

public class Request implements Message {
    private int messageType;
    private String id;
    private String action;
    private JsonObject request;

    public Request(int messageType, String id, String action, JsonObject request) {
        this.messageType = messageType;
        this.id = id;
        this.action = action;
        this.request = request;
    }

    public int getMessageType() {
        return messageType;
    }

    public void setMessageType(int messageType) {
        this.messageType = messageType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public JsonObject getRequest() {
        return request;
    }

    public void setRequest(JsonObject request) {
        this.request = request;
    }
}
