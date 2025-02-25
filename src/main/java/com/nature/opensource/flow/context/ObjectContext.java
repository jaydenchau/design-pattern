package com.nature.opensource.flow.context;

import lombok.Data;

import java.util.List;

/**
 * @author Jayden Chau
 * @date 2023/9/26 12:31
 */
@Data
public class ObjectContext {

    private List<String> parentIdList;

    public List<String> getParentIdList() {
        return parentIdList;
    }

    public void setParentIdList(List<String> parentIdList) {
        this.parentIdList = parentIdList;
    }
}
