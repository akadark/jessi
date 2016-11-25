package main;
import java.io.IOException;
import java.util.Scanner;

import entity.Recipe;
import view.IngredientView;
import view.LoginView;
import view.TypeView;
// ���α׷� �����Ŀ� ������ selectlist.txt ��������
//( �Է��Ҷ����� ���� ������ �ϱ����� txt ���� ����Ⱑ �ƴ� �̾�⸦ �߽��ϴ�.)
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		LoginView loginView = new LoginView();
		boolean result = loginView.login();
			
		if(result){
		  
			TypeView typeView = new TypeView();
			typeView.showTypeList();
			typeView.getTypeID(scanner);
			IngredientView ingredientView = new IngredientView();
			ingredientView.selectIngredient(scanner); // view->control->entity(valueObject���·�)
			/*
			HomeworkView homesubmitView = new HomeworkView();
			homesubmitView.getSubmitList(scanner);
			ScoreView scoreView = new ScoreView();
			scoreView.showScoreList();
			*/
		}
		
	}
}
