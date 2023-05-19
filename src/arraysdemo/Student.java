package arraysdemo;


/**
 *
 * @author Alvin Che
 */
public class Student {
    //first comments
    private String sId;
    private String sName;

    public Student(){
        
    }

    public Student(String sId, String sName) {
        this.sId = sId;
        this.sName = sName;
    }
    
    
    
    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
    
    
    
    
}
