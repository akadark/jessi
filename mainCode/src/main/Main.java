package main;
import java.io.*;
import java.util.*;

import view.*;
// ���α׷� �����Ŀ� ������ selectlist.txt ��������
//( �Է��Ҷ����� ���� ������ �ϱ����� txt ���� ����Ⱑ �ƴ� �̾�⸦ �߽��ϴ�.)
public class Main {
	public static void main(String[] args) throws IOException {
	  
		  Scanner scanner = new Scanner(System.in);
//		LoginView loginView = new LoginView();
//		boolean result = loginView.login();
		  
		  InitPanel initPanel = new InitPanel();
			TypeView typeView = new TypeView();
			typeView.showTypeList();
			typeView.getTypeID(scanner);
			IngredientView ingredientView = new IngredientView();
			ingredientView.clearSelectlist(); // ���� selectlist.txt �ʱ�ȭ
			ingredientView.selectIngredient(scanner); // view->control->entity(valueObject���·�)
			RecipeView recipeView = new RecipeView();
			recipeView.search();
	}
}
