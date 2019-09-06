package ru.geekbrains.jsf.webService;

import ru.geekbrains.jsf.ItemRepr;

import javax.ejb.Local;
import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@Local
@WebService
public interface ItemServiceWs {

    @WebMethod
    List<ItemRepr> getAllItems();

    @WebMethod
    ItemRepr findById(int id);

    @WebMethod
    void delete(int id);


}
