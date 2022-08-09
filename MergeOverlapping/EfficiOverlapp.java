package MergeOverlapping;

import java.util.Arrays;

class Interval implements Comparable<Interval>{
    int s;
    int e;

    Interval(int s, int e){
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(Interval a) {
        // TODO Auto-generated method stub
        return this.s - a.s;
    }

}
public class EfficiOverlapp {
    public static void Overlap(Interval number[]){
        Arrays.sort(number);
        int resule = 0;
        for(int i = 1; i < number.length;){
            if(number[resule].e >= number[i].s){
                number[resule].e = Math.max(number[resule].e, number[i].e);
                number[resule].s = Math.min(number[resule].s, number[i].s);
            }
            else{
                resule++;
                number[resule] = number[i];
            }
        }

        for(int i = 0; i <= resule; i++){
            System.out.println( "[" + number[i].s + ", " + number[i].e + "] ");
        }
    }
    public static void main(String[] args) {
        Interval number[] = {new Interval(5, 10), new Interval(3, 15), new Interval(18, 30), new Interval(2, 7)};
        Overlap(number);
    }
}
