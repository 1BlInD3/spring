package com.example.kanban.KanBan;

public class Response{
    private boolean error;
    private String message;
    private String path;

    public Response(boolean error, String message, String path){
        this.error = error;
        this.message = message;
        this.path = path;
    }

    public String getMessage() {
        return message;
    }

    public String getPath() {
        return path;
    }
    public boolean getError(){
        return error;
    }
}
