package hogwarts;

import java.util.*;

public class WizardBFS {
	
	// Destination wizard number.
	final int START_WIZARD = 0;
	final int END_WIZARD = 9;
	
	// Given a list of wizards and who they know, compute the minimum cost it takes to get to the end wizard.
	public int getMinimumCost(List<List<Integer>> wizards) {
		List<List<Integer>> paths = this.getPath(START_WIZARD, wizards, START_WIZARD);
		int minCost = Integer.MAX_VALUE;
		
		for (int i = 0; i < paths.size(); i++) {
			List<Integer> currPath = paths.get(i);
			Integer lastNum = currPath.get(currPath.size()-1);
			if (lastNum != null && lastNum.intValue() == END_WIZARD) {
				// Get the cost.
				int cost = this.calcCost(currPath);
				
				if (cost < minCost) {
					minCost = cost;
				}
			}
		}
		return minCost;
	}
	
	private List<List<Integer>> getPath(int currWizard, List<List<Integer>> wizards, int pathLength) {
		// Start at wizard 0
		if (currWizard == END_WIZARD) {
			List<Integer> last = new ArrayList<Integer>();
			last.add(END_WIZARD);
			List<List<Integer>> result = new ArrayList();
			result.add(0, new ArrayList());
			result.get(0).addAll(last);
			return result;
		}
		else if(pathLength == END_WIZARD) {
			return new ArrayList();
		}
		else {
			List<Integer> connections = wizards.get(currWizard);
			int currPathLength = pathLength + 1;
			List<List<Integer>> results = new ArrayList();
			
			for(int i = 0; i < connections.size(); i++) {
				List<List<Integer>> paths = this.getPath(connections.get(i).intValue(), wizards, currPathLength);
				
				for(int p = 0; p < paths.size(); p++) {
					paths.get(p).add(0, currWizard); // add current wizard to the beginning of the list we're visiting. 
					results.add(p, paths.get(p));
				}
			}
				
			return results;	
		}
	}
	
	private int calcCost(List<Integer> path) {
		int cost = 0;
		
		if (path.size() - 1 <= 0) {
			return Integer.MAX_VALUE;
		}
		
		for(int i = 0; i < path.size() - 1; i++) {
			cost += this.getCost(path.get(i), path.get(i+1));
		}
		return cost;
	}
	
	private int getCost(int level1, int level2) {
		int diff = level2 - level1;
		if (diff < 0) { 
			diff = diff * (-1); 
		}
		
		int cost = diff * diff;
		return cost; // Assuming that the values cannot be negative.
	}
	
	public List<Integer> getWizardList(int[] wiz) {
		List<Integer> wizards = new ArrayList<Integer>();
		
		for(int i = 0; i < wiz.length; i++) {
			wizards.add(wiz[i]);
		}
		
		return wizards;
	}
	
}
