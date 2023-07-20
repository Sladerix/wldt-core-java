package it.wldt.adapter.physical.event;

import it.wldt.adapter.physical.PhysicalAssetRelationshipInstance;
import it.wldt.exception.EventBusException;

public class PhysicalAssetRelationshipInstanceCreatedWldtEvent<T> extends PhysicalAssetWldtEvent<PhysicalAssetRelationshipInstance<T>> {

    public static final String EVENT_BASIC_TYPE = "dt.physical.event.relationship.created";

    public PhysicalAssetRelationshipInstanceCreatedWldtEvent(PhysicalAssetRelationshipInstance<T> body) throws EventBusException {
        super(body.getRelationship().getName(), body);
    }

    @Override
    protected String getBasicEventType() {
        return EVENT_BASIC_TYPE;
    }

}
