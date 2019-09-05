package ru.geekbrains.jsf;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import javax.xml.ws.EndpointReference;
import java.util.List;

@WebService(endpointInterface = "ru.geekbrains.jsf.UserServiceWs")
public class UserServiceWsImpl implements UserServiceWs {

    @Override
    public List<UserRepr> getAllUsers() {
        return null;
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/UserServiceWs",new UserServiceWsImpl());
    }
}
