package com.nature.opensource.flow.cmp;

import com.yomahub.liteflow.core.NodeComponent;
import org.springframework.stereotype.Component;

/**
 * @author Jayden Chau
 * @date 2023/9/26 12:21
 */
@Component("a")
public class ACmp extends NodeComponent {

    @Override
    public void process() throws Exception {
        System.out.println("i am A");
    }
}
