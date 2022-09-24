package org.example;

import Maven.com.hi.Findgrades;
import Maven.com.hi.Student;
import Maven.com.hi.Subject;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper=new ObjectMapper();
            Student std=new Student();
            Subject sub=new Subject();

            List<Path>list=new ArrayList<>();
            Map<String,Path>map=new HashMap<>();
            Map<Student,Map<String,Integer>>mapL=new HashMap<>();
            List<Student>listL=new ArrayList<>();
            Set<String>set=new HashSet<>() ;

            Student stdnull=new Student();
            stdnull.setAge(0);
            stdnull.setName("");
            Path sbfile=Paths.get("C:\\Users\\UDDEEPA\\IdeaProjects\\untitled1\\src\\main\\resources\\my");

            Scanner scan=new Scanner(System.in);
            System.out.println("Subjects :");
            String [] subarr=scan.nextLine().split(",");
            sub.setSub1(subarr[0]);
            sub.setSub2(subarr[1]);
            sub.setSub3(subarr[2]);

            System.out.println("No of students");
            int count=scan.nextInt();
            for(int i=0;i<count;i++){

                System.out.println("Name,Age,Marks");
                String s=scan.next();
                set.add(s);}
            for (String string: set){
                String [] arr=new String[5];
                arr=string.split(",");
                std.setName(arr[0]);
                std.setAge(Integer.parseInt(arr[1]));
                int math=Integer.parseInt(arr[2]);int scn=Integer.parseInt(arr[3]);int eng=Integer.parseInt(arr[4]);
                Map<String,Integer >map1=std.addsubjectmarks(sub,math,scn,eng);

                mapL.put(std,map1);
                Path stfile=Paths.get("C:\\Users\\UDDEEPA\\IdeaProjects\\untitled1\\src\\main\\resources\\"+std.getName());
                std.add(std,stfile);
                listL.add(std.read(stfile));
                list.add(stfile);
                map.put(std.getName(),stfile);





            }









            System.out.println(std.view(list));
            System.out.println(std.searchStudent(map,"A"));
            std.deleteStudent(map,"A",stdnull);
            System.out.println(std.view(list));
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