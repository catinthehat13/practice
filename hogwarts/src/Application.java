package hogwarts;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		WizardBFS school = new WizardBFS();
		
		List<List<Integer>> wizards = new ArrayList();
		int[] wiz0 = {1,2,3};
		int[] wiz1 = {2,3};
		int[] wiz2 = {7,8};
		int[] wiz3 = {5};
		int[] wiz4 = {6};
		int[] wiz5 = {8,7};
		int[] wiz6 = {9,4};
		int[] wiz7 = {4,6};
		int[] wiz8 = {1};
		int[] wiz9 = {1,4};
		
		wizards.add(school.getWizardList(wiz0));
		wizards.add(school.getWizardList(wiz1));
		wizards.add(school.getWizardList(wiz2));
		wizards.add(school.getWizardList(wiz3));
		wizards.add(school.getWizardList(wiz4));
		wizards.add(school.getWizardList(wiz5));
		wizards.add(school.getWizardList(wiz6));
		wizards.add(school.getWizardList(wiz7));
		wizards.add(school.getWizardList(wiz8));
		wizards.add(school.getWizardList(wiz9));
		
		int cost = school.getMinimumCost(wizards);
		System.out.println("Minimum cost is: " + cost);
	}
}
