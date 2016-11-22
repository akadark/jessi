package entity;

import java.io.*;
import java.util.*;

import valueObject.*;

public class Recipe {
  private Vector<RecipeInfo> recipelist;
  private Vector<String> ingredientlist1;
  private Vector<String> ingredientlist2;
  private Vector<String> ingredientlist3;
  private Vector<String> ingredientlist4;
  
  public Recipe(){ // ������ ������ �� ��Ḯ��Ʈ �߰�
    this.recipelist = new Vector<RecipeInfo>();
    this.ingredientlist1 = new Vector<String>();
    this.ingredientlist2 = new Vector<String>();
    this.ingredientlist3 = new Vector<String>();
    this.ingredientlist4 = new Vector<String>();
    
    ingredientlist1.add("��");
    ingredientlist1.add("�������");
    ingredientlist1.add("�ҽ���");
    ingredientlist1.add("����");
    ingredientlist1.add("������");
    
    ingredientlist2.add("�߰��");
    ingredientlist2.add("����");
    ingredientlist2.add("����");
    ingredientlist2.add("����");
    
    ingredientlist3.add("����");
    ingredientlist3.add("�����");
    ingredientlist3.add("����");
    ingredientlist3.add("���");
    
    ingredientlist4.add("����");
    ingredientlist4.add("���߰���");
    ingredientlist4.add("�ұ�");
    
    recipelist.add(new RecipeInfo("�δ��", ingredientlist1));
    recipelist.add(new RecipeInfo("��������", ingredientlist2));
    recipelist.add(new RecipeInfo("��������", ingredientlist3));
    recipelist.add(new RecipeInfo("���߱�ġ", ingredientlist4));
    
  }
  
  // selectlist�� recipelist�� ��� ��ġ �� �˻�
  public void search(Vector<IngredientInfo> selectlist){
    int k = 0;
    for(int i = 0; i < selectlist.size(); i++){
      for(int j = 0; j < recipelist.size(); j++){
        for(k = 0; k < recipelist.get(j).getIngredient().size(); k++){
          //System.out.println(recipelist.get(j).getIngredient().size());
          System.out.println(selectlist.get(i).getIngredientName() + " ==? " + recipelist.get(j).getIngredient().get(k));
          if(selectlist.get(i).getIngredientName().equals(recipelist.get(j).getIngredient().get(k))){
            System.out.println("ok");
            recipelist.get(j).countUp(); // ��ġ�ϸ� �ش� recipe�� count++
          }
        }
        k = 0;
      }
    }
    for(int a = 0; a < recipelist.size(); a++)
    System.out.println(a + "��° �������� count : " + recipelist.get(a).getCount());
  }
  //���ƿ� ����
  public void likeup(){
	  Vector <Integer> like = new Vector <Integer>();
	  for(int x=0; x<recipelist.size();x++){
		  like.add(recipelist.get(x).getLike()); // like ����Ʈ�� �� ������ ���ƿ� ����
	  }
	  Collections.sort(like, new LikeComparator());
	  for(int y=0;y<like.size();y++){
		  System.out.print(); 
	  } 
  }
  class LikeComparator implements Comparator<Integer>{
	  public int compare(Integer first, Integer second){ //comparator �޼ҵ带 ����
	  return first > second ? -1 : (first == second ? 0 : 1); 
	  }
}
