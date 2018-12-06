package C189TC;

public class Tree_Node {
    // TJC Create and Declare Variables
    private String name;
    private String phone;
    private String email;
    private Tree_Node parent;
    private Tree_Node leftNode;
    private Tree_Node rightNode;
    private boolean isRightChild;

    // TJC Construct Variables
    public Tree_Node(String name, String phone, String email){
        this(name, phone, email, null, null);
    }
    
    // TJC Create TREE NODE
    public Tree_Node(String name, String phone, String email, Tree_Node leftNode, Tree_Node rightNode){
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }
    
    // TJC Create Method Mutators
    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPhone(){
        return this.phone;
    }

    public  Tree_Node getLeftNode(){
        return this.leftNode;
    }

    public Tree_Node getRightNode(){
        return this.rightNode;
    }

    public Tree_Node getparent(){
        return this.parent;
    }

    public boolean getisRightChild() {
        return isRightChild;
    }

    public void setLeftNode(Tree_Node leftNode){
        this.leftNode = leftNode;
    }

    public void setRightNode(Tree_Node rightNode){
        this.rightNode = rightNode;
    }

    public void setParent(Tree_Node parent){this.parent = parent; }

    public void setisRightChild (boolean isRightChild){this.isRightChild = isRightChild; }


}