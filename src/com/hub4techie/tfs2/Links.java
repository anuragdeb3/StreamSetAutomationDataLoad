
package com.hub4techie.tfs2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Links {

    @SerializedName("self")
    @Expose
    private Self self;
    @SerializedName("workItemUpdates")
    @Expose
    private WorkItemUpdates workItemUpdates;
    @SerializedName("workItemRevisions")
    @Expose
    private WorkItemRevisions workItemRevisions;
    @SerializedName("workItemHistory")
    @Expose
    private WorkItemHistory workItemHistory;
    @SerializedName("html")
    @Expose
    private Html html;
    @SerializedName("workItemType")
    @Expose
    private WorkItemType workItemType;
    @SerializedName("fields")
    @Expose
    private Fields_ fields;

    public Self getSelf() {
        return self;
    }

    public void setSelf(Self self) {
        this.self = self;
    }

    public WorkItemUpdates getWorkItemUpdates() {
        return workItemUpdates;
    }

    public void setWorkItemUpdates(WorkItemUpdates workItemUpdates) {
        this.workItemUpdates = workItemUpdates;
    }

    public WorkItemRevisions getWorkItemRevisions() {
        return workItemRevisions;
    }

    public void setWorkItemRevisions(WorkItemRevisions workItemRevisions) {
        this.workItemRevisions = workItemRevisions;
    }

    public WorkItemHistory getWorkItemHistory() {
        return workItemHistory;
    }

    public void setWorkItemHistory(WorkItemHistory workItemHistory) {
        this.workItemHistory = workItemHistory;
    }

    public Html getHtml() {
        return html;
    }

    public void setHtml(Html html) {
        this.html = html;
    }

    public WorkItemType getWorkItemType() {
        return workItemType;
    }

    public void setWorkItemType(WorkItemType workItemType) {
        this.workItemType = workItemType;
    }

    public Fields_ getFields() {
        return fields;
    }

    public void setFields(Fields_ fields) {
        this.fields = fields;
    }

}
