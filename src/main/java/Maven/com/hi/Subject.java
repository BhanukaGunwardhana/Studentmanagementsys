package Maven.com.hi;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class Subject {
    public Subject(){

    }
    private  String sub1;
    private  String sub2;
    private  String sub3;

    public String getSub1() {
        return sub1;
    }

    public void setSub1(String sub1) {
        this.sub1 = sub1;
    }

    public String getSub2() {
        return sub2;
    }

    public void setSub2(String sub2) {
        this.sub2 = sub2;
    }

    public String getSub3() {
        return sub3;
    }

    public void setSub3(String sub3) {
        this.sub3 = sub3;
    }
    ObjectMapper mapper=new ObjectMapper();
    public void addsub(Subject sub, Path file) throws IOException {
        mapper.writeValue(file.toFile(),sub);

    }
    public String viewsub(Path file) throws IOException {
        Subject sb=mapper.readValue(file.toFile(), Subject.class);
        return sb.toString();

    }

    @Override
    public String toString() {
        return "Subject{" +
                "sub1='" + sub1 + '\'' +
                ", sub2='" + sub2 + '\'' +
                ", sub3='" + sub3 + '\'' +
                ", mapper=" + mapper +
                '}';
    }
    //public String viewsub(List<Path>list){



    //}
}
