package org.apache.openjpa.util.dummies;

import org.apache.openjpa.kernel.OpenJPAStateManager;
import org.apache.openjpa.util.ChangeTracker;
import org.apache.openjpa.util.Proxy;

public class DummyProxy implements Proxy {
    private OpenJPAStateManager owner;
    private int ownerField;
    private ChangeTracker changeTracker;

    // Constructor
    public DummyProxy(int ownerField) {
        this.ownerField = ownerField;
    }

    @Override
    public void setOwner(OpenJPAStateManager sm, int field) {
        this.owner = sm;
        this.ownerField = field;
    }

    @Override
    public OpenJPAStateManager getOwner() {
        return owner;
    }

    @Override
    public int getOwnerField() {
        return ownerField;
    }

    @Override
    public ChangeTracker getChangeTracker() {
        return changeTracker;
    }

    @Override
    public Object copy(Object orig) {
        // Basic deep copy logic (if needed, customize based on object type)
        if (orig instanceof Cloneable) {
            try {
                return orig.getClass().getMethod("clone").invoke(orig);
            } catch (Exception e) {
                throw new RuntimeException("Clone failed", e);
            }
        }
        return orig; // Return the same reference if not cloneable
    }

    @Override
    public String toString() {
        return "DummyProxy{" +
                "owner=" + owner +
                ", ownerField=" + ownerField +
                ", changeTracker=" + changeTracker +
                '}';
    }

    // ✅ Implementing equals()
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof DummyProxy)) {
            return false;
        }
        DummyProxy that = (DummyProxy) obj;
        return owner == that.owner && ownerField == that.ownerField && changeTracker == that.changeTracker;
    }
}
