package com.nature.design.pattern.client;

import lombok.Data;

import java.util.List;

/**
 * @author Jayden Chau
 * @date 2022/9/2 3:19 PM
 */
@Data
public class OrderAcknowledgementQuery {

    private List<Integer> seasonIds;
    private String        currencyCode;
    private Integer       orderStatusId;
    private String        dateField;
    private String        startDate;
    private String        endDate;

}
