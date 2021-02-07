package sample;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import sample.ocpp.Message;
import sample.ocpp.Request;
import sample.ocpp.RequestHandler;
import sample.ocpp.RequestParser;

import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.util.Arrays;

@ServerEndpoint(
        value = "/ocpp/ws/ocpp16/78125E20",
        subprotocols = {"ocpp1.6"}
        )
public class SocketServer {

    private static Session session;

    @OnOpen
    public void onOpen(Session session) {
        this.session = session;
        System.out.println(String.format("WebSocket opened: %s", session.getId()));
    }

    @OnMessage
    public String handleTextMessage(String message) {
        System.out.println("--------------------------------------------------------------");
        System.out.println("Request");
        System.out.println(message);
        JsonArray jsonArray = (JsonArray) new JsonParser().parse(message);

        Message msg = RequestParser.parse(jsonArray);
        String responseMessage = RequestHandler.handle((Request) msg);

        System.out.println("Response");
        System.out.println(responseMessage);

        return responseMessage;
    }

    @OnMessage(maxMessageSize = 1024000)
    public byte[] handleBinaryMessage(byte[] buffer) {
        System.out.println("New Binary Message Received");
        System.out.println(Arrays.toString(buffer));
        return buffer;
    }

    @OnError
    public void onError(Session session, Throwable t) {
        System.out.println(String.format("Error in WebSocket session %s%n", session == null ? "null" : session.getId(),t));
    }

    public static void sendMessage(String message) {
        try {
            SocketServer.session.getBasicRemote().sendText(message);
        } catch (Exception ex) {
            System.out.println("Message sending error " + ex.toString());
        }
    }

}
