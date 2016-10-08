package com.atguigu.dao;


	class Value{
		int i=15;
	}

	public class Test{
		public static void main(String[] args) {
			Test t=new Test();
			t.first();
			/*因为first方法中没有static，所以要
			从新new一个Text
			*/
	}
		public void first(){
		int i=5;
		Value v=new Value();
		v.i=25;
		/*
		将上面的v.i，i赋值给second 然后在second中v.i
		的值转换为了20
		*/
		second(v,i);
		System.out.println(v.i);//25
	}
		

	public void second(Value v,int i){
			i=0;
			v.i=20;
			Value val=new Value();
			v=val;
			//v=val,这样val中的i的值就为v.i
			System.out.println(v.i+"\n"+i);
			//15,0 将Value中i的值赋给了second中的i

		}
	}


