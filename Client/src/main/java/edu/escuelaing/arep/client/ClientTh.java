package edu.escuelaing.arep.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class ClientTh extends Thread{
    private String url;
    private String request = "1%2C2%2C3%2C4%2C5%2C6%2C7%2C8%2C9%2C10";

    public ClientTh(String url){
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public void run(){
        String line = null;

        try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(new URL(url+request).openStream()))){
            while ((line=reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e);
        }


    }


}
