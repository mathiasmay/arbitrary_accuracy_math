package math.number_representations.real_number.sequence_of_digits;

import java.util.Optional;

import math.number_representations.AbstractMutableDigitRepresentation;
import math.number_representations.FinalMutableDigitRepresentation;
import math.number_representations.real_number.SomeInternalRepresentationForRealNumber;
import math.number_representations.signum.FinalInternalRepresentationForSignum;
import math.number_representations.signum.SomeInternalRepresentationForSignum;
import math.number_representations.whole_number.sequence_of_digits.FinalInternalRepresentationForWholeNumberAsASequenceOfDigits;

public final class FinalInternalRepresentationForRealNumberAsASequenceOfDigits
extends         AbstractInternalRepresentationForRealNumberAsASequenceOfDigits
{
		private final String three_dots = "…";

		private final String separator_after_whole_number_part = ".";
		private final String separator_each_three_digits = "";
	
	    private final int basis = 10;
	    protected byte signum;
	    
	    int default_accuracy = 30;

	    // TODO make .toString() format dependent on some static enum value
	    
	    public FinalInternalRepresentationForRealNumberAsASequenceOfDigits
	    (
			AbstractMutableDigitRepresentation
			argumentMutableDigitRepresentation,
			byte arg_signum
	    )
	    {
	        super();
	        // DigitRepresentation has to be cloned to make the class
	        // immutable:
	        setInstanceMutableDigitRepresentation
	        (
	        	  argumentMutableDigitRepresentation
	        	  .clone()
	        );
	        this.signum = arg_signum;
	    }
	    
	    public FinalInternalRepresentationForRealNumberAsASequenceOfDigits
	    (
    		FinalInternalRepresentationForRealNumberAsASequenceOfDigits
			internalRepresentationForRealNumberAsASequenceOfDigits
	    )
	    {
	        super();
	        // DigitRepresentation has to be cloned to make the class
	        // immutable:
	        setInstanceMutableDigitRepresentation
	        (
	        	   internalRepresentationForRealNumberAsASequenceOfDigits
	        	  .getInstanceMutableDigitRepresentation()
	        	  .clone()
	        );
	    }
	    
	    public FinalInternalRepresentationForRealNumberAsASequenceOfDigits
	    (Double x)
	    {
	        super();
	        
	        setInstanceMutableDigitRepresentation
	        (
	        	new FinalMutableDigitRepresentation()
	        );
	        
	    	setValueIfPossibleOrReturnFalse(x);
	    	
	        if      (0<x) {this.signum =  1;}
	        else if (x<0) {this.signum = -1;}
	        else          {this.signum =  0;}
	    }

		    
	    public FinalInternalRepresentationForRealNumberAsASequenceOfDigits
	    (Integer x)
	    {
	        super();
	        
	        setInstanceMutableDigitRepresentation
	        (
	        	new FinalMutableDigitRepresentation()
	        );
	        
	    	setValueIfPossibleOrReturnFalse(x);
	        
	        if      (0<x) {this.signum =  1;}
	        else if (x<0) {this.signum = -1;}
	        else          {this.signum =  0;}
	    }
	    
	    public FinalInternalRepresentationForRealNumberAsASequenceOfDigits
	    (int x, int index_shift)
	    {
	        super();
	        
	        setInstanceMutableDigitRepresentation
	        (
	        	new FinalMutableDigitRepresentation()
	        );
	        
	        this.setDigitRepresentation
	        (
	    		getInstanceMutableDigitRepresentation(),
	        	x, index_shift
	        );
	        if      (0<x) {this.signum =  1;}
	        else if (x<0) {this.signum = -1;}
	        else          {this.signum =  0;}
	    }

	    

		@Override
		public FinalInternalRepresentationForRealNumberAsASequenceOfDigits
		magnitudeAsRealNumber()
		{
			return new FinalInternalRepresentationForRealNumberAsASequenceOfDigits
				(super.getInstanceMutableDigitRepresentation(), this.signum);
		}

		@Override
		public FinalInternalRepresentationForSignum signum_as_FinalInternalRepresentationForSignum()
		{
			return new FinalInternalRepresentationForSignum(this.signum);
		}

		@Override
		public FinalInternalRepresentationForRealNumberAsASequenceOfDigits
		new__convert_to_FinalInternalRepresentationForRealNumberAsASequenceOfDigits()
		{
			return this.clone();
		}

		byte getSignum()
		{
			return signum;
		}

		void setSignum(byte signum)
		{
			this.signum = signum;
		}

		public FinalInternalRepresentationForRealNumberAsASequenceOfDigits
		clone()
		{
			FinalInternalRepresentationForRealNumberAsASequenceOfDigits x
			= new FinalInternalRepresentationForRealNumberAsASequenceOfDigits
			(getInstanceMutableDigitRepresentation().clone(),(byte)0);
			
			x.getInstanceMutableDigitRepresentation().setIndexShift
			(x.getInstanceMutableDigitRepresentation().getIndexShift());
			
			
	        if      (          0<this.signum) {x.signum =  1;}
	        else if (this.signum<0          ) {x.signum = -1;}
	        else                              {x.signum =  0;}
	        
			return x;
		}

		
		public FinalInternalRepresentationForRealNumberAsASequenceOfDigits
		dividedBy(FinalInternalRepresentationForRealNumberAsASequenceOfDigits arg_rep)
		{
			return this.dividedBy(arg_rep, default_accuracy);
		}
		
		

		public FinalInternalRepresentationForRealNumberAsASequenceOfDigits
		dividedBy
		(
			FinalInternalRepresentationForRealNumberAsASequenceOfDigits x,
			int accuracy_number_of_digits
		)
		{
        	FinalInternalRepresentationForRealNumberAsASequenceOfDigits
            result
            = new FinalInternalRepresentationForRealNumberAsASequenceOfDigits(1);
            
            result.multiplyBy
            (
        		(FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
            	this
            );
            result.divideBy
            (
                (FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
                x
                ,
                accuracy_number_of_digits
            );
            return result;
		}
		
		public FinalInternalRepresentationForRealNumberAsASequenceOfDigits
		dividedBy_WholePart
		(FinalInternalRepresentationForRealNumberAsASequenceOfDigits x)
		{
        	FinalInternalRepresentationForRealNumberAsASequenceOfDigits
            result = new
            FinalInternalRepresentationForRealNumberAsASequenceOfDigits
            (this);

        	result.divideBy_WholePart
            (
                (FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
                x
            );
            return result;
		}
 
		public boolean equals
		(FinalInternalRepresentationForRealNumberAsASequenceOfDigits arg_rep)
		{
			return this.isEqualTo
			(
				(FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
				arg_rep
			);
		}


	    public int getDigitsAsInt_DigitsDownToCertainPower(int lowest_power)
		{
			int result = 0;
			int power_factor = 1;
			
			int power_min = lowest_power;
			int power_max = getInstanceMutableDigitRepresentation().getPowerOfHighestDigit();
			
			for ( int power = power_min, i=0 ; power<=power_max ; power++, i++ )
			{
				power_factor = 1;
				for (int j = 1; j <= i ; j++)
				{
					power_factor *= basis;
				}
				result += getInstanceMutableDigitRepresentation().getDigitFromPower(power) * power_factor;
			}
			
			return result;
		}

		public boolean isWholeNumber()
		{
			return
				0 <=
				super.instanceMutableDigitRepresentation.getPowerOfLowestDigit()
			;
		}
	    
		public FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
		convertToWholeNumber()
		{
			// TODO if not whole number, throw exception

			FinalMutableDigitRepresentation DigitRepresentation
			= new FinalMutableDigitRepresentation();
			
			int power_min = getInstanceMutableDigitRepresentation()
							.getPowerOfLowestDigit();
			int power_max = getInstanceMutableDigitRepresentation()
							.getPowerOfHighestDigit();
			
			for ( int power = power_min ; power<=power_max ; power++ )
			{
				DigitRepresentation.setDigitFromPower
				(
					getInstanceMutableDigitRepresentation()
					.getDigitFromPower(power)
					,
					power
				);
			}

			
			FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
			result =
			new FinalInternalRepresentationForWholeNumberAsASequenceOfDigits
			(
				DigitRepresentation,
				getSignum()
			);
			
			return result;
		}
	    
	    @Override
	    public Optional<Double> getValueAsDoubleIfPossible()
	    {
	        // TODO implement getValueAsDoubleIfPossible()
	        return null;
	    }

		@Override
	    public Optional<Integer> getValueAsIntegerIfPossible()
	    {
	        // TODO implement getValueAsIntegerIfPossible()
	        return null;
	    }

		public boolean hasBiggerMagnitudeThan
	    (FinalInternalRepresentationForRealNumberAsASequenceOfDigits x)
	    {
	        boolean firstDifferentDigitOfThisWasFound = false;
	        int     powerOfFirstDigitOfThis = 0;
	        
	        boolean firstDifferentDigitOfArgumentWasFound = false;
	        int     powerOfFirstDigitOfArgument = 0;
	        
	        int power_min = Math.min
	        (
	            getInstanceMutableDigitRepresentation().getPowerOfLowestDigit(),
	            x.getInstanceMutableDigitRepresentation().getPowerOfLowestDigit()
	        );
	        int power_max = Math.max
	        (
	            getInstanceMutableDigitRepresentation().getPowerOfHighestDigit(),
	            x.getInstanceMutableDigitRepresentation().getPowerOfHighestDigit()
	        );
	        
	        for ( int power = power_max ; power_min<=power ; power-- )
	        {
	            if
	            (
	                (
	                    getInstanceMutableDigitRepresentation().getDigitFromPower(power)
	                    != 0
	                )
	                &&
	                !firstDifferentDigitOfThisWasFound
	            )
	            {
	                firstDifferentDigitOfThisWasFound = true;
	                powerOfFirstDigitOfThis = power;
	            }

	            if
	            (
	                    (
	                        x.getInstanceMutableDigitRepresentation().getDigitFromPower(power)
	                        != 0
	                    )
	                &&
	                    !firstDifferentDigitOfArgumentWasFound
	            )
	            {
	                firstDifferentDigitOfArgumentWasFound = true;
	                powerOfFirstDigitOfArgument = power;
	            }

	            if
	            (
	                firstDifferentDigitOfThisWasFound
	                &&
	                firstDifferentDigitOfArgumentWasFound
	            )
	            {
	                if
	                (
	                        x.getInstanceMutableDigitRepresentation()
	                        .getDigitFromPower(powerOfFirstDigitOfArgument)
	                    <
	                        getInstanceMutableDigitRepresentation()
	                        .getDigitFromPower(powerOfFirstDigitOfThis)
	                )
	                {
	                    return true;
	                }
	                else if
	                (
	                        getInstanceMutableDigitRepresentation()
	                        .getDigitFromPower(powerOfFirstDigitOfThis)
	                    <
	                        x.getInstanceMutableDigitRepresentation()
	                        .getDigitFromPower(powerOfFirstDigitOfArgument)
	                )
	                {
	                    return false;
	                }
	                else
	                {
	                    firstDifferentDigitOfThisWasFound     = false;
	                    firstDifferentDigitOfArgumentWasFound = false;
	                }
	            }
	            else if
	            (
	                firstDifferentDigitOfThisWasFound
	                &&
	                !firstDifferentDigitOfArgumentWasFound
	            )
	            {
	                return true;
	            }
	            else if
	            (
	                !firstDifferentDigitOfThisWasFound
	                &&
	                firstDifferentDigitOfArgumentWasFound
	            )
	            {
	                return false;
	            }
	        }
	        
	        return false;
	    }

	


		public boolean hasSameFirstDigitsAs
		(SomeInternalRepresentationForRealNumberAsASequenceOfDigits arg_rep,
		int number_of_digits_to_check)
		{
			int number_of_digits_already_checked = 0;
			
	        int power_min = Math.min
	        (
	            getInstanceMutableDigitRepresentation().getPowerOfLowestDigit(),
	            (
	            	(FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
	            	arg_rep
	            ).getInstanceMutableDigitRepresentation().getPowerOfLowestDigit()
	        );
	        int power_max = Math.max
	        (
	            getInstanceMutableDigitRepresentation().getPowerOfHighestDigit(),
	            (
	            	(FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
	            	arg_rep
	            ).getInstanceMutableDigitRepresentation().getPowerOfHighestDigit()
	        );
	        
	        for ( int power = power_max ; power_min<=power ; power-- )
	        {
	        	if
	        	(
	    			(
		            	(FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
		            	arg_rep
		            ).getInstanceMutableDigitRepresentation().getDigitFromPower(power)
	        		!=
	        		getInstanceMutableDigitRepresentation().getDigitFromPower(power)
	        	)
	        	{
	        		return false;
	        	}
	        	
	        	number_of_digits_already_checked++;
	        	
	        	if (number_of_digits_already_checked==number_of_digits_to_check)
	        	{break;}
	        }
			
			return true;
		}



		public boolean hasSameMagnitudeAs
		(FinalInternalRepresentationForRealNumberAsASequenceOfDigits arg_rep)
		{
	        int power_min = Math.min
	        (
	            getInstanceMutableDigitRepresentation().getPowerOfLowestDigit(),
	            (
	            	(FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
	            	arg_rep
	            ).getInstanceMutableDigitRepresentation().getPowerOfLowestDigit()
	        );
	        int power_max = Math.max
	        (
	            getInstanceMutableDigitRepresentation().getPowerOfHighestDigit(),
	            (
	            	(FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
	            	arg_rep
	            ).getInstanceMutableDigitRepresentation().getPowerOfHighestDigit()
	        );
	        
	        for ( int power = power_max ; power_min<=power ; power-- )
	        {
	        	if
	        	(
	    			(
		            	(FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
		            	arg_rep
		            ).getInstanceMutableDigitRepresentation().getDigitFromPower(power)
	        		!=
	        		getInstanceMutableDigitRepresentation().getDigitFromPower(power)
	        	)
	        	{
	        		return false;
	        	}
	        }
			
			return true;
		}

		
		public boolean hasSmallerMagnitudeThan
		(FinalInternalRepresentationForRealNumberAsASequenceOfDigits x)
		{
			// TODO implement hasSmallerMagnitudeThan
			return false;
		}


		
		public boolean isBiggerThan
		(FinalInternalRepresentationForRealNumberAsASequenceOfDigits x)
		{
			// TODO implement isBiggerThan()
			return false;
		}

		public boolean isEqualTo
		(FinalInternalRepresentationForRealNumberAsASequenceOfDigits arg_rep)
		{
			if
			(
				this.signum != arg_rep.signum
				||
				!this.hasSameMagnitudeAs(arg_rep)
			)
			{
				return false;
			}
			
			return true;
		}



		
		public boolean isSimilarTo
		(FinalInternalRepresentationForRealNumberAsASequenceOfDigits x)
		{
			FinalInternalRepresentationForRealNumberAsASequenceOfDigits
			relative_difference = this.minus(x).dividedBy(this.plus(x));
			
			FinalInternalRepresentationForRealNumberAsASequenceOfDigits
			limit = new
			FinalInternalRepresentationForRealNumberAsASequenceOfDigits
			(0.1);
			
			boolean condition
			= limit.hasBiggerMagnitudeThan(relative_difference);
			
			return
					this.signum
					==
					((FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
					x).signum
				&&
					condition
			;
		}


		
		@Override
		public boolean isZero()
		{
			return super.getInstanceMutableDigitRepresentation().isZero();
		}
		
		public boolean isPositive()
		{
			return this.signum == 1;
		}
		
		public boolean isNegative()
		{
			return this.signum == -1;
		}

		public boolean isSmallerThan
		(FinalInternalRepresentationForRealNumberAsASequenceOfDigits x)
		{
			// TODO implement isSmallerThan
			return false;
		}
	    
	    // standard method, thus not final
	    public FinalInternalRepresentationForRealNumberAsASequenceOfDigits
	    minus(FinalInternalRepresentationForRealNumberAsASequenceOfDigits arg_rep)
	    {
	        	FinalInternalRepresentationForRealNumberAsASequenceOfDigits
	            result = new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(0);
	            
	            result.add(this);
	            result.subtract(arg_rep);
	            return result;
	        
	    }


	    // standard method, thus not final
	    public FinalInternalRepresentationForRealNumberAsASequenceOfDigits
	    plus(FinalInternalRepresentationForRealNumberAsASequenceOfDigits arg_rep)
	    {
        	FinalInternalRepresentationForRealNumberAsASequenceOfDigits
            result = new
            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(0);
            
            result.add(arg_rep);
            result.add(this);
            return result;
	        
	    }


		public void roundToCertainPower(int power) 
		{
			//int power_min = this.getPowerOfLowestDigit();
			int power_max = getInstanceMutableDigitRepresentation().getPowerOfHighestDigit();
			
			if (power==power_max) {return;}
			
			if ( getInstanceMutableDigitRepresentation().getDigitFromPower(power)<basis/2 )
			{
				getInstanceMutableDigitRepresentation().setDigitFromPower(0, power);
			}
			else 
			{
				if (1<=this.signum) 
				{
					this.add
					(
						new
						FinalInternalRepresentationForRealNumberAsASequenceOfDigits
						(
							basis
							-
							getInstanceMutableDigitRepresentation()
								.getDigitFromPower(power)
							,
							power
						)
					);
				}
				else
				{
					this.subtract
					(
						new
						FinalInternalRepresentationForRealNumberAsASequenceOfDigits
						(
							basis
							-
							getInstanceMutableDigitRepresentation()
								.getDigitFromPower(power)
							,
							power
						)
					);
				}
			}
		}

	    private boolean setValueIfPossibleOrReturnFalse(Double x)
	    {
	    	double remaining = Math.abs(x);
	    	int digit = 0;
	    	

	        if      (0<x) {this.signum =  1;}
	        else if (x<0) {this.signum = -1;}
	        else
	        {
	            this.signum =  0;
	            getInstanceMutableDigitRepresentation().setToZero();
	            return true;
	        }

	    	int current_power
	    	= (int)
	    	Math.floor
	    	(
	    		Math.log
	    		(
	    			Math.abs(remaining)
	    		)
	    		/
	    		Math.log(basis)
	    	);
	    	
	    	while( x+remaining != x)
	    	{
		    	digit = (int)
		    	(
		    		remaining
		    		/
		    		Math.pow
		    		(
		    			(double)basis, (double)current_power
		    		)
		    	);
		    	
		    	// if remaining is small compared to x,
		    	// negative digits can occur due to calculation errors.
		    	// So: A quick and dirty solution:
		    	if (digit<0){break;}
		    	

		    	getInstanceMutableDigitRepresentation()
		    	.setDigitFromPower(digit, current_power);
		    	
		    	remaining -= digit * Math.pow(basis, current_power);
		    	current_power--;
	    	}
	    	
	        return true;
	    }
	    
	    private boolean setValueIfPossibleOrReturnFalse(Integer x)
	    {
	        long sum_of_digits = 0;
	        long carry_over    = 0;
	        

	        if      (0<x) {this.signum =  1;}
	        else if (x<0) {this.signum = -1;}
	        else
	        {
	            this.signum =  0;
	            getInstanceMutableDigitRepresentation().setToZero();
	            return true;
	        }
	        
	        this.setDigitRepresentation(getInstanceMutableDigitRepresentation() ,x, 0);
	        
	        return true;
	    }

	    
	    public FinalInternalRepresentationForRealNumberAsASequenceOfDigits
	    times(FinalInternalRepresentationForRealNumberAsASequenceOfDigits arg_rep)
	    {
	        	FinalInternalRepresentationForRealNumberAsASequenceOfDigits
	            result = new
	            FinalInternalRepresentationForRealNumberAsASequenceOfDigits(1);
	            
	            result.multiplyBy(this);
	            result.multiplyBy(arg_rep);
	            return result;
	    }


	    @Override
	    public String toString()
	    {
	    	return toStringConvenient();
	    	//return toStringDecimalAllDigits(); 
	    	//return toStringDecimalScientificNotationExponentFirstAllDigits();
	    }

	    public String toStringConvenient()
	    {
	    	int limit = 7;
	    	
	        int power_min
	        = getInstanceMutableDigitRepresentation().getPowerOfLowestDigit();
	        int power_max
	        = getInstanceMutableDigitRepresentation().getPowerOfHighestDigit();
	        
	    	if
	    	(
	    		(power_max-power_min) < limit
	    	)
	    	{
	    		return toStringDecimalAllDigits();
	    	}
	    	else if
    		(
    			power_max <= limit-1
    			&&
    			-limit <= power_max
    		)
	    	{
	    		return toStringDecimal(limit);
	    	}
	    	else
	    	{
	    		return toStringDecimalScientificNotation(limit);
	    	}
	    }

	    public String toStringDecimalAllDigits()
	    {
	        int power_min
	        = getInstanceMutableDigitRepresentation().getPowerOfLowestDigit();
	        int power_max
	        = getInstanceMutableDigitRepresentation().getPowerOfHighestDigit();
	        
	        if (power_max<0) {power_max=0;} 
	        if (0<power_min) {power_min=0;} 
	        
	        String result = "";
	        
	        if (signum < 0) result += "-";
	        
	        for (int power = power_max; power_min <= power; power--)
	        {
	            result += getInstanceMutableDigitRepresentation()
	            		  .getDigitFromPower(power);
	            if (power != power_min)
	            {
		            if      (power == 0) {result += separator_after_whole_number_part;}
		            else if (power%3==0) {result += separator_each_three_digits;}
	            }
	        }
	        
	        return result;
	    }

	    public String toStringDecimal
	    (int number_of_digits)
	    {
	        int power_max
	        = getInstanceMutableDigitRepresentation().getPowerOfHighestDigit();
	        int power_min
	        = Math.max
	        (
        		getInstanceMutableDigitRepresentation().getPowerOfLowestDigit(),
        		power_max - number_of_digits + 1
	        );
	        
	        if (power_max<0) {power_max=0;} 
	        if (0<power_min) {power_min=0;} 
	        
	        String result = "";
	        
	        if (signum < 0) result += "-";
	        
	        int power = power_max;
	        
	        for ( ; power_min <= power; power--)
	        {
	            result += getInstanceMutableDigitRepresentation()
	            	     .getDigitFromPower(power);
	            if (power != power_min)
	            {
		            if      (power == 0) {result += separator_after_whole_number_part;}
		            else if (power%3 == 0) {result += separator_each_three_digits;}
		            //else if (power%3==0) {result += " ";}
	            }
	        }
	        
	        if
	        (
	        	(power == -1)
	        	&&
	        	(
	        		getInstanceMutableDigitRepresentation()
	        			.getPowerOfLowestDigit()
	        		!=
	        		0
	        	)
	        )
	        {
	        	result += ".";
	            //result += getInstanceMutableDigitRepresentation()
	            //	     .getDigitFromPower(power);
	        }
	        
	        if (power < 0) {result += three_dots;}
	        
	        return result;
	    }

	    public String toStringDecimalScientificNotationAllDigits()
	    {
	        int power_min
	        = getInstanceMutableDigitRepresentation().getPowerOfLowestDigit();
	        int power_max
	        = getInstanceMutableDigitRepresentation().getPowerOfHighestDigit();
	        
	        String result = "";
	        
	        if (signum < 0) result += "-";
	        
	        for (int power = power_max; power_min <= power; power--)
	        {
	            result += getInstanceMutableDigitRepresentation().getDigitFromPower(power);
	            if (power != power_min)
	            {
		            if      (power               == power_max) {result += separator_after_whole_number_part;}
		            else if ((power-power_max)%3 == 0)         {result += separator_each_three_digits;}
	            }
	        }


        	result += "e" + power_max;

	        
	        return result;
	    }

	    public String toStringDecimalScientificNotationExponentFirstAllDigits()
	    {
	        int power_min
	        = getInstanceMutableDigitRepresentation().getPowerOfLowestDigit();
	        int power_max
	        = getInstanceMutableDigitRepresentation().getPowerOfHighestDigit();
	        
	        String result = "";
	        
	        if (signum < 0) result += "-";
	        
	        result += "(" + orderOfMagnitudeToString(power_max) + ")*";
	        
	        for (int power = power_max; power_min <= power; power--)
	        {
	            result += getInstanceMutableDigitRepresentation().getDigitFromPower(power);
	            if (power != power_min)
	            {
		            if      (power               == power_max) {result += separator_after_whole_number_part;}
		            else if ((power-power_max)%3 == 0)         {result += separator_each_three_digits;}
	            }
	        }


	        
	        return result;
	    }

	    public String toStringDecimalScientificNotation
	    (int number_of_digits)
	    {
	        int power_max
	        = getInstanceMutableDigitRepresentation().getPowerOfHighestDigit();
	        int power_min
	        = Math.max
	        (
        		getInstanceMutableDigitRepresentation().getPowerOfLowestDigit(),
        		power_max - number_of_digits + 1
	        );
	        
	        String result = "";
	        
	        if (signum < 0) result += "-";
	        
	        int power = power_max;
	        
	        for ( ; power_min <= power; power--)
	        {
	            result += getInstanceMutableDigitRepresentation().getDigitFromPower(power);
	            if (power != power_min)
	            {
		            if      (power               == power_max) {result += separator_after_whole_number_part;}
		            else if ((power-power_max)%3 == 0)         {result += separator_each_three_digits;}
	            }
	        }

	        if (power < 0) {result += three_dots;}

        	result += "*" + orderOfMagnitudeToString(power_max);

	        
	        return result;
	    }
	    
	    private String orderOfMagnitudeToString(int power)
	    {
	    	return basis + "^" + power;
	    	//return "e" + power;
	    }

	    private void add
	    (final FinalInternalRepresentationForRealNumberAsASequenceOfDigits x)
	    {
	        if
	        (
	                ( 0 < this.signum ) && ( 0 <= x.signum )
	            ||
	                ( this.signum < 0 ) && ( x.signum <= 0 )
	        ) 
	        {
	            // e.g.  5+3= 8
	            // e.g.  3+5= 8
	            // e.g. -5+(-3)=-8
	            // e.g. -3+(-5)=-8

	            // Signum stays the same
	            this.add_OnlyMagnitudes(x);
	        }
	        else if
	        (
	            this.signum == 0
	        ) 
	        {
	            // e.g. 0+3=3
	            // e.g. 0+(-3)=-3
	            // e.g. 0+0=0
	            
	            this.signum = x.signum;
	            this.add_OnlyMagnitudes(x);
	        }
	        else
	        {
	            boolean thisHasBiggerMagnitudeThanArgument =
	                this.hasBiggerMagnitudeThan(x);
	            
	            if
	            (
	                ( 0 < this.signum ) && ( x.signum < 0 )
	            )
	            {
					if( this.hasSameMagnitudeAs(x) )
					{
						// e.g. +5 + -5 = 0
						this.signum = 0;
						getInstanceMutableDigitRepresentation().setToZero();
					}
					else
					{
		                if (thisHasBiggerMagnitudeThanArgument) 
		                {
		                    // e.g. 5-3=2
		                    signum = 1;
		                    this.subtract_SmallerMagnitudeFromBiggerMagnitude(x);
		                }
		                else 
		                {
		                    // e.g. 3-5=-2
		                    signum = -1;
		                    this.subtract_BiggerMagnitudeFromSmallerMagnitude(x);
		                }
					}
	            }
	            else if
	            (
	                ( this.signum < 0 ) && ( 0 < x.signum )
	            )
	            {
					if( this.hasSameMagnitudeAs(x) )
					{
						// e.g. -5 + +5 = 0
						this.signum = 0;
						getInstanceMutableDigitRepresentation().setToZero();
					}
					else
					{
		                if (thisHasBiggerMagnitudeThanArgument) 
		                {
		                    // e.g. -5+3=-2
		                    signum = -1;
		                    this.subtract_SmallerMagnitudeFromBiggerMagnitude(x);
		                }
		                else 
		                {
		                    // e.g. -3+5=2
		                    signum = 1;
		                    this.subtract_BiggerMagnitudeFromSmallerMagnitude(x);
		                }
					}
	            }
	        }
	    }


	    private void add_OnlyMagnitudes
	    (FinalInternalRepresentationForRealNumberAsASequenceOfDigits x)
	    {
	        long sum_of_digits = 0;
	        long carry_over    = 0;
	        
	        int power_min = Math.min
	        (
	            getInstanceMutableDigitRepresentation().getPowerOfLowestDigit(),
	            x.getInstanceMutableDigitRepresentation().getPowerOfLowestDigit()
	        );
	        int power_max = Math.max
	        (
	            getInstanceMutableDigitRepresentation().getPowerOfHighestDigit(),
	            x.getInstanceMutableDigitRepresentation().getPowerOfHighestDigit()
	            
	        );

	        for ( int power = power_min ; power<=power_max ; power++ )
	        {
	            sum_of_digits = carry_over;
	            
	            sum_of_digits +=
	                getInstanceMutableDigitRepresentation().getDigitFromPower(power);
	            sum_of_digits +=
	                x.getInstanceMutableDigitRepresentation().getDigitFromPower(power);
	            
	            getInstanceMutableDigitRepresentation().setDigitFromPower
	            ( (int)(sum_of_digits % basis), power );
	            
	            carry_over = (int)
	            (
	                (
	                    sum_of_digits
	                    -
	                    getInstanceMutableDigitRepresentation().getDigitFromPower(power)
	                )
	                /
	                basis
	            );
	            
	            if ( (carry_over!=0) && (power_max<=power) ) {power_max++;}
	        }
	        
	    }
	    

	    private void divideBy
		(FinalInternalRepresentationForRealNumberAsASequenceOfDigits x,
		int accuracy_number_of_digits)
		{
			if(x.getInstanceMutableDigitRepresentation().isZero())
			{throw new IllegalArgumentException("\ndividing by 0 is not defined");}
			
			if(getInstanceMutableDigitRepresentation().isZero())
			{getInstanceMutableDigitRepresentation().setToZero();return;}
			
			FinalInternalRepresentationForRealNumberAsASequenceOfDigits
				result = new
				FinalInternalRepresentationForRealNumberAsASequenceOfDigits(0,0);
			FinalInternalRepresentationForRealNumberAsASequenceOfDigits
				summand_for_result = new
				FinalInternalRepresentationForRealNumberAsASequenceOfDigits(0,0);
			FinalInternalRepresentationForRealNumberAsASequenceOfDigits
				to_subtract_from_this = new
				FinalInternalRepresentationForRealNumberAsASequenceOfDigits(0,0);
			FinalInternalRepresentationForRealNumberAsASequenceOfDigits
				to_add_to_this = new
				FinalInternalRepresentationForRealNumberAsASequenceOfDigits(0,0);
			FinalInternalRepresentationForRealNumberAsASequenceOfDigits
				positive_x =
					(FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
					x.clone();
			
			positive_x.signum = 1;
			
			boolean first_non_zero_digit_found = false;
			
			byte resulting_signum = (byte)(this.signum * x.signum);
			this.signum = 1;
			
			
			int power_min_this
			= getInstanceMutableDigitRepresentation().getPowerOfLowestDigit();
			int power_max_this
			= getInstanceMutableDigitRepresentation().getPowerOfHighestDigit();
//			int power_min_x
//			= x.InstanceDigitRepresentation.getPowerOfLowestDigit();
			int power_max_x
			= x.getInstanceMutableDigitRepresentation().getPowerOfHighestDigit();
			
			//int factor_divident = 0;
			int factor_divisor
			= x.getInstanceMutableDigitRepresentation().getDigitFromPower(power_max_x);
			
			int factor = 1;
			
			int digits_from_this_up_to_current_power = 0;
			
			int digit_counter = 0;
			int power_this = power_max_this;
			
			for
			(
					
				;
					digit_counter < accuracy_number_of_digits+1
				;
					power_this--
			)
			{
				digits_from_this_up_to_current_power =
				(
					this.getDigitsAsInt_DigitsDownToCertainPower(power_this)
				);
				
				//if (digits_from_this_up_to_current_power==0) {break;}
				
				factor = digits_from_this_up_to_current_power / factor_divisor;
				
				if( first_non_zero_digit_found )
				{
					digit_counter+=1;
				}
				else 
				{
					if(factor!=0)
					{
						first_non_zero_digit_found = true;
						digit_counter+=1;
					}
				}
				
				summand_for_result
				= new FinalInternalRepresentationForRealNumberAsASequenceOfDigits
				(factor,power_this-power_max_x);
				
				result.add(summand_for_result);
				
				to_subtract_from_this =
					(FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
					summand_for_result.clone();
				to_subtract_from_this.multiplyBy(positive_x);
				
				this.subtract(to_subtract_from_this);
				
				while ( this.signum < 0 )
				{
					result.subtract(
					new FinalInternalRepresentationForRealNumberAsASequenceOfDigits
					(1,power_this-power_max_x));
					
					to_add_to_this =
						(FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
						positive_x.clone();
					
					to_add_to_this.multiplyBy(
					new FinalInternalRepresentationForRealNumberAsASequenceOfDigits
					(1,power_this-power_max_x));
					
					this.add(to_add_to_this);
				}
			}
			
//			this.digits  = result.digits;
//			this.signum *= resulting_signum;
//			this.index_shift = result.index_shift;
			setInstanceMutableDigitRepresentation(result.getInstanceMutableDigitRepresentation());
			this.signum = resulting_signum;
			
			this.roundToCertainPower(power_this-power_max_x+1);
		}
	    

	    private void divideBy_WholePart
		(FinalInternalRepresentationForRealNumberAsASequenceOfDigits x)
		{
			if(x.getInstanceMutableDigitRepresentation().isZero())
			{throw new IllegalArgumentException("\ndividing by 0 is not defined");}
			
			if(getInstanceMutableDigitRepresentation().isZero())
			{getInstanceMutableDigitRepresentation().setToZero();return;}
			
			FinalInternalRepresentationForRealNumberAsASequenceOfDigits
				result = new
				FinalInternalRepresentationForRealNumberAsASequenceOfDigits(0,0);
			FinalInternalRepresentationForRealNumberAsASequenceOfDigits
				summand_for_result = new
				FinalInternalRepresentationForRealNumberAsASequenceOfDigits(0,0);
			FinalInternalRepresentationForRealNumberAsASequenceOfDigits
				to_subtract_from_this = new
				FinalInternalRepresentationForRealNumberAsASequenceOfDigits(0,0);
			FinalInternalRepresentationForRealNumberAsASequenceOfDigits
				to_add_to_this = new
				FinalInternalRepresentationForRealNumberAsASequenceOfDigits(0,0);
			FinalInternalRepresentationForRealNumberAsASequenceOfDigits
				positive_x =
					(FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
					x.clone();
			
			positive_x.signum = 1;
			
			boolean first_non_zero_digit_found = false;
			
			byte resulting_signum = (byte)(this.signum * x.signum);
			this.signum = 1;
			
			
			int power_min_this
			= getInstanceMutableDigitRepresentation().getPowerOfLowestDigit();
			int power_max_this
			= getInstanceMutableDigitRepresentation().getPowerOfHighestDigit();
//			int power_min_x
//			= x.InstanceDigitRepresentation.getPowerOfLowestDigit();
			int power_max_x
			= x.getInstanceMutableDigitRepresentation().getPowerOfHighestDigit();
			
			//int factor_divident = 0;
			int factor_divisor
			= x.getInstanceMutableDigitRepresentation().getDigitFromPower(power_max_x);
			
			int factor = 1;
			
			int digits_from_this_up_to_current_power = 0;
			
			int digit_counter = 0;
			int power_this = power_max_this;
			
			for
			(
					
				;
					0 <= power_this
					//digit_counter < accuracy_number_of_digits+1
				;
					power_this--
			)
			{
				digits_from_this_up_to_current_power =
				(
					this.getDigitsAsInt_DigitsDownToCertainPower(power_this)
				);
				
				//if (digits_from_this_up_to_current_power==0) {break;}
				
				factor = digits_from_this_up_to_current_power / factor_divisor;
				
				if( first_non_zero_digit_found )
				{
					digit_counter+=1;
				}
				else 
				{
					if(factor!=0)
					{
						first_non_zero_digit_found = true;
						digit_counter+=1;
					}
				}
				
				summand_for_result
				= new FinalInternalRepresentationForRealNumberAsASequenceOfDigits
				(factor,power_this-power_max_x);
				
				result.add(summand_for_result);
				
				to_subtract_from_this =
					(FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
					summand_for_result.clone();
				to_subtract_from_this.multiplyBy(positive_x);
				
				this.subtract(to_subtract_from_this);
				
				while ( this.signum < 0 )
				{
					result.subtract(
					new FinalInternalRepresentationForRealNumberAsASequenceOfDigits
					(1,power_this-power_max_x));
					
					to_add_to_this =
						(FinalInternalRepresentationForRealNumberAsASequenceOfDigits)
						positive_x.clone();
					
					to_add_to_this.multiplyBy(
					new FinalInternalRepresentationForRealNumberAsASequenceOfDigits
					(1,power_this-power_max_x));
					
					this.add(to_add_to_this);
				}
			}
			
//			this.digits  = result.digits;
//			this.signum *= resulting_signum;
//			this.index_shift = result.index_shift;
			setInstanceMutableDigitRepresentation(result.getInstanceMutableDigitRepresentation());
			this.signum = resulting_signum;
			
			this.roundToCertainPower(power_this-power_max_x+1);
		}
	    

	    private void
		multiplyBy(FinalInternalRepresentationForRealNumberAsASequenceOfDigits x)
		{
	    	FinalInternalRepresentationForRealNumberAsASequenceOfDigits result
			= new FinalInternalRepresentationForRealNumberAsASequenceOfDigits(0);
			
			int power_min_this
				= getInstanceMutableDigitRepresentation().getPowerOfLowestDigit();
			int power_max_this
				= getInstanceMutableDigitRepresentation().getPowerOfHighestDigit();
			int power_min_x
				= x.getInstanceMutableDigitRepresentation().getPowerOfLowestDigit();
			int power_max_x
				= x.getInstanceMutableDigitRepresentation().getPowerOfHighestDigit();
			
			
			for (int power_this = power_min_this; power_this <= power_max_this; power_this++)
			{
				for (int power_x = power_min_x; power_x <= power_max_x; power_x++)
				{
					FinalInternalRepresentationForRealNumberAsASequenceOfDigits
					y = new
					FinalInternalRepresentationForRealNumberAsASequenceOfDigits
						(
							(int)
							(
								(long)(getInstanceMutableDigitRepresentation()
										   .getDigitFromPower(power_this))
								*
								(long)(x.getInstanceMutableDigitRepresentation()
								        .getDigitFromPower(power_x))
							)
							,
								power_this + power_x
						);
					result.add
					(
						y
					);
				}
			}
			
			//this.digits  = result.digits;
			setInstanceMutableDigitRepresentation(result.getInstanceMutableDigitRepresentation());
			this.signum *= x.signum;
			//this.InstanceDigitRepresentation
			//    .setIndexShift(result.InstanceDigitRepresentation.getIndexShift());
			
		}


		private void setDigitRepresentation
	    (
	    	AbstractMutableDigitRepresentation argDigitRepresentation,
	    	int x, int arg_index_shift
	    )
	    {
	        long sum_of_digits = 0;
	        long carry_over    = 0;
	        
	        
	        carry_over = Math.abs(x);
	        
	        for ( int power = 0 ; carry_over!=0 ; power++ ) 
	        {
	            sum_of_digits = carry_over;
	            
	            
	            argDigitRepresentation.setDigitFromPower
	            ( (int)(sum_of_digits % basis), power );
	            
	            carry_over = (long)
	            (
	                (
	                    sum_of_digits
	                    -
	                    argDigitRepresentation.getDigitFromPower(power)
	                )
	                /
	                basis
	            );
	        }
	        
	        argDigitRepresentation.setIndexShift(arg_index_shift);

//	        if      (0<x) {this.signum =  1;}
//	        else if (x<0) {this.signum = -1;}
//	        else          {this.signum =  0;}
	    }
	    
	    // TODO implement Iterator to go through all relevant digits
		// maybe with transformation to any basis
		
		private void setValueFromLongAndIndexShift(long x, int arg_indexshift)
	    {

	        long sum_of_digits = 0;
	        long carry_over    = 0;
	        

	        if      (0<x) {this.signum =  1;}
	        else if (x<0) {this.signum = -1;}
	        else
	        {
	            this.signum =  0;
	            getInstanceMutableDigitRepresentation().setToZero();
	            return;
	        }
	         
	        carry_over = Math.abs(x);
	        
	        for ( int power = 0 ; carry_over!=0 ; power++ ) 
	        {
	            sum_of_digits = carry_over;
	            
	            
	            getInstanceMutableDigitRepresentation().setDigitFromPower
	            ( (int)(sum_of_digits % basis), power );
	            
	            carry_over = (long)
	            (
	                (
	                    sum_of_digits
	                    -
	                    getInstanceMutableDigitRepresentation().getDigitFromPower(power)
	                )
	                /
	                basis
	            );
	        }
	        getInstanceMutableDigitRepresentation().setIndexShift(arg_indexshift);
	    }

		private void
		subtract(FinalInternalRepresentationForRealNumberAsASequenceOfDigits x)
		{
			if
			(
					( 0 < this.signum ) && ( x.signum <= 0 )
				||
					( this.signum < 0 ) && ( 0 <= x.signum )
			) 
			{
				// e.g.  5 - -3 = 8
				// e.g.  3 - -5 = 8
				// e.g. -5 -  3 =-8
				// e.g. -3 -  5 =-8

				// Signum stays the same
				this.add_OnlyMagnitudes(x);
			}
			else if
			(
				this.signum == 0
			) 
			{
				// e.g. 0 - +3 = -3
				// e.g. 0 - -3 = +3
				// e.g. 0 -  0 =  0
				
				this.signum = (byte)(-x.signum);
				this.add_OnlyMagnitudes(x);
			}
			else
			{
				boolean thisHasBiggerMagnitudeThanArgument = this.hasBiggerMagnitudeThan(x);
				
				if
				(
					( 0 < this.signum ) && ( 0 < x.signum )
				)
				{
					if( this.hasSameMagnitudeAs(x) )
					{
						// e.g. +5 - +5 = 0
						this.signum = 0;
						getInstanceMutableDigitRepresentation().setToZero();
					}
					else
					{
						if (thisHasBiggerMagnitudeThanArgument) 
						{
							// e.g. +5 - +3 = +2
							signum = 1;
							this.subtract_SmallerMagnitudeFromBiggerMagnitude(x);
						}
						else 
						{
							// e.g. +3 - +5 = -2 
							signum = -1;
							this.subtract_BiggerMagnitudeFromSmallerMagnitude(x);
							//if (this.isZero()) {this.signum=0;}
						}
					}
				}
				else if
				(
					( this.signum < 0 ) && ( x.signum < 0 )
				)
				{
					if( this.hasSameMagnitudeAs(x) )
					{
						// e.g. +5 - +5 = 0
						this.signum = 0;
						getInstanceMutableDigitRepresentation().setToZero();
					}
					else
					{
						if (thisHasBiggerMagnitudeThanArgument) 
						{
							// e.g. -5 - -3 = -2
							signum = -1;
							this.subtract_SmallerMagnitudeFromBiggerMagnitude(x);
						}
						else 
						{
							// e.g. -3 - -5 = 2
							signum = 1;
							this.subtract_BiggerMagnitudeFromSmallerMagnitude(x);
							//if (this.isZero()) {this.signum=0;}
						}
					}
				}
			}
		}

		private void subtract_BiggerMagnitudeFromSmallerMagnitude
	    (FinalInternalRepresentationForRealNumberAsASequenceOfDigits x) 
	    {
	        // e.g. 3-5
	        // x is bigger than digits 
	        // x minus digits

	        long difference_of_digits = 0;
	        
	        int carry_over    = 0;

	        int power_min = Math.min
	        (
	            getInstanceMutableDigitRepresentation().getPowerOfLowestDigit(),
	            x.getInstanceMutableDigitRepresentation().getPowerOfLowestDigit()
	        );
	        int power_max = Math.max
	        (
	            getInstanceMutableDigitRepresentation().getPowerOfHighestDigit(),
	            x.getInstanceMutableDigitRepresentation().getPowerOfHighestDigit()
	        );

	        for ( int power = power_min ; power<=power_max ; power++ )
	        {
	            difference_of_digits = carry_over;
	            
	            difference_of_digits -=
	                getInstanceMutableDigitRepresentation().getDigitFromPower(power);
	            difference_of_digits +=
	                x.getInstanceMutableDigitRepresentation().getDigitFromPower(power);

	            getInstanceMutableDigitRepresentation().setDigitFromPower
	            (
	                (int)(difference_of_digits % basis),
	                power
	            );
	            
	            if ( getInstanceMutableDigitRepresentation().getDigitFromPower(power) < 0 )
	            {
	                getInstanceMutableDigitRepresentation().setDigitFromPower
	                (
	                    getInstanceMutableDigitRepresentation().getDigitFromPower(power)
	                    + basis,
	                    power
	                );
	            }
	            
	            carry_over = (int)
	            (
	                (
	                    difference_of_digits
	                    -
	                    getInstanceMutableDigitRepresentation().getDigitFromPower(power)
	                )
	                /
	                basis
	            );
	            
	            if ( (carry_over!=0) && (power_max<=power) ) {power_max++;}
	        }
	        
	    }


		private void subtract_SmallerMagnitudeFromBiggerMagnitude
	    (FinalInternalRepresentationForRealNumberAsASequenceOfDigits x) 
	    {
	        // e.g. 5-3
	        // digits is bigger than x
	        // digits minus x
	        
	        long difference_of_digits = 0;
	        
	        int carry_over    = 0;

	        int power_min = Math.min
	        (
	            getInstanceMutableDigitRepresentation().getPowerOfLowestDigit(),
	            x.getInstanceMutableDigitRepresentation().getPowerOfLowestDigit()
	        );
	        int power_max = Math.max
	        (
	            getInstanceMutableDigitRepresentation().getPowerOfHighestDigit(),
	            x.getInstanceMutableDigitRepresentation().getPowerOfHighestDigit()
	        );
	        
	        for ( int power = power_min ; power<=power_max ; power++ )
	        {
	            difference_of_digits = carry_over;
	            
	            difference_of_digits +=
	                getInstanceMutableDigitRepresentation().getDigitFromPower(power);
	            difference_of_digits -=
	                x.getInstanceMutableDigitRepresentation().getDigitFromPower(power);

	            getInstanceMutableDigitRepresentation().setDigitFromPower
	            ( (int)(difference_of_digits % basis), power );
	            if ( getInstanceMutableDigitRepresentation().getDigitFromPower(power) < 0 )
	            {
	                getInstanceMutableDigitRepresentation().setDigitFromPower
	                (
	                    getInstanceMutableDigitRepresentation().getDigitFromPower(power)
	                    + basis,
	                    power
	                );
	            }
	            
	            carry_over = (int)
	            (
	                (
	                    difference_of_digits
	                    -
	                    getInstanceMutableDigitRepresentation().getDigitFromPower(power))
	                /
	                basis
	            );
	            
	            if ( (carry_over!=0) && (power_max<=power) ) {power_max++;}
	        }
	    }

	    
	    

    
}
