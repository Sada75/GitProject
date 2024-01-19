import java.util.ArrayList;

public class Main {
    public static void kMaxSumCombination(ArrayList a,ArrayList b, int k){

        ArrayList<Integer> c=new ArrayList<Integer>();
        for(int i=0;i<a.size();i++){
            for(int j=0;j<b.size();j++){
                int d= (int) a.get(i);
                int l= (int) b.get(j);
                int o=d*l;

                c.add(o);

            }
        }
        for(int r=1;r<=k;r++){
            int p=c.get(0);
            for(int i=1;i<c.size();i++){
                if(c.get(i)>p){
                    p=c.get(i);
                }
            }
            int e=c.indexOf(p);
            System.out.println(p);
            c.remove(e);
        }


    }

    public static void main(String args[]){
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(12);
        a.add(13);
        a.add(17);
        a.add(20);
        ArrayList<Integer> b=new ArrayList<Integer>();
        b.add(43);
        b.add(42);
        b.add(31);
        b.add(76);
        int k=4;


        kMaxSumCombination(a, b, k);
    }
}
