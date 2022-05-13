package com.xx.demo.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Hello{

    public Hello() {
    }

    public Hello(String xm, String sj, int nl) {
        this.xm = xm;
        this.sj = sj;
        this.nl = nl;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "xm='" + xm + '\'' +
                ", sj='" + sj + '\'' +
                ", nl=" + nl +
                '}';
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getSj() {
        return sj;
    }

    public void setSj(String sj) {
        this.sj = sj;
    }

    public int getNl() {
        return nl;
    }

    public void setNl(int nl) {
        this.nl = nl;
    }


    private String xm;

    private String sj;

    private int nl;


}
