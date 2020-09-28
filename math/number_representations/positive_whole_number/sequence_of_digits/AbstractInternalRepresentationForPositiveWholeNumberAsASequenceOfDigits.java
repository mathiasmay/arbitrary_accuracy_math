package math.number_representations.positive_whole_number.sequence_of_digits;

import math.number_exceptions.FinalRuntimeExceptionBinaryOperationNotYetImplemented;
import math.number_exceptions.FinalRuntimeExceptionSupplierNotYetImplemented;
import math.number_representations.positive_rational_number.quotient_of_two_positive_whole_numbers.SomeInternalRepresentationForPositiveRationalNumberAsAQuotientOfTwoPositiveWholeNumbers;
import math.number_representations.positive_whole_number.AbstractInternalRepresentationForPositiveWholeNumber;
import math.number_representations.rational_number.quotient_of_two_whole_numbers.SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers;
import math.number_representations.whole_number.sequence_of_digits.AbstractInternalRepresentationForWholeNumberAsASequenceOfDigits;
import math.number_representations.whole_number.sequence_of_digits.SomeInternalRepresentationForWholeNumberAsASequenceOfDigits;

public abstract class AbstractInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
extends               AbstractInternalRepresentationForPositiveWholeNumber
implements SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
{


    

    // Design pattern: bridge
	protected AbstractInternalRepresentationForWholeNumberAsASequenceOfDigits
		instanceInternalRepresentationForWholeNumberAsASequenceOfDigits;
	
	
	public AbstractInternalRepresentationForWholeNumberAsASequenceOfDigits
	getInstanceInternalRepresentationForWholeNumberAsASequenceOfDigits()
	{
		return instanceInternalRepresentationForWholeNumberAsASequenceOfDigits;
	}


	public void
	setInstanceInternalRepresentationForWholeNumberAsASequenceOfDigits
	(
		AbstractInternalRepresentationForWholeNumberAsASequenceOfDigits
		instanceInternalRepresentationForWholeNumberAsASequenceOfDigits
	)
	{
		this.instanceInternalRepresentationForWholeNumberAsASequenceOfDigits
		= instanceInternalRepresentationForWholeNumberAsASequenceOfDigits;
	}


	@Override
	public SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
	clone()
	{
        if (this instanceof
        		FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        {

        	return
        		((FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
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
	equals
	(
			SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits x
	)
	{
        if (this instanceof
        		FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        			this)
        			.equals
        			(
    					(FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
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
	isEqualTo
	(
			SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits x
	)
	{
        if (this instanceof
        		FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        			this)
        			.isEqualTo
        			(
    					(FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
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
	isSimilarTo
	(
			SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits x
	)
	{
        if (this instanceof
        		FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        			this)
        			.isSimilarTo
        			(
    					(FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
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
	isBiggerThan
	(
			SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits x
	)
	{
        if (this instanceof
        		FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        			this)
        			.isBiggerThan
        			(
    					(FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
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
	isSmallerThan
	(
			SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits x
	)
	{
        if (this instanceof
        		FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        			this)
        			.isSmallerThan
        			(
    					(FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
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
	hasSameMagnitudeAs
	(
			SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits x
	)
	{
        if (this instanceof
        		FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        			this)
        			.hasSameMagnitudeAs
        			(
    					(FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
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
	hasBiggerMagnitudeThan
	(
			SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits x
	)
	{
        if (this instanceof
        		FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        			this)
        			.hasBiggerMagnitudeThan
        			(
    					(FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
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
	hasSmallerMagnitudeThan
	(
			SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits x
	)
	{
        if (this instanceof
        		FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        			this)
        			.hasSmallerMagnitudeThan
        			(
    					(FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
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
	public SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
	plus
	(
			SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits x
	)
	{
        if (this instanceof
        		FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        			this)
        			.plus
        			(
    					(FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
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
	public SomeInternalRepresentationForWholeNumberAsASequenceOfDigits
	minus
	(
			SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits x
	)
	{
        if (this instanceof
        		FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        			this)
        			.minus
        			(
    					(FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
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
	public SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
	times
	(
			SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits x
	)
	{
        if (this instanceof
        		FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        			this)
        			.times
        			(
    					(FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
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
	public SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
	dividedBy
	(
			SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits x
	)
	{
        if (this instanceof
        		FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        			this)
        			.dividedBy
        			(
    					(FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
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
	public SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
	dividedBy
	(
		SomeInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits x,
		int accuracy_number_of_digits
	)
	{

        if (this instanceof
        		FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        			this)
        			.dividedBy
        			(
    					(FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
        				x,
        				accuracy_number_of_digits
        			)
        		;
        			
	        }
	//        else if (arg_rep instanceof
	//                AbstractInternalRepresentationForPositiveWholeNumberAsARationalNumber)
	//        {
	//            // TODO dividedBy() for WholeNumberAsARationalNumber
	//        }
	        else
	        {
	            throw new FinalRuntimeExceptionBinaryOperationNotYetImplemented
	            ("dividedBy", this, x);
	        }
        }
        else
        {
            throw new FinalRuntimeExceptionBinaryOperationNotYetImplemented
            ("dividedBy", this, x);
        }
	

	}



}
