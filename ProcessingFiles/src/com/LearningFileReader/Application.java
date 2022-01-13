package com.LearningFileReader;

import java.io.*;


public class Application {
	public static void main(String args[]) {
		
		File file =new File("myFile.txt");
		
		try (FileReader fileReader=new FileReader(file);
				BufferedReader buffer =new BufferedReader(fileReader);){
		   
			String line=buffer.readLine();
			
			while(line !=null) {
				System.out.println(line);
				line=buffer.readLine();
			}
		} catch (FileNotFoundException e) {
			
			System.out.println("File not found");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Problem reading the file"+file.getName());
		}
		
				
			} 
		    
			
		
	}


