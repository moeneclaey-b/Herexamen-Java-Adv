package edu.ap.spring.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Entity
public class Quote {
	
	   @Id
	   @GeneratedValue
	   private Long id;

	   public String loadFile (){
	       String text = "";
	       try {
               FileReader fileReader = new FileReader
                       ("C:\\Info-Project\\Herexamen-Java-Adv\\JAVA Adv Herexamen\\SPRING-EXAMEN-JAVA2-VRAAG1\\src\\files\\Oscar_Wilde.txt");
               BufferedReader reader = new BufferedReader(fileReader);
               String currentLine = "";
               while ((currentLine = reader.readLine()) != null){
                   text += currentLine;
                   text += "\n";
                   System.out.println(currentLine);
               }
           } catch (IOException e) {
               e.printStackTrace();
           }
           return text;
       }
}
