package entity;

import java.util.*;

import javax.swing.*;

import valueObject.*;

public class Recipe {
  private Vector<RecipeInfo> recipelist;
  private Vector<RecipeInfo> likelist;
  private Vector<RecipeInfo> resultlist;
  private Vector<String> ingredientlist1;
  private Vector<String> ingredientlist2;
  private Vector<String> ingredientlist3;
  private Vector<String> ingredientlist4;

  SearchRecipe hashmap;

  public Recipe() {// ������ ������ �� ��Ḯ��Ʈ �߰�
    this.recipelist = new Vector<RecipeInfo>();
    this.resultlist = new Vector<RecipeInfo>();
    this.ingredientlist1 = new Vector<String>();
    this.ingredientlist2 = new Vector<String>();
    this.ingredientlist3 = new Vector<String>();
    this.ingredientlist4 = new Vector<String>();
    
    ingredientlist1.add("��");
    ingredientlist1.add("�������");
    ingredientlist1.add("�ҽ���");
    ingredientlist1.add("����");
    ingredientlist1.add("������");
    
    ingredientlist2.add("����");
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
    
    recipelist.add(new RecipeInfo("�δ��", 5, ingredientlist1));
    recipelist.add(new RecipeInfo("��������", 4, ingredientlist2));
    recipelist.add(new RecipeInfo("��������", 4, ingredientlist3));
    recipelist.add(new RecipeInfo("���߱�ġ", 3, ingredientlist4));
    
  }

  public void initialize(SearchRecipe hashmap){
//    this.hashmap = hashmap;
    hashmap.setRecipeNameInHashmap(1, "�δ��");
    hashmap.setRecipeNameInHashmap(2, "��������");
    hashmap.setRecipeNameInHashmap(3, "��������");
    hashmap.setRecipeNameInHashmap(4, "���߱�ġ");
  }
  
  // selectlist�� recipelist�� ��� ��ġ�� ���ϰ� ���ο� �迭�� ����� ����.
  public Vector<RecipeInfo> search(Vector<IngredientInfo> selectlist){
    for(int i = 0; i < recipelist.size(); i++){ // ������ �˻��� ī��Ʈ �ʱ�ȭ
      recipelist.get(i).setCount(0);
    }
    
    int k = 0;
    Vector<RecipeInfo> templist = new Vector<RecipeInfo>();
    System.out.println("�����Ͻ� ��� ���� : " + selectlist.size());
    System.out.println("��ü ������DB ������ : " + recipelist.size());
    for(int i = 0; i < selectlist.size(); i++){
      for(int j = 0; j < recipelist.size(); j++){
        for(k = 0; k < recipelist.get(j).getIngredient().size(); k++){
          //System.out.println(recipelist.get(j).getIngredient().size());          
          if(selectlist.get(i).getIngredientName().equals(recipelist.get(j).getIngredient().get(k))){
            if(recipelist.get(j).getCount() == 0){ // ��ġ�ϰ� ���� ���õ����� ������ �ش� recipe�� templist�� �߰�
              templist.add((recipelist.get(j))); 
              System.out.println("��ġ ������ �� : " + recipelist.get(j).getRecipeName() + ",  ��ġ ��� ��" + " : " + recipelist.get(j).getIngredient().get(k));
            }
            recipelist.get(j).countUp(); // �ش� recipe�� count++
          }
        }
        k = 0;
      }
    }
//    for(int a = 0; a < recipelist.size(); a++){ // test
//      System.out.println(a + "��° �������� count : " + recipelist.get(a).getCount());
//    }
    return resultlist = templist; // ���� resultlist�� ���� ������� templist�� ��ü
  }
  
  public int getLikelist(){ // ���ƿ䰡 1�̻��� list�� ���������� ����
    // test
	  recipelist.get(0).setLike(4); 
	  recipelist.get(1).setLike(5);
	  recipelist.get(2).setLike(1);
	  recipelist.get(3).setLike(7);
	  
	  System.out.println("recipelist size print : " + recipelist.size());
	  
	  this.likelist = new Vector <RecipeInfo>(); 
	  
	  for(int x = 0; x < recipelist.size(); x++){
		  if(recipelist.get(x).getLike()!=0){ // list�� ���ƿ䰡 0�� �ƴ� ����Ʈ�� �ִ´�
			  likelist.add(recipelist.get(x));
			  System.out.println("likelist "+ x + " print : " + likelist.size());
		  }
	  }
	  return likelist.size(); // ������ ����Ʈ�� ������Ʈ ���� ��ȯ
  }
  
  public Vector<RecipeInfo> sortLike(JTable table){
    getLikelist(); // �׽�Ʈ��
    quickSort(likelist, 0, likelist.size()-1 );
    return likelist;

 }
  /*
  void bubbleSort(Vector<RecipeInfo> likelist) {

	    int n = likelist.size();
	    Vector<RecipeInfo> temp = new Vector<RecipeInfo>();

	    for (int i = 0; i < n-1; i++) {
	        for (int j = 1; j < (n - i); j++) {

	            if (likelist.get(j-1).getLike() < likelist.get(j).getLike()) {
	            	temp.add(0, likelist.get(j-1));
	            	likelist.set(j-1, likelist.get(j));
	            	likelist.set(j, temp.get(0));
	            }

	        }
	    }
	}
  
  */
  
  
  int partition(Vector<RecipeInfo> likelist, int left, int right)
  {
        int i = left, j = right;
        int middle = left + (right - left) /2;
        Vector<RecipeInfo> temp = new Vector<RecipeInfo>();
        int pivot = likelist.get(middle).getLike();
       
        while (i <= j) {
              for (;likelist.get(i).getLike() > pivot;)
                    i++;
              for (;likelist.get(j).getLike() < pivot;)
                    j--;
              if (i <= j) {
            	  temp.add(0, likelist.get(i));
            	  likelist.set(i, likelist.get(j));
            	  likelist.set(j, temp.get(0));
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

  
  
 
 }


