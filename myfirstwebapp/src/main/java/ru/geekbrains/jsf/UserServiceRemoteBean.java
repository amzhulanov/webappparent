package ru.geekbrains.jsf;

import javax.ejb.Remote;
import java.util.List;

//интерфейс для EJB клиента

@Remote
public interface UserServiceRemoteBean {

    List<UserRepr> getAllUsers();

    UserRepr findById(int id);

    void delete(int id);
}
