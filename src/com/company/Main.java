package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random=new Random();
        int[] Array=new int[10];
        ArrayList<Integer>ArrayList=new ArrayList<>();
        LinkedList<Integer>LinkedList=new LinkedList<>();
        int[] ArraySort=new int[10];
        ArrayList<Integer>ALSort=new ArrayList<>();
        LinkedList<Integer>LLSort=new LinkedList<>();
        Overload overload = new Overload();
        for(int i=0;i< Array.length;i++){
           Array[i]=random.nextInt(0,2);
           ArrayList.add(random.nextInt(0,2));
           LinkedList.add(random.nextInt(0,2));
        }System.out.println("Random massivter--> ");
        for(int i=0;i< Array.length;i++){
        System.out.print(Array[i]+", ");}
        System.out.println("  ");
        System.out.println(ArrayList);
        System.out.println(LinkedList);
        int k=0;
        int j=9;
        for(int i=0;i< Array.length;i++){
            if(Array[i]==0){
                ArraySort[k]=0;
                k++;}
            else {
                ArraySort[j]=1;
            j--;}}
        k=0;
        j=0;
        for(Integer a:ArrayList){
            if(a==0){
                k++;}}
            for(Integer b:LinkedList){
                if(b==0){
                    j++;}}
        for(int i=0;i<k;i++){
            ALSort.add(0);}
        for (int i=0;i<(10-k);i++){
        ALSort.add(1);}
            for(int i=0;i<j;i++){
                    LLSort.add(0);}
        for (int i=0;i<(10-j);i++){
            LLSort.add(1);}
        System.out.println("Sortirovkadan kiyin-->");
        for(int i=0;i<Overload.Sortirovka(ArraySort).length;i++){
        System.out.print(Overload.Sortirovka(ArraySort)[i]+", ");}
        System.out.println("  ");
        System.out.println(Overload.Sortirovka(ALSort));
        System.out.println(Overload.Sortirovka(LLSort));


}}


/*0 жана 1 деген сандар менен рандомно Массивди, ArrayListти жана LinkedListти толтурунуз.
        Overload методдорду тузунуз, алар сортировка болгон элементтерди кайтарсын. Башында 0дор жана аягында 1лер.*/