package math.number_representations.signum;

import java.util.Optional;

import math.number_exceptions.FinalRuntimeExceptionBinaryOperationNotYetImplemented;
import math.number_representations.AbstractInternalRepresentation;
import math.number_representations.positive_whole_number.SomeInternalRepresentationForPositiveWholeNumber;
import math.number_representations.positive_whole_number.sequence_of_digits.FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits;
import math.number_representations.real_number.SomeInternalRepresentationForRealNumber;
import math.number_representations.real_number.sequence_of_digits.FinalInternalRepresentationForRealNumberAsASequenceOfDigits;
import math.number_representations.whole_number.SomeInternalRepresentationForWholeNumber;
import math.number_representations.whole_number.sequence_of_digits.FinalInternalRepresentationForWholeNumberAsASequenceOfDigits;

public abstract class AbstractInternalRepresentationForSignum
extends               AbstractInternalRepresentation
implements SomeInternalRepresentationForSignum
{
	protected byte value = 0;


	@Override
	public FinalInternalRepresentationForRealNumberAsASequenceOfDigits
	new__convert_to_FinalInternalRepresentationForRealNumberAsASequenceOfDigits
	()
	{
		if (0<this.value)
		{
			return new
				FinalInternalRepresentationForRealNumberAsASequenceOfDigits(1);
		}
		else if	(this.value<0)
		{
			return new
				FinalInternalRepresentationForRealNumberAsASequenceOfDigits(-1);
		}
		else
		{
			return new
				FinalInternalRepresentationForRealNumberAsASequenceOfDigits(0);
		}
	}
	
	@Override
	public FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
	magnitudeAsPositiveWholeNumber()
	{
		if (this.value==0)
		{
			return new
			FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
			(0);
		}
		else
		{
			return new
			FinalInternalRepresentationForPositiveWholeNumberAsASequenceOfDigits
			(1);
		}
	}

	@Override
	public FinalInternalRepresentationForRealNumberAsASequenceOfDigits
	magnitudeAsRealNumber()
	{
		if (this.value==0)
		{
			return new
				FinalInternalRepresentationForRealNumberAsASequenceOfDigits(0);
		}
		else
		{
			return new
				FinalInternalRepresentationForRealNumberAsASequenceOfDigits(1);
		}
	}

	@Override
	public FinalInternalRepresentationForSignum signum_as_FinalInternalRepresentationForSignum()
	{
		return new FinalInternalRepresentationForSignum(this.value);
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
	public SomeInternalRepresentationForSignum clone()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(SomeInternalRepresentationForSignum x)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString()
	{
		return toString_as_Value();
	}

	public String toString_as_PrefixSignumSymbol()
	{
		if		(0<value)	{return String.valueOf("+");}
		else if	(value<0)	{return String.valueOf("-");}
		else				{return String.valueOf("");}
	}

	public String toString_as_PrefixSignumSymbol_only_if_negative()
	{
		if		(0<value)	{return String.valueOf("");}
		else if	(value<0)	{return String.valueOf("-");}
		else				{return String.valueOf("");}
	}

	public String toString_as_Value()
	{
		if		(0<value)	{return String.valueOf( 1);}
		else if	(value<0)	{return String.valueOf(-1);}
		else				{return String.valueOf( 0);}
	}

	@Override
	public SomeInternalRepresentationForWholeNumber plus(SomeInternalRepresentationForSignum x)
	{
		return
			SomeInternalRepresentationForWholeNumber.of(this.value+x.asInt());
	}

	@Override
	public SomeInternalRepresentationForWholeNumber minus(SomeInternalRepresentationForSignum x)
	{
		return
			SomeInternalRepresentationForWholeNumber.of(this.value-x.asInt());
	}

	@Override
	public SomeInternalRepresentationForSignum times(SomeInternalRepresentationForSignum x)
	{
		if( this.value==0 || x.asInt()==0 )
		{
			return SomeInternalRepresentationForSignum.of(0);
		}
		else if
		(
			0<this.value && 0<x.asInt()
			||
			this.value<0 && x.asInt()<0
		)
		{
			return SomeInternalRepresentationForSignum.of(1);
		}
		else
		{
			return SomeInternalRepresentationForSignum.of(-1);
		}
	}

	@Override
	public SomeInternalRepresentationForSignum dividedBy(SomeInternalRepresentationForSignum x)
	{
		if( x.asInt() == 0 )
		{
			// TODO other exception
			throw new RuntimeException("Division by 0");
		}
		else if( this.value==0 )
		{
			return SomeInternalRepresentationForSignum.of(0);
		}
		else if
		(
			0<this.value && 0<x.asInt()
			||
			this.value<0 && x.asInt()<0
		)
		{
			return SomeInternalRepresentationForSignum.of(1);
		}
		else
		{
			return SomeInternalRepresentationForSignum.of(-1);
		}
	}


	
	public FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
	plus(FinalInternalRepresentationForSignum x)
	{
		return
			new FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
			(this.value+x.asInt());
	}

	
	public FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
	minus(FinalInternalRepresentationForSignum x)
	{
		return
			new FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
			(this.value-x.asInt());
	}

	
	public FinalInternalRepresentationForSignum
	times(FinalInternalRepresentationForSignum x)
	{
		if( this.value==0 || x.asInt()==0 )
		{
			return new FinalInternalRepresentationForSignum(0);
		}
		else if
		(
			0<this.value && 0<x.asInt()
			||
			this.value<0 && x.asInt()<0
		)
		{
			return new FinalInternalRepresentationForSignum(1);
		}
		else
		{
			return new FinalInternalRepresentationForSignum(-1);
		}
	}

	
	public FinalInternalRepresentationForSignum
	dividedBy(FinalInternalRepresentationForSignum x)
	{
		if( x.asInt() == 0 )
		{
			// TODO other exception
			throw new RuntimeException("Division by 0");
		}
		else if( this.value==0 )
		{
			return new FinalInternalRepresentationForSignum(0);
		}
		else if
		(
			0<this.value && 0<x.asInt()
			||
			this.value<0 && x.asInt()<0
		)
		{
			return new FinalInternalRepresentationForSignum(1);
		}
		else
		{
			return new FinalInternalRepresentationForSignum(-1);
		}
	}

	@Override
	public SomeInternalRepresentationForSignum dividedBy(SomeInternalRepresentationForSignum x, int accuracy)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isZero()
	{
		return value==0;
	}

	@Override
	public boolean isPositive()
	{
		return 0<value;
	}

	@Override
	public boolean isNegative()
	{
		return value<0;
	}

	@Override
	public int asInt()
	{
		return value;
	}





    
}
