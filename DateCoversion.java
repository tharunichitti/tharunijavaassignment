package javaAssignment;
//Java Program to Convert String to Date

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCoversion {
	
	public static void main(String[] args) throws ParseException {
		String str="05/09/1999";
		Date date= new SimpleDateFormat("dd/MM/yyyy").parse(str);
		
		System.out.println("Date: "+date);


	}
}
