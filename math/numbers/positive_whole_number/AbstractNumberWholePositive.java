package math.numbers.positive_whole_number;

import java.util.Optional;

import math.*;

import math.number_representations.positive_whole_number.*;

import math.number_representations.positive_whole_number.sequence_of_digits.FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits;

import math.numbers.AbstractNumber;
import math.numbers.rational_number.FinalRationalNumber;
import math.numbers.whole_number.*;

public abstract class AbstractNumberWholePositive
extends AbstractNumber
implements  // Set, whose elements this class represents:
            PositiveWholeNumber,
            // all known SUPERsets:
            WholeNumber, RationalNumber, RealNumber, ComplexNumber
{

    private AbstractInternalRepresentationForPositiveWholeNumber
    instance_InternalRepresentation;

    // Constructor
    public AbstractNumberWholePositive()
    {
        this(0);
    }
    
    // Constructor
    public AbstractNumberWholePositive(Integer x)
    {
        this(new
        FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits(x));
    }
    
    // Constructor
    public AbstractNumberWholePositive(Double x)
    {
        this(new
		FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits(x));
    }
    
    // Constructor
    public AbstractNumberWholePositive
    (
            SomeInternalRepresentationForPositiveWholeNumber
            ArgumentInstanceInternalRepresentationForPositiveWholeNumber
    )
    {
        this.instance_InternalRepresentation =
        	(AbstractInternalRepresentationForPositiveWholeNumber)
            ArgumentInstanceInternalRepresentationForPositiveWholeNumber;
    }
    

    @Override
	public String toString()
	{
        return this.instance_InternalRepresentation.toString();
	}
	
    public final AbstractInternalRepresentationForPositiveWholeNumber
    getInternalRepresentation()
    {
        return instance_InternalRepresentation;
    }
    
    @Override
    public final Optional<Integer> getValueAsIntegerIfPossible()
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

    @Override
    public WholeNumber plus(WholeNumber x)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public WholeNumber minus(WholeNumber x)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public WholeNumber times(WholeNumber x)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public RationalNumber dividedBy(WholeNumber x)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isEqualTo(WholeNumber x)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public PositiveWholeNumber plus(PositiveWholeNumber x)
    {
        return new FinalPositiveWholeNumber
        (
                    ((AbstractNumberWholePositive)this).getInternalRepresentation()
            .plus
            (
                    ((AbstractNumberWholePositive)   x).getInternalRepresentation()
            )
        );
    }

    @Override
    public WholeNumber minus(PositiveWholeNumber x)
    {
    	// TODO return FinalPositiveWholeNumber or FinalWholeNumber
    	// depending on the signum
        return new FinalWholeNumber
        (
                    ((AbstractNumberWholePositive)this).getInternalRepresentation()
            .minus
            (
                    ((AbstractNumberWholePositive)   x).getInternalRepresentation()
            )
        );
    }

    @Override
    public PositiveWholeNumber times(PositiveWholeNumber x)
    {
        return new FinalPositiveWholeNumber
        (
                    ((AbstractNumberWholePositive)this).getInternalRepresentation()
            .times
            (
                    ((AbstractNumberWholePositive)   x).getInternalRepresentation()
            )
        );
    }

    @Override
    public RationalNumber dividedBy(PositiveWholeNumber x)
    {
        return new FinalRationalNumber
        (
                    ((AbstractNumberWholePositive)this).getInternalRepresentation()
            .dividedBy
            (
                    ((AbstractNumberWholePositive)   x).getInternalRepresentation()
            )
        );
    }

    @Override
    public boolean isEqualTo(PositiveWholeNumber x)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasSameRealPartAs(PositiveWholeNumber x)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasBiggerRealPartThan(PositiveWholeNumber x)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasSmallerRealPartThan(PositiveWholeNumber x)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasSameMagnitudeAs(PositiveWholeNumber x)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasBiggerMagnitudeThan(PositiveWholeNumber x)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasSmallerMagnitudeThan(PositiveWholeNumber x)
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

	@Override
	public boolean isBiggerThan(PositiveWholeNumber x)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSmallerThan(PositiveWholeNumber x)
	{
		// TODO Auto-generated method stub
		return false;
	}


}
