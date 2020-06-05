package sample.ocpp;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import sample.ocpp.mock.Mock;

import java.util.ArrayList;

public class RequestHandler {

    public static String handle(Request request) {
        ArrayList response = new ArrayList();
        response.add(3);
        response.add(request.getId());
        if ("BootNotification".equals(request.getAction())) {
            response.add(Mock.bootNotificationMock);
        }

        if ("Authorize".equals(request.getAction())) {
            response.add(Mock.authorizeMock);
        }

        if ("StartTransaction".equals(request.getAction())) {
            response.add(Mock.startTransactionMock);
        }

        if ("StopTransaction".equals(request.getAction())) {
            response.add(Mock.stopTransactionMock);
        }

        if ("StatusNotification".equals(request.getAction())) {
            response.add(Mock.statusNotificationMock);
        }

        if ("MeterValues".equals(request.getAction())) {
            response.add(Mock.meterValuesMock);
        }

        if ("Heartbeat".equals(request.getAction())) {
            response.add(Mock.heartbeatMock);
        }

        return new Gson().toJson(response);
    }
}
