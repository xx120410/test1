package com.xx.demo.entity;

import lombok.Data;

@Data
public class Trade {
    private  int id;
    private String ticketno2;
    private String ticketno1;
    private String truckno;
    private String product;
    private String specification;
    private String sender;
    private String receiver;
    private String grossdatetime;
    private String taredatetime;
    private String gross;
    private String tare;
    private String net;
    private int state;

    public Trade() {
    }

    public Trade(int id, String ticketno2, String ticketno1, String truckno, String product, String specification, String sender, String receiver, String grossdatetime, String taredatetime, String gross, String tare, String net, int state) {
        this.id = id;
        this.ticketno2 = ticketno2;
        this.ticketno1 = ticketno1;
        this.truckno = truckno;
        this.product = product;
        this.specification = specification;
        this.sender = sender;
        this.receiver = receiver;
        this.grossdatetime = grossdatetime;
        this.taredatetime = taredatetime;
        this.gross = gross;
        this.tare = tare;
        this.net = net;
        this.state = state;
    }
}
