package math.numbers.real_number;

import java.util.Optional;

import math.*;

import math.number_representations.real_number.*;

import math.number_representations.real_number.rational_number.FinalInternalRepresentationForRealNumberAsARationalNumber;

import math.numbers.AbstractNumber;

public abstract class AbstractNumberReal
extends AbstractNumber
implements  // Set, whose elements this class represents:
            RealNumber,
            // all known SUPERsets:
            ComplexNumber
{
    private AbstractInternalRepresentationForRealNumber
    instance_InternalRepresentation;

    // Constructor
    public AbstractNumberReal()
    {
        this(0);
    }
    
    // Constructor
    public AbstractNumberReal(Integer x)
    {
        this(new
        FinalInternalRepresentationForRealNumberAsARationalNumber(x));
    }
    
    // Constructor
    public AbstractNumberReal(Double x)
    {
        this(new
        FinalInternalRepresentationForRealNumberAsARationalNumber(x));
    }
    
    // Constructor
    public AbstractNumberReal
    (
            SomeInternalRepresentationForRealNumber
            ArgumentInstanceInternalRepresentationForRealNumber
    )
    {
        this.instance_InternalRepresentation =
        	(AbstractInternalRepresentationForRealNumber)
            ArgumentInstanceInternalRepresentationForRealNumber;
    }
    
//    // Constructor
//    public AbstractNumberReal
//    (
//        Integer x,
//        SomeInternalRepresentationForRealNumber
//            ArgumentInstanceInternalRepresentationForRealNumber
//    )
//    {
//        this.instance_InternalRepresentation =
//        	(AbstractInternalRepresentationForRealNumber)
//            ArgumentInstanceInternalRepresentationForRealNumber;
//        
//        setValueIfPossibleOrThrowException(x);
//    }
//    
//    // Constructor
//    public AbstractNumberReal
//    (
//        Double x,
//        SomeInternalRepresentationForRealNumber
//            ArgumentInstanceInternalRepresentationForRealNumber
//    )
//    {
//        this.instance_InternalRepresentation =
//        	(AbstractInternalRepresentationForRealNumber)
//            ArgumentInstanceInternalRepresentationForRealNumber;
//        
//        setValueIfPossibleOrThrowException(x);
//    }

    @Override
	public AbstractNumberReal clone()
	{
		return
			new FinalRealNumber
			(
					(AbstractInternalRepresentationForRealNumber)
			    	this.instance_InternalRepresentation.clone()
			);
	}

	@Override
    public String toString()
    {
        return this.instance_InternalRepresentation.toString();
    }


    public AbstractInternalRepresentationForRealNumber
    getInternalRepresentation()
    {
        return this.instance_InternalRepresentation;
    }

    @Override
    public Optional<Integer> getValueAsIntegerIfPossible()
    {
        // delegate to Internal Representation
        return
        this.getInternalRepresentation()
            .getValueAsIntegerIfPossible();
    }

    @Override
    public Optional<Double> getValueAsDoubleIfPossible()
    {
        // delegate to Internal Representation
        return
        this.getInternalRepresentation()
            .getValueAsDoubleIfPossible();
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
    public final RealNumber plus(RealNumber x)
    {
        return new FinalRealNumber
        (
                    ((AbstractNumberReal)this).getInternalRepresentation()
            .plus
            (
                    ((AbstractNumberReal)   x).getInternalRepresentation()
            )
        );
    }

    @Override
    public RealNumber minus(RealNumber x)
    {
        return new FinalRealNumber
        (
                    ((AbstractNumberReal)this).getInternalRepresentation()
            .minus
            (
                    ((AbstractNumberReal)   x).getInternalRepresentation()
            )
        );
    }

    @Override
    public RealNumber times(RealNumber x)
    {
        return new FinalRealNumber
        (
                    ((AbstractNumberReal)this).getInternalRepresentation()
            .times
            (
                    ((AbstractNumberReal)   x).getInternalRepresentation()
            )
        );
    }

    @Override
    public RealNumber dividedBy(RealNumber x)
    {
        return new FinalRealNumber
        (
                    ((AbstractNumberReal)this).getInternalRepresentation()
            .dividedBy
            (
                    ((AbstractNumberReal)   x).getInternalRepresentation()
            )
        );
    }

    @Override
    public boolean isEqualTo(RealNumber x)
    {
        return
        (
                    ((AbstractNumberReal)this).getInternalRepresentation()
            .equals
            (
                    ((AbstractNumberReal)   x).getInternalRepresentation()
            )
        );
    }

    @Override
	public boolean isSimilarTo(RealNumber x)
	{
        return
        (
                    ((AbstractNumberReal)this).getInternalRepresentation()
            .isSimilarTo
            (
                    ((AbstractNumberReal)   x).getInternalRepresentation()
            )
        );
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
	public boolean equals(Object obj)
	{
		if (!(obj instanceof SomeNumber)) {return false;}
        // delegate to Internal Representation
        return ((AbstractNumberReal)this)
        		.getInternalRepresentation().equals
        		(
    				((AbstractNumberReal)obj)
    				.getInternalRepresentation()
        		);
	}

    
}
