package math.number_representations.whole_number.sequence_of_digits;

import math.number_exceptions.FinalRuntimeExceptionBinaryOperationNotYetImplemented;
import math.number_exceptions.FinalRuntimeExceptionSupplierNotYetImplemented;
import math.number_representations.rational_number.SomeInternalRepresentationForRationalNumber;
import math.number_representations.real_number.sequence_of_digits.AbstractInternalRepresentationForRealNumberAsASequenceOfDigits;
import math.number_representations.whole_number.AbstractInternalRepresentationForWholeNumber;

public abstract
class		AbstractInternalRepresentationForWholeNumberAsASequenceOfDigits
extends		AbstractInternalRepresentationForWholeNumber
implements	SomeInternalRepresentationForWholeNumberAsASequenceOfDigits
{


    

    // Design pattern: bridge
	protected AbstractInternalRepresentationForRealNumberAsASequenceOfDigits
		      instanceInternalRepresentationForRealNumberAsASequenceOfDigits;
	
	
	public AbstractInternalRepresentationForRealNumberAsASequenceOfDigits
	getInstanceInternalRepresentationForRealNumberAsASequenceOfDigits()
	{
		return instanceInternalRepresentationForRealNumberAsASequenceOfDigits;
	}


	public void
	setInstanceInternalRepresentationForRealNumberAsASequenceOfDigits
	(
		AbstractInternalRepresentationForRealNumberAsASequenceOfDigits
		instanceInternalRepresentationForRealNumberAsASequenceOfDigits
	)
	{
		this.instanceInternalRepresentationForRealNumberAsASequenceOfDigits
		= instanceInternalRepresentationForRealNumberAsASequenceOfDigits;
	}


	@Override
	public SomeInternalRepresentationForWholeNumberAsASequenceOfDigits
	clone()
	{
        if (this instanceof
        		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
        {

        	return
        		((FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
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
			SomeInternalRepresentationForWholeNumberAsASequenceOfDigits x
	)
	{
        if (this instanceof
        		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
        			this)
        			.equals
        			(
    					(FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
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
			SomeInternalRepresentationForWholeNumberAsASequenceOfDigits x
	)
	{
        if (this instanceof
        		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
        			this)
        			.isEqualTo
        			(
    					(FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
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
			SomeInternalRepresentationForWholeNumberAsASequenceOfDigits x
	)
	{
        if (this instanceof
        		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
        			this)
        			.isSimilarTo
        			(
    					(FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
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
			SomeInternalRepresentationForWholeNumberAsASequenceOfDigits x
	)
	{
        if (this instanceof
        		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
        			this)
        			.isBiggerThan
        			(
    					(FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
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
			SomeInternalRepresentationForWholeNumberAsASequenceOfDigits x
	)
	{
        if (this instanceof
        		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
        			this)
        			.isSmallerThan
        			(
    					(FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
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
			SomeInternalRepresentationForWholeNumberAsASequenceOfDigits x
	)
	{
        if (this instanceof
        		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
        			this)
        			.hasSameMagnitudeAs
        			(
    					(FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
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
			SomeInternalRepresentationForWholeNumberAsASequenceOfDigits x
	)
	{
        if (this instanceof
        		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
        			this)
        			.hasBiggerMagnitudeThan
        			(
    					(FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
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
			SomeInternalRepresentationForWholeNumberAsASequenceOfDigits x
	)
	{
        if (this instanceof
        		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
        			this)
        			.hasSmallerMagnitudeThan
        			(
    					(FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
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
	public SomeInternalRepresentationForWholeNumberAsASequenceOfDigits
	plus
	(
			SomeInternalRepresentationForWholeNumberAsASequenceOfDigits x
	)
	{
        if (this instanceof
        		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
        			this)
        			.plus
        			(
    					(FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
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
			SomeInternalRepresentationForWholeNumberAsASequenceOfDigits x
	)
	{
        if (this instanceof
        		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
        			this)
        			.minus
        			(
    					(FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
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
	public SomeInternalRepresentationForWholeNumberAsASequenceOfDigits
	times
	(
			SomeInternalRepresentationForWholeNumberAsASequenceOfDigits x
	)
	{
        if (this instanceof
        		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
        			this)
        			.times
        			(
    					(FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
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
	dividedBy
	(
			SomeInternalRepresentationForWholeNumberAsASequenceOfDigits x
	)
	{
        if (this instanceof
        		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
        			this)
        			.dividedBy
        			(
    					(FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
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
	dividedBy
	(
		SomeInternalRepresentationForWholeNumberAsASequenceOfDigits x,
		int accuracy_number_of_digits
	)
	{

        if (this instanceof
        		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
        			this)
        			.dividedBy
        			(
    					(FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
        				x,
        				accuracy_number_of_digits
        			)
        		;
        			
	        }
	//        else if (arg_rep instanceof
	//                AbstractInternalRepresentationForWholeNumberAsARationalNumber)
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
