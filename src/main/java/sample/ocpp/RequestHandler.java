package sample.ocpp;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import sample.ocpp.mock.Mock;
import sample.ocpp.types.IdTagInfo;
import sample.ocpp.types.StartTransaction;
import sample.ocpp.utils.DateTimeFormater;
import sample.ocpp.utils.Status;

import java.util.ArrayList;
import java.util.Date;

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
            response.add(new StartTransaction(
                    new IdTagInfo(
                            "2021-03-19T08:44:00.131Z",
                            "",
                            Status.AuthorizeAccepted
                    ),
                    (int) Math.round(Math.random() * 1000)
            ));
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
