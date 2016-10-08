package com.atguigu.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestMS {

	public static void main(String[] args) {
		List list=new ArrayList();	
		String s2 = "abc";
        String s1 = new String("abc");      
        String s3 = new String("abc");

        System.out.println(s1 == s2);      //false  s1ָ��ѵõ�ֵַ��s2 ָ�����ص�ֵַ��ͬ
        System.out.println(s1 == s3);      //false   S1 S3 ָ����е�ֵַ��ͬ
        System.out.println(s2 == s3);      //false


        System.out.println("====================");
        /**
        �����ַ�������Ĺ淶����ʾ��ʽ�� 
        һ����ʼΪ�յ��ַ����أ������� String ˽�е�ά���� 
        ������ intern ����ʱ��������Ѿ�����һ�����ڴ� String ������ַ������� equals(Object) ����ȷ������
        �򷵻س��е��ַ��������򣬽��� String ������ӵ����У������ش� String ��������á� 
        ����ѭ���¹��򣺶������������ַ��� s �� t�����ҽ��� s.equals(t) Ϊ true ʱ��
        s.intern() == t.intern() ��Ϊ true�� 
        ��������ֵ�ַ������ַ�����ֵ�������ʽ��ʹ�� intern �������в�����
        �ַ�������ֵ�� Java Language Specification 
        �� ��3.10.5 ���塣

        ���أ�һ���ַ�������������ַ�����ͬ����һ��ȡ�Ծ���Ψһ�ַ����ĳء�
         */        
        System.out.println(s1 ==s1.intern());   //false
        System.out.println(s2 ==s2.intern());   //true
        System.out.println(s1.intern() ==s2.intern()); //true
        
        System.out.println("====================");
        
        String s4 = "java";
        String s5 = "ja";
        String s6 = "va";
        String s7 = new String("java");
        String s8 = new String("ja");
        System.out.println(s4 == "java");   //true     
        System.out.println(s4 == (s5+s6));  //false
        System.out.println(s4 == "ja"+s6);	//false
        System.out.println("---------------------");
        System.out.println(s7 == s4);
        System.out.println(s7 =="java");
        System.out.println(s4 ==s8+s6);

	}
}