package com.namyangju.soulworker;

/**
 * Created by admin on 2017-03-24.
 */

public class Chatdate {
    private String userName;
    private String message;

    public Chatdate(){

    }

    public Chatdate(String userName, String message) {
        this.userName = userName;
        this.message = message;
    }

    public String getUserName(){
        return userName;
    }

    public String getMessage(){
        return message;
    }
}
