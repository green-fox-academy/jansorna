package com.greenfox.rest.models;

public class LogCounter {
    private Iterable<Log> logList;
    private String entry_count;


    public LogCounter(Iterable<Log> logList, String entry_count) {
        this.logList = logList;
        this.entry_count = entry_count;
    }

    public Iterable<Log> getLogList() {
        return logList;
    }

    public void setLogList(Iterable<Log> logList) {
        this.logList = logList;
    }

    public String getEntry_count() {
        return entry_count;
    }

    public void setEntry_count(String entry_count) {
        this.entry_count = entry_count;
    }
}
