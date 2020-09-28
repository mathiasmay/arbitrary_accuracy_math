package math.number_representations.positive_whole_number;

import math.number_exceptions.FinalRuntimeExceptionBinaryOperationNotYetImplemented;
import math.number_exceptions.FinalRuntimeExceptionSupplierNotYetImplemented;
import math.number_representations.AbstractInternalRepresentation;
import math.number_representations.positive_rational_number.SomeInternalRepresentationForPositiveRationalNumber;
import math.number_representations.positive_whole_number.sequence_of_digits.SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits;
import math.number_representations.rational_number.SomeInternalRepresentationForRationalNumber;
import math.number_representations.whole_number.SomeInternalRepresentationForWholeNumber;

public abstract class AbstractInternalRepresentationForPositiveWholeNumber
extends               AbstractInternalRepresentation
implements SomeInternalRepresentationForPositiveWholeNumber
{


	
	@Override
	public SomeInternalRepresentationForPositiveWholeNumber
	clone()
	{
        if (this instanceof
        		SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        {

        	return
        		((SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        		this)
        		.clone()
        	;
        }
        // TODO all other cases
        else
        {
            throw new FinalRuntimeExceptionSupplierNotYetImplemented
            ("clone", this);
        }
	}


	@Override
	public boolean
	equals(SomeInternalRepresentationForPositiveWholeNumber x)
	{
        if (this instanceof
        		SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        {
	        	return
	        		((SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        		this)
	        		.equals
	        		(
        				(SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        				x
	        		)
	        	;
	        }
	        // TODO all other cases
	        else
	        {
	            throw new FinalRuntimeExceptionBinaryOperationNotYetImplemented
	            ("equals", this, x);
	        }
        }
        // TODO all other cases
        else
        {
            throw new FinalRuntimeExceptionBinaryOperationNotYetImplemented
            ("equals", this, x);
        }
	}
	
	@Override
	public boolean
	isEqualTo(SomeInternalRepresentationForPositiveWholeNumber x)
	{
        if (this instanceof
        		SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        {
	        	return
	        		((SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        		this)
	        		.isEqualTo
	        		(
        				(SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        				x
	        		)
	        	;
	        }
	        // TODO all other cases
	        else
	        {
	            throw new FinalRuntimeExceptionBinaryOperationNotYetImplemented
	            ("isEqualTo", this, x);
	        }
        }
        // TODO all other cases
        else
        {
            throw new FinalRuntimeExceptionBinaryOperationNotYetImplemented
            ("isEqualTo", this, x);
        }
	}
	
	@Override
	public boolean
	isSimilarTo(SomeInternalRepresentationForPositiveWholeNumber x)
	{
        if (this instanceof
        		SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        {
	        	return
	        		((SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        		this)
	        		.isSimilarTo
	        		(
        				(SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        				x
	        		)
	        	;
	        }
	        // TODO all other cases
	        else
	        {
	            throw new FinalRuntimeExceptionBinaryOperationNotYetImplemented
	            ("isSimilarTo", this, x);
	        }
        }
        // TODO all other cases
        else
        {
            throw new FinalRuntimeExceptionBinaryOperationNotYetImplemented
            ("isSimilarTo", this, x);
        }
	}
	
	@Override
	public boolean
	isBiggerThan(SomeInternalRepresentationForPositiveWholeNumber x)
	{
        if (this instanceof
        		SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        {
	        	return
	        		((SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        		this)
	        		.isBiggerThan
	        		(
        				(SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        				x
	        		)
	        	;
	        }
	        // TODO all other cases
	        else
	        {
	            throw new FinalRuntimeExceptionBinaryOperationNotYetImplemented
	            ("isBiggerThan", this, x);
	        }
        }
        // TODO all other cases
        else
        {
            throw new FinalRuntimeExceptionBinaryOperationNotYetImplemented
            ("isBiggerThan", this, x);
        }
	}
	
	@Override
	public boolean
	isSmallerThan(SomeInternalRepresentationForPositiveWholeNumber x)
	{
        if (this instanceof
        		SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        {
	        	return
	        		((SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        		this)
	        		.isSmallerThan
	        		(
        				(SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        				x
	        		)
	        	;
	        }
	        // TODO all other cases
	        else
	        {
	            throw new FinalRuntimeExceptionBinaryOperationNotYetImplemented
	            ("isSmallerThan", this, x);
	        }
        }
        // TODO all other cases
        else
        {
            throw new FinalRuntimeExceptionBinaryOperationNotYetImplemented
            ("isSmallerThan", this, x);
        }
	}
	
	@Override
	public boolean
	hasSameMagnitudeAs(SomeInternalRepresentationForPositiveWholeNumber x)
	{
        if (this instanceof
        		SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        {
	        	return
	        		((SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        		this)
	        		.hasSameMagnitudeAs
	        		(
        				(SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        				x
	        		)
	        	;
	        }
	        // TODO all other cases
	        else
	        {
	            throw new FinalRuntimeExceptionBinaryOperationNotYetImplemented
	            ("hasSameMagnitudeAs", this, x);
	        }
        }
        // TODO all other cases
        else
        {
            throw new FinalRuntimeExceptionBinaryOperationNotYetImplemented
            ("hasSameMagnitudeAs", this, x);
        }
	}
	
	@Override
	public boolean
	hasBiggerMagnitudeThan(SomeInternalRepresentationForPositiveWholeNumber x)
	{
        if (this instanceof
        		SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        {
	        	return
	        		((SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        		this)
	        		.hasBiggerMagnitudeThan
	        		(
        				(SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        				x
	        		)
	        	;
	        }
	        // TODO all other cases
	        else
	        {
	            throw new FinalRuntimeExceptionBinaryOperationNotYetImplemented
	            ("hasBiggerMagnitudeThan", this, x);
	        }
        }
        // TODO all other cases
        else
        {
            throw new FinalRuntimeExceptionBinaryOperationNotYetImplemented
            ("hasBiggerMagnitudeThan", this, x);
        }
	}
	
	@Override
	public boolean
	hasSmallerMagnitudeThan(SomeInternalRepresentationForPositiveWholeNumber x)
	{
        if (this instanceof
        		SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        {
	        	return
	        		((SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        		this)
	        		.hasSmallerMagnitudeThan
	        		(
        				(SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        				x
	        		)
	        	;
	        }
	        // TODO all other cases
	        else
	        {
	            throw new FinalRuntimeExceptionBinaryOperationNotYetImplemented
	            ("hasSmallerMagnitudeThan", this, x);
	        }
        }
        // TODO all other cases
        else
        {
            throw new FinalRuntimeExceptionBinaryOperationNotYetImplemented
            ("hasSmallerMagnitudeThan", this, x);
        }
	}
	
	@Override
	public SomeInternalRepresentationForPositiveWholeNumber
	plus(SomeInternalRepresentationForPositiveWholeNumber x)
	{
        if (this instanceof
        		SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        {
	        	return
	        		((SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        		this)
	        		.plus
	        		(
        				(SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
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
	public SomeInternalRepresentationForWholeNumber
	minus(SomeInternalRepresentationForPositiveWholeNumber x)
	{
        if (this instanceof
        		SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        {
	        	return
	        		((SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        		this)
	        		.minus
	        		(
        				(SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
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
	public SomeInternalRepresentationForPositiveWholeNumber
	times(SomeInternalRepresentationForPositiveWholeNumber x)
	{
        if (this instanceof
        		SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        {
	        	return
	        		((SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        		this)
	        		.times
	        		(
        				(SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
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
	public SomeInternalRepresentationForRationalNumber
	dividedBy(SomeInternalRepresentationForPositiveWholeNumber x)
	{
        if (this instanceof
        		SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        {
	        	return
	        		((SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        		this)
	        		.dividedBy
	        		(
        				(SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
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
    public SomeInternalRepresentationForRationalNumber
    dividedBy(SomeInternalRepresentationForPositiveWholeNumber x,int accuracy_number_of_digits)
	{

        if (this instanceof
        		SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        {
	        	return
	        		((SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        		this)
	        		.dividedBy
	        		(
        				(SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        				x,
	        			accuracy_number_of_digits
	        		)
	        	;
	        }
	        // TODO all other cases
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
	

    
}
