import java.util.ArrayList;

public class InsertionArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(14);
        list.add(7);
        list.add(2);
        for(int i=1;i<list.size();i++){
            int ele=list.get(i);
            int check=i-1;

            while(check>=0 && ele<list.get(check)){
                list.set(check+1,list.get(check));
                check--;
            }
            list.set(check+1,ele);
        }
        System.out.println(list);
    }
}
