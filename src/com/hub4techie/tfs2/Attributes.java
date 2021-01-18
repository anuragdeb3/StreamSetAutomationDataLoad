
package com.hub4techie.tfs2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attributes {

    @SerializedName("isLocked")
    @Expose
    private Boolean isLocked;
    @SerializedName("authorizedDate")
    @Expose
    private String authorizedDate;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("resourceCreatedDate")
    @Expose
    private String resourceCreatedDate;
    @SerializedName("resourceModifiedDate")
    @Expose
    private String resourceModifiedDate;
    @SerializedName("revisedDate")
    @Expose
    private String revisedDate;
    @SerializedName("resourceSize")
    @Expose
    private Integer resourceSize;
    @SerializedName("name")
    @Expose
    private String name;

    public Boolean getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    public String getAuthorizedDate() {
        return authorizedDate;
    }

    public void setAuthorizedDate(String authorizedDate) {
        this.authorizedDate = authorizedDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResourceCreatedDate() {
        return resourceCreatedDate;
    }

    public void setResourceCreatedDate(String resourceCreatedDate) {
        this.resourceCreatedDate = resourceCreatedDate;
    }

    public String getResourceModifiedDate() {
        return resourceModifiedDate;
    }

    public void setResourceModifiedDate(String resourceModifiedDate) {
        this.resourceModifiedDate = resourceModifiedDate;
    }

    public String getRevisedDate() {
        return revisedDate;
    }

    public void setRevisedDate(String revisedDate) {
        this.revisedDate = revisedDate;
    }

    public Integer getResourceSize() {
        return resourceSize;
    }

    public void setResourceSize(Integer resourceSize) {
        this.resourceSize = resourceSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
