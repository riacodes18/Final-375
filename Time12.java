package com.uregina.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.uregina.exceptions.*;

/**
 * 12-hour time
 *
 */
public class Time12 
{
	private int hours;		// 1:12
	private int minutes;	// 0:59
	private AmPm am_pm;		// am or pm
	/** 
	 * constructor to initial Time12 object
	 * @param hours 		hours of 12-hour time format (1:12)
	 * @param minutes		minutes of 12-hour time format (0:59)
	 * @param am_pm			am or pm
	*/
    public Time12 (int hours, int minutes, AmPm am_pm) throws InvalidTimeException
    {
		if(hours<1||hours>12) throw new InvalidTimeException();
		if(minutes<0||minutes>=60) throw new InvalidTimeException();
        this.hours=hours;
		this.minutes=minutes;
		this.am_pm=am_pm;
    }
	/**
	 * Convert time 12-hour to 24-hour
	*/
	public String toTime24() 
	{
		return Time24.toTime24(this.hours, this.minutes, this.am_pm);
	}
	/**
	* returns the hours of 12-hour time format (1:12)
	*/
	public static int getHours(){
		return this.hours;
	}
	/**
	* returns the minutes of 12-hour time format (0:59)
	*/
	public int getMinutes(){
		return this.minutes;
	}
	/**
	* returns the am/pm of 12-hour time format
	*/
	public AmPm getAM_or_PM(){
		return this.am_pm;
	}
	/**
	 * Convert Time12 object to string
	 * @param  None
	 * @return a string in the fromat HH:MM am/pm
	*/
	public String toString()
	{
		return String.format("%2d:%2d",this.hours,this.minutes)+(this.am_pm==AmPm.am? " am":" pm");
	}
	/**
	 * calculates the minutes of subracting two valid Time12 objects 
	 * 		assuming that both times happened in the same day.
	 * @param t1 	12-hour time object
	 * @param t1 	12-hour time object
	 * @return 		minutes equivalent of calculating (t1-t2)
	 * 				which can be positive, zero or negative integer
	 * usefeul functions that you may use
	 * 		(class: Time12 , method: toTime24)
	 * 		(class: Time24 , method: getHours)
	 * 		(class: Time24 , method: getMinutes)
	*/
	public static int subtract(Time12 t1, Time12 t2) throws ParseException
	{
		int difference=0;
		//Todo: add your code here
		
		// int twentyfourhourTimeH = getHours() + 12;
		// int Time12 = twentyfourhourTimeH;
		String d1 = "02/21/2020 10:00";
		String d2 = "02/23/2020 18:00";
		SimpleDateFormat sfd = new SimpleDateFormat(" mm/dd/yyyy hh:mm");
		Time24 t1 = sdf.parse(d1);
		Time24 t2 = sdf.parse(d2);
        difference = t1.getHours() - t2.getHours();

		System.out.println(difference/(1000.0*60*60));
		// end of your code
		return difference;
	}
	/**
	 * checks if a Time12 is before another one
	 * @param 	t1 a Time12 object
	 * @param 	t2 a Time12 object
	 * @return	true if t1<t2, false otherwise
	*/
	public static boolean lessThan(Time12 t1,Time12 t2)
	{
		return Time12.subtract(t1,t2)<0;
	}
	public boolean difference(String string) {
		return false;
	}
}
