package br.com.meli.solid.structural.adapter.util;

public class Token {
    private String token;
    public Token() {
        this.token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkRlc2lnbmVyIFBhdHRlciIsImlhdCI6MTUxNjIzOTAyMn0.Ul9p7zZIaS5GQXoTBg7_YSd-pdY_aHcuO4-rTY50BqI";
    }

    private String getToken() {
        return  this.token;
    }
}
