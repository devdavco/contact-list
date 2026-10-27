import java.util.*;

public class AddressBook {

    Map<String,Contact>  search = new TreeMap<>();
    Set<String> groups = new TreeSet<>();
    Map<String,Set<String>> relationGroup  = new TreeMap<>();
    List<Contact> historyAddNew = new ArrayList<>();

    public void addContact(Contact c){
        search.put(c.getName(),c);
        historyAddNew.add(c);
    }
    public Contact searchContact(String name){

        return search.get(name);

    }
    public Contact deleteContact(String name){
        Contact contactDeleted = search.remove(name);
        if (contactDeleted != null) {
            historyAddNew.remove(contactDeleted);
        }

        //Falta implementar eliminar de los grupos

        return contactDeleted;
    }

}
