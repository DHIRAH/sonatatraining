package com.example.demos;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.Test;
import com.example.demos.MyServiceStub;
import com.example.demos.MyServiceIntf;


 class MyServiceImplStubTest  {
	
	 
	 @Test
	void test() {
		 MyServiceIntf my = new MyServiceStub();
		 MyServiceImpla mys = new MyServiceImpla(my);
		 List<String> filterMySer = mys.retriveRelated("Dummy");
		 
		assertEquals(2, filterMySer.size());
		 }




	 

}
