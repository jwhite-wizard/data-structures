package com.jacob.white.linkedlist;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NodeTest {

	@Test
	public void testToString() {
		Node<String> rileyNode = new Node<String>("Riley");
		Node<String> kinsleyNode = new Node<String>("Kinsley", rileyNode);
		assertEquals("node toString didn't work!", "Data: Kinsley\n-> Data: Riley\n-> ", kinsleyNode.toString());	
	}
}
