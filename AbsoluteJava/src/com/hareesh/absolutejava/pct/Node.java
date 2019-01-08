package com.hareesh.absolutejava.pct;

import java.util.ArrayList;

public class Node {
	
	public int nodeId;
	public ArrayList<Node> connections = new ArrayList<Node>();
	
	public Node(int nodeId) {
		this.nodeId = nodeId;
	}

	/**
	 * @return the nodeId
	 */
	public int getNodeId() {
		return nodeId;
	}

	/**
	 * @param nodeId the nodeId to set
	 */
	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}

	/**
	 * @return the connections
	 */
	public ArrayList<Node> getConnections() {
		return connections;
	}

	/**
	 * @param connections the connections to set
	 */
	public void setConnections(ArrayList<Node> connections) {
		this.connections = connections;
	}

}
