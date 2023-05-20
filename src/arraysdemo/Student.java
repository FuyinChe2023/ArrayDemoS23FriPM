package arraysdemo;

import java.util.prefs.Preferences;


/**
 *
 * @author Alvin Che
 */
public class Student {
    //second commit
    //Sunday
    
    private String sId;
    private String sName;
    private String address;
    private String gender;
    
   
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
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
     
    
    
    
}
