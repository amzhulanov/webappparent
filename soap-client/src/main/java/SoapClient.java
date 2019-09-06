import ru.geekbrains.jsf.*;

import java.net.MalformedURLException;
import java.net.URL;

public class SoapClient {

    public static void main(String[] args) throws MalformedURLException {
        URL urlUser = new URL("http://localhost:8080/myfirstwebapp/UserService/UserServiceBean?WSDL");
        UserService userService = new UserService(urlUser);
        UserServiceWs userServiceBeanPort = userService.getUserServiceBeanPort();

        userServiceBeanPort.getAllUsers()
                .forEach(u -> System.out.printf("%d\t%s%n", u.getId(), u.getLogin()));
      //  System.out.println(userServiceBeanPort.findById(1).getLogin());

        URL urlItem = new URL("http://localhost:8080/myfirstwebapp/ItemService/ItemServiceBean?WSDL");
        ItemService itemService=new ItemService(urlItem);
        ItemServiceWs itemServiceBeanPort=itemService.getItemServiceBeanPort();

        itemServiceBeanPort.getAllItems().forEach(i-> System.out.printf("%s\t%s%s%n",i.getName(),i.getCategory(),i.getVendor()));
        itemServiceBeanPort.delete(3);
        System.out.println("Удалил один товар");
        itemServiceBeanPort.getAllItems().forEach(i-> System.out.printf("%s\t%s%s%n",i.getName(),i.getCategory(),i.getVendor()));

    }
}