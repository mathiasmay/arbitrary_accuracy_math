package math.number_representations.whole_number;

import math.number_exceptions.FinalRuntimeExceptionBinaryOperationNotYetImplemented;
import math.number_exceptions.FinalRuntimeExceptionSupplierNotYetImplemented;
import math.number_representations.AbstractInternalRepresentation;
import math.number_representations.rational_number.SomeInternalRepresentationForRationalNumber;
import math.number_representations.whole_number.sequence_of_digits.SomeInternalRepresentationForWholeNumberAsASequenceOfDigits;

public abstract class AbstractInternalRepresentationForWholeNumber
extends               AbstractInternalRepresentation
implements SomeInternalRepresentationForWholeNumber
{


	
	@Override
	public SomeInternalRepresentationForWholeNumber
	clone()
	{
        if (this instanceof
        		SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
        {

        	return
        		((SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
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
	equals(SomeInternalRepresentationForWholeNumber x)
	{
        if (this instanceof
        		SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
	        {
	        	return
	        		((SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
	        		this)
	        		.equals
	        		(
        				(SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
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
	isEqualTo(SomeInternalRepresentationForWholeNumber x)
	{
        if (this instanceof
        		SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
	        {
	        	return
	        		((SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
	        		this)
	        		.isEqualTo
	        		(
        				(SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
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
	isSimilarTo(SomeInternalRepresentationForWholeNumber x)
	{
        if (this instanceof
        		SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
	        {
	        	return
	        		((SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
	        		this)
	        		.isSimilarTo
	        		(
        				(SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
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
	isBiggerThan(SomeInternalRepresentationForWholeNumber x)
	{
        if (this instanceof
        		SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
	        {
	        	return
	        		((SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
	        		this)
	        		.isBiggerThan
	        		(
        				(SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
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
	isSmallerThan(SomeInternalRepresentationForWholeNumber x)
	{
        if (this instanceof
        		SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
	        {
	        	return
	        		((SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
	        		this)
	        		.isSmallerThan
	        		(
        				(SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
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
	hasSameMagnitudeAs(SomeInternalRepresentationForWholeNumber x)
	{
        if (this instanceof
        		SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
	        {
	        	return
	        		((SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
	        		this)
	        		.hasSameMagnitudeAs
	        		(
        				(SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
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
	hasBiggerMagnitudeThan(SomeInternalRepresentationForWholeNumber x)
	{
        if (this instanceof
        		SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
	        {
	        	return
	        		((SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
	        		this)
	        		.hasBiggerMagnitudeThan
	        		(
        				(SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
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
	hasSmallerMagnitudeThan(SomeInternalRepresentationForWholeNumber x)
	{
        if (this instanceof
        		SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
	        {
	        	return
	        		((SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
	        		this)
	        		.hasSmallerMagnitudeThan
	        		(
        				(SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
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
	public SomeInternalRepresentationForWholeNumber
	plus(SomeInternalRepresentationForWholeNumber x)
	{
        if (this instanceof
        		SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
	        {
	        	return
	        		((SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
	        		this)
	        		.plus
	        		(
        				(SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
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
	minus(SomeInternalRepresentationForWholeNumber x)
	{
        if (this instanceof
        		SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
	        {
	        	return
	        		((SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
	        		this)
	        		.minus
	        		(
        				(SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
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
	public SomeInternalRepresentationForWholeNumber
	times(SomeInternalRepresentationForWholeNumber x)
	{
        if (this instanceof
        		SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
	        {
	        	return
	        		((SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
	        		this)
	        		.times
	        		(
        				(SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
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
	dividedBy(SomeInternalRepresentationForWholeNumber x)
	{
        if (this instanceof
        		SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
	        {
	        	return
	        		((SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
	        		this)
	        		.dividedBy
	        		(
        				(SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
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
    dividedBy(SomeInternalRepresentationForWholeNumber x,int accuracy_number_of_digits)
	{

        if (this instanceof
        		SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
	        {
	        	return
	        		(SomeInternalRepresentationForRationalNumber)
	        		this
	        		.dividedBy
	        		(
        				(SomeInternalRepresentationForWholeNumberAsASequenceOfDigits)
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
