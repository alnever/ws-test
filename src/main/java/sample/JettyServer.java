package sample;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletContextHandler;

import javax.websocket.server.ServerContainer;
import org.eclipse.jetty.websocket.jsr356.server.deploy.WebSocketServerContainerInitializer;

public class JettyServer {

    private Server server;

    public void start() throws Exception {
        server = new Server(8086);
//        ServerConnector serverConnector = new ServerConnector(server);
//
//        serverConnector.setPort(8086);
//        server.setConnectors(new Connector[] {serverConnector});

        ServletContextHandler contextHandler = new ServletContextHandler();
        contextHandler.setContextPath("/");

        server.setHandler(contextHandler);

        ServerContainer container = WebSocketServerContainerInitializer.configureContext(contextHandler);
        container.addEndpoint(SocketServer.class);

        server.start();
        System.out.println("Server started on port " + String.valueOf(8086));
    }
}
