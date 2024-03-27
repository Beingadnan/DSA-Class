import java.util.ArrayList;

public class SelectionSort {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(8);
        list.add(10);
        list.add(2);
        for(int i=0;i<list.size();i++){
            int small=i;
            for(int j=i+1;j<list.size();j++){
                if(list.get(small)>list.get(j)){
                    small=j;
                }
            }
            int temp=list.get(i);
            list.set(i,list.get(small));
            list.set(small,temp);
        }
        System.out.println(list);
    }
}
