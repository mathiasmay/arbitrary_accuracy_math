import math.*;
import math.number_representations.FinalMutableDigitRepresentation;
import math.numbers.positive_whole_number.FinalPositiveWholeNumber;
import math.numbers.rational_number.FinalRationalNumber;
import math.numbers.signum.FinalSignum;
import math.numbers.whole_number.FinalWholeNumber;

import static math.StaticNumberFactory.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DemoArbitraryAccuracyMath
{

	
    public static void main(String[] args)
    {
        RealNumber x1 = RealNumber.of
           	(1.0, RealNumber.InternalRepresentation.SEQUENCE_OF_DIGITS);
        RealNumber x2 = RealNumber.of
           	(7  , RealNumber.InternalRepresentation.SEQUENCE_OF_DIGITS);
        
        RealNumber x3;
        
        x3 = x1.plus(x2);
        
        System.out.println(x1 + " + " + x2 + " = " + x3);
        System.out.println("");
        
        x3 = x1.minus(x2);

        System.out.println(x1 + " - " + x2 + " = " + x3);
        System.out.println("");
        
        x3 = x1.times(x2);

        System.out.println(x1 + " * " + x2 + " = " + x3);
        System.out.println("");
        
        x3 = x1.dividedBy(x2);

        System.out.println(x1 + " / " + x2 + " = " + x3);
        System.out.println("");
        
        System.out.println
        (
        	  "immutable?: "
        	+
        	(
        		(x1.dividedBy(x2)!=x3) ?
        			"yes, as intended, GOOD"
        		:	"no, not as intended, BAD" 
        	)
        );

        System.out.println("-------------------------------------------------");

        FinalMutableDigitRepresentation a
        = new FinalMutableDigitRepresentation();
        
        a.setDigitFromPower(5, 2);
        
        System.out.println(a.isZero());
        System.out.println("");

        System.out.println("-------------------------------------------------");
        
        WholeNumber x4 = WholeNumber.of(-545);
        WholeNumber x5 = WholeNumber.of(278);
        
        WholeNumber y2;
        
        y2 = x4.plus(x5);
        System.out.println(x4 + " + " + x5 + " = " + y2);
        y2 = x5.plus(x4);
        System.out.println(x5 + " + " + x4 + " = " + y2);
        System.out.println("");

        System.out.println(x4 + " - " + x5 + " = " + x4.minus(x5));
        System.out.println(x5 + " - " + x4 + " = " + x5.minus(x4));
        System.out.println("");

        System.out.println(x4 + " * " + x5 + " = " + x4.times(x5));
        System.out.println(x5 + " * " + x4 + " = " + x5.times(x4));
        System.out.println("");

        System.out.println(x4 + " / " + x5 + " = " + x4.dividedBy(x5) );
        System.out.println(x5 + " / " + x4 + " = " + x5.dividedBy(x4) );
        System.out.println("");

        System.out.println("-------------------------------------------------");
        
        PositiveWholeNumber x6 = PositiveWholeNumber.of(3);
        PositiveWholeNumber x7 = PositiveWholeNumber.of(5);
        
        System.out.println(x6 + " + " + x7 + " = " + x6.plus(x7));
        System.out.println(x7 + " + " + x6 + " = " + x7.plus(x6));
        System.out.println("");

        System.out.println(x6 + " - " + x7 + " = " + x6.minus(x7));
        System.out.println(x7 + " - " + x6 + " = " + x7.minus(x6));
        System.out.println("");
        
        System.out.println(x6 + " * " + x7 + " = " + x6.times(x7));
        System.out.println(x7 + " * " + x6 + " = " + x7.times(x6));
        System.out.println("");
        
        System.out.println(x6 + " / " + x7 + " = " + x6.dividedBy(x7));
        System.out.println(x7 + " / " + x6 + " = " + x7.dividedBy(x6));
        System.out.println("");

        System.out.println("-------------------------------------------------");
        
        Signum x8  = Signum.of( 3);
        Signum x9  = Signum.of(-5);
        Signum x10 = Signum.of( 0);

        System.out.println(x8 + " + " + x9 + " = " + x8.plus(x9));
        System.out.println(x9 + " + " + x8 + " = " + x9.plus(x8));
        System.out.println(x8 + " + " + x10 + " = " + x8.plus(x10));
        System.out.println(x10 + " + " + x8 + " = " + x10.plus(x8));
        System.out.println(x9 + " + " + x10 + " = " + x9.plus(x10));
        System.out.println(x10 + " + " + x9 + " = " + x10.plus(x9));
        System.out.println("");

        System.out.println(x8 + " - " + x9 + " = " + x8.minus(x9));
        System.out.println(x9 + " - " + x8 + " = " + x9.minus(x8));
        System.out.println(x8 + " - " + x10 + " = " + x8.minus(x10));
        System.out.println(x10 + " - " + x8 + " = " + x10.minus(x8));
        System.out.println(x9 + " - " + x10 + " = " + x9.minus(x10));
        System.out.println(x10 + " - " + x9 + " = " + x10.minus(x9));
        System.out.println("");

        System.out.println(x8 + " * " + x9 + " = " + x8.times(x9));
        System.out.println(x9 + " * " + x8 + " = " + x9.times(x8));
        System.out.println(x8 + " * " + x10 + " = " + x8.times(x10));
        System.out.println(x10 + " * " + x8 + " = " + x10.times(x8));
        System.out.println(x9 + " * " + x10 + " = " + x9.times(x10));
        System.out.println(x10 + " * " + x9 + " = " + x10.times(x9));
        System.out.println("");

        System.out.println(x8 + " / " + x9 + " = " + x8.dividedBy(x9));
        System.out.println(x9 + " / " + x8 + " = " + x9.dividedBy(x8));
        try{System.out.print  (x8 + " / " + x10 + " = ");
        	System.out.println(x8.dividedBy(x10));}
        catch (Exception e){System.out.println("(exception occurred as expected)");}
        System.out.println(x10 + " / " + x8 + " = " + x10.dividedBy(x8));
        try{System.out.print  (x9 + " / " + x10 + " = ");
        	System.out.println(x9.dividedBy(x10));}
        catch (Exception e){System.out.println("(exception occurred as expected)");}
        System.out.println(x10 + " / " + x9 + " = " + x10.dividedBy(x9));
        System.out.println("");

        System.out.println("-------------------------------------------------");
        
        RationalNumber x11 = RationalNumber.of(-2, 3);
        RationalNumber x12 = RationalNumber.of(3, 4);
        RationalNumber x13 = RationalNumber.of(0, 4);
        
        System.out.println(x11 + " + " + x12 + " = " + x11.plus(x12));
        System.out.println(x12 + " + " + x11 + " = " + x12.plus(x11));
        System.out.println(x11 + " + " + x13 + " = " + x11.plus(x13));
        System.out.println("");

        System.out.println(x11 + " - " + x12 + " = " + x11.minus(x12));
        System.out.println(x12 + " - " + x11 + " = " + x12.minus(x11));
        System.out.println(x11 + " - " + x13 + " = " + x11.minus(x13));
        System.out.println("");
        
        System.out.println(x11 + " * " + x12 + " = " + x11.times(x12));
        System.out.println(x12 + " * " + x11 + " = " + x12.times(x11));
        System.out.println(x11 + " * " + x13 + " = " + x11.times(x13));
        System.out.println("");
        
        System.out.println(x11 + " / " + x12 + " = " + x11.dividedBy(x12));
        System.out.println(x12 + " / " + x11 + " = " + x12.dividedBy(x11));
        try{System.out.print(x11 + " / " + x13 + " = ");
        	System.out.println(x11.dividedBy(x13));}
        catch (Exception e){System.out.println("(exception occurred as expected)");}
        
        System.out.println("");
        
        
    }
    
}
