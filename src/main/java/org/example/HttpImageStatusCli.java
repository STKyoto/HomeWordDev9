package org.example;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class HttpImageStatusCli {
    public void askStatus() throws URISyntaxException, IOException {
        HttpStatusImageDownloader httpStatusImageDownloader = new HttpStatusImageDownloader();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter HTTP status code");
            if (scanner.hasNextInt()){
                httpStatusImageDownloader.downloadStatusImage(scanner.nextInt());
            }else {
                System.out.println("Please enter valid number");
                scanner.next();
            }
        }
    }
}
