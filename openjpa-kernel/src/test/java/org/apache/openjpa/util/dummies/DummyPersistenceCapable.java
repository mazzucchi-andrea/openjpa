package org.apache.openjpa.util.dummies;

import org.apache.openjpa.enhance.FieldConsumer;
import org.apache.openjpa.enhance.FieldSupplier;
import org.apache.openjpa.enhance.PersistenceCapable;
import org.apache.openjpa.enhance.StateManager;

public class DummyPersistenceCapable implements PersistenceCapable {
    private StateManager stateManager;
    private Object objectId;
    private Object version;
    private Boolean detachedState = null; // Unknown initially
    private boolean isDirty = false;
    private boolean isTransactional = false;
    private boolean isPersistent = false;
    private boolean isNew = false;
    private boolean isDeleted = false;

    @Override
    public int pcGetEnhancementContractVersion() {
        return 1; // Dummy version
    }

    @Override
    public Object pcGetGenericContext() {
        return null; // No real context
    }

    @Override
    public StateManager pcGetStateManager() {
        return stateManager;
    }

    @Override
    public void pcReplaceStateManager(StateManager sm) {
        this.stateManager = sm;
    }

    @Override
    public void pcProvideField(int fieldIndex) {
        // No-op
    }

    @Override
    public void pcProvideFields(int[] fieldIndices) {
        // No-op
    }

    @Override
    public void pcReplaceField(int fieldIndex) {
        // No-op
    }

    @Override
    public void pcReplaceFields(int[] fieldIndex) {
        // No-op
    }

    @Override
    public void pcCopyFields(Object fromObject, int[] fields) {
        if (fromObject instanceof DummyPersistenceCapable) {
            DummyPersistenceCapable from = (DummyPersistenceCapable) fromObject;
            this.stateManager = from.stateManager;
            this.objectId = from.objectId;
            this.version = from.version;
            this.detachedState = from.detachedState;
            this.isDirty = from.isDirty;
            this.isTransactional = from.isTransactional;
            this.isPersistent = from.isPersistent;
            this.isNew = from.isNew;
            this.isDeleted = from.isDeleted;
        }
    }

    @Override
    public void pcDirty(String fieldName) {
        this.isDirty = true;
    }

    @Override
    public Object pcFetchObjectId() {
        return objectId;
    }

    @Override
    public Object pcGetVersion() {
        return version;
    }

    @Override
    public boolean pcIsDirty() {
        return isDirty;
    }

    @Override
    public boolean pcIsTransactional() {
        return isTransactional;
    }

    @Override
    public boolean pcIsPersistent() {
        return isPersistent;
    }

    @Override
    public boolean pcIsNew() {
        return isNew;
    }

    @Override
    public boolean pcIsDeleted() {
        return isDeleted;
    }

    @Override
    public Boolean pcIsDetached() {
        return detachedState;
    }

    @Override
    public PersistenceCapable pcNewInstance(StateManager sm, boolean clear) {
        return new DummyPersistenceCapable();
    }

    @Override
    public PersistenceCapable pcNewInstance(StateManager sm, Object obj, boolean clear) {
        return new DummyPersistenceCapable();
    }

    @Override
    public Object pcNewObjectIdInstance() {
        return new Object(); // Fake ID
    }

    @Override
    public Object pcNewObjectIdInstance(Object obj) {
        return obj; // Return given object as ID
    }

    @Override
    public void pcCopyKeyFieldsToObjectId(Object obj) {
        // No-op
    }

    @Override
    public void pcCopyKeyFieldsToObjectId(FieldSupplier supplier, Object obj) {
        // No-op
    }

    @Override
    public void pcCopyKeyFieldsFromObjectId(FieldConsumer consumer, Object obj) {
        // No-op
    }

    @Override
    public Object pcGetDetachedState() {
        return detachedState;
    }

    @Override
    public void pcSetDetachedState(Object state) {
        this.detachedState = (Boolean) state;
    }

    @Override
    public String toString() {
        return "DummyPersistenceCapable{" +
                "stateManager=" + stateManager +
                ", objectId=" + objectId +
                ", version=" + version +
                ", detachedState=" + detachedState +
                ", isDirty=" + isDirty +
                ", isTransactional=" + isTransactional +
                ", isPersistent=" + isPersistent +
                ", isNew=" + isNew +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
