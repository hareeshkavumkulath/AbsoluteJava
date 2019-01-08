package com.hareesh.absolutejava.pct;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DeadLockDetection {
	
	public static ArrayList<Node> nodes = new ArrayList<Node>();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numLines = in.nextInt();
		String[] lines = new String[numLines]; 
		in.nextLine();
		for(int i=0;i<numLines;i++) {
			lines[i] = in.nextLine();
		}
		processNodes(lines);
		processConnections(lines);
		boolean isCycle = false;
		for(int i=0;i<nodes.size();i++) {
			if(dfs(nodes.get(i))) {
				isCycle = true;
			}
		}
		if(isCycle)
			System.out.println("YES");
		else
			System.out.println("NO");
		
		/*for(int i=0;i<nodes.size();i++) {
			System.out.println(nodes.get(i).getNodeId());
		}*/
		
		/*for(int i=0;i<nodes.size();i++) {
			System.out.print(nodes.get(i).getNodeId() + " ");
			for(int j=0;j<nodes.get(i).getConnections().size();j++) {
				System.out.print(nodes.get(i).getConnections().get(j).getNodeId() + " ");
			}
			System.out.println();
		}*/
	}

	private static boolean dfs(Node node) {
		//System.out.println(node.getNodeId() + " " + node.getConnections().size());
		boolean isCycle = false;
		ArrayList<Node> checkedNodes = new ArrayList<Node>();
		ArrayList<Node> visitedNodes = new ArrayList<Node>();
		checkedNodes.add(node);
		visitedNodes.addAll(node.getConnections());
		int i = 0;
		if(node.getConnections().size() > 0) {
			while(!checkedNodes.isEmpty() && !isCycle && visitedNodes.get(i).getConnections().size() > 0) {
				checkedNodes.remove(0);
				//System.out.println(visitedNodes.get(i).getNodeId());
				checkedNodes.add(visitedNodes.get(i));
				for(int j=0;j<checkedNodes.get(0).getConnections().size();j++) {
					if(!visitedNodes.contains(checkedNodes.get(0).getConnections().get(j))) {
						visitedNodes.add(checkedNodes.get(0).getConnections().get(j));
					}else {
						isCycle = true;
						break;
					}
					if(checkedNodes.get(0).getConnections().get(j) == node) {
						isCycle = true;
						break;
					}
				}
				i++;
			}
		}
		return isCycle;
	}

	private static void processConnections(String[] lines) {
		for(int i=0;i<lines.length;i++) {
			String[] pids = lines[i].split(" ");
			int pid1 = Integer.parseInt(pids[0]);
			int pid2 = Integer.parseInt(pids[1]);
			int pid3 = Integer.parseInt(pids[2]);
			Node node1 = getNodes(pid1);
			if(pid2 != -1) {
				Node node2 = getNodes(pid2);
				node2.getConnections().add(node1);
			}
			if(pid3 != -1) {
				Node node3 = getNodes(pid3);
				node1.getConnections().add(node3);
			}
			
		}
	}

	private static Node getNodes(int pid) {
		Node node = null;
		for(int i=0;i<nodes.size();i++) {
			if(nodes.get(i).getNodeId() == pid) {
				node = nodes.get(i);
			}
		}
		return node;
	}

	private static void processNodes(String[] lines) {
		Set<Integer> dots = new HashSet<Integer>();  
		for(int i=0;i<lines.length;i++) {
			String[] pids = lines[i].split(" ");
			for(int j=0;j<3;j++) {
				int pid = Integer.parseInt(pids[j]);
				if(!dots.contains(pid) && pid != -1) {
					dots.add(pid);
					nodes.add(new Node(pid));
				}
			}
		}		
	}

}
