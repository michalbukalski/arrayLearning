package dev.michal;

public class main {

    public static void main(String[] args) {

        int[] firstTen = {1,2,3,4,5,6,7,8,9,12};
        System.out.println("First = "+ firstTen[0]);
        int arrayLenght = firstTen.length;
        System.out.println("Lenght of array = " + arrayLenght);
        System.out.println("Last = " + firstTen[arrayLenght-1]);

//        another array
        System.out.println("---------------------------");


        int[] newArray;
        newArray = new int[] {5,4,3,2,1,0,-1};
        for (int i = 0; i< newArray.length; i++){
            System.out.println("Value of array nr " + i + " is [" + newArray[i] + "]");
//            System.out.println("index of array is "+ i + " value of array is [" + newArray[i] + "]");
        }
    }
}
