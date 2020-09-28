package math.numbers.positive_real_number;

import java.util.Optional;

import math.*;

import math.number_representations.positive_real_number.AbstractInternalRepresentationForPositiveRealNumber;

import math.numbers.AbstractNumber;

public abstract class AbstractNumberRealPositive
extends AbstractNumber
implements  // Set, whose elements this class represents:
            PositiveRealNumber,
            // all known SUPERsets:
            RealNumber, ComplexNumber
{

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
//
//    public final void setValueIfPossibleOrThrowException(Double x)
//    {
//        // delegate to Internal Representation
//        this.getInternalRepresentation()
//            .setValueIfPossibleOrThrowException(x);
//    }
    
    public AbstractInternalRepresentationForPositiveRealNumber
    getInternalRepresentation()
    {
        // TODO Auto-generated method stub
        return null;
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
    public PositiveRealNumber plus(PositiveRealNumber x)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public RealNumber minus(PositiveRealNumber x)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PositiveRealNumber times(PositiveRealNumber x)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PositiveRealNumber dividedBy(PositiveRealNumber x)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isEqualTo(PositiveRealNumber x)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasSameRealPartAs(PositiveRealNumber x)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasBiggerRealPartThan(PositiveRealNumber x)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasSmallerRealPartThan(PositiveRealNumber x)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasSameMagnitudeAs(PositiveRealNumber x)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasBiggerMagnitudeThan(PositiveRealNumber x)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasSmallerMagnitudeThan(PositiveRealNumber x)
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
	public boolean isBiggerThan(PositiveRealNumber x)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSmallerThan(PositiveRealNumber x)
	{
		// TODO Auto-generated method stub
		return false;
	}



}
