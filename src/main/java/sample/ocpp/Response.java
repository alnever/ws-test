package sample.ocpp;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class Response implements Message{
    private int messageType;
    private String id;
    private JsonObject response;

    public Response(int messageType, String id, JsonObject response) {
        this.messageType = messageType;
        this.id = id;
        this.response = response;
    }

//    public String getResponseMessage() {
//        JsonArray jsonArray =
//
//        return "";
//    }
}
