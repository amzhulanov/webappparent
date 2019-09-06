package ru.geekbrains.jsf.remoteBean;

import ru.geekbrains.jsf.UserRepr;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface UserServiceRemoteBean {

    List<UserRepr> getAllUsers();

    UserRepr findById(int id);

    void delete(int id);
}
