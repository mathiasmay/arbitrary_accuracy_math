package math.number_representations.real_number.sequence_of_digits;

import java.util.Optional;

import math.number_exceptions.FinalRuntimeExceptionBinaryOperationNotYetImplemented;
import math.number_exceptions.FinalRuntimeExceptionSupplierNotYetImplemented;
import math.number_representations.AbstractMutableDigitRepresentation;
import math.number_representations.real_number.AbstractInternalRepresentationForRealNumber;

public abstract class
AbstractInternalRepresentationForRealNumberAsASequenceOfDigits
extends               AbstractInternalRepresentationForRealNumber
implements SomeInternalRepresentationForRealNumberAsASequenceOfDigits
{
	
    // Design pattern: bridge
    public AbstractMutableDigitRepresentation instanceMutableDigitRepresentation;

	public AbstractMutableDigitRepresentation getInstanceMutableDigitRepresentation()
	{
		return instanceMutableDigitRepresentation;
	}

	public void setInstanceMutableDigitRepresentation(AbstractMutableDigitRepresentation instanceMutableDigitRepresentation)
	{
		this.instanceMutableDigitRepresentation = instanceMutableDigitRepresentation;
	}



	
	@Override
	public SomeInternalRepresentationForRealNumberAsASequenceOfDigits
	clone()
	{
        if (this instanceof
        		FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
        {

        	return
        		((FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
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
			SomeInternalRepresentationForRealNumberAsASequenceOfDigits x
	)
	{
        if (this instanceof
        		FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
        			this)
        			.equals
        			(
    					(FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
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
			SomeInternalRepresentationForRealNumberAsASequenceOfDigits x
	)
	{
        if (this instanceof
        		FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
        			this)
        			.isEqualTo
        			(
    					(FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
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
			SomeInternalRepresentationForRealNumberAsASequenceOfDigits x
	)
	{
        if (this instanceof
        		FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
        			this)
        			.isSimilarTo
        			(
    					(FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
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
			SomeInternalRepresentationForRealNumberAsASequenceOfDigits x
	)
	{
        if (this instanceof
        		FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
        			this)
        			.isBiggerThan
        			(
    					(FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
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
			SomeInternalRepresentationForRealNumberAsASequenceOfDigits x
	)
	{
        if (this instanceof
        		FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
        			this)
        			.isSmallerThan
        			(
    					(FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
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
			SomeInternalRepresentationForRealNumberAsASequenceOfDigits x
	)
	{
        if (this instanceof
        		FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
        			this)
        			.hasSameMagnitudeAs
        			(
    					(FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
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
			SomeInternalRepresentationForRealNumberAsASequenceOfDigits x
	)
	{
        if (this instanceof
        		FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
        			this)
        			.hasBiggerMagnitudeThan
        			(
    					(FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
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
			SomeInternalRepresentationForRealNumberAsASequenceOfDigits x
	)
	{
        if (this instanceof
        		FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
        			this)
        			.hasSmallerMagnitudeThan
        			(
    					(FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
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
	public SomeInternalRepresentationForRealNumberAsASequenceOfDigits
	plus
	(
			SomeInternalRepresentationForRealNumberAsASequenceOfDigits x
	)
	{
        if (this instanceof
        		FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
        			this)
        			.plus
        			(
    					(FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
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
	public SomeInternalRepresentationForRealNumberAsASequenceOfDigits
	minus
	(
			SomeInternalRepresentationForRealNumberAsASequenceOfDigits x
	)
	{
        if (this instanceof
        		FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
        			this)
        			.minus
        			(
    					(FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
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
	public SomeInternalRepresentationForRealNumberAsASequenceOfDigits
	times
	(
			SomeInternalRepresentationForRealNumberAsASequenceOfDigits x
	)
	{
        if (this instanceof
        		FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
        			this)
        			.times
        			(
    					(FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
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
	public SomeInternalRepresentationForRealNumberAsASequenceOfDigits
	dividedBy
	(
			SomeInternalRepresentationForRealNumberAsASequenceOfDigits x
	)
	{
        if (this instanceof
        		FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
        			this)
        			.dividedBy
        			(
    					(FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
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
	public SomeInternalRepresentationForRealNumberAsASequenceOfDigits
	dividedBy
	(
		SomeInternalRepresentationForRealNumberAsASequenceOfDigits x,
		int accuracy_number_of_digits
	)
	{

        if (this instanceof
        		FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
        {

	        if (x instanceof
	        		FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
	        {
	        	return
        			((FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
        			this)
        			.dividedBy
        			(
    					(FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
        				x,
        				accuracy_number_of_digits
        			)
        		;
        			
	        }
	//        else if (arg_rep instanceof
	//                AbstractInternalRepresentationForRealNumberAsARationalNumber)
	//        {
	//            // TODO dividedBy() for RealNumberAsARationalNumber
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
