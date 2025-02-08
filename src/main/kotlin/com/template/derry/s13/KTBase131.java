package com.template.derry.s13;

/**
 * author: jack hu
 *
 * @Create: 2025-02-07 21:00
 * @Description:
 **/
public class KTBase131 {

    public static void main(String[] args) {
//        KTBase131Kt.getStudentNameValueInfo("testKt..");
        StudentInfo.getStudentNameValueInfo("testKt..");

        Person person = new Person();
        for (String name : person.names) {
            System.out.println("name is : "+name);
        }
    }
}
