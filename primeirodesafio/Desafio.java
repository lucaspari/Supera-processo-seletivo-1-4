package primeirodesafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Desafio {
    public static void desafio(){
   
        ArrayList<Integer> odd = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
             ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0 ; i < number ; i++){
            int valor = in.nextInt();
            numbers.add(valor);
        }
        odd.addAll(numbers.stream().filter((i) -> i % 2 != 0).toList());
        even.addAll(numbers.stream().filter((i) -> i % 2 == 0).toList());
        Collections.sort(odd,Collections.reverseOrder());
        Collections.sort(even);
        result.addAll(even);
        result.addAll(odd);
        System.out.println("-----------------------------------");
        result.forEach(System.out::println);
        in.close();

    }
    public static void main(String[] args) {
        desafio();
    }
}
