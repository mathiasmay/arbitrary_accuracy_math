package math.number_representations;

import java.util.Optional;

public interface SomeInternalRepresentation
{
	@Override String
		toString();

//	public abstract boolean
//        setValueIfPossibleOrReturnFalse(Integer x);
    public abstract Optional<Integer>
        getValueAsIntegerIfPossible();
//    public abstract boolean
//        setValueIfPossibleOrReturnFalse(Double x);
    public abstract Optional<Double>
        getValueAsDoubleIfPossible();
}
