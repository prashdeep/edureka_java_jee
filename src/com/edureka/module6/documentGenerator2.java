package com.edureka.module6;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;

public class documentGenerator2 {
	public static void main(String args[]) throws Exception {
		DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
		DocumentBuilder b = f.newDocumentBuilder();
		Document doc = b.newDocument();

		Element rootele = doc.createElement("students");
		Element studentele = doc.createElement("student");
		Element nameele = doc.createElement("name");
		Element emailele = doc.createElement("email");
		Element mobileele = doc.createElement("mobile");
		Element addrele = doc.createElement("address");

		Text t1 = doc.createTextNode("Amit");
		Text t2 = doc.createTextNode("Amit_sharma@gmail.com");
		Text t3 = doc.createTextNode("5678");
		Text t4 = doc.createTextNode("UK");// Document object module parser

		nameele.appendChild(t1);
		emailele.appendChild(t2);
		mobileele.appendChild(t3);
		addrele.appendChild(t4);

		studentele.appendChild(nameele);
		studentele.appendChild(emailele);
		studentele.appendChild(mobileele);
		studentele.appendChild(addrele);

		rootele.appendChild(studentele);
		doc.appendChild(rootele);
		Transformer t = TransformerFactory.newInstance().newTransformer();
		t.transform(new DOMSource(doc), new StreamResult(new FileOutputStream("c:/Data Files/students.xml")));
		System.out.println("XML file generated..");

	}
}
