package math.number_representations.rational_number;

import java.util.Optional;

import math.number_exceptions.FinalRuntimeExceptionSupplierNotYetImplemented;
import math.number_representations.AbstractInternalRepresentation;
import math.number_representations.positive_whole_number.SomeInternalRepresentationForPositiveWholeNumber;
import math.number_representations.rational_number.quotient_of_two_whole_numbers.SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers;
import math.number_representations.real_number.sequence_of_digits.SomeInternalRepresentationForRealNumberAsASequenceOfDigits;
import math.number_representations.signum.SomeInternalRepresentationForSignum;
import math.number_representations.whole_number.SomeInternalRepresentationForWholeNumber;

public abstract class AbstractInternalRepresentationForRationalNumber
extends               AbstractInternalRepresentation
implements            SomeInternalRepresentationForRationalNumber
{


	@Override
	public SomeInternalRepresentationForRationalNumber clone()
	{
        if (this instanceof
        		SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers)
        {

        	return
        		((SomeInternalRepresentationForRationalNumberAsAQuotientOfTwoWholeNumbers)
        		this)
        		.clone()
        	;
        }
        // TODO all other cases
        else
        {
            throw new FinalRuntimeExceptionSupplierNotYetImplemented
            ("clone", this);
        }
	}



    
}
