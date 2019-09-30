package com.example.onthigk;

public class country {
    private String Ten;
    private String flag;

    public country(String ten, String flag) {
        Ten = ten;
        this.flag = flag;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "country{" +
                "Ten='" + Ten + '\'' +
                ", flag='" + flag + '\'' +
                '}';
    }
}
