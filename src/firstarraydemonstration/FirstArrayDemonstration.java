// File: MultipleArrays.java
// Author: ATG8
// Date: 13-2-2016
// Purpose: This program is designed to create and print multiple arrays.

package firstarraydemonstration;

public class FirstArrayDemonstration{

  public static void main(String[] args){
    char[] header={'_', 'A', 'B', 'C', 'D', 'E'};
    int[][] row={{1}, {2}, {3}, {4}, {5}};
    String[][] coor={{"|___A1__|___B1__|___C1__|___D1__|___E1__|"},
 		   {"|___A2__|___B2__|___C2__|___D2__|___E2__|"},
 		   {"|___A3__|___B3__|___C3__|___D3__|___E3__|"},
 		   {"|___A4__|___B4__|___C4__|___D4__|___E4__|"},
 		   {"|___A5__|___B5__|___C5__|___D5__|___E5__|"}};
    
  //print title
  System.out.println("         I think of Excel spreadsheets!         ");
  System.out.println("************************************************");
  System.out.println();

  //loop through and print header
  for(int headcount=0; headcount<header.length; headcount++){
    System.out.print(String.valueOf(header[headcount])+"___|___");
  } //end header print
  System.out.println();

    //loop through and print row number
    for(int rowrow=0; rowrow<row.length; rowrow++){
      for(int colrow=0; colrow<row[rowrow].length; colrow++){
      System.out.print(row[rowrow][colrow]+"___");
      
        //call method to print coordinates of cells
        for(int colcoor=0; colcoor<coor[rowrow].length; colcoor++){
        System.out.print(coor[rowrow][colcoor]+"___");
        } //end printing of coordinates
      System.out.println();
      } //end for loop colrow
    } //end for loop rowrow
  } //end main
} // end program