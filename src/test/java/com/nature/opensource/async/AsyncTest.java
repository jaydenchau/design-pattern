//package com.nature.design.pattern.opensource.async;
//
//import com.gobrs.async.core.GobrsAsync;
//import com.gobrs.async.core.common.domain.AsyncResult;
//import com.gobrs.async.core.common.domain.TaskResult;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * @author Jayden Chau
// * @date 2023/2/22 16:57
// */
//@SpringBootTest
//@RunWith(SpringRunner.class)
//public class AsyncTest {
//
//    @Autowired
//    private GobrsAsync gobrsAsync;
//
//    @Test
//    public void testAsync() {
//        Map<String, Object> params = new HashMap();
//        // 任务流程名称 , 任务流程传入参数, 任务流程超时时间
//        AsyncResult asyncResult = gobrsAsync.go("ruleName", () -> params, 1000);
//        Map<String, TaskResult> resultMap = asyncResult.getResultMap();
//        for (Map.Entry<String, TaskResult> entry : resultMap.entrySet()) {
//            System.out.println("entry.getValue().getResult() = " + entry.getValue().getResult());
//        }
//    }
//}
