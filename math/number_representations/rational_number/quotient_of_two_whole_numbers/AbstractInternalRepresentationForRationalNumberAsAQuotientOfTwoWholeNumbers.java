package math.number_representations.rational_number.quotient_of_two_whole_numbers;

import java.util.Optional;

import math.Signum;
import math.number_exceptions.FinalRuntimeExceptionBinaryOperationNotYetImplemented;
import math.number_representations.positive_whole_number.sequence_of_digits.AbstractInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits;
import math.number_representations.rational_number.AbstractInternalRepresentationForRationalNumber;
import math.number_representations.rational_number.SomeInternalRepresentationForRationalNumber;
import math.number_representations.real_number.sequence_of_digits.FinalInternalRepresentationForRealNumberAsASequenceOfDigits;
import math.number_representations.real_number.sequence_of_digits.SomeInternalRepresentationForRealNumberAsASequenceOfDigits;
import math.number_representations.signum.AbstractInternalRepresentationForSignum;
import math.number_representations.whole_number.SomeInternalRepresentationForWholeNumber;

public abstract class AbstractInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
extends               AbstractInternalRepresentationForRationalNumber
implements SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
{


    

    // Design pattern: bridge
	protected AbstractInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
	numerator;
	protected AbstractInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
	denominator;
	protected AbstractInternalRepresentationForSignum
	signum;
	
	
	
	@Override
	public String toString()
	{
		if(this.isZero())
		{
			return "0";
		}
		else
		{
			return
				  signum.toString_as_PrefixSignumSymbol_only_if_negative()
				+ numerator
				+ "/"
				+ denominator;
		}
	}
	
	@Override
	public AbstractInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
	clone()
	{
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean equals(SomeInternalRepresentationForRationalNumber x)
	{
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public SomeInternalRepresentationForRationalNumber plus(SomeInternalRepresentationForRationalNumber x)
	{
		if (this instanceof
	   		SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers)
	    {
	
	        if (x instanceof
	        	SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers)
	        {
	        	return
	    			((SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers)
	    			this)
	    			.plus
	    			(
						(SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers)
	    				x
	    			)
	    		;
	    			
	        }
	        // TODO all other cases
	        else
	        {
	            throw new FinalRuntimeExceptionBinaryOperationNotYetImplemented
	            ("plus", this, x);
	        }
	    }
	    // TODO all other cases
	    else
	    {
	        throw new FinalRuntimeExceptionBinaryOperationNotYetImplemented
	        ("plus", this, x);
	    }
	}
	
	@Override
	public SomeInternalRepresentationForRationalNumber minus(SomeInternalRepresentationForRationalNumber x)
	{
		if (this instanceof
	   		SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers)
	    {
	
	        if (x instanceof
	        	SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers)
	        {
	        	return
	    			((SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers)
	    			this)
	    			.minus
	    			(
						(SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers)
	    				x
	    			)
	    		;
	    			
	        }
	        // TODO all other cases
	        else
	        {
	            throw new FinalRuntimeExceptionBinaryOperationNotYetImplemented
	            ("minus", this, x);
	        }
	    }
	    // TODO all other cases
	    else
	    {
	        throw new FinalRuntimeExceptionBinaryOperationNotYetImplemented
	        ("minus", this, x);
	    }
	}
	@Override
	public SomeInternalRepresentationForRationalNumber times(SomeInternalRepresentationForRationalNumber x)
	{
		if (this instanceof
	   		SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers)
	    {
	
	        if (x instanceof
	        	SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers)
	        {
	        	return
	    			((SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers)
	    			this)
	    			.times
	    			(
						(SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers)
	    				x
	    			)
	    		;
	    			
	        }
	        // TODO all other cases
	        else
	        {
	            throw new FinalRuntimeExceptionBinaryOperationNotYetImplemented
	            ("times", this, x);
	        }
	    }
	    // TODO all other cases
	    else
	    {
	        throw new FinalRuntimeExceptionBinaryOperationNotYetImplemented
	        ("times", this, x);
	    }
	}
	@Override
	public SomeInternalRepresentationForRationalNumber dividedBy(SomeInternalRepresentationForRationalNumber x)
	{
		if (this instanceof
		   		SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers)
		    {
		
		        if (x instanceof
		        	SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers)
		        {
		        	return
		    			((SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers)
		    			this)
		    			.dividedBy
		    			(
							(SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers)
		    				x
		    			)
		    		;
		    			
		        }
		        // TODO all other cases
		        else
		        {
		            throw new FinalRuntimeExceptionBinaryOperationNotYetImplemented
		            ("dividedBy", this, x);
		        }
		    }
		    // TODO all other cases
		    else
		    {
		        throw new FinalRuntimeExceptionBinaryOperationNotYetImplemented
		        ("dividedBy", this, x);
		    }
	}
	@Override
	public SomeInternalRepresentationForRationalNumber dividedBy(
			SomeInternalRepresentationForRationalNumber x, int accuracy
	)
	{
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isEqualTo(SomeInternalRepresentationForRationalNumber x)
	{
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isSimilarTo(SomeInternalRepresentationForRationalNumber x)
	{
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isBiggerThan(SomeInternalRepresentationForRationalNumber x)
	{
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isSmallerThan(SomeInternalRepresentationForRationalNumber x)
	{
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean hasSameMagnitudeAs(SomeInternalRepresentationForRationalNumber x)
	{
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean hasBiggerMagnitudeThan(SomeInternalRepresentationForRationalNumber x)
	{
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean hasSmallerMagnitudeThan(SomeInternalRepresentationForRationalNumber x)
	{
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Optional<Integer> getValueAsIntegerIfPossible()
	{
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Optional<Double> getValueAsDoubleIfPossible()
	{
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean equals(SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers x)
	{
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers	plus
	(
			SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers x
	)
	{
        if (this instanceof
        		FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers)
	        {
	        	return
        			((FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers)
        			this)
        			.plus
        			(
    					(FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers)
        				x
        			)
        		;
        			
	        }
	        // TODO all other cases
	        else
	        {
	            throw new FinalRuntimeExceptionBinaryOperationNotYetImplemented
	            ("plus", this, x);
	        }
        }
        // TODO all other cases
        else
        {
            throw new FinalRuntimeExceptionBinaryOperationNotYetImplemented
            ("plus", this, x);
        }
	}
	
	@Override
	public SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers minus(
			SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers x
	)
	{
        if (this instanceof
        		FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers)
	        {
	        	return
        			((FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers)
        			this)
        			.minus
        			(
    					(FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers)
        				x
        			)
        		;
        			
	        }
	        // TODO all other cases
	        else
	        {
	            throw new FinalRuntimeExceptionBinaryOperationNotYetImplemented
	            ("minus", this, x);
	        }
        }
        // TODO all other cases
        else
        {
            throw new FinalRuntimeExceptionBinaryOperationNotYetImplemented
            ("minus", this, x);
        }
	}
	@Override
	public SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers times(
			SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers x
	)
	{
		if (this instanceof
	    		FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers)
	    {
	
	        if (x instanceof
	        		FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers)
	        {
	        	return
	    			((FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers)
	    			this)
	    			.times
	    			(
						(FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers)
	    				x
	    			)
	    		;
	    			
	        }
	        // TODO all other cases
	        else
	        {
	            throw new FinalRuntimeExceptionBinaryOperationNotYetImplemented
	            ("times", this, x);
	        }
	    }
	    // TODO all other cases
	    else
	    {
	        throw new FinalRuntimeExceptionBinaryOperationNotYetImplemented
	        ("times", this, x);
	    }
	}
	@Override
	public SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers dividedBy(
			SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers x
	)
	{
		if (this instanceof
	    		FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers)
	    {
	
	        if (x instanceof
	        		FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers)
	        {
	        	return
	    			((FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers)
	    			this)
	    			.dividedBy
	    			(
						(FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers)
	    				x
	    			)
	    		;
	    			
	        }
	        // TODO all other cases
	        else
	        {
	            throw new FinalRuntimeExceptionBinaryOperationNotYetImplemented
	            ("dividedBy", this, x);
	        }
	    }
	    // TODO all other cases
	    else
	    {
	        throw new FinalRuntimeExceptionBinaryOperationNotYetImplemented
	        ("dividedBy", this, x);
	    }
	}
	@Override
	public SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers dividedBy(
			SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers x, int accuracy
	)
	{
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isEqualTo(SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers x)
	{
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isSimilarTo(SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers x)
	{
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isBiggerThan(SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers x)
	{
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isSmallerThan(SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers x)
	{
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean hasSameMagnitudeAs(SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers x)
	{
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean hasBiggerMagnitudeThan(SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers x)
	{
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean hasSmallerMagnitudeThan(SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers x)
	{
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
