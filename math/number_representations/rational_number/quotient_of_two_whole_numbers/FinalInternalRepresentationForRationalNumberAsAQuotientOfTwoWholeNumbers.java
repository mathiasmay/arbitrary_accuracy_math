package math.number_representations.rational_number.quotient_of_two_whole_numbers;

import java.util.Optional;

import math.number_representations.AbstractMutableDigitRepresentation;
import math.number_representations.positive_whole_number.sequence_of_digits.FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits;
import math.number_representations.rational_number.AbstractInternalRepresentationForRationalNumber;
import math.number_representations.signum.FinalInternalRepresentationForSignum;
import math.number_representations.signum.SomeInternalRepresentationForSignum;
import math.number_representations.whole_number.SomeInternalRepresentationForWholeNumber;
import math.number_representations.whole_number.sequence_of_digits.FinalInternalRepresentationForWholeNumberAsASequenceOfDigits;

public final class
FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
extends
AbstractInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
{

    
    public
    FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
    (Integer x)
    {
        super();
        
        super.numerator = new
        FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
        (Math.abs(x));
        
        super.denominator = new
        FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
        (1);
        
        super.signum = new
        FinalInternalRepresentationForSignum
        ((int)(Math.signum(x)));
    }
    
    public
    FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
    (Integer numerator, Integer denominator)
    {
        super();
        
        // TODO denominator == 0
        
        super.numerator = new
        FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
        (Math.abs(numerator));
        
        super.denominator = new
        FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
        (Math.abs(denominator));
        
        super.signum = new
        FinalInternalRepresentationForSignum
        ((int)(Math.signum(((double)numerator)/((double)denominator))));
    }
    
    public
    FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
    (
	    FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
	    	numerator,
    	FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
	    	denominator,
	    FinalInternalRepresentationForSignum
	    	signum
    )
    {
        super();
        
        // TODO denominator == 0
        
        super.numerator = new
        FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
        (numerator);
        
        super.denominator = new
        FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
        (denominator);
        
        super.signum = new FinalInternalRepresentationForSignum(signum);
    }
    
    public
    FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
    (
	    FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
	    	numerator,
    	FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
	    	denominator
    )
    {
        super();
        
        // TODO denominator == 0
        
        super.numerator = new
        FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
        (numerator.magnitudeAsPositiveWholeNumber());
        
        super.denominator = new
        FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
        (denominator.magnitudeAsPositiveWholeNumber());
        
        super.signum = numerator.signum_as_FinalInternalRepresentationForSignum() .dividedBy (denominator.signum_as_FinalInternalRepresentationForSignum());
    }
    
    public
    FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
    (
	    FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
	    	numerator,
    	FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
	    	denominator
    )
    {
        super();
        
        // TODO denominator == 0
        
        super.numerator = new
        FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
        (numerator);
        
        super.denominator = new
        FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
        (denominator);
        
        super.signum = new FinalInternalRepresentationForSignum(1);
    }
    
    public FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
    (Double x)
    {
        super();
        // TODO
//        super
//        .instanceInternalRepresentationForWholeNumberAsASequenceOfDigitsNumerator
//        = new FinalInternalRepresentationForWholeNumberAsASequenceOfDigits();
//        
//        super
//        .instanceInternalRepresentationForWholeNumberAsASequenceOfDigitsDenominator
//        = new FinalInternalRepresentationForWholeNumberAsASequenceOfDigits();
    }


    public FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
    (
		AbstractMutableDigitRepresentation
		argumentMutableDigitRepresentation,
		byte arg_signum
    )
    {
        super();
        // DigitRepresentation has to be cloned to make the class
        // immutable:

        // TODO
//        setInstanceInternalRepresentationForRealNumberAsASequenceOfDigits
//        (
//        	new FinalInternalRepresentationForRealNumberAsASequenceOfDigits
//        	(
//        		argumentMutableDigitRepresentation.clone(),
//        		arg_signum
//        	)
//        );
  
    }

	
	@Override
	public FinalInternalRepresentationForSignum signum_as_FinalInternalRepresentationForSignum()
	{
		return new FinalInternalRepresentationForSignum(this.signum.asInt());
	}

	public
	FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
	plus
	(FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers x)
	{
		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
		this_signed_numerator = new
		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
		(
			this.numerator,
			this.signum
		);
		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
		this_signed_denominator = new
		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
		(
			this.denominator
		);
		
		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
		x_signed_numerator = new
		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
		(
			x.numerator,
			x.signum
		);
		
		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
		x_signed_denominator = new
		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
		(
			x.denominator
		);
		
		
		
		
		
		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
		numerator = new
		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
		(
					(this_signed_numerator.times(x_signed_denominator))
				.plus
					(this_signed_denominator.times(x_signed_numerator))
		);

		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
		denominator = new
		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
		(
			(this_signed_denominator) .times (x_signed_denominator)
		);

		FinalInternalRepresentationForSignum
		signum = new
		FinalInternalRepresentationForSignum
		(
			( numerator.signum_as_FinalInternalRepresentationForSignum() ) .dividedBy ( denominator.signum_as_FinalInternalRepresentationForSignum() )
		);
		
		FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
		y = new
		FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
		(
			numerator.magnitudeAsPositiveWholeNumber(),
			denominator.magnitudeAsPositiveWholeNumber(),
			signum
		);
		
		return y;
		
	}

	
	public
	FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
	minus
	(FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers x)
	{
		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
		this_signed_numerator = new
		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
		(
			this.numerator,
			this.signum
		);
		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
		this_signed_denominator = new
		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
		(
			this.denominator
		);
		
		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
		x_signed_numerator = new
		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
		(
			x.numerator,
			x.signum
		);
		
		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
		x_signed_denominator = new
		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
		(
			x.denominator
		);
		
		
		
		
		
		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
		numerator = new
		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
		(
					(this_signed_numerator.times(x_signed_denominator))
				.minus
					(this_signed_denominator.times(x_signed_numerator))
		);

		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
		denominator = new
		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
		(
			(this_signed_denominator) .times (x_signed_denominator)
		);

		FinalInternalRepresentationForSignum
		signum = new
		FinalInternalRepresentationForSignum
		(
			( numerator.signum_as_FinalInternalRepresentationForSignum() ) .dividedBy ( denominator.signum_as_FinalInternalRepresentationForSignum() )
		);
		
		FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
		y = new
		FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
		(
			numerator.magnitudeAsPositiveWholeNumber(),
			denominator.magnitudeAsPositiveWholeNumber(),
			signum
		);
		
		return y;
	}

	
	public
	FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
	times
	(FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers x)
	{
		FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
		numerator = new
		FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
		(
			 (x.numerator) .times (this.numerator)
			.magnitudeAsPositiveWholeNumber()
		);

		FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
		denominator = new
		FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
		(
			(x.denominator) .times (this.denominator)
			.magnitudeAsPositiveWholeNumber()
		);

		FinalInternalRepresentationForSignum
		signum = new
		FinalInternalRepresentationForSignum
		(
			( this.signum_as_FinalInternalRepresentationForSignum() ) .times ( x.signum_as_FinalInternalRepresentationForSignum() )
		);
		
		FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
		y = new
		FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
		(
			numerator,
			denominator,
			signum
		);
		
		return y;
	}

	public
	FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
	dividedBy
	(FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers x)
	{
		if( x.isZero() )
		{
			throw new RuntimeException("dividing by 0");
		}
		
		FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
		numerator = new
		FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
		(
			 (this.numerator) .times (x.denominator)
			.magnitudeAsPositiveWholeNumber()
		);

		FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
		denominator = new
		FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
		(
			(this.denominator) .times (x.numerator)
			.magnitudeAsPositiveWholeNumber()
		);

		FinalInternalRepresentationForSignum
		signum = new
		FinalInternalRepresentationForSignum
		(
			( this.signum_as_FinalInternalRepresentationForSignum() ) .times ( x.signum_as_FinalInternalRepresentationForSignum() )
		);
		
		FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
		y = new
		FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
		(
			numerator,
			denominator,
			signum
		);
		
		if(numerator.isZero())
		{
			return new
			FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
			(0);
		}
		else
		{
			return y;
		}
	}


	@Override
	public boolean isZero()
	{
		return super.numerator.isZero();
	}

	private void reduce_Fraction()
	{
//		FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
//		numerator =
//		(FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
//		super.numerator;
//		
//		FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
//		denominator =
//		(FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits)
//		super.denominator;
		
		// TODO
		
//		numerator.dividedBy_WholePart(denominator);
		
//		this.wholePart();
//		this.remainder();
	}
	
    

}
