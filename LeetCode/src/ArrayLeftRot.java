import java.util.ArrayList;
import java.util.List;

public  class ArrayLeftRot {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        List<Integer> li = new ArrayList<>();
        for (int i : arr){
            li.add(i);
        }
        System.out.println(rotLeft(li,2));
    }
    public static List<Integer> rotLeft(List<Integer> a, int d){
        List<Integer> removed = new ArrayList<>();
        List<Integer> rot = new ArrayList<>();
        int[] array = new int[a.size()];
        for (int i= 0;i<a.size();i++){
            array[i]=a.get(i);
        }

        for (int i=0;i<d;i++){
            int r = array[i];
            removed.add(r);
        }
        for (int i = d;i<array.length;i++){
            rot.add(array[i]);
        }
        rot.addAll(removed);

        return rot ;
    }
}