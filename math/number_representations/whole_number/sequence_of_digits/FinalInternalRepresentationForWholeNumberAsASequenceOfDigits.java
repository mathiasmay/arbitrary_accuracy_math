package math.number_representations.whole_number.sequence_of_digits;

import java.util.Optional;

import math.number_representations.AbstractMutableDigitRepresentation;
import math.number_representations.positive_whole_number.SomeInternalRepresentationForPositiveWholeNumber;
import math.number_representations.positive_whole_number.sequence_of_digits.AbstractInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits;
import math.number_representations.positive_whole_number.sequence_of_digits.FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits;
import math.number_representations.rational_number.quotient_of_two_whole_numbers.FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers;
import math.number_representations.real_number.SomeInternalRepresentationForRealNumber;
import math.number_representations.real_number.sequence_of_digits.FinalInternalRepresentationForRealNumberAsASequenceOfDigits;
import math.number_representations.signum.AbstractInternalRepresentationForSignum;
import math.number_representations.signum.FinalInternalRepresentationForSignum;
import math.number_representations.signum.SomeInternalRepresentationForSignum;

public final class
           FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
extends AbstractInternalRepresentationForWholeNumberAsASequenceOfDigits
{

    
    public FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
    (Integer x)
    {
        super();
        
        super.setInstanceInternalRepresentationForRealNumberAsASequenceOfDigits
        (
        	new FinalInternalRepresentationForRealNumberAsASequenceOfDigits(x)
        );
    }
    
    public FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
    (Double x)
    {
        super();
        
        super.setInstanceInternalRepresentationForRealNumberAsASequenceOfDigits
        (
        	new FinalInternalRepresentationForRealNumberAsASequenceOfDigits(x)
        );
    }


    public FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
    (
		AbstractMutableDigitRepresentation
		argumentMutableDigitRepresentation,
		byte arg_signum
    )
    {
        super();
        // DigitRepresentation has to be cloned to make the class
        // immutable:

        
        setInstanceInternalRepresentationForRealNumberAsASequenceOfDigits
        (
        	new FinalInternalRepresentationForRealNumberAsASequenceOfDigits
        	(
        		argumentMutableDigitRepresentation.clone(),
        		arg_signum
        	)
        );
  
    }


    public FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
    (AbstractInternalRepresentationForWholeNumberAsASequenceOfDigits x)
    {
        super();
        // DigitRepresentation has to be cloned to make the class
        // immutable:

        
        setInstanceInternalRepresentationForRealNumberAsASequenceOfDigits
        (
        	new FinalInternalRepresentationForRealNumberAsASequenceOfDigits
        	(
        		 x
        		.instanceInternalRepresentationForRealNumberAsASequenceOfDigits
        		.instanceMutableDigitRepresentation,
        		(byte)(x.signum_as_FinalInternalRepresentationForSignum().asInt())
        	)
        );
  
    }

    public FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
    (
    AbstractInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits x,
    AbstractInternalRepresentationForSignum signum
    )
    {
        super();
        // DigitRepresentation has to be cloned to make the class
        // immutable:

        
        setInstanceInternalRepresentationForRealNumberAsASequenceOfDigits
        (
        	new FinalInternalRepresentationForRealNumberAsASequenceOfDigits
        	(
        		 x
        		.getInstanceInternalRepresentationForWholeNumberAsASequenceOfDigits()
        		.instanceInternalRepresentationForRealNumberAsASequenceOfDigits
        		.instanceMutableDigitRepresentation,
        		(byte)(signum.asInt())
        	)
        );
  
    }

    public FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
    (
    AbstractInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits x
    )
    {
        super();
        // DigitRepresentation has to be cloned to make the class
        // immutable:

        
        setInstanceInternalRepresentationForRealNumberAsASequenceOfDigits
        (
        	new FinalInternalRepresentationForRealNumberAsASequenceOfDigits
        	(
        		 x
        		.getInstanceInternalRepresentationForWholeNumberAsASequenceOfDigits()
        		.instanceInternalRepresentationForRealNumberAsASequenceOfDigits
        		.instanceMutableDigitRepresentation,
        		(byte)1
        	)
        );
  
    }

	@Override
	public FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
	magnitudeAsPositiveWholeNumber()
	{
		return
			new FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
			(
				 super
				.instanceInternalRepresentationForRealNumberAsASequenceOfDigits
				.instanceMutableDigitRepresentation
			)
		;
	}

	@Override
	public FinalInternalRepresentationForRealNumberAsASequenceOfDigits
	magnitudeAsRealNumber()
	{
		return
			  super
			.instanceInternalRepresentationForRealNumberAsASequenceOfDigits
			.magnitudeAsRealNumber();
	}

	@Override
	public FinalInternalRepresentationForSignum signum_as_FinalInternalRepresentationForSignum()
	{
		return
			  super
			.instanceInternalRepresentationForRealNumberAsASequenceOfDigits
			.signum_as_FinalInternalRepresentationForSignum();
	}

	@Override
	public FinalInternalRepresentationForRealNumberAsASequenceOfDigits
	new__convert_to_FinalInternalRepresentationForRealNumberAsASequenceOfDigits
	()
	{
		return new FinalInternalRepresentationForRealNumberAsASequenceOfDigits
		(
			// casting should always work, since the instance is always created
			// by this class, which should only use
			// FinalInternalRepresentationForRealNumberAsASequenceOfDigits
			(FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
			super.instanceInternalRepresentationForRealNumberAsASequenceOfDigits
		);
			 
	}

	public boolean isPositive()
    {
    	return
    	super
    	.instanceInternalRepresentationForRealNumberAsASequenceOfDigits
    	.isPositive();
    }

    public boolean isPositiveWholeNumber()
    {
    	return this.isPositive();
    }

    public FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
    convertToPositiveWholeNumber()
    {
    	return
    	new FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
    	(
	    	super
	    	.instanceInternalRepresentationForRealNumberAsASequenceOfDigits
	    	.instanceMutableDigitRepresentation
	    	.clone()
    	);
    }
    

    public FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
    plus(FinalInternalRepresentationForWholeNumberAsASequenceOfDigits arg_rep)
    {

    	// TODO transform to FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
    	// - add internal representation immutable
    	// - since the sum of two whole numbers has to be a whole number,
    	//   the result can simply be converted to a whole number
    	//   without checking
    	
    	
    	FinalInternalRepresentationForRealNumberAsASequenceOfDigits
    	x =
    	(FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
    	this.instanceInternalRepresentationForRealNumberAsASequenceOfDigits
    		.plus
    		(
    			arg_rep
    			.instanceInternalRepresentationForRealNumberAsASequenceOfDigits
    		);
    	
    	if (!x.isWholeNumber())
    	{
    		// Should never arrive here, since the sum of two whole numbers
    		// is a whole number. So only if the internal representation of
    		// at least one of the whole numbers is not actually a whole number,
    		// the program would arrive here.
    	}

		return x.convertToWholeNumber();
    	
    }

    

	public FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
	minus(FinalInternalRepresentationForWholeNumberAsASequenceOfDigits arg_rep)
	{
    	// TODO transform to FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
    	// - add internal representation immutable
    	// - since the difference of two whole numbers has to be a whole number,
    	//   the result can simply be converted to a whole number
    	//   without checking
    	
    	
    	FinalInternalRepresentationForRealNumberAsASequenceOfDigits
    	x =
    	(FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
    	this.instanceInternalRepresentationForRealNumberAsASequenceOfDigits
    		.minus
    		(
    			arg_rep
    			.instanceInternalRepresentationForRealNumberAsASequenceOfDigits
    		);
    	
    	if (!x.isWholeNumber())
    	{
    		// Should never arrive here, since the difference between two whole
    		// numbers is a whole number. So only if the internal representation
    		// of at least one of the whole numbers is not actually a whole
    		// number, the program would arrive here.
    	}

		return x.convertToWholeNumber();
	}


	public FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
	times(FinalInternalRepresentationForWholeNumberAsASequenceOfDigits arg_rep)
	{
    	// TODO transform to FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
    	// - add internal representation immutable
    	// - since the product of two whole numbers has to be a whole number,
    	//   the result can simply be converted to a whole number
    	//   without checking
    	
    	
    	FinalInternalRepresentationForRealNumberAsASequenceOfDigits
    	x =
    	(FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
    	this.instanceInternalRepresentationForRealNumberAsASequenceOfDigits
    		.times
    		(
    			arg_rep
    			.instanceInternalRepresentationForRealNumberAsASequenceOfDigits
    		);
    	
    	if (!x.isWholeNumber())
    	{
    		// Should never arrive here, since the difference between two whole
    		// numbers is a whole number. So only if the internal representation
    		// of at least one of the whole numbers is not actually a whole
    		// number, the program would arrive here.
    	}

		return x.convertToWholeNumber();
	}

	public FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
	dividedBy
	(FinalInternalRepresentationForWholeNumberAsASequenceOfDigits x)
	{
    	return new
		FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
		(this,x)
    	;
	}

	@Override
	public String toString()
	{
		return this
			.instanceInternalRepresentationForRealNumberAsASequenceOfDigits
			.toString();
	}

	@Override
	public boolean isZero()
	{
		return
			 super
			.instanceInternalRepresentationForRealNumberAsASequenceOfDigits
			.isZero()
		;
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
        
}
