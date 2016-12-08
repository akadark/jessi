package entity;

import java.io.*;
import java.util.*;

import javax.swing.*;

import valueObject.*;

public class Ingredient {
  private Vector<IngredientInfo> ingredientlist;
  private Vector<RecipeInfo> recipelist;

  public Ingredient() {
    try {
      BufferedWriter fileWriter = new BufferedWriter(new FileWriter("ingredient.txt"));

        fileWriter.write("�������");
        fileWriter.newLine();
        
        fileWriter.write("�Ұ��");
        fileWriter.newLine();
        
        fileWriter.write("�߰��");
        fileWriter.newLine();
        
        fileWriter.write("������");
        fileWriter.newLine();
        
        fileWriter.write("����");
        fileWriter.newLine();
        
        fileWriter.write("����");
        fileWriter.newLine();
        
        fileWriter.write("����");
        fileWriter.newLine();
        
        fileWriter.write("����");
        fileWriter.newLine();
        
        fileWriter.write("���");
        fileWriter.newLine();

        fileWriter.write("ȣ��");
        fileWriter.newLine();

        fileWriter.write("������ī");
        fileWriter.newLine();
        
        fileWriter.write("����");
        fileWriter.newLine();
        
        fileWriter.write("����");
        fileWriter.newLine();

        fileWriter.write("����");
        fileWriter.newLine();

        fileWriter.write("����");
        fileWriter.newLine();

        fileWriter.write("��");
        fileWriter.newLine();

        fileWriter.write("����");
        fileWriter.newLine();

        fileWriter.write("�̿�");
        fileWriter.newLine();

        fileWriter.write("ȫ��");
        fileWriter.newLine();

        fileWriter.write("������");
        fileWriter.newLine();

        fileWriter.write("��¡��");
        fileWriter.newLine();

        fileWriter.write("����");
        fileWriter.newLine();
        
        fileWriter.write("�ɰ�");
        fileWriter.newLine();

        fileWriter.write("��ġ");
        fileWriter.newLine();

        fileWriter.write("����");
        fileWriter.newLine();

        fileWriter.write("�ұ�");
        fileWriter.newLine();

        fileWriter.write("����");
        fileWriter.newLine();

        fileWriter.write("���尡��");
        fileWriter.newLine();

        fileWriter.write("����");
        fileWriter.newLine();

        fileWriter.write("����");
        fileWriter.newLine();

        fileWriter.write("���ҽ�");
        fileWriter.newLine();

        fileWriter.write("�ᳪ��");
        fileWriter.newLine();

        fileWriter.write("���ֳ���");
        fileWriter.newLine();

        fileWriter.write("��縮");
        fileWriter.newLine();

        fileWriter.write("�ñ�ġ");
        fileWriter.newLine();
        
      fileWriter.close();

    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public Vector<IngredientInfo> getList() {
    try {
      BufferedReader fileReader = new BufferedReader(new FileReader("ingredient.txt"));
      ingredientlist = new Vector<IngredientInfo>();
      String line = "start";
      for(int i = 0; line != null; i++){
        line = fileReader.readLine();
        if(line != null){
          ingredientlist.add(new IngredientInfo(line));
          //System.out.println(line);
        }else {
          break;
        }
      }
      
      fileReader.close();

    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return ingredientlist;
  }

  public void setSelectlist(JCheckBox checkBox) {
    try {    
      BufferedWriter fileWriter = new BufferedWriter(new FileWriter("selectlist.txt", true));
      
      if(checkBox.isSelected()){
        fileWriter.write(checkBox.getText());
        fileWriter.newLine();
        //System.out.println(checkBox.getText() + "��(��) selectlist�� �߰��Ǿ����ϴ�."); // test
      }
      
      fileWriter.close();

    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public Vector<IngredientInfo> getSelectlist() {
    Vector<IngredientInfo> selectlist = new Vector<IngredientInfo>();
    try {
      BufferedReader fileReader = new BufferedReader(new FileReader("selectlist.txt"));
      String line = "start";
      for(int i = 0; line != null; i++){
        line = fileReader.readLine();
        if(line != null){
          selectlist.add(new IngredientInfo(line));
          //System.out.println(line); // �������� ����� ��� �׽�Ʈ
        }else {
          break;
        }
      }
      
      fileReader.close();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    return selectlist;
  }
  
  public void clearSelectlist() throws IOException{
    BufferedWriter fileWriter = new BufferedWriter(new FileWriter("selectlist.txt"));
    fileWriter.close();
  }
}
