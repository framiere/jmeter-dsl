package com.jaxio.jmeter;

import lombok.Setter;
import lombok.experimental.Accessors;

public class Output {

	@Accessors(fluent = true)
	@Setter
	public class JmeterTestPlan {
		private String version;
		private String properties;
		private String jmeter;

		public JmeterTestPlan add(Object... p) {
			return this;
		}
	}

	@Accessors(fluent = true)
	@Setter
	public class HashTree {
		public HashTree add(Object... p) {
			return this;
		}
	}

	@Accessors(fluent = true)
	@Setter
	public class TestPlan {
		private String guiclass;
		private String testclass;
		private String testname;
		private String enabled;

		public TestPlan add(Object... p) {
			return this;
		}
	}

	public interface Prop {

	}

	public abstract class BaseProp<T extends Prop> implements Prop {
		public T add(T... props) {
			return (T) this;
		}
	}

	@Accessors(fluent = true)
	@Setter
	public class StringProp extends BaseProp<StringProp> {
		private String name;

		public void p() {
			// TODO Auto-generated method stub

		}
	}

	@Accessors(fluent = true)
	@Setter
	public class BoolProp extends BaseProp<BoolProp> {
		private String name;
	}

	@Accessors(fluent = true)
	@Setter
	public class CollectionProp extends BaseProp<CollectionProp> {
		private String name;
	}

	@Accessors(fluent = true)
	@Setter
	public class LongProp extends BaseProp<LongProp> {
		private String name;
	}

	@Accessors(fluent = true)
	@Setter
	public class ElementProp extends BaseProp<ElementProp> {
		private String name;
		private String elementType;
		private String guiclass;
		private String testclass;
		private String testname;
		private String enabled;
	}

	@Accessors(fluent = true)
	@Setter
	public class Arguments {
		private String name;
	}

	@Accessors(fluent = true)
	@Setter
	public class ThreadGroup extends TestPlan {
		private String name;
	}

	public void p() {
		 new JmeterTestPlan()
		 .version("1.2")
		 .properties("2.4")
		 .jmeter("2.9 r1437961")
		 .add(
		 new HashTree()
		 .add(
		  new TestPlan()
		  .guiclass("TestPlanGui")
		  .testclass("TestPlan")
		  .testname("Test plan")
		  .enabled("true")
		  .add(
		   new StringProp()
		   .name("TestPlan.comments")
		  ,
		   new BoolProp()
		   .name("TestPlan.functional_mode")
		  ,
		   new BoolProp()
		   .name("TestPlan.serialize_threadgroups")
		  ,
		   new ElementProp()
		   .name("TestPlan.user_defined_variables")
		   .elementType("Arguments")
		   .guiclass("ArgumentsPanel")
		   .testclass("Arguments")
		   .testname("Variables pr?-d?finies")
		   .enabled("true")
		   )
		  ,
		   new StringProp()
		   .name("TestPlan.user_define_classpath")
		  )
		 , 
		  new HashTree()
		  .add(
		   new ThreadGroup()
		   .guiclass("ThreadGroupGui")
		   .testclass("ThreadGroup")
		   .testname("Groupe d'unit?s")
		   .enabled("true")
		   .add(
		    new StringProp()
		    .name("ThreadGroup.on_sample_error"))));
		    }
}
