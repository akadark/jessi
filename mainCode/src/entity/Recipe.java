package entity;

import java.io.*;

import java.util.*;

import valueObject.*;

public class Recipe {
  private Vector<RecipeInfo> recipelist;
  private Vector<RecipeInfo> likelist;
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
  
  public int getLikelist(){
	  recipelist.get(0).setLike(4);
	  recipelist.get(1).setLike(5);
	  recipelist.get(2).setLike(1);
	  
	  System.out.println("recipelist size print : " + recipelist.size());
	  
	  this.likelist = new Vector <RecipeInfo>(); // ���ƿ䰡 1�̻��� list�� ���������� ����
	  
	  for(int x=0; x<recipelist.size();x++){ 
		  if(recipelist.get(x).getLike()!=0){ // list�� ���ƿ䰡 0�� �ƴ� ����Ʈ�� �ִ´�
			  likelist.add(recipelist.get(x));
			  System.out.println("likelist "+x + " print : " + likelist.size());
		  }
	  }
	  return likelist.size();
  }
  
  public void sortLike(){
	  for(int x=0; x<likelist.size();x++){
	  System.out.println("before print : " + likelist.get(x).getLike());
	  }
	  //quickSort(likelist, 0, likelist.size() );
	  bubbleSort(likelist);
	  for(int x=0; x<likelist.size();x++){
	  System.out.println("after print : " + likelist.get(x).getLike());
	  }
	  
  }
  
  void bubbleSort(Vector<RecipeInfo> likelist) {

	    int n = likelist.size();
	    Vector<RecipeInfo> temp = new Vector<RecipeInfo>();

	    for (int i = 0; i < n; i++) {
	        for (int j = 1; j < (n - i); j++) {

	            if (likelist.get(j-1).getLike() < likelist.get(j).getLike()) {
	            	temp.add(0, likelist.get(j-1));
	            	  likelist.add(j-1, likelist.get(j));
	            	  likelist.add(j, temp.get(0));
	            }

	        }
	    }
	    System.out.println("?");
	}
  
  
  
  /*
  int partition(Vector<RecipeInfo> likelist, int left, int right)
  {
        int i = left, j = right;
        int middle = left + (right - left) /2;
        Vector<RecipeInfo> temp = new Vector<RecipeInfo>();
        int pivot = likelist.get(middle).getLike();
       
        while (i <= j) {
              while (likelist.get(left).getLike() < pivot)
                    i++;
              while (likelist.get(right).getLike() > pivot)
                    j--;
              if (i <= j) {
            	  temp.add(0, likelist.get(left));
            	  likelist.add(left, likelist.get(right));
            	  likelist.add(right, temp.get(0));
                    i++;
                    j--;
              }
        };
       
        return i;
  }
   
  void quickSort(Vector<RecipeInfo> likelist, int left, int right) {
        int index = partition(likelist, left, right);
        if (left < index - 1)
              quickSort(likelist, left, index - 1);
        if (index < right)
              quickSort(likelist, index, right);
  }
  
  */
  
 
 }


