package ru.geekbrains;

import java.net.MalformedURLException;
import java.net.URL;

public class JaxWSClient {
    public static void main(String[] args) throws MalformedURLException {
        URL url=new URL("http://localhost:8080/myfirstwebapp/UserServiceWsImpl?WSDL");
//        UserServiceWsImplService userServiceWsService = new UserServiceWsImplService(url);
//        UserServiceWs userServiceWs=userServiceWsService.getUserServiceWsImplPort();

    }
}
