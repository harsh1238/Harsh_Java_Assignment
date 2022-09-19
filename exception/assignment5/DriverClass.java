package com.exception.assignment5;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

import com.exception.assignment5.exe.BookingNotAllowedException;

public class DriverClass 
{
	public static void main(String[] args) throws Exception {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of Tatkal tickets");
		int NoOfTatkalTicket=sc.nextInt();
		
//		System.out.println("Enter number of normal tickets");
//		int NoOfNormalicket=sc.nextInt();
		
		
//		int ticket=1;
//		switch(ticket)
//		{
//		case 1:
//			System.out.println("Enter number of Tatkal tickets");
//			int NoOfTatkalTicket=sc.nextInt();
//			LocalTime tatkalticketbookingtime = LocalTime.of(10, 30, 00);
//			RailwayTicketSystem.tatkalTicketBooking(NoOfTatkalTicket, tatkalticketbookingtime, 9);
//			break;
//		case 2:
//			System.out.println("Enter number of normal tickets");
//			int NoOfNormalicket=sc.nextInt();
//			LocalTime normalticketbookingtime = LocalTime.of(12, 00, 00);
//			RailwayTicketSystem.normalTicketBooking(NoOfNormalicket,normalticketbookingtime,8);
//			break;
//		 default:
//			System.out.println("don't want to book ticket");
//		}
		
//	LocalTime normalticketbookingtime = LocalTime.of(10, 30, 22);
//		//LocalTime time = LocalTime.parse( "1:00:00");
//		RailwayTicketSystem.normalTicketBooking(NoOfNormalicket,normalticketbookingtime,8);

		LocalTime tatkalticketbookingtime = LocalTime.of(11, 30, 22);
		RailwayTicketSystem.tatkalTicketBooking(NoOfTatkalTicket, tatkalticketbookingtime, 9);
	}
}
