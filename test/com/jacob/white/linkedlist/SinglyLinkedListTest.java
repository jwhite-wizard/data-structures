package com.jacob.white.linkedlist;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SinglyLinkedListTest {
	SinglyLinkedList<String> linkedList;

	@Before
	public void setUp() throws Exception {
		linkedList = new SinglyLinkedList<String>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConstructor() {
		SinglyLinkedList<String> linkedList = new SinglyLinkedList<String>();
		assertTrue(linkedList.isEmpty());
	}

	@Test
	public void testFirstInsert() {
		Node kinsleyNode = createAndInsertStringNode("Kinsley");
		assertEquals("First insert didn't work!", kinsleyNode.getData().toString(), "Kinsley");
	}
	
	@Test
	public void testMultipleInserts(){
		Node kinsleyNode = createAndInsertStringNode("Kinsley");
		Node titanNode = createAndInsertStringNode("Titan");
		assertEquals("Multiple inserts didn't work!", titanNode.getData().toString(), this.linkedList.getHead().getData().toString());
	}

	@Test
	public void testRemoveHead() {
		Node zeusNode = createAndInsertStringNode("Zeus");
		Node titanNode = createAndInsertStringNode("Titan");
		this.linkedList.removeHead();
		assertEquals("removeHead() didn't work!", this.linkedList.getHead().getData().toString(), zeusNode.getData().toString());
	}

	private Node createAndInsertStringNode(String string){
		Node<String> node = new Node<String>(string);
		this.linkedList.insert(node);
		return node;
	}
}
