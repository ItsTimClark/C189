package C189TC;

public class Person {
    // TJC Variable Creation and Declaration
    private String name;
    private String phone;
    private String email;
    private Person nextNode;

    // TJC Variable Construction
    public Person(String name, String phone, String email){
        this(name, phone, email, null);
    }
    
    // TJC Create NODE aka a Person in this example set
    public Person(String name, String phone, String email, Person nextNode){
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.nextNode = nextNode;
    }
    
    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPhone(){
        return this.phone;
    }

    public  Person getNextNode(){
        return this.nextNode;
    }

    public void setNextNode(Person nextNode){
        this.nextNode = nextNode;
    }

}