package com.atguigu.dao;


	class Value{
		int i=15;
	}

	public class Test{
		public static void main(String[] args) {
			Test t=new Test();
			t.first();
			/*��Ϊfirst������û��static������Ҫ
			����newһ��Text
			*/
	}
		public void first(){
		int i=5;
		Value v=new Value();
		v.i=25;
		/*
		�������v.i��i��ֵ��second Ȼ����second��v.i
		��ֵת��Ϊ��20
		*/
		second(v,i);
		System.out.println(v.i);//25
	}
		

	public void second(Value v,int i){
			i=0;
			v.i=20;
			Value val=new Value();
			v=val;
			//v=val,����val�е�i��ֵ��Ϊv.i
			System.out.println(v.i+"\n"+i);
			//15,0 ��Value��i��ֵ������second�е�i

		}
	}


