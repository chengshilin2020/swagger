package com.example.swagger2.sort;

import net.minidev.json.JSONUtil;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class sortTest {
    //冒泡排序
    @Test
    public void maopao(){
        int[] a={8,2,6,4,7};
        //外层循环排序次数
        for(int i=0;i<a.length-1;i++){
            //内层循环比较次数
            for(int j=0;j<a.length-i-1;j++){
                //前一位和后一位比较，如果前一位比后一位大，就互换位置
                if(a[j]>a[j+1])
                {
                    int emp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=emp;
                }
            }
        }
        Arrays.stream(a).forEach(System.out::print);
    }
    @Test
    public void xuanze(){
        int[] a={8,2,6,4,7};

        //记录当前次数最大值的角标
        int pos;

        //交换的变量
        int temp;

        //外层循环次数
        for(int i=0;i<a.length-1;i++){

            //新的次数，将角标重新赋值为0
            pos=0;
            //遍历数组的个数并得到最大数的角标
            for (int j = 0; j < a.length-i; j++) {

                if(a[j]>a[pos]){
                    pos=j;
                }
            }
            //交换
            temp=a[pos];
            a[pos]=a[a.length-i-1];
            a[a.length-i-1]=temp;
        }
        System.out.println(a);
    }
}
