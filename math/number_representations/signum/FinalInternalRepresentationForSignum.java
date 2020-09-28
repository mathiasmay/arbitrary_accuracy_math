package math.number_representations.signum;

import math.number_representations.real_number.sequence_of_digits.FinalInternalRepresentationForRealNumberAsASequenceOfDigits;

public class FinalInternalRepresentationForSignum
extends AbstractInternalRepresentationForSignum
{
	public FinalInternalRepresentationForSignum(byte value)
	{
		super();
		
		if		(0<value)	{super.value =  1;}
		else if	(value<0)	{super.value = -1;}
		else				{super.value =  0;}
	}
	
	public FinalInternalRepresentationForSignum(int value)
	{
		super();
		
		if		(0<value)	{super.value =  1;}
		else if	(value<0)	{super.value = -1;}
		else				{super.value =  0;}
	}
	
	public FinalInternalRepresentationForSignum
	(FinalInternalRepresentationForSignum x)
	{
		super();
		
		if		(0<x.asInt())	{super.value =  1;}
		else if	(x.asInt()<0)	{super.value = -1;}
		else					{super.value =  0;}
	}
	
	
	
}
