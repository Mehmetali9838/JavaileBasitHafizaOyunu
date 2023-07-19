/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basithafizaoyunu;

import java.util.Scanner;

/**
 *
 * @author mehme
 */
public class main {
     
     static Kart [][] kartlar = new Kart[4][4];
    
    public static void main(String[] args){
        
        kartlar[0][0] = new Kart('E');
        kartlar[0][1] = new Kart('A');
        kartlar[0][2] = new Kart('B');
        kartlar[0][3] = new Kart('F');
        kartlar[1][0] = new Kart('G');
        kartlar[1][1] = new Kart('A');
        kartlar[1][2] = new Kart('D');
        kartlar[1][3] = new Kart('H');
        kartlar[2][0] = new Kart('F');
        kartlar[2][1] = new Kart('C');
        kartlar[2][2] = new Kart('D');
        kartlar[2][3] = new Kart('H');
        kartlar[3][0] = new Kart('E');
        kartlar[3][1] = new Kart('G');
        kartlar[3][2] = new Kart('B');
        kartlar[3][3] = new Kart('C');
        
        oyunTahtasi();
        
        while(OyunBittimi() == false){
            
            oyunTahtasi();
            TahminEt();
        }
    }
    public static void TahminEt(){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Birinci Tahmini Giriniz: ( i ve j değerlerini boşluk ile giriniz )");
        int i1=scanner.nextInt();
        int j1= scanner.nextInt();
        
        kartlar[i1][j1].setTahmin(true);
        oyunTahtasi();
        
        System.out.println("ikinci Tahmini Giriniz: ( i ve j değerlerini boşluk ile giriniz )");
        int i2=scanner.nextInt();
        int j2= scanner.nextInt();
        
        
        if(kartlar[i1][j1].getDeger() == kartlar[i2][j2].getDeger()){
            kartlar[i2][j2].setTahmin(true);
        }
        else{
            kartlar[i1][j1].setTahmin(false);
        }
    }
    
    public static void oyunTahtasi(){
        
        for(int i = 0 ; i < 4 ; i++){
            System.out.println("____________________");
            for(int j = 0 ; j < 4 ; j++){
                if(kartlar[i][j].isTahmin()){
                    System.out.print(" |"+kartlar[i][j].getDeger()+"| ");
                }
                else{
                    System.out.print(" | | ");
                    
                }
            }
            System.out.println(" ");
        }
        
        
    }
    
    public static boolean OyunBittimi(){
        
        for( int i = 0; i < 4 ; i++){
            for(int j = 0 ; j < 4 ; j++){
                if(kartlar[i][j].isTahmin()==false){
                    return false;
                }
                else{
                    
                }
            }
        }
        return true;
    }
}
