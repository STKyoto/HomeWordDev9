package org.example;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.*;

public class HttpStatusImageDownloader {
    public void downloadStatusImage(int code) throws IOException, URISyntaxException {
        HttpStatusChecker httpStatusChecker = new HttpStatusChecker();
        String fileName = "status_image_" + code;
        int byteRead;
        byte[] buffer = new byte[1024];

            BufferedInputStream bufferedInputStream = new BufferedInputStream(httpStatusChecker.getStatusImage(code).getInputStream());
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);

            while ((byteRead = bufferedInputStream.read(buffer, 0, 1024)) != -1) {
                fileOutputStream.write(buffer, 0, byteRead);
            }
        System.out.println("Image downloaded and saved as " + fileName);
    }
}
