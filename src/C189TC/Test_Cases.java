package C189TC;

public class Test_Cases {
     public static void main(String[] args){
        // TJC Output start of HASH
        System.out.println("Testing Hash:");
        Directory_Hash hashTest = new Directory_Hash();
        // TJC Test Case: #1
        hashTest.add("Bob", "Smith", "bsmith@somewhere.com", "555-235-1111");
        // TJC Test Case: #2
        hashTest.add("Jane", "Williams", "jw@something.com", "555-235-1112");
        // TJC Test Case: #3
        hashTest.add("Mohammed", "al-Salam", "mas@someplace.com", "555-235-1113");
        // TJC Test Case: #4
        hashTest.add("Pat", "Jones", "pjones@homesweethome.com", "555-235-1114");
        // TJC Test Case: #5
        hashTest.add("Billy", "Kidd", "billy_the_kid@nowhere.com", "555-235-1115");
        // TJC Test Case: #6
        hashTest.add("H.", "Houdini", "houdini@noplace.com", "555-235-1116");
        // TJC Test Case: #7
        hashTest.add("Jack", "Jones", "jjones@hill.com", "555-235-1117");
        // TJC Test Case: #8
        hashTest.add("Jill", "Jones", "jillj@hill.com", "555-235-1118");
        // TJC Test Case: #9
        hashTest.add("John", "Doe", "jdoe@somedomain.com", "555-235-1119");
        // TJC Test Case: #10
        hashTest.add("Jane", "Doe", "jdoe@somedomain.com", "555-235-1120");
        // TJC Test Case: #11
        hashTest.find("Pat", "Jones");
        // TJC Test Case: #12
        hashTest.find("Billy", "Kidd");
        // TJC Test Case: #13
        hashTest.delete("John", "Doe");
        // TJC Test Case: #14
        hashTest.add("Test", "Case", "Test_Case@testcase.com", "555-235-1121");
        // TJC Test Case: #15
        hashTest.add("Nadezhda", "Kanachekhovskaya", "dr.nadezhda.kanacheckovskaya@somehospital.moscow.ci.ru", "555-235-1122");
        // TJC Test Case: #16
        hashTest.add("Jo", "Wu", "wu@h.com", "555-235-1123");
        // TJC Test Case: #17
        hashTest.add("Millard", "Fillmore", "millard@theactualwhitehouse.us", "555-235-1124");
        // TJC Test Case: #18
        hashTest.add("Bob", "vanDyke", "vandyke@nodomain.com", "555-235-1125");
        // TJC Test Case: #19
        hashTest.add("Upside", "Down", "upsidedown@rightsideup.com", "555-235-1126");
        // TJC Test Case: #20
        hashTest.find("Jack", "Jones");
        // TJC Test Case: #21
        hashTest.find("Nadezhda", "Kanachekhovskaya");
        // TJC Test Case: #22
        hashTest.delete("Jill", "Jones");
        // TJC Test Case: #23
        hashTest.delete("John", "Doe");
        // TJC Test Case: #24
        hashTest.find("Jill", "Jones");
        // TJC Test Case: #25
        hashTest.find("John", "Doe");
        // TJC Output Completion of HASH
        System.out.println();
        System.out.println("Complete: Hash Test");
        System.out.println();
        // TJC Output start of TREE
        System.out.println("Testing Tree:");
        Directory_Tree treeTest = new Directory_Tree();
        // TJC Test Case: #1
        treeTest.add("Bob", "Smith", "bsmith@somewhere.com", "555-235-1111");
        // TJC Test Case: #2
        treeTest.add("Jane", "Williams", "jw@something.com", "555-235-1112");
        // TJC Test Case: #3
        treeTest.add("Mohammed", "al-Salam", "mas@someplace.com", "555-235-1113");
        // TJC Test Case: #4
        treeTest.add("Pat", "Jones", "pjones@homesweethome.com", "555-235-1114");
        // TJC Test Case: #5
        treeTest.add("Billy", "Kidd", "billy_the_kid@nowhere.com", "555-235-1115");
        // TJC Test Case: #6
        treeTest.add("H.", "Houdini", "houdini@noplace.com", "555-235-1116");
        // TJC Test Case: #7
        treeTest.add("Jack", "Jones", "jjones@hill.com", "555-235-1117");
        // TJC Test Case: #8
        treeTest.add("Jill", "Jones", "jillj@hill.com", "555-235-1118");
        // TJC Test Case: #9
        treeTest.add("John", "Doe", "jdoe@somedomain.com", "555-235-1119");
        // TJC Test Case: #10
        treeTest.add("Jane", "Doe", "jdoe@somedomain.com", "555-235-1120");
        // TJC Test Case: #11
        treeTest.find("Pat", "Jones");
        // TJC Test Case: #12
        treeTest.find("Billy", "Kidd");
        // TJC Test Case: #13
        treeTest.delete("John", "Doe");
        // TJC Test Case: #14
        treeTest.add("Test", "Case", "Test_Case@testcase.com", "555-235-1121");
        // TJC Test Case: #15
        treeTest.add("Nadezhda", "Kanachekhovskaya", "dr.nadezhda.kanacheckovskaya@somehospital.moscow.ci.ru", "555-235-1122");
        // TJC Test Case: #16
        treeTest.add("Jo", "Wu", "wu@h.com", "555-235-1123");
        // TJC Test Case: #17
        treeTest.add("Millard", "Fillmore", "millard@theactualwhitehouse.us", "555-235-1124");
        // TJC Test Case: #18
        treeTest.add("Bob", "vanDyke", "vandyke@nodomain.com", "555-235-1125");
        // TJC Test Case: #19
        treeTest.add("Upside", "Down", "upsidedown@rightsideup.com", "555-235-1126");
        // TJC Test Case: #20
        treeTest.find("Jack", "Jones");
        // TJC Test Case: #21
        treeTest.find("Nadezhda", "Kanachekhovskaya");
        // TJC Test Case: #22
        treeTest.delete("Jill", "Jones");
        // TJC Test Case: #23
        treeTest.delete("John", "Doe");
        // TJC Test Case: #24
        treeTest.find("Jill", "Jones");
        // TJC Test Case: #25
        treeTest.find("John", "Doe");
        System.out.println();
        // TJC Output completion of TREE
        System.out.println("Complete: Tree Test");  
}
}
