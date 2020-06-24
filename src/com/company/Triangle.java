package com.company;

public class Triangle {
    public static void main(String[] args){
        int array[][] = new int[4][7];
        array[0][0]=0;
        array[0][1]=0;
        array[0][2]=0;
        array[0][3]=1;
        array[0][4]=0;
        array[0][5]=0;
        array[0][6]=0;
        array[1][0]=0;
        array[1][1]=0;
        array[1][2]=1;
        array[1][3]=1;
        array[1][4]=1;
        array[1][5]=0;
        array[1][6]=0;
        array[2][0]=0;
        array[2][1]=1;
        array[2][2]=1;
        array[2][3]=1;
        array[2][4]=1;
        array[2][5]=1;
        array[2][6]=0;
        array[3][0]=1;
        array[3][1]=1;
        array[3][2]=1;
        array[3][3]=1;
        array[3][4]=1;
        array[3][5]=1;
        array[3][6]=1;
        for(int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
