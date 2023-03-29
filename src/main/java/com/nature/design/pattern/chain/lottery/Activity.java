package com.nature.design.pattern.chain.lottery;

import lombok.Builder;
import lombok.Data;

/**
 * @author Jayden Chau
 * @date 2023/2/23 15:04
 */
@Data
@Builder
public class Activity {

    private int awardRemainNum;

    private boolean expired;

    private boolean enabled;
}
