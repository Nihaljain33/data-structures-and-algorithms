package demos;

import java.util.Objects;

public final class ImmutableClass {

    private final int count;

    public ImmutableClass(int count) {
        this.count = count;
    }

    public int getCount() {
        return this.count;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof ImmutableClass thisClass)) return false;
        return thisClass.getCount() == this.count;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count);
    }
}
