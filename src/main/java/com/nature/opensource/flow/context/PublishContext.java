package com.nature.opensource.flow.context;

import lombok.Data;

import java.util.List;

/**
 * @author Jayden Chau
 * @date 2023/9/26 12:26
 */
@Data
public class PublishContext {

    private List<String> allPublishObjectId;

    private List<String> publishToCurrentUserId;

    public List<String> getAllPublishObjectId() {
        return allPublishObjectId;
    }

    public void setAllPublishObjectId(List<String> allPublishObjectId) {
        this.allPublishObjectId = allPublishObjectId;
    }

    public List<String> getPublishToCurrentUserId() {
        return publishToCurrentUserId;
    }

    public void setPublishToCurrentUserId(List<String> publishToCurrentUserId) {
        this.publishToCurrentUserId = publishToCurrentUserId;
    }
}
