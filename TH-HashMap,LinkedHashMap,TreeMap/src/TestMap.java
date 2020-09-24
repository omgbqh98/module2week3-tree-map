import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
//        tạo hasmap de luu tru sinh vien:
        Map<String, Integer> hasMap = new HashMap<>();
        hasMap.put( "huynh",3);
        hasMap.put( "hoang",4);
        hasMap.put( "khoa",2);
        hasMap.put("quang",7);
        System.out.println("hien thi sinh vien trong hasmap:");
        System.out.println(hasMap + "\n");

//        tao treemap de luu tru key theo thu tu giam dan:
        Map<String, Integer> treeMap = new TreeMap<>(hasMap);
        System.out.println("hien thi sv thu tu giam gian của key:  ");
        System.out.println(treeMap);


//        Tạo LinkedHashMap trong main lưu danh sách sinh viên và hiển thị dữ liệu
        Map<String, Integer> linkedHasMap = new LinkedHashMap<>();
        linkedHasMap.put( "huynh",3);
        linkedHasMap.put( "hoang",4);
        linkedHasMap.put( "khoa",2);
        linkedHasMap.put("quang",7);
        System.out.println(linkedHasMap.get("hoang"));
    }


}
