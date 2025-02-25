package com.nature.opensource.flow;

import com.google.common.collect.Lists;
import com.nature.opensource.flow.context.ObjectContext;
import com.nature.opensource.flow.context.PublishContext;
import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.flow.LiteflowResponse;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Jayden Chau
 * @date 2023/9/26 12:21
 */
@Component
public class LiteFlowService {

    @Resource
    private FlowExecutor flowExecutor;

    public void testConfig() throws Exception {
        PublishContext publishContext = new PublishContext();
        publishContext.setAllPublishObjectId(Lists.newArrayList("1", "2", "3"));
        publishContext.setPublishToCurrentUserId(Lists.newArrayList("1"));

        List<PublishContext> publishContextsList = Lists.newArrayList(publishContext);

        ObjectContext objectContext = new ObjectContext();
        objectContext.setParentIdList(Lists.newArrayList("5,6,7"));

        List<ObjectContext> objectContextList = Lists.newArrayList(objectContext);

        LiteflowResponse response = flowExecutor.execute2Resp("permissionChain", null, objectContextList, publishContextsList);

        // LiteflowResponse response = flowExecutor.execute2Resp("permissionChain", null, publishContext);
        // PageResult<String> pageResult = response.getContextBean(PageResult.class);
        // System.out.println(pageResult.getTotal());

    }
}
