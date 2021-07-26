/**
 * 
 */
package com.ss.jb.dayfive;
import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.time.LocalDate;
import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalQuery;
import java.lang.NumberFormatException;

/**
 * @author Li
 *
 */

//**************Answers for the Questions about Date-Time APIs in Java 8***************************

//--1 Which class would you use to store your birthday in years, months, days, seconds, and nanoseconds?
// Answer: I would use LocalDateTime class, if it needs time zone, then I would use ZoneDateTime class

//--2 Given a random date, how would you find the date of the previous Thursday?
// Answer: I can use the method previous of TemporalAdjuster
// LocalDate date=....;
//System.out.printf("The previous Thursday is:%s%n",date.with(TemporalAdjuster.previous(DayofWeek.THURSDAY))

//--3 What is the difference between a ZoneId and a ZoneOffset?
//ZoneOffset tracks the absolute offset from UTC. ZoneId uses the ZoneRules to determine how an offset varies for a particular time of year and region

//--4 How would you convert an Instant to a ZonedDateTime? How would you convert a ZonedDateTime to an Instant?
//Use ZoneDateTime.ofInstant to convert an Instant to ZonedDateTime, or I can use Instan.atZone method. 
//ZonedDateTime zdt=ZonedDateTime.ofInstant(Instant.now()),ZoneId.systemDefault());
//ZonedDateTime zdt=Instant.now().atZone(ZoneId.systemDefault());
//Use toInstant method in the ChronoZeonedDateTime interface,implemented by the ZonedDateTime class, to convert from a ZonedDateTime to an Instant.
//Instant inst=ZonedDateTime.now().toInstant();

public class AssignmentsFourDFive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AssignmentsFourDFive obj1=new AssignmentsFourDFive();
		obj1.monthsOfYear(new String[] {"2021"});
		obj1.mondaysofMonthCurrentYear(new String[] {"January"});
		obj1.dateonFridayThirteen(new String[] {"November","13","2020"});

    }
	
//--5 Write an example that, for a given year, reports the length of each month within that year.
	public void monthsOfYear(String[] a)
	{
		int year = 0;

        if (a.length <= 0) {
            System.out.printf("Usage: MonthsInYear <year>%n");
            throw new IllegalArgumentException();
        }

        try {
            year = Integer.parseInt(a[0]);
        } catch (NumberFormatException nexc) {
            System.out.printf("%s is not a properly formatted number.%n",
                a[0]);
            throw nexc;     // Rethrow the exception.
        }

        try {
            //Year test = Year.of(year);
        } catch (DateTimeException exc) {
            System.out.printf("%d is not a valid year.%n", year);
            throw exc;     // Rethrow the exception.
        }

        System.out.printf("For the year %d:%n", year);
        for (Month month : Month.values()) {
            YearMonth ym = YearMonth.of(year, month);
            System.out.printf("%s: %d days%n", month, ym.lengthOfMonth());
        }
	}

//-- 6 Write an example that, for a given month of the current year, lists all of the Mondays in that month.
	public void mondaysofMonthCurrentYear(String[] a)
	{
		Month month = null;

        if (a.length <= 0) {
            System.out.printf("Usage: ListMondays <month>%n");
            throw new IllegalArgumentException();
        }

        try {
            month = Month.valueOf(a[0].toUpperCase());
        } catch (IllegalArgumentException exc) {
            System.out.printf("%s is not a valid month.%n", a[0]);
            throw exc;      // Rethrow the exception.
        }
         Year y=Year.now();
        System.out.printf("For the month of %s of current year %s,the below dates are the Mondays:%n", month,y);
        LocalDate date = Year.now().atMonth(month).atDay(1).
              with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        Month mi = date.getMonth();
        while (mi == month) {
            System.out.printf("%s%n", date);
            date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
            mi = date.getMonth();
        }
	}

//--7 Write an example that tests whether a given date occurs on Friday the 13th.
	public class FridayThirteenQuery implements TemporalQuery<Boolean> {
		@Override
		public Boolean queryFrom(TemporalAccessor date) {
			// TODO Auto-generated method stub
	        return ((date.get(ChronoField.DAY_OF_MONTH) == 13) &&
	                (date.get(ChronoField.DAY_OF_WEEK) == 5));
		}
	}
	
	public void dateonFridayThirteen(String[] a)
	{
		Month month = null;
        LocalDate date = null;
        int year =0;

        if (a.length < 3) {
            System.out.printf("Usage: Superstitious <month> <day>%n");
            throw new IllegalArgumentException();
        }

        try {
            month = Month.valueOf(a[0].toUpperCase());
        } catch (IllegalArgumentException exc) {
            System.out.printf("%s is not a valid month.%n", a[0]);
            throw exc;     // Rethrow the exception.
        }
        
        try {
            year = Integer.parseInt(a[2]);
        } catch (IllegalArgumentException exc) {
            System.out.printf("%s is not a valid year.%n", a[2]);
            throw exc;     // Rethrow the exception.
        }

        int day = Integer.parseInt(a[1]);

        try {
        	Year y=Year.of(year);
            date = y.atMonth(month).atDay(day);
        } catch (DateTimeException exc) {
            System.out.printf("%s %s is not a valid date.%n", month, day);
            throw exc;     // Rethrow the exception.
        }
        
        if (date.query(new FridayThirteenQuery()))
        {
        	System.out.println("Yes this date is on Friday the 13th");
        }
        else
        	System.out.println("No this date is NOT on Friday the 13th");
	}

}
