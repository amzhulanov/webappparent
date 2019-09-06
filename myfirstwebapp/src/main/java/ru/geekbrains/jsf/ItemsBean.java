package ru.geekbrains.jsf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.geekbrains.jsf.localBean.ItemsServiceLocalBean;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Stateless
@Named
public class ItemsBean implements Serializable {

    private Logger logger = LoggerFactory.getLogger(ItemsBean.class);

    @Inject
    private ItemsServiceLocalBean itemServiceBean;

    @Inject
    private GarbageService garbageService;

    private ItemRepr item;

    public ItemRepr getItem() {
        return item;
    }

    public void setItem(ItemRepr item) {
        this.item = item;
    }

    public List<ItemRepr> getAllItems() {
        return itemServiceBean.getAllItems();
    }

    public String editItem(ItemRepr item) {
        this.item=item;
        return "/item.xhtml?faces-redirect=true";
    }

    public void deleteItem(ItemRepr item) {
        garbageService.merge(new GarbageRepr(item));
        itemServiceBean.delete(item.getId());
    }

    public String createItem() {
        this.item=new ItemRepr();
        return "/item.xhtml?faces-redirect=true";
    }

    public String saveItem() {
        itemServiceBean.merge(this.item);
        return "/items.xhtml?faces-redirect=true";
    }
}