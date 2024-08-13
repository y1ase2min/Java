/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matris;

/**
 *
 * @author Yasemin
 */
public class Matris {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String [][]sehirler= new String[3][3];
      sehirler [0][0]= "istanbul";
      sehirler [0][1]= "adana";
      sehirler [0][2]= "denizli";
      sehirler [1][0]= "didim";
      sehirler [1][1]= "fatsa";
      sehirler [1][2]= "giresun";
      sehirler [2][0]= "urfa";
      sehirler [2][1]= "rize";
      sehirler [2][2]= "muğla";
      
      int i,j;
      for(i=0;i<3;i++){
          for(j=0;j<3;j++){
              System.out.println(sehirler[i][j]);
          }
      }
      
      
    }
    
}
