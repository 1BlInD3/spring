package com.example.kanban.KanBan;


import java.util.HashMap;
import java.util.List;

public class Config {
    private String mainServer;
    private String backupServer;
    private String endPoint;
    private String logPath;
    private Integer timeOut;
    private HashMap<String, String> ipAddress;
    private List<String> itAccess;

    public String getMainServer() {
        return mainServer;
    }

    public String getBackupServer() {
        return backupServer;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public String getLogPath() {
        return logPath;
    }

    public Integer getTimeOut() {
        return timeOut;
    }

    public HashMap<String, String> getIpAddress() {
        return ipAddress;
    }

    public List<String> getItAccess() {
        return itAccess;
    }

}
