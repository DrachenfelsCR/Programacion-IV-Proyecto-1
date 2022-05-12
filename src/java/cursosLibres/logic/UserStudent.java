package cursosLibres.logic;
import cursosLibres.logic.record;
import java.util.ArrayList;

public class UserStudent extends User{
    //Attributes
    
     private ArrayList<record> ArrayRecord;
     
    //Methods
     
      public UserStudent() {
        super("Estudiante", "", "", "", "");
        this.ArrayRecord = new ArrayList<record>();
    }
     
    public UserStudent(String rol, String id, String name, String email, String phoneNumber) {
        super(rol, id, name, email, phoneNumber);
        this.ArrayRecord = new ArrayList<record>();
    }

    public ArrayList<record> getArrayRecord() {
        return ArrayRecord;
    }

    public void setArrayRecord(ArrayList<record> ArrayRecord) {
        this.ArrayRecord = ArrayRecord;
    }
        
}
