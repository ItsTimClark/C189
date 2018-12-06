package C189TC;

public class Directory_Tree {
Tree_Node root;

    public void add(String fName, String lName, String email, String phone){
        System.out.println("Adding data to tree: " + fName + " " + lName );
        String name = nameCat(fName, lName);
        Tree_Node newTreeNode = new Tree_Node(name, phone, email);
        // TJC Perform NULL Check
        if(root == null){
        // TJC Insert if NULL = TRUE
            root = newTreeNode;
            System.out.println("Adding data to root" + "Root name = " + root.getName());
        }
        else {
            rAdd(root, newTreeNode);
        }
    }

    public void rAdd(Tree_Node addRoot, Tree_Node newTreeNode){
            if(newTreeNode.getName().compareTo(addRoot.getName()) < 0){
                if(addRoot.getLeftNode() == null){
                // TJC Set ROOT child LEFT to NEW NODE
                    addRoot.setLeftNode(newTreeNode);
                // TJC Set NEW NODE to parent
                    newTreeNode.setParent(addRoot);
                    newTreeNode.setisRightChild(false);
                }
                else{
                    rAdd(addRoot.getLeftNode(), newTreeNode);
                }
            }
            else{
                if(addRoot.getRightNode() == null) {
                // TJC Set ROOT child RIGHT to NEW NODE
                    addRoot.setRightNode(newTreeNode);
                // TJC Set NEW NODE to parent
                    newTreeNode.setParent(addRoot);
                    newTreeNode.setisRightChild(true);
                }
                else{
                    rAdd(addRoot.getRightNode(), newTreeNode);
                }
            }


    }

    public Tree_Node find(String fName, String lName){
        // TJC Display Status Update for Search
        System.out.println("Find Tree Value: " + fName + " " + lName);
        // TJC Concatenate FIRST+LAST Name
        String name = nameCat(fName, lName);
        // TJC Return Search Results
        return rFind(root, name);
    }

    public Tree_Node rFind(Tree_Node rFindroot, String rname){
        // TJC Compare Root Name
        String compareRootName = rFindroot.getName();
        if(rname.compareTo(compareRootName) == 0){
        // TJC Report if Found
            System.out.println("Name: " + rname + " found");
        // TJC Return Results
            return rFindroot;
        }
        else if(rname.compareTo(compareRootName) < 0){
            // TJC Perform NULL check
            if(rFindroot.getLeftNode() == null){
            // TJC Report if NOT Found
                System.out.println("Name: " + rname + " not found as left node");
            // TJC Return NULL
                return null;
            }
            else {
                rFind(rFindroot.getLeftNode(), rname);
            }
        }
        else {
            // TJC Perform NULL check for Right-Child
            if(rFindroot.getRightNode() == null) {
            // TJC Report if NOT Found
                System.out.println("Name: " + rname + " not found as right node");
            // TJC Return NULL
                return null;
            }
            else {
                rFind(rFindroot.getRightNode(), rname);
            }
        }
        return rFindroot;
    }

    public Tree_Node delete(String fName, String lName){
        System.out.println("Delete Name from Tree: " + fName + " " + lName);
        Tree_Node delNode = find(fName, lName);
        // TJC Check for deletion
        if(delNode == null){
        // TJC Return NULL - Nothing found to delete
            System.out.println("Name not found - nothing to delete.");
            return null;
        }
        else if(delNode.getLeftNode() == null && delNode.getRightNode() == null){
                if(delNode.getisRightChild() == true){
                    // TJC Set NODE Parent to NULL (RIGHT)
                    delNode.getparent().setRightNode(null);
                }
                else {
                    // TJC Set NODE Parent to NULL (LEFT)
                    delNode.getparent().setLeftNode(null);
                }
        }
        // TJC CHECK for Right-Child-Node
        else if(delNode.getRightNode() != null && delNode.getLeftNode() == null){
            delNode.getparent().setRightNode(delNode.getRightNode());
            delNode.getRightNode().setParent(delNode.getparent());
        }
        // TJC CHECK for Left-Child-Node
        else if(delNode.getLeftNode() != null && delNode.getRightNode() == null){
            delNode.getparent().setLeftNode(delNode.getLeftNode());
            delNode.getLeftNode().setParent(delNode.getparent());
        }
        // TJC Check for BOTH-Child-Node
        else if((delNode.getRightNode() != null) && (delNode.getLeftNode() != null)){
            delNode = util(delNode.getRightNode());

            if(delNode.getisRightChild() == true){
            // TJC Set NODE Child (RIGHT) to NULL
                delNode.getparent().setRightNode(null);
            }
            else {
            // TJC Set NODE Child (LEFT) to NULL
                delNode.getparent().setLeftNode(null);
            }
        }
        return null;
    }

    // TJC Create Utility that returns Child on Loop until NULL returns then Exit
    public Tree_Node util (Tree_Node utilTreenode){
        boolean exitLoop = false;
        // TJC Create and Set Variable
        Tree_Node retTreenode = utilTreenode;
        while(exitLoop == false){
            retTreenode = utilTreenode;
            utilTreenode = utilTreenode.getLeftNode();
        // TJC Check if child = NULL
            if(utilTreenode.getLeftNode() == null){
        // TJC Exit upon NULL = TRUE
                 exitLoop = true;
             }

        }
        // TJC Returns Node
        return retTreenode;
    }
    
    // TJC Concatenates FIRST + LAST name into FULLNAME string
    public String nameCat(String fName, String lName){
        return fName + lName;}
}