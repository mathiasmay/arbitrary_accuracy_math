package math.numbers.whole_number;

import java.util.Optional;

import math.*;

import math.number_representations.whole_number.*;
import math.number_representations.whole_number.sequence_of_digits.FinalInternalRepresentationForWholeNumberAsASequenceOfDigits;

import math.numbers.AbstractNumber;
import math.numbers.rational_number.FinalRationalNumber;

public abstract class AbstractNumberWhole
extends AbstractNumber
implements  // Set, whose elements this class represents:
            WholeNumber,
            // all known SUPERsets:
            RationalNumber, RealNumber, ComplexNumber
{


    private AbstractInternalRepresentationForWholeNumber
    instance_InternalRepresentation;

    // Constructor
    public AbstractNumberWhole()
    {
        this(0);
    }
    
    // Constructor
    public AbstractNumberWhole(Integer x)
    {
        this(new
        FinalInternalRepresentationForWholeNumberAsASequenceOfDigits(x));
    }
    
    // Constructor
    public AbstractNumberWhole(Double x)
    {
        this(new
		FinalInternalRepresentationForWholeNumberAsASequenceOfDigits(x));
    }
    
    // Constructor
    public AbstractNumberWhole
    (
            SomeInternalRepresentationForWholeNumber
            ArgumentInstanceInternalRepresentationForWholeNumber
    )
    {
        this.instance_InternalRepresentation =
        	(AbstractInternalRepresentationForWholeNumber)
            ArgumentInstanceInternalRepresentationForWholeNumber;
    }
    
//    public final boolean setValueIfPossibleOrReturnFalse(Integer x)
//    {
//        // delegate to Internal Representation
//        return
//            this.getInternalRepresentation()
//                .setValueIfPossibleOrReturnFalse(x);
//    }

//    public final void setValueIfPossibleOrThrowException(Integer x)
//    {
//        // delegate to Internal Representation
//        this.getInternalRepresentation()
//            .setValueIfPossibleOrThrowException(x);
//    }
    
//    public final boolean setValueIfPossibleOrReturnFalse(Double x)
//    {
//        // delegate to Internal Representation
//        return
//            this.getInternalRepresentation()
//                .setValueIfPossibleOrReturnFalse(x);
//    }

//    public final void setValueIfPossibleOrThrowException(Double x)
//    {
//        // delegate to Internal Representation
//        this.getInternalRepresentation()
//            .setValueIfPossibleOrThrowException(x);
//    }

    @Override
	public String toString()
	{
        return this.instance_InternalRepresentation.toString();
	}

	public AbstractInternalRepresentationForWholeNumber
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
    public RationalNumber plus(RationalNumber x)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public RationalNumber minus(RationalNumber x)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public RationalNumber times(RationalNumber x)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public RationalNumber dividedBy(RationalNumber x)
    {
        // TODO Auto-generated method stub
        return null;
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

//    @Override
//    public WholeNumber plus(WholeNumber x)
//    {
//    	return this.instance_InternalRepresentation.plus(x);
//    }


    @Override
    public final WholeNumber plus(WholeNumber x)
    {
        return new FinalWholeNumber
        (
                    ((AbstractNumberWhole)this).getInternalRepresentation()
            .plus
            (
                    ((AbstractNumberWhole)   x).getInternalRepresentation()
            )
        );
    }
    
    @Override
    public WholeNumber minus(WholeNumber x)
    {
        return new FinalWholeNumber
        (
                    ((AbstractNumberWhole)this).getInternalRepresentation()
            .minus
            (
                    ((AbstractNumberWhole)   x).getInternalRepresentation()
            )
        );
    }

    @Override
    public WholeNumber times(WholeNumber x)
    {
        return new FinalWholeNumber
        (
                    ((AbstractNumberWhole)this).getInternalRepresentation()
            .times
            (
                    ((AbstractNumberWhole)   x).getInternalRepresentation()
            )
        );
    }

    @Override
    public RationalNumber dividedBy(WholeNumber x)
    {
        return new FinalRationalNumber
        (
                    ((AbstractNumberWhole)this).getInternalRepresentation()
            .dividedBy
            (
                    ((AbstractNumberWhole)   x).getInternalRepresentation()
            )
        );
    }

    @Override
    public boolean isEqualTo(WholeNumber x)
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

	@Override
	public boolean isBiggerThan(WholeNumber x)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSmallerThan(WholeNumber x)
	{
		// TODO Auto-generated method stub
		return false;
	}

    
}
