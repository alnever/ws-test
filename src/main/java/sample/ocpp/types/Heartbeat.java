package sample.ocpp.types;

public class Heartbeat {
    private String currentTime;

    public Heartbeat(String currentTime) {
        this.currentTime = currentTime;
    }

    public String getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }
}
