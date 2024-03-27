import java.util.ArrayList;

public class SortingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(8);
        list.add(7);
        list.add(29);
        for(int i=0;i<list.size()-1;i++){
            for(int j=0;j<list.size()-i-1;j++){
               if(list.get(j)>list.get(j+1)){
                int temp=list.get(j);
                list.set(j,list.get(j+1));
                list.set(j+1,temp);
               }
            }
        }
        System.out.println(list);
    }
}
