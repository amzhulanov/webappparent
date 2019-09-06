package ru.geekbrains.jsf.remoteBean;

import ru.geekbrains.jsf.ItemRepr;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface ItemServiceRemoteBean {

    List<ItemRepr> getAllItems();

    ItemRepr findById(int id);

    void delete(int id);

}
