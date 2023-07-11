package quartodesafio;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio {
    public static void desafio(int n){
        Scanner scanner = new Scanner(System.in);
        var arr = new ArrayList<String>();
        for(int i = 0; i < n; i++){
            arr.add(scanner.nextLine());
        }
        arr.forEach((palavra) ->{
            int size = palavra.length() / 2;
            String[] arrPalavra = palavra.split("");
            for(int i = size; i> 0; i--){
                System.out.print(arrPalavra[i-1]);
            }
            for(int i = palavra.length(); i > size ; i--){
                System.out.print(arrPalavra[i-1]);
            }
            System.out.println("");
        });
        scanner.close();
    }
    public static void main(String[] args) {
        desafio(5);
    }
}
