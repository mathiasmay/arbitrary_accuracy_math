package math.numbers.rational_number;

import java.util.Optional;

import math.*;

import math.number_representations.rational_number.*;
import math.number_representations.rational_number.quotient_of_two_whole_numbers.FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers;
import math.numbers.AbstractNumber;
import math.numbers.real_number.AbstractNumberReal;
import math.numbers.real_number.FinalRealNumber;

public abstract class AbstractNumberRational
extends AbstractNumber
implements  // Set, whose elements this class represents:
            RationalNumber,
            // all known SUPERsets:
            RealNumber, ComplexNumber
{

    private AbstractInternalRepresentationForRationalNumber
    instance_InternalRepresentation;


    // Constructor
    public AbstractNumberRational(Integer x)
    {
    	//TODO
//        this(new
//        FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
//        (x));
    }
    
    // Constructor
    public AbstractNumberRational(Integer numerator, Integer denominator)
    {
      this(new
      FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
      (numerator, denominator));
    }
    
    // Constructor
    public AbstractNumberRational(Double x)
    {
    	// TODO
//        this(new
//		FinalInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers
//		(x));
    }
    
    // Constructor
    public AbstractNumberRational
    (
            SomeInternalRepresentationForRationalNumber
            ArgumentInstanceInternalRepresentationForRationalNumber
    )
    {
        this.instance_InternalRepresentation =
        	(AbstractInternalRepresentationForRationalNumber)
            ArgumentInstanceInternalRepresentationForRationalNumber;
    }
    
//    public final boolean setValueIfPossibleOrReturnFalse(Integer x)
//    {
//        // delegate to Internal Representation
//        return
//            this.getInternalRepresentation()
//                .setValueIfPossibleOrReturnFalse(x);
//    }
//
//
//    
//    public final boolean setValueIfPossibleOrReturnFalse(Double x)
//    {
//        // delegate to Internal Representation
//        return
//            this.getInternalRepresentation()
//                .setValueIfPossibleOrReturnFalse(x);
//    }


    
    public AbstractInternalRepresentationForRationalNumber
    getInternalRepresentation()
    {
        return this.instance_InternalRepresentation;
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
    public PositiveRealNumber getMagnitude()
    {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public ComplexNumber plus(ComplexNumber x)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ComplexNumber minus(ComplexNumber x)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ComplexNumber times(ComplexNumber x)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ComplexNumber dividedBy(ComplexNumber x)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isEqualTo(ComplexNumber x)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasSameRealPartAs(ComplexNumber x)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasBiggerRealPartThan(ComplexNumber x)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasSmallerRealPartThan(ComplexNumber x)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasSameMagnitudeAs(ComplexNumber x)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasBiggerMagnitudeThan(ComplexNumber x)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasSmallerMagnitudeThan(ComplexNumber x)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public RealNumber plus(RealNumber x)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public RealNumber minus(RealNumber x)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public RealNumber times(RealNumber x)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public RealNumber dividedBy(RealNumber x)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isEqualTo(RealNumber x)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
	public boolean isSimilarTo(RealNumber x)
	{
		// TODO Auto-generated method stub
		return false;
	}

    @Override
    public boolean hasSameMagnitudeAs(RealNumber x)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasBiggerMagnitudeThan(RealNumber x)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasSmallerMagnitudeThan(RealNumber x)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
	public String toString()
	{
		return this.instance_InternalRepresentation.toString();
	}

	@Override
    public RationalNumber plus(RationalNumber x)
    {
        return new FinalRationalNumber
        (
                    ((AbstractNumberRational)this).getInternalRepresentation()
            .plus
            (
                    ((AbstractNumberRational)   x).getInternalRepresentation()
            )
        );
    }

    @Override
    public RationalNumber minus(RationalNumber x)
    {
        return new FinalRationalNumber
        (
                    ((AbstractNumberRational)this).getInternalRepresentation()
            .minus
            (
                    ((AbstractNumberRational)   x).getInternalRepresentation()
            )
        );
    }

    @Override
    public RationalNumber times(RationalNumber x)
    {
        return new FinalRationalNumber
        (
                    ((AbstractNumberRational)this).getInternalRepresentation()
            .times
            (
                    ((AbstractNumberRational)   x).getInternalRepresentation()
            )
        );
    }

    @Override
    public RationalNumber dividedBy(RationalNumber x)
    {
        return new FinalRationalNumber
        (
                    ((AbstractNumberRational)this).getInternalRepresentation()
            .dividedBy
            (
                    ((AbstractNumberRational)   x).getInternalRepresentation()
            )
        );
    }

    @Override
    public boolean isEqualTo(RationalNumber x)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasSameRealPartAs(RationalNumber x)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasBiggerRealPartThan(RationalNumber x)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasSmallerRealPartThan(RationalNumber x)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasSameMagnitudeAs(RationalNumber x)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasBiggerMagnitudeThan(RationalNumber x)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasSmallerMagnitudeThan(RationalNumber x)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public SomeNumber plus(SomeNumber x)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public SomeNumber minus(SomeNumber x)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public SomeNumber times(SomeNumber x)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public SomeNumber dividedBy(SomeNumber x)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isEqualTo(SomeNumber x)
    {
        // TODO Auto-generated method stub
        return false;
    }

	@Override
	public Signum getSignum()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isBiggerThan(RealNumber x)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSmallerThan(RealNumber x)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isBiggerThan(RationalNumber x)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSmallerThan(RationalNumber x)
	{
		// TODO Auto-generated method stub
		return false;
	}

    
}
