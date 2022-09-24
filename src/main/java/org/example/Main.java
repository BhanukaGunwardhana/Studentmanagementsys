package org.example;

import Maven.com.hi.Findgrades;
import Maven.com.hi.Student;
import Maven.com.hi.Subject;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper=new ObjectMapper();
            Student std=new Student();
            Student std1=new Student();
            Student std2=new Student();
            Subject sub=new Subject();

            List<Path>list=new ArrayList<>();
            Map<String,Path>map=new HashMap<>();
            Map<Student,Map<String,Integer>>mapL=new HashMap<>();
            List<Student>listL=new ArrayList<>();

            Student stdnull=new Student();
            stdnull.setAge(0);
            stdnull.setName("");
            Path sbfile=Paths.get("C:\\Users\\UDDEEPA\\IdeaProjects\\untitled1\\src\\main\\resources\\my");

            sub.setSub1("Maths");
            sub.setSub2("Science");
            sub.setSub3("English");
            sub.addsub(sub,sbfile);
            System.out.println(sub.viewsub(sbfile));


            std1.setName("Vimukthi");
            std1.setAge(30);
            Map<String,Integer >map1=std1.addsubjectmarks(sub,78,79,90);
            mapL.put(std1,map1);
            listL.add(std1);

            Path stfile=Paths.get("C:\\Users\\UDDEEPA\\IdeaProjects\\untitled1\\src\\main\\resources\\"+std1.getName());
            std1.add(std1,stfile);
            list.add(stfile);
            map.put("Vimukthi",stfile);

            std2.setName("Dilan");
            std2.setAge(35);
            Map<String,Integer >map2= std2.addsubjectmarks(sub,75,89,86);
            mapL.put(std2,map2);
            listL.add(std2);
            Path file1=Paths.get("C:\\Users\\UDDEEPA\\IdeaProjects\\untitled1\\src\\main\\resources\\"+std2.getName());
            std2.add(std2,file1);
            list.add(file1);
            map.put("Bhanuka",file1);

            //System.out.println(std.view(list));
            //System.out.println(std.searchStudent(map,"Vimukthi"));
            //std.deleteStudent(map,"Vimukthi",stdnull);
           Findgrades grades=new Findgrades();
           System.out.println(grades.findgrades(mapL,listL));
            //System.out.println(std.view(list));


           //System.out.println(std.view());

            //System.out.println(std.searchStudent("Vimukthi",std).toString());
            //std.setName("Vimukthi");
            //std.getName();
            //std.setAge(30);
            //std.getAge();

           // Path file=Paths.get("C:\\Users\\UDDEEPA\\IdeaProjects\\untitled1\\src\\main\\resources\\hi");
            //File book1= new File("src/main/resources/hi");
            //Student s=mapper.readValue(file.toFile(), Student.class);
           // System.out.println(std.toString());
            //mapper.writeValue();
            //mapper.writeValue();


           // Path file=Paths.get("src/main/resources/hi");
            //File book1= new File("src/main/resources/hi");
            //Student s1=mapper.readValue(file.toFile(), Student.class);
            //System.out.println(s1.toString());


        }
        catch (Exception e){
            System.out.println(e);
        }


    }
}