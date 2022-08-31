package com.java_basics;

public class Arrays {
    private double[] array;
    private int numberOfElements = 0;

//    setting the size of the array
    void size(int counter){
        array = new double[counter];
    }


//    insertion into an array
    void insert(double value){
        array[numberOfElements] = value;
        numberOfElements++;
    }


//    searching for a value in an array
    public boolean find(double searchKey) {
        int j;
        for(j=0; j<array.length; j++){
            if (array[j] == searchKey){
                break;
            }
        }
        if (j==numberOfElements){
            return false;
        } else {
            return true;
        }
    }


//    deleting an element in an array
    public boolean remove(double deleteKey){
        int j;
        for(j=0; j<array.length; j++){
            if (array[j] == deleteKey){
                break;
            }
        }
        if(j==numberOfElements){
            return false;
        }else{
            for(int k=j; k<array.length; k++){
                array[k] = array[k+1];
                numberOfElements--;
                return true;
            }
            return true;
        }
    }

//    displaying the contents of the array
    public void display(){
        for(int i=0; i< array.length; i++){
            System.out.print(array[i]+"  ");
        }
        System.out.println();
    }
}
