package ru.geekbrains;

import ru.geekbrains.jsf.UserService;
import ru.geekbrains.jsf.UserServiceWs;

import java.net.MalformedURLException;
import java.net.URL;

public class JaxWSClient {
    public static void main(String[] args) throws MalformedURLException {
        URL url=new URL("http://localhost:8080/myfirstwebapp/UserService/UserServiceBean?WSDL");
        UserService userService = new UserService(url);
        UserServiceWs userServiceBeanPort = userService.getUserServiceBeanPort();

        userServiceBeanPort.getAllUsers()
                .forEach(u -> System.out.printf("%d\t%s%n", u.getId(), u.getLogin()));



    }
}
