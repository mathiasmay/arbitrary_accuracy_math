package math.number_representations.real_number.rational_number;

import java.util.Optional;

import math.number_representations.real_number.SomeInternalRepresentationForRealNumber;
import math.number_representations.real_number.sequence_of_digits.FinalInternalRepresentationForRealNumberAsASequenceOfDigits;
import math.number_representations.signum.FinalInternalRepresentationForSignum;
import math.number_representations.signum.SomeInternalRepresentationForSignum;

public final class
FinalInternalRepresentationForRealNumberAsARationalNumber
extends
AbstractInternalRepresentationForRealNumberAsARationalNumber
{

    
    public FinalInternalRepresentationForRealNumberAsARationalNumber
    (Integer x)
    {
    	//TODO
    }
    
    public FinalInternalRepresentationForRealNumberAsARationalNumber
    (Double x)
    {

    	//TODO
    }
    
//    @Override
//    public boolean setValueIfPossibleOrReturnFalse(Integer x)
//    {
//        // TODO Auto-generated method stub
//        return false;
//    }

    @Override
    public Optional<Integer> getValueAsIntegerIfPossible()
    {
        // TODO Auto-generated method stub
        return null;
    }

//    @Override
//    public boolean setValueIfPossibleOrReturnFalse(Double x)
//    {
//        // TODO Auto-generated method stub
//        return false;
//    }

    @Override
	public FinalInternalRepresentationForRealNumberAsASequenceOfDigits
	magnitudeAsRealNumber()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FinalInternalRepresentationForSignum signum_as_FinalInternalRepresentationForSignum()
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
	public boolean equals(Object obj)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSimilarTo(SomeInternalRepresentationForRealNumber x)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isZero()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isPositive()
	{
		// TODO Auto-generated method stub
		return false;
	}


}
