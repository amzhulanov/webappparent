package ru.geekbrains.jsf.webService;

import ru.geekbrains.jsf.UserRepr;

import javax.ejb.Local;
import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@Local
@WebService
public interface UserServiceWs {

    @WebMethod
    List<UserRepr> getAllUsers();

    @WebMethod
    UserRepr findById(int id);

    @WebMethod
    void delete(int id);


}
