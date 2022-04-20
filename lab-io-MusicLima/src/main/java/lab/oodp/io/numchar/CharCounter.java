package lab.oodp.io.numchar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CharCounter {
	
	int numE = 0;
    int total = 0;
    
    public int getNumE() {
		return numE;
	}

	public int getTotal() {
		return total;
	}

	public void start() {

        printNumEsWithFileReader();

    }

    private void printNumEsWithFileReader() {
    	
    	//TODO: read file and count Es and total number of character, uncomment sysout below
        int num = 0;
    	try(FileReader reader = new FileReader("input1.txt")){
        	while((num = reader.read()) != -1) {
        		if(num == 'E' || num == 'e') {
        			numE++;
        		}
        		total++;
        		System.out.println(num);
        	}
        	
    	}

    	catch (IOException e) {
    		System.out.println("IO problem" + e);
    		}
    	
        System.out.println("Number of e/E's: " + numE + " out of " + total);
    }

    public static void main(String[] args) {
        new CharCounter().start();
    }

}