package com.cn;

public class Renew {
		public boolean equals(Object obj){
			//自反性
			if(this==obj)
			{
				return true;
			}
			
			//非空性
			if(obj==null)
			{
				return false;
			}
			
			//比较内容
			if(this.getClass()!=obj.getClass())
			{
				return false;
			}
			else
				return true;
		}
}
