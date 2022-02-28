/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanPraktikum2;

/**
 *
 * @author Alvian
 */
public class PachmanLatihan2 {
    int x, y, width, height;
    
    PachmanLatihan2(){
        
    }
    PachmanLatihan2(int xh, int yv, int w, int h){
        x = xh;
        y = yv;
        width = w;
        height = h;
    }
    void moveLeft(){
        if(x > 1)x--;
        printPosition();
    }
    void moveRight(){
        if(x < width-1)x++;
        printPosition();
    }
    void moveUp(){
        if(y > 1)y--;
        printPosition();
    }
    void moveDown(){
        if(y < height -1)y++;
        printPosition();
    }
    void printPosition(){
        for(int i = 0; i <= height; i++){
            for(int j=0; j <= width; j++){
                if(i == 0 || i == height || j == 0 || j == width){
                    System.out.print("A  ");
                }else if (i == y && j == x) {
                    System.out.print("O  ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
