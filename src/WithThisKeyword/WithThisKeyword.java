
package WithThisKeyword;

public class WithThisKeyword {
    
    int id;
    String name;
    
    WithThisKeyword(int id, String name){
    this.id = id;
    this.name = name;
    }
    void display(){
        System.out.println(id + " " + name);
    }
    public static void main(String[] args) {
        
        WithThisKeyword s1 = new WithThisKeyword(1, "Wan Sornolota IT");
        WithThisKeyword s2 = new WithThisKeyword(2, "Wan Quiz Contest");
        
        s1.display();
        s2.display();
    }
}
