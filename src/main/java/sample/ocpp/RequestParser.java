package sample.ocpp;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class RequestParser {
    public static Message parse(JsonArray message) {
        Message msg = null;

        int messageType = Integer.parseInt(message.get(0).toString());

        switch (messageType) {
            case 2:
                msg = new Request(
                        messageType,
                        message.get(1).getAsString(),
                        message.get(2).getAsString(),
                        (JsonObject) message.get(3)
                );
                break;
            case 3:
                break;
            case 4:
                break;
            default:
        }

        return msg;
    }
}
