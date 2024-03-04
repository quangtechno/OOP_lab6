
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class StudentManager {
DAO dao=new DAO();
ArrayList<Student> list = new ArrayList<>();

    public StudentManager() {
    }
    
    public Student findStudentID(String student_ID) {
        for (int i = 0; i < list.size(); i++) {
            Student temp = list.get(i);
            if (temp.getStudentID().equalsIgnoreCase(student_ID)) {
                return temp;
            }
        }
        return null;
    }

    public ArrayList<Student> getList() {
        return list;
    }

    public void setList(ArrayList<Student> list) {
        this.list = list;
    }

    public boolean addStudent(Student stu) {
        if (findStudentID(stu.getStudentID()) == null) {
            list.add(stu);
            return true;
        } else {
            return false;
        }
    }
public void print(){
    for(int i=0;i<list.size();i++){
        System.out.println(list.get(i).toString());
    }
}
public void readData(){
    this.list=dao.readObject();
}
public void saveData(){
    this.dao.saveObject(list);
}
    public ArrayList<Student> getListStudent() {
        return list;
    }
}
