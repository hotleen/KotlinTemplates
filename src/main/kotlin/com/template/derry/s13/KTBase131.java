package com.template.derry.s13;

/**
 * author: jack hu
 *
 * @Create: 2025-02-07 21:00
 * @Description:
 **/
public class KTBase131 {

    // KT代码，类函数对应Java是非静态函数，KT文件没有类，直接写的方法是静态函数，Java中通过类名静态调用
    public static void main(String[] args) {
//        KTBase131Kt.getStudentNameValueInfo("testKt..");
        StudentInfo.getStudentNameValueInfo("testKt..");

        Person person = new Person();
        for (String name : person.names) {
            System.out.println("name is : "+name);
        }

        KTBase133Kt.show("sheldon");
    }
}
