package math.number_representations.real_number;

import math.number_exceptions.FinalRuntimeExceptionBinaryOperationNotYetImplemented;
import math.number_exceptions.FinalRuntimeExceptionSupplierNotYetImplemented;
import math.number_representations.AbstractInternalRepresentation;
import math.number_representations.real_number.sequence_of_digits.SomeInternalRepresentationForRealNumberAsASequenceOfDigits;

public abstract class AbstractInternalRepresentationForRealNumber
extends               AbstractInternalRepresentation
implements SomeInternalRepresentationForRealNumber
{
	
	

	
	@Override
	public SomeInternalRepresentationForRealNumber
	clone()
	{
        if (this instanceof
        		SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
        {

        	return
        		((SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
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
	equals(SomeInternalRepresentationForRealNumber x)
	{
        if (this instanceof
        		SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
	        {
	        	return
	        		((SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
	        		this)
	        		.equals
	        		(
        				(SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
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
	isEqualTo(SomeInternalRepresentationForRealNumber x)
	{
        if (this instanceof
        		SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
	        {
	        	return
	        		((SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
	        		this)
	        		.isEqualTo
	        		(
        				(SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
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
	isSimilarTo(SomeInternalRepresentationForRealNumber x)
	{
        if (this instanceof
        		SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
	        {
	        	return
	        		((SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
	        		this)
	        		.isSimilarTo
	        		(
        				(SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
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
	isBiggerThan(SomeInternalRepresentationForRealNumber x)
	{
        if (this instanceof
        		SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
	        {
	        	return
	        		((SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
	        		this)
	        		.isBiggerThan
	        		(
        				(SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
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
	isSmallerThan(SomeInternalRepresentationForRealNumber x)
	{
        if (this instanceof
        		SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
	        {
	        	return
	        		((SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
	        		this)
	        		.isSmallerThan
	        		(
        				(SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
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
	hasSameMagnitudeAs(SomeInternalRepresentationForRealNumber x)
	{
        if (this instanceof
        		SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
	        {
	        	return
	        		((SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
	        		this)
	        		.hasSameMagnitudeAs
	        		(
        				(SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
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
	hasBiggerMagnitudeThan(SomeInternalRepresentationForRealNumber x)
	{
        if (this instanceof
        		SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
	        {
	        	return
	        		((SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
	        		this)
	        		.hasBiggerMagnitudeThan
	        		(
        				(SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
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
	hasSmallerMagnitudeThan(SomeInternalRepresentationForRealNumber x)
	{
        if (this instanceof
        		SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
	        {
	        	return
	        		((SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
	        		this)
	        		.hasSmallerMagnitudeThan
	        		(
        				(SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
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
	public SomeInternalRepresentationForRealNumber
	plus(SomeInternalRepresentationForRealNumber x)
	{
        if (this instanceof
        		SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
	        {
	        	return
	        		((SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
	        		this)
	        		.plus
	        		(
        				(SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
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
	public SomeInternalRepresentationForRealNumber
	minus(SomeInternalRepresentationForRealNumber x)
	{
        if (this instanceof
        		SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
	        {
	        	return
	        		((SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
	        		this)
	        		.minus
	        		(
        				(SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
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
	public SomeInternalRepresentationForRealNumber
	times(SomeInternalRepresentationForRealNumber x)
	{
        if (this instanceof
        		SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
	        {
	        	return
	        		((SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
	        		this)
	        		.times
	        		(
        				(SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
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
	public SomeInternalRepresentationForRealNumber
	dividedBy(SomeInternalRepresentationForRealNumber x)
	{
        if (this instanceof
        		SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
	        {
	        	return
	        		((SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
	        		this)
	        		.dividedBy
	        		(
        				(SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
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
    public SomeInternalRepresentationForRealNumber
    dividedBy(SomeInternalRepresentationForRealNumber x,int accuracy_number_of_digits)
	{

        if (this instanceof
        		SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
	        {
	        	return
	        		(SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
	        		this
	        		.dividedBy
	        		(
        				(SomeInternalRepresentationForRealNumberAsASequenceOfDigits)
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
