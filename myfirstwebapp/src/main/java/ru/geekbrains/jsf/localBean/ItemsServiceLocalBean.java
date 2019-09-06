package ru.geekbrains.jsf.localBean;

import ru.geekbrains.jsf.ItemRepr;
import ru.geekbrains.persist.item.Item;

import javax.ejb.Local;
import java.util.List;

@Local
public interface ItemsServiceLocalBean {

    Item merge(ItemRepr item);

    void delete(int id);

    ItemRepr findById(int id);

    boolean existsById(int id);

    List<ItemRepr> getAllItems();

}
