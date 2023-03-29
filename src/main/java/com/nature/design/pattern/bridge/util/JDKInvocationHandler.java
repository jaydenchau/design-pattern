// package com.nature.design.pattern.bridge.util;
//
//
// import java.lang.reflect.InvocationHandler;
// import java.lang.reflect.Method;
//
// public class JDKInvocationHandler implements InvocationHandler {
//
//     private PayService payService;
//
//     public JDKInvocationHandler(PayService payService) {
//         this.payService = payService;
//     }
//
//     @Override
//     public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//         return PayService.class.getMethod(method.getName(), ClassLoaderUtils.getClazzByArgs(args)).invoke(payService, args);
//     }
//
// }
