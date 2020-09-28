package math.number_representations;

public abstract class AbstractMutableDigitRepresentation
{
    public abstract int  getDigitFromPower(int power);
    public abstract void setDigitFromPower(int digit, int power);
    public abstract int  getPowerOfHighestDigit();
    public abstract int  getPowerOfLowestDigit();
    public abstract int  getMaximumAllowedBasis();
    public abstract void setToZero();
    public abstract void setToZero(int array_size_to_start_with);
    public abstract void setIndexShift(int arg_index_shift);
    public abstract int  getIndexShift();
    public abstract boolean isZero();
    @Override
    public abstract AbstractMutableDigitRepresentation clone();
}
