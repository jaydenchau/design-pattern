// package com.nature.design.pattern.bridge.util;
//
// import java.lang.reflect.InvocationHandler;
// import java.lang.reflect.Proxy;
//
// public class JDKProxy {
//
//     public static <T> T getProxy(Class<T> interfaceClass, PayService payService) throws Exception {
//         InvocationHandler handler = new JDKInvocationHandler(payService);
//         ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
//         Class<?>[] classes = interfaceClass.getInterfaces();
//         return (T) Proxy.newProxyInstance(classLoader, new Class[]{classes[0]}, handler);
//     }
//
// }
