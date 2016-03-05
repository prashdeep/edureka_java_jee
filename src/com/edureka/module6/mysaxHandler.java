package com.edureka.module6;

//Reading xml file content using SAX Reader
//package xml1;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.*;
import org.xml.sax.helpers.*;
import java.io.*;

class mysaxHandler extends DefaultHandler {
	public void startDocument() {
		System.out.println("Document begins here");
	}

	public void startElement(String uri, String localName, String qName, Attributes attrs) {
		System.out.print("<" + qName + ">");
	}

	public void characters(char ch[], int start, int len) {
		System.out.print(new String(ch, start, len));
	}

	public void endElement(String uri, String localName, String qName) {
		System.out.println("</" + qName + ">");
	}

	public void endDocument() {
		System.out.println("Document ends here");
	}

	public static void main(String args[]) throws Exception {
		SAXParser p = SAXParserFactory.newInstance().newSAXParser();
		p.parse(new FileInputStream("c:/data files/students.xml"), new mysaxHandler());
	}
}