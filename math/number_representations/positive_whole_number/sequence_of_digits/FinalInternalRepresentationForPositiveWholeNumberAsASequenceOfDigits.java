package math.number_representations.positive_whole_number.sequence_of_digits;

import java.util.Optional;

import math.number_exceptions.FinalRuntimeExceptionResultIsNotInTheSet;
import math.number_representations.AbstractMutableDigitRepresentation;
import math.number_representations.positive_rational_number.quotient_of_two_positive_whole_numbers.FinalInternalRepresentationForPositiveRationalNumberAsAQuotientOfTwoPositiveWholeNumbers;
import math.number_representations.positive_whole_number.SomeInternalRepresentationForPositiveWholeNumber;
import math.number_representations.rational_number.quotient_of_two_whole_numbers.FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers;
import math.number_representations.real_number.SomeInternalRepresentationForRealNumber;
import math.number_representations.real_number.sequence_of_digits.FinalInternalRepresentationForRealNumberAsASequenceOfDigits;
import math.number_representations.signum.FinalInternalRepresentationForSignum;
import math.number_representations.signum.SomeInternalRepresentationForSignum;
import math.number_representations.whole_number.sequence_of_digits.FinalInternalRepresentationForWholeNumberAsASequenceOfDigits;

public final class
           FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
extends AbstractInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
{

    
    public FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
    (Integer x)
    {
        super();

        // TODO check, if x is positive
        
        super
        .instanceInternalRepresentationForWholeNumberAsASequenceOfDigits
        =
        new FinalInternalRepresentationForWholeNumberAsASequenceOfDigits(x);
    }
    
    public FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
    (Double x)
    {
        super();

        // TODO check, if x is positive

        super
        .instanceInternalRepresentationForWholeNumberAsASequenceOfDigits
        =
        new FinalInternalRepresentationForWholeNumberAsASequenceOfDigits(x);
    }


    public FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
    (
		AbstractMutableDigitRepresentation
		argumentMutableDigitRepresentation
    )
    {
        super();
        // DigitRepresentation has to be cloned to make the class
        // immutable:

        super
        .instanceInternalRepresentationForWholeNumberAsASequenceOfDigits
        =
        new FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
        (
        		argumentMutableDigitRepresentation,
        		(byte)1
        );
  
    }


    public FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
    (
    	FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits x
    )
    {
        this
        (
        	 x
        	.getInstanceInternalRepresentationForWholeNumberAsASequenceOfDigits()
        	.getInstanceInternalRepresentationForRealNumberAsASequenceOfDigits()
        	.getInstanceMutableDigitRepresentation()
        );
    }



    // ------------------------------------------------------------------------
    
    

	@Override
	public FinalInternalRepresentationForRealNumberAsASequenceOfDigits
	new__convert_to_FinalInternalRepresentationForRealNumberAsASequenceOfDigits
	()
	{
		return
		super
		.instanceInternalRepresentationForWholeNumberAsASequenceOfDigits
		.new__convert_to_FinalInternalRepresentationForRealNumberAsASequenceOfDigits();
	}
    

    @Override
	public FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
	magnitudeAsPositiveWholeNumber()
	{
		return
			 super
			.instanceInternalRepresentationForWholeNumberAsASequenceOfDigits
			.magnitudeAsPositiveWholeNumber()
		;
	}

	@Override
	public FinalInternalRepresentationForRealNumberAsASequenceOfDigits
	magnitudeAsRealNumber()
	{
		return
			 super
			.instanceInternalRepresentationForWholeNumberAsASequenceOfDigits
			.magnitudeAsRealNumber();
	}

	@Override
	public FinalInternalRepresentationForSignum signum_as_FinalInternalRepresentationForSignum()
	{
		return new FinalInternalRepresentationForSignum(1);
	}

	public FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
    plus(FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits arg_rep)
    {

    	// TODO transform to FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
    	// - add internal representation immutable
    	// - since the sum of two whole numbers has to be a whole number,
    	//   the result can simply be converted to a whole number
    	//   without checking
    	
    	
    	FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
    	x =
    	(FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
    	this
    	.instanceInternalRepresentationForWholeNumberAsASequenceOfDigits
    		.plus
    		(
    			arg_rep
    	    	.instanceInternalRepresentationForWholeNumberAsASequenceOfDigits
    		);
    	
    	if (!x.isPositiveWholeNumber())
    	{
    		// Should never arrive here, since the sum of two whole numbers
    		// is a whole number. So only if the internal representation of
    		// at least one of the whole numbers is not actually a whole number,
    		// the program would arrive here.
    	}

		return x.convertToPositiveWholeNumber();
    	
    }



	public FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
	minus(FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits arg_rep)
	{
    	// TODO transform to FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
    	// - add internal representation immutable
    	// - since the difference of two whole numbers has to be a whole number,
    	//   the result can simply be converted to a whole number
    	//   without checking
    	

//    	FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
//    	x =
		return
    	(FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
    	this
    	.instanceInternalRepresentationForWholeNumberAsASequenceOfDigits
    		.minus
    		(
    			arg_rep
    			.instanceInternalRepresentationForWholeNumberAsASequenceOfDigits
    		);
    	
//    	if (!x.isPositiveWholeNumber())
//    	{
//    		throw new FinalRuntimeExceptionResultIsNotInTheSet
//    		("minus", "PositiveWholeNumber", this, arg_rep);
//    	}

//		return x;
	}


	public FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
	times(FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits arg_rep)
	{
    	// TODO transform to FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
    	// - add internal representation immutable
    	// - since the product of two whole numbers has to be a whole number,
    	//   the result can simply be converted to a whole number
    	//   without checking
    	

    	FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
    	x =
    	(FinalInternalRepresentationForWholeNumberAsASequenceOfDigits)
    	this
    	.instanceInternalRepresentationForWholeNumberAsASequenceOfDigits
    		.times
    		(
    			arg_rep
    			.instanceInternalRepresentationForWholeNumberAsASequenceOfDigits
    		);
    	
//    	if (!x.isPositiveWholeNumber())
//    	{
//    		// Should never arrive here, since the product of two whole
//    		// numbers is a whole number. So only if the internal representation
//    		// of at least one of the whole numbers is not actually a whole
//    		// number, the program would arrive here.
//    	}

		return x.convertToPositiveWholeNumber();
	}

	public FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
	dividedBy
	(FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits x)
	{
    	// TODO 
		return new
		FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
		(this,x)
		;
	}

	@Override
	public String toString()
	{
		return this
			.instanceInternalRepresentationForWholeNumberAsASequenceOfDigits
			.toString();
	}

	@Override
	public boolean isZero()
	{
		return
			 super
			.instanceInternalRepresentationForWholeNumberAsASequenceOfDigits
			.isZero();
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
