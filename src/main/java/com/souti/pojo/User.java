package com.souti.pojo;

import org.springframework.stereotype.Component;

import java.sql.Date;
@Component
public class User {
    String tm;
    String ask;
    String date;

    public String getTm() {
        return tm;
    }

    public void setTm(String tm) {
        this.tm = tm;
    }

    public String getAsk() {
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
