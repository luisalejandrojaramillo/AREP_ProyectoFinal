package edu.escuelaing.arep;

import edu.escuelaing.arep.client.ClientTh;

public class App {

    public static int client = 10;
    public static String url = "http://localhost:4567/results?num=";

    public static void main(String[] args) throws InterruptedException {
        ClientTh[] hilo = new ClientTh[client];
        for(int i=0;i<client;i++){
            hilo[i]=new ClientTh(url);
        }
        for(int i=0;i<client;i++){
            hilo[i].start();
        }
        for(int i=0;i<client;i++){
            hilo[i].join();
        }

        System.out.println("Finish !");
    }


}
