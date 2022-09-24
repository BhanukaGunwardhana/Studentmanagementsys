package Maven.com.hi;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student extends Subject {
    public Student(){

    }
   // public Student(String name,int age){
    //    this.name=name;
    //    this.age=age;
   // }
    private String name;
    private int age;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    ObjectMapper mapper=new ObjectMapper();

    public void add(Student std,Path file) throws Exception{

        mapper.writeValue(file.toFile(),std);
    }
    public String view(List<Path> list)throws Exception{
        String s="";
        for(Path i:list){
        Student s1=mapper.readValue(i.toFile(),Student.class);
        s=s+s1.toString()+"#";
        }
        return s;


    }
    public Student searchStudent(Map<String,Path> map,String name) throws Exception{
        Student s1=mapper.readValue(map.get(name).toFile(),Student.class);

        return s1;

    }
    public void deleteStudent(Map<String,Path> map,String name,Student stdnull) throws Exception {
        //map.get(name)
        mapper.writeValue(map.get(name).toFile(),stdnull);
    }
    public Map addsubjectmarks(Subject sub,int math,int scn,int eng){
        Map<String,Integer> map=new HashMap<>();
        map.put(sub.getSub1(),math);
        map.put(sub.getSub2(),scn);
        map.put(sub.getSub3(),eng);
        return map;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
