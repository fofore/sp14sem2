import java.awt.List;
import java.util.ArrayList;


public class BusinessTasks {

	public static void main(String[] args) {
		String [] in0 = {"a","b","c","d"};
		int in1 = 2;
		System.out.println(getTask(in0, in1));
		
		String [] in11 = {"a","b","c","d","e"};
		int in12 = 3;
		System.out.println(getTask(in11, in12));

	}

	public static String getTask(String [] list, int n) {
		ArrayList<String> taskList = new ArrayList<String>();
		for (String string : list) {
			taskList.add(string);
		}
		System.out.println(taskList);
		//index start from 0
		int index = 0;
		while (taskList.size() > 1) {
			//the one need to be removed, only need to offset n-1
			index = (index + n - 1) % taskList.size();
			//remove the task
			taskList.remove(index);
			//if is removing the last one, make the index 0  taskindex == tasklist.length
			if (index == taskList.size()) {
				index = 0;
			}
		}
		
		return taskList.get(0);
	}
	
}

