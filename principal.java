import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;  


public class principal {
    public static void main(String args[])
    {
        System.out.println("Trabalho de Automatos");
        char elemento[] = new char[] {'0','1'}; 
        int estados = 3;
        char entrada[] = new char[] {'0','0','0','1','1'};
        String finais[] = new String[] {"1","2"};
        char inicial = '1';
        char estado = inicial;
        String transicoes[] = new String[] {"101", "112", "203", "212", "302", "312"};

        for(char e : entrada){
            String transicao = "";
            for(String t : transicoes){
                if (t.toCharArray()[0] == estado && t.toCharArray()[1] == e){
                    transicao = t;
                    break;
                }                                    
            }   
            if (transicao == "") {
                System.out.println("Não encontrei uma transição valida!");
                break;
            }
            
            estado = transicao.toCharArray()[2];
            System.out.println("Transição: " + transicao);
            System.out.println();
            if(Arrays.asList(finais).contains(Character.toString(estado))){
                System.out.println("Estado final = " + estado);
            }else {
                System.out.println("Não chegou a um estado final.");
            }

        } 
    }
}