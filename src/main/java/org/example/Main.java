package org.example;


public class Main {
    public static void main(String[] args) {
        HttpImageStatusCli httpImageStatusCli = new HttpImageStatusCli();
        try {
            httpImageStatusCli.askStatus();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}