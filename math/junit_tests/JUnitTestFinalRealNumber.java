package math.junit_tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import math.RealNumber;
import math.number_representations.real_number.sequence_of_digits.FinalInternalRepresentationForRealNumberAsASequenceOfDigits;
import math.numbers.real_number.AbstractNumberReal;
import math.numbers.real_number.FinalRealNumber;

public class JUnitTestFinalRealNumber
{
	int default_number_of_repetition = 10;

	// 78 / 375 = 0.208 == 0.20800 00-27
	private int randomIntNotZero()
	{
		int result = 0;
		
		while(result==0)
		{
			result = (int)
			(
				Math.pow
				(
					10.0,
						0.0
					+
						(3.0-(0.0))
						*
						Math.random()
				)
				*
				(
						-1.0
					+
						(1.0-(-1.0))
						*
						Math.random()
				)
			);

		};
	
		return result;
	}
	
	private double randomDoubleNotZero()
	{
		double result=0.0;
		
		while(result==0.0)
		{
			result = (double)
			(
				Math.pow
				(
					10.0,
						-10.0
					+
						(10.0-(-10.0))
						*
						Math.random()
				)
				*
				(
						-1.0
					+
						(1.0-(-1.0))
						*
						Math.random()
				)
			);
		}
		
		return result;
	}
	
	
	@Test
	public void
	test_plus_int_nonzero_nonzero_ForRealNumberAsASequenceOfDigits()
	{
		for ( int i = 1 ; i <= default_number_of_repetition ; i++ )
		{
			int a = randomIntNotZero();
			int b = randomIntNotZero();
			
	        RealNumber x1 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a)
	        );
	        RealNumber x2 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(b)
	        );
	        RealNumber y = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a+b)
	        );
	        
	        RealNumber x3;
	        
	        x3 = x1.plus(x2);
	        
	        System.out.println(x1 + " + " + x2 + " = " + x3);
	        System.out.println("");

			assertTrue
			(
				x1 + " + " + x2 + " = " + x3 + " == " + y,
				x3.isEqualTo(y)
			);
		}
	}
	

	@Test
	public void
	test_plus_int_nonzero_zero_ForRealNumberAsASequenceOfDigits()
	{
		for ( int i = 1 ; i <= default_number_of_repetition ; i++ )
		{
			int a = randomIntNotZero();
			int b = 0;
			
	        RealNumber x1 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a)
	        );
	        RealNumber x2 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(b)
	        );
	        RealNumber y = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a+b)
	        );
	        
	        RealNumber x3;
	        
	        x3 = x1.plus(x2);
	        
	        System.out.println(x1 + " + " + x2 + " = " + x3);
	        System.out.println("");

			assertTrue
			(
				x1 + " + " + x2 + " = " + x3 + " == " + y,
				x3.isEqualTo(y)
			);
		}
	}
	

	@Test
	public void
	test_plus_int_zero_nonzero_ForRealNumberAsASequenceOfDigits()
	{
		
		for ( int i = 1 ; i <= default_number_of_repetition ; i++ )
		{
			int a = 0;
			int b = randomIntNotZero();
			
	        RealNumber x1 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a)
	        );
	        RealNumber x2 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(b)
	        );
	        RealNumber y = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a+b)
	        );
	        
	        RealNumber x3;
	        
	        x3 = x1.plus(x2);
	        
	        System.out.println(x1 + " + " + x2 + " = " + x3);
	        System.out.println("");

			assertTrue
			(
				x1 + " + " + x2 + " = " + x3 + " == " + y,
				x3.isEqualTo(y)
			);
		}
	}
	

	@Test
	public void
	test_plus_int_zero_zero_ForRealNumberAsASequenceOfDigits()
	{
		
		for ( int i = 1 ; i <= default_number_of_repetition ; i++ )
		{
			int a = 0;
			int b = 0;
			
	        RealNumber x1 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a)
	        );
	        RealNumber x2 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(b)
	        );
	        RealNumber y = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a+b)
	        );
	        
	        RealNumber x3;
	        
	        x3 = x1.plus(x2);
	        
	        System.out.println(x1 + " + " + x2 + " = " + x3);
	        System.out.println("");

			assertTrue
			(
				x1 + " + " + x2 + " = " + x3 + " == " + y,
				x3.isEqualTo(y)
			);
		}
	}

	
	@Test
	public void
	test_plus_double_nonzero_nonzero_ForRealNumberAsASequenceOfDigits()
	{
		for ( int i = 1 ; i <= default_number_of_repetition ; i++ )
		{
			double a = randomDoubleNotZero();
			double b = randomDoubleNotZero();
			
	        RealNumber x1 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a)
	        );
	        RealNumber x2 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(b)
	        );
	        RealNumber y = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a+b)
	        );
	        
	        RealNumber x3;
	        
	        x3 = x1.plus(x2);
	        
	        System.out.println(x1 + " + " + x2 + " = " + x3);
	        System.out.println("");

			assertTrue
			(
				x1 + " + " + x2 + " = " + x3 + " == " + y,
				x3.isSimilarTo(y)
			);
		}
	}
	

	@Test
	public void
	test_plus_double_nonzero_zero_ForRealNumberAsASequenceOfDigits()
	{
		for ( int i = 1 ; i <= default_number_of_repetition ; i++ )
		{
			double a = randomDoubleNotZero();
			double b = 0;
			
	        RealNumber x1 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a)
	        );
	        RealNumber x2 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(b)
	        );
	        RealNumber y = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a+b)
	        );
	        
	        RealNumber x3;
	        
	        x3 = x1.plus(x2);
	        
	        System.out.println(x1 + " + " + x2 + " = " + x3);
	        System.out.println("");

			assertTrue
			(
				x1 + " + " + x2 + " = " + x3 + " == " + y,
				x3.isEqualTo(y)
			);
		}
	}
	

	@Test
	public void
	test_plus_double_zero_nonzero_ForRealNumberAsASequenceOfDigits()
	{
		
		for ( int i = 1 ; i <= default_number_of_repetition ; i++ )
		{
			double a = 0;
			double b = randomDoubleNotZero();
			
	        RealNumber x1 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a)
	        );
	        RealNumber x2 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(b)
	        );
	        RealNumber y = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a+b)
	        );
	        
	        RealNumber x3;
	        
	        x3 = x1.plus(x2);
	        
	        System.out.println(x1 + " + " + x2 + " = " + x3);
	        System.out.println("");

			assertTrue
			(
				x1 + " + " + x2 + " = " + x3 + " == " + y,
				x3.isEqualTo(y)
			);
		}
	}
	

	@Test
	public void
	test_plus_double_zero_zero_ForRealNumberAsASequenceOfDigits()
	{
		
		for ( int i = 1 ; i <= default_number_of_repetition ; i++ )
		{
			double a = 0;
			double b = 0;
			
	        RealNumber x1 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a)
	        );
	        RealNumber x2 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(b)
	        );
	        RealNumber y = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a+b)
	        );
	        
	        RealNumber x3;
	        
	        x3 = x1.plus(x2);
	        
	        System.out.println(x1 + " + " + x2 + " = " + x3);
	        System.out.println("");

			assertTrue
			(
				x1 + " + " + x2 + " = " + x3 + " == " + y,
				x3.isEqualTo(y)
			);
		}
	}

	@Test
	public void
	test_minus_int_nonzero_nonzero_ForRealNumberAsASequenceOfDigits()
	{
		for ( int i = 1 ; i <= default_number_of_repetition ; i++ )
		{
			int a = randomIntNotZero();
			int b = randomIntNotZero();
			
	        RealNumber x1 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a)
	        );
	        RealNumber x2 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(b)
	        );
	        RealNumber y = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a-b)
	        );
	        
	        RealNumber x3;
	        
	        x3 = x1.minus(x2);
	        
	        System.out.println(x1 + " - " + x2 + " = " + x3);
	        System.out.println("");
	        
			assertTrue
			(
				x1 + " - " + x2 + " = " + x3 + " == " + y,
				x3.isEqualTo(y)
			);
		}
	}
	

	@Test
	public void
	test_minus_int_nonzero_zero_ForRealNumberAsASequenceOfDigits()
	{
		for ( int i = 1 ; i <= default_number_of_repetition ; i++ )
		{
			int a = randomIntNotZero();
			int b = 0;
			
	        RealNumber x1 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a)
	        );
	        RealNumber x2 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(b)
	        );
	        RealNumber y = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a-b)
	        );
	        
	        RealNumber x3;
	        
	        x3 = x1.minus(x2);
	        
	        System.out.println(x1 + " - " + x2 + " = " + x3);
	        System.out.println("");

			assertTrue
			(
				x1 + " - " + x2 + " = " + x3 + " == " + y,
				x3.isEqualTo(y)
			);
		}
	}
	

	@Test
	public void
	test_minus_int_zero_nonzero_ForRealNumberAsASequenceOfDigits()
	{
		
		for ( int i = 1 ; i <= default_number_of_repetition ; i++ )
		{
			int a = 0;
			int b = randomIntNotZero();
			
	        RealNumber x1 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a)
	        );
	        RealNumber x2 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(b)
	        );
	        RealNumber y = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a-b)
	        );
	        
	        RealNumber x3;
	        
	        x3 = x1.minus(x2);

	        System.out.println(x1 + " - " + x2 + " = " + x3);
	        System.out.println("");

			assertTrue
			(
				x1 + " - " + x2 + " = " + x3 + " == " + y,
				x3.isEqualTo(y)
			);
		}
	}
	

	@Test
	public void
	test_minus_int_zero_zero_ForRealNumberAsASequenceOfDigits()
	{
		
		for ( int i = 1 ; i <= default_number_of_repetition ; i++ )
		{
			int a = 0;
			int b = 0;
			
	        RealNumber x1 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a)
	        );
	        RealNumber x2 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(b)
	        );
	        RealNumber y = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a-b)
	        );
	        
	        RealNumber x3;
	        
	        x3 = x1.minus(x2);

	        System.out.println(x1 + " - " + x2 + " = " + x3);
	        System.out.println("");

			assertTrue
			(
				x1 + " - " + x2 + " = " + x3 + " == " + y,
				x3.isEqualTo(y)
			);
		}
	}


	@Test
	public void
	test_minus_double_nonzero_nonzero_ForRealNumberAsASequenceOfDigits()
	{
		for ( int i = 1 ; i <= default_number_of_repetition ; i++ )
		{
			double a = randomDoubleNotZero();
			double b = randomDoubleNotZero();
			
	        RealNumber x1 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a)
	        );
	        RealNumber x2 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(b)
	        );
	        RealNumber y = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a-b)
	        );
	        
	        RealNumber x3;
	        
	        x3 = x1.minus(x2);
	        
	        System.out.println(x1 + " - " + x2 + " = " + x3);
	        System.out.println("");
	        
			assertTrue
			(
				x1 + " - " + x2 + " = " + x3 + " == " + y,
				x3.isSimilarTo(y)
			);
		}
	}
	

	@Test
	public void
	test_minus_double_nonzero_zero_ForRealNumberAsASequenceOfDigits()
	{
		for ( int i = 1 ; i <= default_number_of_repetition ; i++ )
		{
			double a = randomDoubleNotZero();
			double b = 0;
			
	        RealNumber x1 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a)
	        );
	        RealNumber x2 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(b)
	        );
	        RealNumber y = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a-b)
	        );
	        
	        RealNumber x3;
	        
	        x3 = x1.minus(x2);
	        
	        System.out.println(x1 + " - " + x2 + " = " + x3);
	        System.out.println("");

			assertTrue
			(
				x1 + " - " + x2 + " = " + x3 + " == " + y,
				x3.isEqualTo(y)
			);
		}
	}
	

	@Test
	public void
	test_minus_double_zero_nonzero_ForRealNumberAsASequenceOfDigits()
	{
		
		for ( int i = 1 ; i <= default_number_of_repetition ; i++ )
		{
			double a = 0;
			double b = randomDoubleNotZero();
			
	        RealNumber x1 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a)
	        );
	        RealNumber x2 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(b)
	        );
	        RealNumber y = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a-b)
	        );
	        
	        RealNumber x3;
	        
	        x3 = x1.minus(x2);

	        System.out.println(x1 + " - " + x2 + " = " + x3);
	        System.out.println("");

			assertTrue
			(
				x1 + " - " + x2 + " = " + x3 + " == " + y,
				x3.isEqualTo(y)
			);
		}
	}
	

	@Test
	public void
	test_minus_double_zero_zero_ForRealNumberAsASequenceOfDigits()
	{
		
		for ( int i = 1 ; i <= default_number_of_repetition ; i++ )
		{
			double a = 0;
			double b = 0;
			
	        RealNumber x1 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a)
	        );
	        RealNumber x2 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(b)
	        );
	        RealNumber y = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a-b)
	        );
	        
	        RealNumber x3;
	        
	        x3 = x1.minus(x2);

	        System.out.println(x1 + " - " + x2 + " = " + x3);
	        System.out.println("");

			assertTrue
			(
				x1 + " - " + x2 + " = " + x3 + " == " + y,
				x3.isEqualTo(y)
			);
		}
	}

	@Test
	public void
	test_times_int_nonzero_nonzero_ForRealNumberAsASequenceOfDigits()
	{
		for ( int i = 1 ; i <= default_number_of_repetition ; i++ )
		{
			int a = randomIntNotZero();
			int b = randomIntNotZero();
			
	        RealNumber x1 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a)
	        );
	        RealNumber x2 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(b)
	        );
	        RealNumber y = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a*b)
	        );
	        
	        RealNumber x3;
	        
	        x3 = x1.times(x2);
	        
	        System.out.println(x1 + " * " + x2 + " = " + x3);
	        System.out.println("");

			assertTrue
			(
				x1 + " * " + x2 + " = " + x3 + " == " + y,
				x3.isEqualTo(y)
			);
		}
	}
	

	@Test
	public void
	test_times_int_nonzero_zero_ForRealNumberAsASequenceOfDigits()
	{
		for ( int i = 1 ; i <= default_number_of_repetition ; i++ )
		{
			int a = randomIntNotZero();
			int b = 0;
			
	        RealNumber x1 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a)
	        );
	        RealNumber x2 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(b)
	        );
	        RealNumber y = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a*b)
	        );
	        
	        RealNumber x3;
	        
	        x3 = x1.times(x2);
	        
	        System.out.println(x1 + " * " + x2 + " = " + x3);
	        System.out.println("");

			assertTrue
			(
				x1 + " * " + x2 + " = " + x3 + " == " + y,
				x3.isEqualTo(y)
			);
		}
	}
	

	@Test
	public void
	test_times_int_zero_nonzero_ForRealNumberAsASequenceOfDigits()
	{
		
		for ( int i = 1 ; i <= default_number_of_repetition ; i++ )
		{
			int a = 0;
			int b = randomIntNotZero();
			
	        RealNumber x1 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a)
	        );
	        RealNumber x2 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(b)
	        );
	        RealNumber y = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a*b)
	        );
	        
	        RealNumber x3;
	        
	        x3 = x1.times(x2);

	        System.out.println(x1 + " * " + x2 + " = " + x3);
	        System.out.println("");

			assertTrue
			(
				x1 + " * " + x2 + " = " + x3 + " == " + y,
				x3.isEqualTo(y)
			);
		}
	}
	

	@Test
	public void
	test_times_int_zero_zero_ForRealNumberAsASequenceOfDigits()
	{
		
		for ( int i = 1 ; i <= default_number_of_repetition ; i++ )
		{
			int a = 0;
			int b = 0;
			
	        RealNumber x1 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a)
	        );
	        RealNumber x2 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(b)
	        );
	        RealNumber y = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a*b)
	        );
	        
	        RealNumber x3;
	        
	        x3 = x1.times(x2);

	        System.out.println(x1 + " * " + x2 + " = " + x3);
	        System.out.println("");

			assertTrue
			(
				x1 + " * " + x2 + " = " + x3 + " == " + y,
				x3.isEqualTo(y)
			);
		}
	}

	@Test
	public void
	test_times_double_nonzero_nonzero_ForRealNumberAsASequenceOfDigits()
	{
		for ( int i = 1 ; i <= default_number_of_repetition ; i++ )
		{
			double a = randomDoubleNotZero();
			double b = randomDoubleNotZero();
			
	        RealNumber x1 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a)
	        );
	        RealNumber x2 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(b)
	        );
	        RealNumber y = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a*b)
	        );
	        
	        RealNumber x3;
	        
	        x3 = x1.times(x2);
	        
	        System.out.println(x1 + " * " + x2 + " = " + x3);
	        System.out.println("");

			assertTrue
			(
				x1 + " * " + x2 + " = " + x3 + " == " + y,
				x3.isSimilarTo(y)
			);
		}
	}
	

	@Test
	public void
	test_times_double_nonzero_zero_ForRealNumberAsASequenceOfDigits()
	{
		for ( int i = 1 ; i <= default_number_of_repetition ; i++ )
		{
			double a = randomDoubleNotZero();
			double b = 0;
			
	        RealNumber x1 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a)
	        );
	        RealNumber x2 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(b)
	        );
	        RealNumber y = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a*b)
	        );
	        
	        RealNumber x3;
	        
	        x3 = x1.times(x2);
	        
	        System.out.println(x1 + " * " + x2 + " = " + x3);
	        System.out.println("");

			assertTrue
			(
				x1 + " * " + x2 + " = " + x3 + " == " + y,
				x3.isEqualTo(y)
			);
		}
	}
	

	@Test
	public void
	test_times_double_zero_nonzero_ForRealNumberAsASequenceOfDigits()
	{
		
		for ( int i = 1 ; i <= default_number_of_repetition ; i++ )
		{
			double a = 0;
			double b = randomDoubleNotZero();
			
	        RealNumber x1 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a)
	        );
	        RealNumber x2 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(b)
	        );
	        RealNumber y = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a*b)
	        );
	        
	        RealNumber x3;
	        
	        x3 = x1.times(x2);

	        System.out.println(x1 + " * " + x2 + " = " + x3);
	        System.out.println("");

			assertTrue
			(
				x1 + " * " + x2 + " = " + x3 + " == " + y,
				x3.isEqualTo(y)
			);
		}
	}
	

	@Test
	public void
	test_times_double_zero_zero_ForRealNumberAsASequenceOfDigits()
	{
		
		for ( int i = 1 ; i <= default_number_of_repetition ; i++ )
		{
			double a = 0;
			double b = 0;
			
	        RealNumber x1 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a)
	        );
	        RealNumber x2 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(b)
	        );
	        RealNumber y = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a*b)
	        );
	        
	        RealNumber x3;
	        
	        x3 = x1.times(x2);

	        System.out.println(x1 + " * " + x2 + " = " + x3);
	        System.out.println("");

			assertTrue
			(
				x1 + " * " + x2 + " = " + x3 + " == " + y,
				x3.isEqualTo(y)
			);
		}
	}

	@Test
	public void
	test_dividedBy_int_nonzero_nonzero_ForRealNumberAsASequenceOfDigits()
	{
		for ( int i = 1 ; i <= default_number_of_repetition ; i++ )
		{
			int a = randomIntNotZero();
			int b = randomIntNotZero();

	        RealNumber x1 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a)
	        );
	        RealNumber x2 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(b)
	        );
	        RealNumber y = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits
	            (((double)a)/((double)b))
	        );
