
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class DAO {

    public void saveObject(ArrayList<Student> templist) {
        File f = new File("Student.Dat");
        FileOutputStream outstream;
        try {
            outstream = new FileOutputStream(f);
            ObjectOutputStream obj = new ObjectOutputStream(outstream);
            obj.writeObject(templist);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public ArrayList<Student> readObject() {
        ArrayList<Student> studentList = new ArrayList<>();
        File f = new File("Student.Dat");
        FileInputStream instream;
        try {
            instream = new FileInputStream(f);
            ObjectInputStream obj = new ObjectInputStream(instream);
            studentList = (ArrayList<Student>) obj.readObject();

        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return studentList;
    }
}
