package sample.ocpp.types;

public class BootNotification {
    private String currentTime;
    private int interval;
    private String status;

    public BootNotification(String currentTime, int interval, String status) {
        this.currentTime = currentTime;
        this.interval = interval;
        this.status = status;
    }

    public String getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

