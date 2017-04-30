  package Medium;

import java.util.HashSet;
import java.util.Set;
class Node{
	public String word;
	public int distance;
	public Node(String word,int distance) {
		this.word=word;
		this.distance=distance;
	}
}
public class WordLadder {
	public static void main(String[] args) {
		
	}
	
	public int ladderLength(String start,String end,Set<String> dict){
		if (start.equals(end)) {
			return 1;
		}
		Set<Node> set =new HashSet<Node>();
		set.add(new Node(start, 1));
		while (!dict.isEmpty()) {
			Set<Node> newset =new HashSet<Node>();
			for (Node node : set) {
				for (int i = 0; i < node.word.length(); i++) {
					for (char ch = 'a'; ch < 'z'; ch++) {
						char[] arr=node.word.toCharArray();
						arr[i]=ch;
						String newWord=new String(arr);
						if (end.equals(newset)) {
							return node.distance+1;
						}
						if (dict.contains(newset)) {
							dict.remove(newWord);
							newset.add(new Node(newWord, node.distance+1));
						}
						
					}
				}
			}
			
			if (newset.isEmpty()) {
				return 0;
			}
			set=newset;
		}

		return 0;
		
	}
}
