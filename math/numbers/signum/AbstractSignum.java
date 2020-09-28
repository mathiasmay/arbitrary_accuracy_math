package math.numbers.signum;

import java.util.Optional;

import math.*;
import math.number_representations.rational_number.AbstractInternalRepresentationForRationalNumber;
import math.number_representations.signum.AbstractInternalRepresentationForSignum;
import math.number_representations.signum.FinalInternalRepresentationForSignum;
import math.number_representations.signum.SomeInternalRepresentationForSignum;
import math.number_representations.whole_number.AbstractInternalRepresentationForWholeNumber;
import math.number_representations.whole_number.SomeInternalRepresentationForWholeNumber;
import math.numbers.AbstractNumber;
import math.numbers.real_number.AbstractNumberReal;
import math.numbers.real_number.FinalRealNumber;
import math.numbers.whole_number.FinalWholeNumber;

public abstract class AbstractSignum
extends AbstractNumber
implements  // Set, whose elements this class represents:
            Signum,
            // all known SUPERsets:
            WholeNumber, RationalNumber, RealNumber, ComplexNumber
{

    private AbstractInternalRepresentationForSignum
    instance_InternalRepresentation;
    
	public AbstractSignum()
	{
		this(0);
	}
    
	public AbstractSignum(int x)
	{
		instance_InternalRepresentation
			= new FinalInternalRepresentationForSignum(x);
	}
    
    // Constructor
    public AbstractSignum
    (
            SomeInternalRepresentationForSignum
            ArgumentInstanceInternalRepresentationForSignum
    )
    {
        this.instance_InternalRepresentation =
        	(AbstractInternalRepresentationForSignum)
            ArgumentInstanceInternalRepresentationForSignum;
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
    
    public AbstractInternalRepresentationForSignum getInternalRepresentation()
    {
        return instance_InternalRepresentation;
    }

    @Override
	public String toString()
	{
		return instance_InternalRepresentation.toString();
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
    public WholeNumber plus(Signum x)
    {
        return new FinalWholeNumber
        (
                    ((AbstractSignum)this).getInternalRepresentation()
            .plus
            (
                    ((AbstractSignum)   x).getInternalRepresentation()
            )
        );
    }

    @Override
    public WholeNumber minus(Signum x)
    {
        return new FinalWholeNumber
        (
                    ((AbstractSignum)this).getInternalRepresentation()
            .minus
            (
                    ((AbstractSignum)   x).getInternalRepresentation()
            )
        );
    }

    @Override
    public Signum times(Signum x)
    {
        return new FinalSignum
        (
                    ((AbstractSignum)this).getInternalRepresentation()
            .times
            (
                    ((AbstractSignum)   x).getInternalRepresentation()
            )
        );
    }

    @Override
    public Signum dividedBy(Signum x)
    {
        return new FinalSignum
        (
                    ((AbstractSignum)this).getInternalRepresentation()
            .dividedBy
            (
                    ((AbstractSignum)   x).getInternalRepresentation()
            )
        );
    }

    @Override
    public boolean isEqualTo(Signum x)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasSameRealPartAs(Signum x)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasBiggerRealPartThan(Signum x)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasSmallerRealPartThan(Signum x)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasSameMagnitudeAs(Signum x)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasBiggerMagnitudeThan(Signum x)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasSmallerMagnitudeThan(Signum x)
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
	public boolean isBiggerThan(Signum x)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSmallerThan(Signum x)
	{
		// TODO Auto-generated method stub
		return false;
	}

 
}
