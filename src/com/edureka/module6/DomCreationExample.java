package com.edureka.module6;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class DomCreationExample {

	public static void main(String[] args) throws ParserConfigurationException, TransformerException {
		DocumentBuilderFactory domBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder domBuilder = domBuilderFactory.newDocumentBuilder();
		Document document = domBuilder.newDocument();

		Element rootNode = document.createElement("employees");

		Element employee = document.createElement("employee");
		Element name = document.createElement("name");
		name.setTextContent("Pradeep");
		employee.appendChild(name);
		rootNode.appendChild(employee);
		document.appendChild(rootNode);

		// write the content into xml file
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(document);
		// Output to console for testing
		
		StreamResult consoleResult = new StreamResult(System.out);
		transformer.transform(source, new StreamResult(new File("F:\\output.xml")));

	}

}
