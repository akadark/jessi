package entity;

import java.util.HashMap;
import java.util.Scanner;

import javax.swing.*;

public class SearchRecipe {
   HashMap<Integer, String> myMap = new HashMap<Integer, String>();
   public void setRecipeNameInHashmap(int num, String recipeName){
      myMap.put(num, recipeName);
    }   
   
   public void getRecipeNameInHashmap(String recipeName, JTable table, JFrame frame){
      System.out.print("�丮�˻� ");
       if (myMap.containsValue(recipeName)){
          System.out.print("�˻���� "+recipeName+"�� �����մϴ�.");
          table.setValueAt("1", 0, 0);
          table.setValueAt(recipeName, 0, 1);
          
       }else  {
         System.out.println("�˻���� "+recipeName+"�� �������� �ʽ��ϴ�.");
         table.setValueAt(" ", 0, 0);
         table.setValueAt(null, 0, 1);
         JOptionPane.showMessageDialog(frame, "�˻���� "+recipeName+"�� �������� �ʽ��ϴ�.");
       }
   }  
}