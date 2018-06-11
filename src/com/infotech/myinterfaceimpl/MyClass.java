package com.infotech.myinterfaceimpl;

import java.util.Collections;
import java.util.List;

import com.infotech.myinterface.MyInterface;

public class MyClass implements MyInterface {
	
	@Override
	public  Integer getMaxNum(List<Integer> inList)
	{
		Integer max=Collections.max(inList);
		return max;
		
	}
	
}
