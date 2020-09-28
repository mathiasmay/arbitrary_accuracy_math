package math.number_representations;

public final class    FinalMutableDigitRepresentation
extends            AbstractMutableDigitRepresentation
{
    private int[] digits;
    private int   index_shift = 0;
    
    public FinalMutableDigitRepresentation()
    {
        super();
        digits = new int[1];
        digits[0] = 0;
    }
    
    public FinalMutableDigitRepresentation(int array_size_to_start_with)
    {
        super();
        digits = new int[array_size_to_start_with];
    }
    
	
    @Override
    public void setToZero()
    {
        digits = new int[1];
        digits[0] = 0;
    }

    @Override
    public void setToZero(int array_size_to_start_with)
    {
        digits = new int[array_size_to_start_with];
        digits[0] = 0;
    }
    
    @Override
    public void setIndexShift(int arg_index_shift)
    {
    	index_shift = arg_index_shift;
    }
    
    @Override
    public int getIndexShift()
    {
    	return index_shift;
    }

    @Override
    public int getDigitFromPower(int power)
    {
        int power_of_first_entry = this.index_shift;
        int power_of_last_entry  = this.index_shift + digits.length -1;
        
        if
        (
                ( power < power_of_first_entry )
            ||
                ( power_of_last_entry < power )
        ) 
        {
            return 0;
        }
        else
        {
            return digits[this.getIndexFromPower(power)];
        }
        
    }

    @Override
    public void setDigitFromPower(int digit, int power)
    {
        int index = getIndexFromPower(power);
        
        if (this.indexIsNotValid(getIndexFromPower(power)))
        {
            if ( index < 0 )
            {
                while (this.indexIsNotValid(getIndexFromPower(power)))
                {
                    this.extendArrayForLowerDigitsByAFactor(2.0f);
                }
            }
            else if ( digits.length <= index )
            {
                while (this.indexIsNotValid(getIndexFromPower(power)))
                {
                    this.extendArrayForHigherDigitsByAFactor(2.0f);
                }
            }
        }
        index = getIndexFromPower(power);
        digits[index] = digit;
    }

    private boolean indexIsNotValid(int index)
    {
        return
        (
                (                   index < 0 )
            ||
                ( digits.length-1 < index     )
        ); 
    }
    
    private void extendArrayForHigherDigitsByAFactor(float factor)
    {
        int[] new_array = new int[(int)(digits.length*factor)];
        
        for ( int i = 0 ;  ; i++  )
        {
            if (    digits.length-1 < i ) {break;}
            if ( new_array.length-1 < i ) {break;}
            
            new_array[i] = digits[i];
        }
        digits = new_array;
    }
    
    private void extendArrayForLowerDigitsByAFactor(float factor)
    {
        int[] new_array = new int[(int)(digits.length*factor)];
        
        int numberOfAdditionalDigits = new_array.length - digits.length;
        
        for ( int i = 0 ;  ; i++  )
        {
            if (    digits.length-1 < i ) {break;}
            if ( new_array.length-1 < i ) {break;}
            
            new_array[i+numberOfAdditionalDigits] = digits[i];
        }
        digits = new_array;
        index_shift -= numberOfAdditionalDigits;
    }
    
    
    private int getIndexFromPower(int power)
    {
        return power - this.index_shift;
    }

    private int getPowerFromIndex(int index)
    {
        return this.index_shift + index;
    }
    
    @Override
    public int getPowerOfHighestDigit()
    {
    	if (this.isZero()) {return 0;};
    	
        int result = this.getPowerFromIndex(0);
        
        for (int i = 0; i <= digits.length-1; i++)
        {
            if ( digits[i] != 0 )
            {
                result = this.getPowerFromIndex(i);
            }
        }
        
        return result;
    }
    
    @Override
    public int getPowerOfLowestDigit()
    {
    	if (this.isZero()) {return 0;};
    	
        int result = this.getPowerFromIndex(0);
        
        for (int i = 0; i <= digits.length-1; i++)
        {
            if ( digits[i] != 0 )
            {
                result = this.getPowerFromIndex(i);
                break;
            }
        }
        
        return result;
    }

    @Override
    public int getMaximumAllowedBasis()
    {
        return Integer.MAX_VALUE;
    }

	@Override
	public AbstractMutableDigitRepresentation clone()
	{
		FinalMutableDigitRepresentation x = new FinalMutableDigitRepresentation();
		
		x.digits      = this.digits.clone();
		x.index_shift = this.index_shift;
		
		return x;
	}
    
	
	public boolean isZero()
	{
		for (int i = 0; i < digits.length; i++)
		{
			if(digits[i]!=0) {return false;}
		}
		return true;
	}
	
	
}
