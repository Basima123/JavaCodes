package com.learning;

public class LowAttendanceException extends RuntimeException {

	  public void allowForExams(int attendance)
	    {
	      
	      if(attendance>=75)
	      {
	        System.out.println("Permit Students");
	      }
	      else
	      {
	        try {
          LowAttendanceException lae = new LowAttendanceException();
	          throw lae; //anonymous object
	                }
	                catch(LowAttendanceException ll)
	                {
	                  System.out.println("Check Attendance");
	                }
	      }
	    }
	}