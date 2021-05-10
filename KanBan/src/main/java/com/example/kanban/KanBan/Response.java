package com.example.kanban.KanBan;

public class Response {
    private boolean error;
    private String message;
    private String xml;

    public Response(boolean error, String message, String xml){
        this.error = error;
        this.message = message;
        this.xml = xml;
    }
}
