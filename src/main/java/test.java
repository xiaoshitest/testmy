import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author ：ssy
 * @description：TODO
 * @date ：2021/8/25 14:56
 */

public class test extends Thread implements Runnable{



    public static int secondHighest (String s) {
        char [] array = s.toCharArray();
        boolean flag = false;
        char max = '0';
        char lowerMax = '0';
        for(int i = 0;i < array.length;i ++){
            if(array[i] <= '9' && array[i] >= '0'){
                if(array[i] > max){
                    max = array[i];
                }else if(array[i] > lowerMax && array[i] > max){
                    flag = true;
                    lowerMax = array[i];
                }
            }
        }
        if(flag == true){
            return Integer.parseInt(lowerMax+"");
        }else{
            return -1;
        }
    }


    public static void main(String[] args) {

        String s = "dfa11afd";
        System.out.println(test.secondHighest(s));;

        List faf = new ArrayList();
































    }
}
