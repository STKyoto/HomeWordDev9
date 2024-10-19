package org.example;


import java.io.IOException;
import java.net.*;

public class HttpStatusChecker{
    public HttpURLConnection getStatusImage(int code) throws URISyntaxException, MalformedURLException {
        URI uri = new URI("https://http.cat/" + code +".jpg");
        URL url = uri.toURL();
        HttpURLConnection connection = null;
        try {
            connection = (HttpURLConnection) url.openConnection();
        } catch (IOException e) {
            throw new RuntimeException();
        }
        return connection;
    }
}
