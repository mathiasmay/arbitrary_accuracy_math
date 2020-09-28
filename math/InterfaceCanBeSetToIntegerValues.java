package math;

import java.util.Optional;

public interface InterfaceCanBeSetToIntegerValues
{
    public abstract boolean setValueIfPossible(Integer x);
    public abstract Optional<Integer> getValueAsIntegerIfPossible();
}
