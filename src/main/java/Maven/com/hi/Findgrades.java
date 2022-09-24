package Maven.com.hi;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Path;
import java.util.*;

public class Findgrades {
    ObjectMapper mapper=new ObjectMapper();
    public String findgrades(Map<Student,Map<String,Integer>>map,List<Student>list){
        Map <Integer,Student>ms=new HashMap<>();
        List<Integer>list2=new ArrayList<>();
        for(Student i: list){
            int tot=0;
            Map<String,Integer>m=map.get(i);
            tot=m.get("Maths")+m.get("scn")+m.get("eng");
            ms.put(tot,i);
            list2.add(tot);



        }
        Collections.sort(list2,Collections.reverseOrder());
        String s1="";
        for(int j=0;j<list2.size();j++){
            s1=s1+Integer.toString(j+1)+"place goes to :"+ms.get(list2.get(j)).getName()+"#";

        }



        return s1;
        }

        }


