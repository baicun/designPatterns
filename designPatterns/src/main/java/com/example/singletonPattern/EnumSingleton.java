package com.example.singletonPattern;

/**
 * 描述
 *
 * @author 白存
 *         版本修订记录：
 *         <pre>
 *         @version v0.01 2018-12-02 18:56 白存 完成初步设计
 *         </pre>
 */
public enum EnumSingleton {
    INSTANCE;
    public void read(){
        System.out.println("read");
    }
}
