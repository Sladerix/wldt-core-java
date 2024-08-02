package it.wldt.storage.model.physical;

import it.wldt.storage.model.StorageRecord;

import java.util.Map;

/**
 * Author: Marco Picone (picone.m@gmail.com)
 * Date: 01/08/2024
 * Physical Asset Event Notification Record Class
 * Represents a Physical Asset Event Notification Record in the storage
 */
public class PhysicalAssetEventNotificationRecord extends StorageRecord {

    // Timestamp of the event
    private long timestamp;

    // Event key associated to the event
    private String eventkey;

    // Body of the event
    private Object body;

    // Metadata associated to the event
    private Map<String, Object> metadata;

    /**
     * Default Constructor
     */
    public PhysicalAssetEventNotificationRecord() {
    }

    /**
     * Constructor with all the required parameters
     * @param timestamp timestamp of the event
     * @param eventkey event key associated to the event
     * @param body body of the event
     * @param metadata  metadata associated to the event
     */
    public PhysicalAssetEventNotificationRecord(long timestamp, String eventkey, Object body, Map<String, Object> metadata) {
        this.timestamp = timestamp;
        this.eventkey = eventkey;
        this.body = body;
        this.metadata = metadata;
    }

    /**
     * Get the timestamp of the event
     * @return timestamp of the event
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * Set the timestamp of the event
     * @param timestamp timestamp of the event
     */
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Get the event key associated to the event
     * @return event key associated to the event
     */
    public String getEventkey() {
        return eventkey;
    }

    /**
     * Set the event key associated to the event
     * @param eventkey event key associated to the event
     */
    public void setEventkey(String eventkey) {
        this.eventkey = eventkey;
    }

    /**
     * Get the body of the event
     * @return body of the event
     */
    public Object getBody() {
        return body;
    }

    /**
     * Set the body of the event
     * @param body body of the event
     */
    public void setBody(Object body) {
        this.body = body;
    }

    /**
     * Get the metadata associated to the event
     * @return metadata associated to the event
     */
    public Map<String, Object> getMetadata() {
        return metadata;
    }

    /**
     * Set the metadata associated to the event
     * @param metadata metadata associated to the event
     */
    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PhysicalAssetEventNotificationRecord{");
        sb.append("recordId=").append(getId());
        sb.append("timestamp=").append(timestamp);
        sb.append(", eventkey='").append(eventkey).append('\'');
        sb.append(", body=").append(body);
        sb.append(", metadata=").append(metadata);
        sb.append('}');
        return sb.toString();
    }
}
