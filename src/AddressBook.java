import java.util.*;

public class AddressBook {

    Map<String,Contact> contacts = new TreeMap<>(); //Contact list
    Set<String> groups = new TreeSet<>(); //Group list
    Map<String,Set<String>> relationGroup  = new TreeMap<>(); // Relacion grupos personas
    List<Contact> historyAddNew = new ArrayList<>(); // historial contacts

    public void addContact(Contact c){
        contacts.put(c.getName(),c);
        historyAddNew.add(c);
    }
    public Contact searchContact(String name){

        return contacts.get(name);

    }
    public Contact deleteContact(String name){
        Contact contactDeleted = contacts.remove(name);
        if (contactDeleted != null) {
            historyAddNew.remove(contactDeleted);
        }

        //Falta implementar eliminar de los grupos

        return contactDeleted;
    }

    public void contactList (){

        for(Contact c: contacts.values()){
            System.out.println(c);
        }
    }

    public void historyList(){
        for(Contact c: historyAddNew){
            System.out.println(c);
        }
    }

    public void addGroup(String groupName){

        if(!groups.contains(groupName)){
            groups.add(groupName);
        }else{
            System.out.println("Ya existe un grupo con el mismo nombre");
        }
    }

    public void addContactToGroup(String contactName, String groupName){

        if(contacts.containsKey(contactName) && groups.contains(groupName) ){

            relationGroup.put(contactName);
        }
    }


}
