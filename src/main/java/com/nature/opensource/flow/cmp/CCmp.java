package com.nature.opensource.flow.cmp;

import cn.hutool.db.PageResult;
import com.yomahub.liteflow.core.NodeComponent;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Jayden Chau
 * @date 2023/9/26 12:21
 */
@Component("c")
public class CCmp extends NodeComponent {

    @Override
    public void process() throws Exception {
        System.out.println("i am C");
        List<Object> contextBeanList = this.getSlot().getContextBeanList();
        for (Object o : contextBeanList) {
            System.out.println(o);
        }
        PageResult<String> result = new PageResult<>();
        result.setTotal(2);
        contextBeanList.add(result);
    }
}
