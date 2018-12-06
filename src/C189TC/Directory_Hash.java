package C189TC;

public class Directory_Hash {
    // TJC Generates the main Hash Table
    Person[] hashTbl = new Person[13];
    // TJC Creates inserts for values into the new Hash Table
    public void add(String fName, String lName, String email, String phone) {
        // TJC Create name variable to hold concatenated full name (First + Last)
        String name = nameCat(fName, lName);
        // TJC Create hashNum variable which uses required equation to convert
        int hashNum = Math.abs(name.toUpperCase().hashCode()%13);
        // TJC Assigns variables
        Person newNode = new Person(name, email, phone, hashTbl[hashNum]);
        hashTbl[hashNum] = newNode;
        System.out.println("Added hash Number = " + hashNum);
    }
    // TJC Performs search function on Hash Table for input values
    public void find(String fName, String lName){
        String name = nameCat(fName, lName);
        // TJC Print Status Results
        System.out.println("Trying to find = " + name);
        int hashNum = Math.abs(name.toUpperCase().hashCode()%13);
        Person counter = hashTbl[hashNum];
        String foundEmail = null;
        String foundPhone = null;
        boolean foundIt = false;
        // TJC Perform NULL checks
        while (counter != null){
            if (counter.getName().equals(name)){
                foundEmail = counter.getEmail();
                foundPhone = counter.getPhone();
                foundIt = true;
            }
            counter = counter.getNextNode();
        }
        if(foundIt == false){
            // TJC Print Results if unable to locate record
            System.out.println(fName + " " + lName + " Can't Be found.");
        }
        else if(foundIt == true){
            // TJC Print Results if able to locate record
            System.out.println("Found: " + name + " " + foundEmail + " " + foundPhone);
        }
    }
    // TJC Performs delete function on Hash Table for input value
    public void delete(String fName, String lName) {
        String name = nameCat(fName, lName);
        System.out.println("Delete = " + name);
        // TJC Update status
        int hashNum = Math.abs(name.toUpperCase().hashCode() % 13);
        // TJC Set Hash Counter
        Person counter = hashTbl[hashNum];
        if (counter.getName().equals(name)) {
            hashTbl[hashNum] = hashTbl[hashNum].getNextNode();
        }
        // TJC Perform NULL checks
        else while (counter != null) {
            Person prevNode = hashTbl[hashNum];
            Person meNode = prevNode.getNextNode();
            if (counter.getName().equals(name)) {
                meNode = meNode.getNextNode();
                prevNode = meNode;
            }
            if (meNode != null){
                prevNode.setNextNode(meNode.getNextNode());
            }
            else System.out.println("Name: "  + fName + " " + lName + " Not found to delete");
            counter = counter.getNextNode();
        }
    }
    // TJC Perform Full Name concatenation (FIRST+LAST)
    public String nameCat(String fName, String lName){
        String tempName = fName + lName;
        return tempName;
    }
}