package com.exception.assignment5;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

import com.exception.assignment5.exe.BookingNotAllowedException;

public class RailwayTicketSystem {

	static final int totalNormalicket=6;
	static final int totalNoOfTatkalTicket=4;
	
	public static void normalTicketBooking(int NoOfNormalicket,LocalTime time,int age) throws Exception
	{ 
//			    Instant actualValue = Instant.parse("2018-06-25T10:00:00Z");
//			    Instant expectedValue = Instant.parse("2018-06-25T12:00:00Z");
			    
//		LocalTime start = LocalTime.parse( "10:00:00" );
//		LocalTime stop = LocalTime.parse( "12:00:00" );
		
		LocalTime start = LocalTime.of(10, 00, 00);
		LocalTime stop = LocalTime.of(12, 00, 00);
			    
			    if(NoOfNormalicket>totalNormalicket )
			    {
			    	throw new BookingNotAllowedException("Booking not allowed for mre than 6 people at a time");
			    }
			    else if(age<5)
			    {
			    	throw new Exception(age+""+"This age group people are not allowed ");
			    }
			    else if(!time.isAfter(start))
			    {
			    	throw new BookingNotAllowedException("Booking not allowed before 10 O'clock");
			    }
			    else if(!time.isBefore(stop) )
			    {
			    	throw new BookingNotAllowedException("Booking not allowed after 12 O'clock");
			    }
			    else 
			    {
			    	System.out.println(NoOfNormalicket+" tickets booked during"+""+time);
			    }	    
	}
	
	public static void tatkalTicketBooking(int NoOfTatkalTicket,LocalTime tatkalticketbookingtime,int age) throws Exception
	{
		LocalTime start = LocalTime.of(11, 00, 00);
		LocalTime stop = LocalTime.of(1, 00, 00);
		
		  if(NoOfTatkalTicket>totalNormalicket )
		    {
		    	throw new BookingNotAllowedException("Booking not allowed for mre than 6 people at a time");
		    }
		    else if(age<5)
		    {
		    	throw new Exception(age+""+"This age group people are not allowed ");
		    }
		    else if(!tatkalticketbookingtime.isAfter(start))
		    {
		    	throw new BookingNotAllowedException("Booking not allowed before 11 O'clock");
		    }
		    else if(!tatkalticketbookingtime.isBefore(stop) )
		    {
		    	throw new BookingNotAllowedException("Booking not allowed after 1 O'clock");
		    }
		    else
		    {
		    	System.out.println(NoOfTatkalTicket+" tickets booked during"+""+tatkalticketbookingtime);
		    }   
	}
	
}
