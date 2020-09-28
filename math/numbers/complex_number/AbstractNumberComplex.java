package math.numbers.complex_number;

import java.util.Optional;

import math.*;

import math.number_representations.complex_number.AbstractInternalRepresentationForComplexNumber;

import math.numbers.AbstractNumber;

public abstract class AbstractNumberComplex
extends AbstractNumber
implements  // Set, whose elements this class represents:
            ComplexNumber
            // all known SUPERsets:
            // (no SUPERsets known)
{


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


    
    public AbstractInternalRepresentationForComplexNumber
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



}