//	        RealNumber limit = new FinalRealNumber
//	        (
//	        	0.001,
//	            new
//	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(0)
//	        );

	        RealNumber x3;
	        
	        RealNumber Similarity;

	        System.out.print(x1 + " / " + x2);
	        
	        x3 = x1.dividedBy(x2);

	        System.out.println(" = " + x3 + " == " + y);
	        System.out.println("");
//	        Similarity = x3.minus(y).dividedBy(x3);
//	        boolean condition = !Similarity.hasBiggerMagnitudeThan(limit);
	        
			assertTrue
			(
				x1 + " / " + x2 + " = " + x3 + " == " + y,
				x3.isSimilarTo(y)
			);
		}
	}
	

	@Test
	public void test_dividedBy_int_nonzero_zero_ForRealNumberAsASequenceOfDigits()
	{
		for ( int i = 1 ; i <= default_number_of_repetition ; i++ )
		{
			int a = randomIntNotZero();
			int b = 0;

	        RealNumber x1 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a)
	        );
	        RealNumber x2 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(b)
	        );
			

	        RealNumber x3;

	        System.out.print(x1 + " / " + x2);

	        boolean exception_occurred = false;
	        
	        try
	        {
	        	x3 = x1.dividedBy(x2);
	        }
	        catch(IllegalArgumentException e)
	        {
	        	exception_occurred = true;
	        }

	        System.out.println
	        (
				exception_occurred ?
			 	  " (exception occurred as expected)"
				: " (exception did not occur as expected)"
	        );
	        System.out.println("");

			assertTrue
			(
				x1 + " / " + x2
				+
				(
					exception_occurred ?
				 	  " (exception occurred as expected)"
					: " (exception did not occur as expected)"
				)
				,
				exception_occurred
			);
		}
	}
	

	@Test
	public void test_dividedBy_int_zero_nonzero_ForRealNumberAsASequenceOfDigits()
	{
		
		for ( int i = 1 ; i <= default_number_of_repetition ; i++ )
		{
			int a = 0;
			int b = randomIntNotZero();
			
	        RealNumber x1 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a)
	        );
	        RealNumber x2 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(b)
	        );
	        RealNumber y = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(0)
	        );
	        
	        RealNumber x3;

	        System.out.print(x1 + " / " + x2);
	        
	        x3 = x1.dividedBy(x2);

	        System.out.println(" = " + x3 + " == " + y);
	        System.out.println("");

			assertTrue
			(
				x1 + " / " + x2 + " = " + x3 + " == " + y,
				x3.isEqualTo(y)
			);
		}
	}
	

	@Test
	public void test_dividedBy_int_zero_zero_ForRealNumberAsASequenceOfDigits()
	{
		for ( int i = 1 ; i <= default_number_of_repetition ; i++ )
		{
			int a = 0;
			int b = 0;

	        RealNumber x1 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a)
	        );
	        RealNumber x2 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(b)
	        );
			

	        RealNumber x3;

	        System.out.print(x1 + " / " + x2);

	        boolean exception_occurred = false;
	        
	        try
	        {
	        	x3 = x1.dividedBy(x2);
	        }
	        catch(IllegalArgumentException e)
	        {
	        	exception_occurred = true;
	        }

	        System.out.println
	        (
				exception_occurred ?
			 	  " (exception occurred as expected)"
				: " (exception did not occur as expected)"
	        );
	        System.out.println("");

			assertTrue
			(
				x1 + " / " + x2
				+
				(
					exception_occurred ?
				 	  " (exception occurred as expected)"
					: " (exception did not occur as expected)"
				)
				,
				exception_occurred
			);
		}
	}

	@Test
	@Category(JUnitCategoryDoubleDouble.class)
	public void
	test_dividedBy_double_nonzero_nonzero_ForRealNumberAsASequenceOfDigits()
	{
		for ( int i = 1 ; i <= default_number_of_repetition ; i++ )
		{
			double a = randomDoubleNotZero();
			double b = randomDoubleNotZero();
			
	        RealNumber x1 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a)
	        );
	        RealNumber x2 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(b)
	        );
	        RealNumber y = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a/b)
	        );

	        RealNumber x3;

	        System.out.print(x1 + " / " + x2);
	        
	        x3 = x1.dividedBy(x2);
			
	        System.out.println(" = " + x3 + " == " + y);
	        System.out.println("");

			assertTrue
			(
				x1 + " / " + x2 + " = " + x3 + " == " + y,
				x3.isSimilarTo(y)
			);
		}
	}
	

	@Test
	public void
	test_dividedBy_double_nonzero_zero_ForRealNumberAsASequenceOfDigits()
	{
		for ( int i = 1 ; i <= default_number_of_repetition ; i++ )
		{
			double a = randomDoubleNotZero();
			double b = 0;

	        RealNumber x1 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a)
	        );
	        RealNumber x2 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(b)
	        );
			

	        RealNumber x3;

	        System.out.print(x1 + " / " + x2);

	        boolean exception_occurred = false;
	        
	        try
	        {
	        	x3 = x1.dividedBy(x2);
	        }
	        catch(IllegalArgumentException e)
	        {
	        	exception_occurred = true;
	        }

	        System.out.println
	        (
				exception_occurred ?
			 	  " (exception occurred as expected)"
				: " (exception did not occurred as expected)"
	        );
	        System.out.println("");

			assertTrue
			(
				x1 + " / " + x2
				+
				(
					exception_occurred ?
				 	  " (exception occurred as expected)"
					: " (exception did not occurred as expected)"
				)
				,
				exception_occurred
			);
		}
	}

	@Test
	public void
	test_dividedBy_double_zero_nonzero_ForRealNumberAsASequenceOfDigits()
	{
		for ( int i = 1 ; i <= default_number_of_repetition ; i++ )
		{
			double a = 0;
			double b = randomDoubleNotZero();
			
	        RealNumber x1 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a)
	        );
	        RealNumber x2 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(b)
	        );
	        RealNumber y = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(0)
	        );
	        
	        RealNumber x3;

	        System.out.print(x1 + " / " + x2);
	        
	        x3 = x1.dividedBy(x2);

	        System.out.println(" = " + x3 + " == " + y);
	        System.out.println("");

			assertTrue
			(
				x1 + " / " + x2 + " = " + x3 + " == " + y,
				x3.isEqualTo(y)
			);
		}
	}

	

	@Test
	public void
	test_dividedBy_double_zero_zero_ForRealNumberAsASequenceOfDigits()
	{
		for ( int i = 1 ; i <= default_number_of_repetition ; i++ )
		{
			double a = 0;
			double b = 0;

	        RealNumber x1 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a)
	        );
	        RealNumber x2 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(b)
	        );
			

	        RealNumber x3;

	        System.out.print(x1 + " / " + x2);

	        boolean exception_occurred = false;
	        
	        try
	        {
	        	x3 = x1.dividedBy(x2);
	        }
	        catch(IllegalArgumentException e)
	        {
	        	exception_occurred = true;
	        }

	        System.out.println
	        (
				exception_occurred ?
			 	  " (exception occurred as expected)"
				: " (exception did not occur as expected)"
	        );
	        System.out.println("");

			assertTrue
			(
				x1 + " / " + x2
				+
				(
					exception_occurred ?
				 	  " (exception occurred as expected)"
					: " (exception did not occur as expected)"
				)
				,
				exception_occurred
			);
		}
	}

	

	@Test
	public void
	test_clone_int_ForRealNumberAsASequenceOfDigits()
	{
		for ( int i = 1 ; i <= default_number_of_repetition ; i++ )
		{
			int a = randomIntNotZero();

	        AbstractNumberReal x1 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a)
	        );
			

	        AbstractNumberReal x2;

	        System.out.print("clone(" + x1 + ") ");
	        
	        x2 = x1.clone();

	        System.out.println(" = " + x2);
	        System.out.println("");

			assertTrue
			(
				"clone(" + x1 + ") ",
				x2.isEqualTo(x1)
			);
		}
	}

	

	@Test
	public void
	test_clone_double_ForRealNumberAsASequenceOfDigits()
	{
		for ( int i = 1 ; i <= default_number_of_repetition ; i++ )
		{
			double a = randomDoubleNotZero();

	        AbstractNumberReal x1 = new FinalRealNumber
	        (
	            new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(a)
	        );
			

	        AbstractNumberReal x2;

	        System.out.print("clone(" + x1 + ") ");
	        
	        x2 = x1.clone();

	        System.out.println(" = " + x2);
	        System.out.println("");

			assertTrue
			(
				"clone(" + x1 + ") ",
				x2.isEqualTo(x1)
			);
		}
	}
	

	
}
