package terceirodesafio;

import java.util.Scanner;

public class Desafio {
    public static int desafio(int n,int  k){
        int counter = 0;
        int[]arr = new int[n];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < n ; i++){
            arr[i] = in.nextInt();
        }
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] - arr[j] == k || arr[j] - arr[i] == k){
                    counter++;
                }
            }
        }
        in.close();
        return counter;
    }
    public static void main(String[] args) {
        System.out.println("Saída: "+ desafio(5,2));
    }
}
