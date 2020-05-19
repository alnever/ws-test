package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;

import javax.xml.soap.Text;

public class Controller {


    @FXML
    private TextField txtPort;

    @FXML
    private TextArea txtRequest;

    @FXML
    public void onStart() throws Exception {
        JettyServer jettyServer = new JettyServer();
        // jettyServer.start(Integer.parseInt(txtPort.getText()));
        jettyServer.start();
    }

    public void onSend() {
        SocketServer.sendMessage(txtRequest.getText());
    }

}
