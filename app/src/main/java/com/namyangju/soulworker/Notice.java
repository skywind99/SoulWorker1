package com.namyangju.soulworker;

/**
 * Created by Kor on 2017-03-13.
 */

public class Notice {

    String notice;
    String name;
    String date;

    public Notice(String name, String date, String notice) {
        this.notice = notice;
        this.name = name;
        this.date = date;
    }

    public String getName(){
        return name;
    }

    public void getName(String name) {
        this.name = name;
    }

    public String getNotice() {
        return notice;

    }

    public void getNotice(String notice) {
        this.notice = notice;
    }

    public String getDate() {
        return date;
    }

    public void getDate(String date) {
        this.date = date;
    }
}
