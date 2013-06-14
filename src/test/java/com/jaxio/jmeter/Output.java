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
		private String name;
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
		public T name(String name) {
			return (T) this;
		}

		public T add(Prop... props) {
			return (T) this;
		}
	}

	@Accessors(fluent = true)
	@Setter
	public class StringProp extends BaseProp<StringProp> {
	}

	@Accessors(fluent = true)
	@Setter
	public class BoolProp extends BaseProp<BoolProp> {
	}

	@Accessors(fluent = true)
	@Setter
	public class CollectionProp extends BaseProp<CollectionProp> {
	}

	@Accessors(fluent = true)
	@Setter
	public class LongProp extends BaseProp<LongProp> {
	}

	@Accessors(fluent = true)
	@Setter
	public class IntProp extends BaseProp<BoolProp> {
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
	public class Arguments extends ElementProp {
		private String name;
	}

	@Accessors(fluent = true)
	@Setter
	public class ThreadGroup extends TestPlan {
	}

	@Accessors(fluent = true)
	@Setter
	public class CookieManager extends TestPlan {
	}

	@Accessors(fluent = true)
	@Setter
	public class HTTPSamplerProxy extends TestPlan {
	}

	@Accessors(fluent = true)
	@Setter
	public class ConfigTestElement extends TestPlan {
	}

	@Accessors(fluent = true)
	@Setter
	public class ResponseAssertion extends TestPlan {
	}

	@Accessors(fluent = true)
	@Setter
	public class RegexExtractor extends TestPlan {
	}

	@Accessors(fluent = true)
	@Setter
	public class XMLAssertion extends TestPlan {
	}

	@Accessors(fluent = true)
	@Setter
	public class ResultCollector extends TestPlan {
	}

	public void p() {
		 new JmeterTestPlan() //
		 .version("1.2") //
		 .properties("2.4") //
		 .jmeter("2.9 r1437961") //
		 .add( //
		 new HashTree() //
		 .add( //
		  new TestPlan() //
		  .guiclass("TestPlanGui") //
		  .testclass("TestPlan") //
		  .testname("Test plan") //
		  .enabled("true") //
		  .add( //
		   new StringProp() //
		   .name("TestPlan.comments") //
		  ,
		   new BoolProp() //
		   .name("TestPlan.functional_mode") //
		  ,
		   new BoolProp() //
		   .name("TestPlan.serialize_threadgroups") //
		  ,
		   new ElementProp() //
		   .name("TestPlan.user_defined_variables") //
		   .elementType("Arguments") //
		   .guiclass("ArgumentsPanel") //
		   .testclass("Arguments") //
		   .testname("Variables pr?-d?finies") //
		   .enabled("true") //
		   .add( //
		    new CollectionProp() //
		    .name("Arguments.arguments") //
		   ) //
		  ,
		   new StringProp() //
		   .name("TestPlan.user_define_classpath") //
		  ) //
		 ,
		  new HashTree() //
		  .add( //
		   new ThreadGroup() //
		   .guiclass("ThreadGroupGui") //
		   .testclass("ThreadGroup") //
		   .testname("Groupe d'unit?s") //
		   .enabled("true") //
		   .add( //
		    new StringProp() //
		    .name("ThreadGroup.on_sample_error") //
		   ,
		    new ElementProp() //
		    .name("ThreadGroup.main_controller") //
		    .elementType("LoopController") //
		    .guiclass("LoopControlPanel") //
		    .testclass("LoopController") //
		    .testname("Contr?leur Boucle") //
		    .enabled("true") //
		    .add( //
		     new BoolProp() //
		     .name("LoopController.continue_forever") //
		    ,
		     new StringProp() //
		     .name("LoopController.loops") //
		    ) //
		   ,
		    new StringProp() //
		    .name("ThreadGroup.num_threads") //
		   ,
		    new StringProp() //
		    .name("ThreadGroup.ramp_time") //
		   ,
		    new LongProp() //
		    .name("ThreadGroup.start_time") //
		   ,
		    new LongProp() //
		    .name("ThreadGroup.end_time") //
		   ,
		    new BoolProp() //
		    .name("ThreadGroup.scheduler") //
		   ,
		    new StringProp() //
		    .name("ThreadGroup.duration") //
		   ,
		    new StringProp() //
		    .name("ThreadGroup.delay") //
		   ) //
		  ,
		   new HashTree() //
		   .add( //
		    new Arguments() //
		    .guiclass("ArgumentsPanel") //
		    .testclass("Arguments") //
		    .testname("Predefined Variables") //
		    .enabled("true") //
		    .add( //
		     new CollectionProp() //
		     .name("Arguments.arguments") //
		     .add( //
		      new ElementProp() //
		      .name("CONTEXT") //
		      .elementType("Argument") //
		      .add( //
		       new StringProp() //
		       .name("Argument.name") //
		      ,
		       new StringProp() //
		       .name("Argument.value") //
		      ,
		       new StringProp() //
		       .name("Argument.metadata") //
		      ) //
		     ,
		      new ElementProp() //
		      .name("username") //
		      .elementType("Argument") //
		      .add( //
		       new StringProp() //
		       .name("Argument.name") //
		      ,
		       new StringProp() //
		       .name("Argument.value") //
		      ,
		       new StringProp() //
		       .name("Argument.metadata") //
		      ) //
		     ,
		      new ElementProp() //
		      .name("password") //
		      .elementType("Argument") //
		      .add( //
		       new StringProp() //
		       .name("Argument.name") //
		      ,
		       new StringProp() //
		       .name("Argument.value") //
		      ,
		       new StringProp() //
		       .name("Argument.metadata") //
		      ) //
		     ) //
		    ) //
		   ,
		    new HashTree() //
		   ,
		    new CookieManager() //
		    .guiclass("CookiePanel") //
		    .testclass("CookieManager") //
		    .testname("HTTP Cookies") //
		    .enabled("true") //
		    .add( //
		     new CollectionProp() //
		     .name("CookieManager.cookies") //
		    ,
		     new BoolProp() //
		     .name("CookieManager.clearEachIteration") //
		    ) //
		   ,
		    new HashTree() //
		   ,
		    new ConfigTestElement() //
		    .guiclass("HttpDefaultsGui") //
		    .testclass("ConfigTestElement") //
		    .testname("HTTP Configuration") //
		    .enabled("true") //
		    .add( //
		     new ElementProp() //
		     .name("HTTPsampler.Arguments") //
		     .elementType("Arguments") //
		     .guiclass("HTTPArgumentsPanel") //
		     .testclass("Arguments") //
		     .testname("Variables pr?-d?finies") //
		     .enabled("true") //
		     .add( //
		      new CollectionProp() //
		      .name("Arguments.arguments") //
		     ) //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.domain") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.port") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.connect_timeout") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.response_timeout") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.protocol") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.contentEncoding") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.path") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.concurrentPool") //
		    ) //
		   ,
		    new HashTree() //
		   ,
		    new HTTPSamplerProxy() //
		    .guiclass("HttpTestSampleGui") //
		    .testclass("HTTPSamplerProxy") //
		    .testname("home anonymous") //
		    .enabled("true") //
		    .add( //
		     new ElementProp() //
		     .name("HTTPsampler.Arguments") //
		     .elementType("Arguments") //
		     .guiclass("HTTPArgumentsPanel") //
		     .testclass("Arguments") //
		     .enabled("true") //
		     .add( //
		      new CollectionProp() //
		      .name("Arguments.arguments") //
		      .add( //
		       new ElementProp() //
		       .name("locale") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ) //
		      ) //
		     ) //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.domain") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.port") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.connect_timeout") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.response_timeout") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.protocol") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.contentEncoding") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.path") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.method") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.follow_redirects") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.auto_redirects") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.use_keepalive") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.DO_MULTIPART_POST") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.monitor") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.embedded_url_re") //
		    ) //
		   ,
		    new HashTree() //
		    .add( //
		     new ResponseAssertion() //
		     .guiclass("AssertionGui") //
		     .testclass("ResponseAssertion") //
		     .testname("assert title") //
		     .enabled("true") //
		     .add( //
		      new CollectionProp() //
		      .name("Asserion.test_strings") //
		      .add( //
		       new StringProp() //
		       .name("-1734538928") //
		      ) //
		     ,
		      new StringProp() //
		      .name("Assertion.test_field") //
		     ,
		      new BoolProp() //
		      .name("Assertion.assume_success") //
		     ,
		      new IntProp() //
		      .name("Assertion.test_type") //
		     ) //
		    ,
		     new HashTree() //
		    ) //
		   ,
		    new HTTPSamplerProxy() //
		    .guiclass("HttpTestSampleGui") //
		    .testclass("HTTPSamplerProxy") //
		    .testname("login page") //
		    .enabled("true") //
		    .add( //
		     new ElementProp() //
		     .name("HTTPsampler.Arguments") //
		     .elementType("Arguments") //
		     .guiclass("HTTPArgumentsPanel") //
		     .testclass("Arguments") //
		     .enabled("true") //
		     .add( //
		      new CollectionProp() //
		      .name("Arguments.arguments") //
		     ) //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.domain") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.port") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.connect_timeout") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.response_timeout") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.protocol") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.contentEncoding") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.path") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.method") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.follow_redirects") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.auto_redirects") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.use_keepalive") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.DO_MULTIPART_POST") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.monitor") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.embedded_url_re") //
		    ) //
		   ,
		    new HashTree() //
		    .add( //
		     new ResponseAssertion() //
		     .guiclass("AssertionGui") //
		     .testclass("ResponseAssertion") //
		     .testname("assert title") //
		     .enabled("true") //
		     .add( //
		      new CollectionProp() //
		      .name("Asserion.test_strings") //
		      .add( //
		       new StringProp() //
		       .name("-936022144") //
		      ) //
		     ,
		      new StringProp() //
		      .name("Assertion.test_field") //
		     ,
		      new BoolProp() //
		      .name("Assertion.assume_success") //
		     ,
		      new IntProp() //
		      .name("Assertion.test_type") //
		     ) //
		    ,
		     new HashTree() //
		    ,
		     new RegexExtractor() //
		     .guiclass("RegexExtractorGui") //
		     .testclass("RegexExtractor") //
		     .testname("extract jsfViewState") //
		     .enabled("true") //
		     .add( //
		      new StringProp() //
		      .name("RegexExtractor.useHeaders") //
		     ,
		      new StringProp() //
		      .name("RegexExtractor.refname") //
		     ,
		      new StringProp() //
		      .name("RegexExtractor.regex") //
		     ,
		      new StringProp() //
		      .name("RegexExtractor.template") //
		     ,
		      new StringProp() //
		      .name("RegexExtractor.default") //
		     ,
		      new StringProp() //
		      .name("RegexExtractor.match_number") //
		     ) //
		    ,
		     new HashTree() //
		    ) //
		   ,
		    new HTTPSamplerProxy() //
		    .guiclass("HttpTestSampleGui") //
		    .testclass("HTTPSamplerProxy") //
		    .testname("post login") //
		    .enabled("true") //
		    .add( //
		     new ElementProp() //
		     .name("HTTPsampler.Arguments") //
		     .elementType("Arguments") //
		     .guiclass("HTTPArgumentsPanel") //
		     .testclass("Arguments") //
		     .enabled("true") //
		     .add( //
		      new CollectionProp() //
		      .name("Arguments.arguments") //
		      .add( //
		       new ElementProp() //
		       .name("javax.faces.partial.ajax") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ,
		       new ElementProp() //
		       .name("javax.faces.source") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ,
		       new ElementProp() //
		       .name("javax.faces.partial.execute") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ,
		       new ElementProp() //
		       .name("javax.faces.partial.render") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ,
		       new ElementProp() //
		       .name("login") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ,
		       new ElementProp() //
		       .name("form") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ,
		       new ElementProp() //
		       .name("j_username") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ,
		       new ElementProp() //
		       .name("j_password") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ,
		       new ElementProp() //
		       .name("javax.faces.ViewState") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ) //
		     ) //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.domain") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.port") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.connect_timeout") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.response_timeout") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.protocol") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.contentEncoding") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.path") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.method") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.follow_redirects") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.auto_redirects") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.use_keepalive") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.DO_MULTIPART_POST") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.monitor") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.embedded_url_re") //
		    ) //
		   ,
		    new HashTree() //
		    .add( //
		     new XMLAssertion() //
		     .guiclass("XMLAssertionGui") //
		     .testclass("XMLAssertion") //
		     .testname("assert xml") //
		     .enabled("true") //
		    ,
		     new HashTree() //
		    ,
		     new ResponseAssertion() //
		     .guiclass("AssertionGui") //
		     .testclass("ResponseAssertion") //
		     .testname("assert redirect") //
		     .enabled("true") //
		     .add( //
		      new CollectionProp() //
		      .name("Asserion.test_strings") //
		      .add( //
		       new StringProp() //
		       .name("-698385692") //
		      ) //
		     ,
		      new StringProp() //
		      .name("Assertion.test_field") //
		     ,
		      new BoolProp() //
		      .name("Assertion.assume_success") //
		     ,
		      new IntProp() //
		      .name("Assertion.test_type") //
		     ) //
		    ,
		     new HashTree() //
		    ) //
		   ,
		    new HTTPSamplerProxy() //
		    .guiclass("HttpTestSampleGui") //
		    .testclass("HTTPSamplerProxy") //
		    .testname("home") //
		    .enabled("true") //
		    .add( //
		     new ElementProp() //
		     .name("HTTPsampler.Arguments") //
		     .elementType("Arguments") //
		     .guiclass("HTTPArgumentsPanel") //
		     .testclass("Arguments") //
		     .enabled("true") //
		     .add( //
		      new CollectionProp() //
		      .name("Arguments.arguments") //
		     ) //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.domain") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.port") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.connect_timeout") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.response_timeout") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.protocol") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.contentEncoding") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.path") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.method") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.follow_redirects") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.auto_redirects") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.use_keepalive") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.DO_MULTIPART_POST") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.monitor") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.embedded_url_re") //
		    ) //
		   ,
		    new HashTree() //
		    .add( //
		     new ResponseAssertion() //
		     .guiclass("AssertionGui") //
		     .testclass("ResponseAssertion") //
		     .testname("assert title") //
		     .enabled("true") //
		     .add( //
		      new CollectionProp() //
		      .name("Asserion.test_strings") //
		      .add( //
		       new StringProp() //
		       .name("-1734538928") //
		      ) //
		     ,
		      new StringProp() //
		      .name("Assertion.test_field") //
		     ,
		      new BoolProp() //
		      .name("Assertion.assume_success") //
		     ,
		      new IntProp() //
		      .name("Assertion.test_type") //
		     ) //
		    ,
		     new HashTree() //
		    ) //
		   ,
		    new HTTPSamplerProxy() //
		    .guiclass("HttpTestSampleGui") //
		    .testclass("HTTPSamplerProxy") //
		    .testname("click search accounts") //
		    .enabled("true") //
		    .add( //
		     new ElementProp() //
		     .name("HTTPsampler.Arguments") //
		     .elementType("Arguments") //
		     .guiclass("HTTPArgumentsPanel") //
		     .testclass("Arguments") //
		     .enabled("true") //
		     .add( //
		      new CollectionProp() //
		      .name("Arguments.arguments") //
		      .add( //
		       new ElementProp() //
		       .name("form") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ) //
		      ,
		       new ElementProp() //
		       .name("javax.faces.ViewState") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ,
		       new ElementProp() //
		       .name("form:selectAccounts") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ) //
		     ) //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.domain") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.port") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.connect_timeout") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.response_timeout") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.protocol") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.contentEncoding") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.path") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.method") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.follow_redirects") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.auto_redirects") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.use_keepalive") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.DO_MULTIPART_POST") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.monitor") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.embedded_url_re") //
		    ) //
		   ,
		    new HashTree() //
		    .add( //
		     new ResponseAssertion() //
		     .guiclass("AssertionGui") //
		     .testclass("ResponseAssertion") //
		     .testname("assert title") //
		     .enabled("true") //
		     .add( //
		      new CollectionProp() //
		      .name("Asserion.test_strings") //
		      .add( //
		       new StringProp() //
		       .name("83441520") //
		      ) //
		     ,
		      new StringProp() //
		      .name("Assertion.test_field") //
		     ,
		      new BoolProp() //
		      .name("Assertion.assume_success") //
		     ,
		      new IntProp() //
		      .name("Assertion.test_type") //
		     ) //
		    ,
		     new HashTree() //
		    ,
		     new RegexExtractor() //
		     .guiclass("RegexExtractorGui") //
		     .testclass("RegexExtractor") //
		     .testname("extract cid") //
		     .enabled("true") //
		     .add( //
		      new StringProp() //
		      .name("RegexExtractor.useHeaders") //
		     ,
		      new StringProp() //
		      .name("RegexExtractor.refname") //
		     ,
		      new StringProp() //
		      .name("RegexExtractor.regex") //
		     ,
		      new StringProp() //
		      .name("RegexExtractor.template") //
		     ,
		      new StringProp() //
		      .name("RegexExtractor.default") //
		     ,
		      new StringProp() //
		      .name("RegexExtractor.match_number") //
		     ) //
		    ,
		     new HashTree() //
		    ) //
		   ,
		    new HTTPSamplerProxy() //
		    .guiclass("HttpTestSampleGui") //
		    .testclass("HTTPSamplerProxy") //
		    .testname("type d in username form") //
		    .enabled("true") //
		    .add( //
		     new ElementProp() //
		     .name("HTTPsampler.Arguments") //
		     .elementType("Arguments") //
		     .guiclass("HTTPArgumentsPanel") //
		     .testclass("Arguments") //
		     .enabled("true") //
		     .add( //
		      new CollectionProp() //
		      .name("Arguments.arguments") //
		      .add( //
		       new ElementProp() //
		       .name("javax.faces.partial.ajax") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ,
		       new ElementProp() //
		       .name("javax.faces.source") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ,
		       new ElementProp() //
		       .name("javax.faces.partial.execute") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ,
		       new ElementProp() //
		       .name("javax.faces.partial.render") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ,
		       new ElementProp() //
		       .name("form:username") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ,
		       new ElementProp() //
		       .name("form:username_query") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ,
		       new ElementProp() //
		       .name("form:username_input") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ,
		       new ElementProp() //
		       .name("form") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ,
		       new ElementProp() //
		       .name("_cid") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ,
		       new ElementProp() //
		       .name("javax.faces.ViewState") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ) //
		     ) //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.domain") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.port") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.connect_timeout") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.response_timeout") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.protocol") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.contentEncoding") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.path") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.method") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.follow_redirects") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.auto_redirects") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.use_keepalive") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.DO_MULTIPART_POST") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.monitor") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.embedded_url_re") //
		    ) //
		   ,
		    new HashTree() //
		    .add( //
		     new XMLAssertion() //
		     .guiclass("XMLAssertionGui") //
		     .testclass("XMLAssertion") //
		     .testname("assert xml") //
		     .enabled("true") //
		    ,
		     new HashTree() //
		    ,
		     new ResponseAssertion() //
		     .guiclass("AssertionGui") //
		     .testclass("ResponseAssertion") //
		     .testname("assert ajax response updates username") //
		     .enabled("true") //
		     .add( //
		      new CollectionProp() //
		      .name("Asserion.test_strings") //
		      .add( //
		       new StringProp() //
		       .name("-1934985013") //
		      ) //
		     ,
		      new StringProp() //
		      .name("Assertion.test_field") //
		     ,
		      new BoolProp() //
		      .name("Assertion.assume_success") //
		     ,
		      new IntProp() //
		      .name("Assertion.test_type") //
		     ) //
		    ,
		     new HashTree() //
		    ,
		     new ResponseAssertion() //
		     .guiclass("AssertionGui") //
		     .testclass("ResponseAssertion") //
		     .testname("assert results") //
		     .enabled("true") //
		     .add( //
		      new CollectionProp() //
		      .name("Asserion.test_strings") //
		      .add( //
		       new StringProp() //
		       .name("2063384715") //
		      ,
		       new StringProp() //
		       .name("62742") //
		      ,
		       new StringProp() //
		       .name("510294722") //
		      ,
		       new StringProp() //
		       .name("1870476603") //
		      ) //
		     ,
		      new StringProp() //
		      .name("Assertion.test_field") //
		     ,
		      new BoolProp() //
		      .name("Assertion.assume_success") //
		     ,
		      new IntProp() //
		      .name("Assertion.test_type") //
		     ) //
		    ,
		     new HashTree() //
		    ) //
		   ,
		    new HTTPSamplerProxy() //
		    .guiclass("HttpTestSampleGui") //
		    .testclass("HTTPSamplerProxy") //
		    .testname("click search with d") //
		    .enabled("true") //
		    .add( //
		     new ElementProp() //
		     .name("HTTPsampler.Arguments") //
		     .elementType("Arguments") //
		     .guiclass("HTTPArgumentsPanel") //
		     .testclass("Arguments") //
		     .enabled("true") //
		     .add( //
		      new CollectionProp() //
		      .name("Arguments.arguments") //
		      .add( //
		       new ElementProp() //
		       .name("javax.faces.partial.ajax") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ,
		       new ElementProp() //
		       .name("javax.faces.source") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ,
		       new ElementProp() //
		       .name("javax.faces.partial.execute") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ,
		       new ElementProp() //
		       .name("javax.faces.partial.render") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ,
		       new ElementProp() //
		       .name("form:search") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ,
		       new ElementProp() //
		       .name("form") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ,
		       new ElementProp() //
		       .name("_cid") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ,
		       new ElementProp() //
		       .name("form:username_hinput") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ,
		       new ElementProp() //
		       .name("javax.faces.ViewState") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ) //
		     ) //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.domain") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.port") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.connect_timeout") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.response_timeout") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.protocol") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.contentEncoding") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.path") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.method") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.follow_redirects") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.auto_redirects") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.use_keepalive") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.DO_MULTIPART_POST") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.monitor") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.embedded_url_re") //
		    ) //
		   ,
		    new HashTree() //
		    .add( //
		     new XMLAssertion() //
		     .guiclass("XMLAssertionGui") //
		     .testclass("XMLAssertion") //
		     .testname("assert xml") //
		     .enabled("true") //
		    ,
		     new HashTree() //
		    ,
		     new ResponseAssertion() //
		     .guiclass("AssertionGui") //
		     .testclass("ResponseAssertion") //
		     .testname("assert ajax response updates messages") //
		     .enabled("true") //
		     .add( //
		      new CollectionProp() //
		      .name("Asserion.test_strings") //
		      .add( //
		       new StringProp() //
		       .name("-1678136383") //
		      ) //
		     ,
		      new StringProp() //
		      .name("Assertion.test_field") //
		     ,
		      new BoolProp() //
		      .name("Assertion.assume_success") //
		     ,
		      new IntProp() //
		      .name("Assertion.test_type") //
		     ) //
		    ,
		     new HashTree() //
		    ,
		     new ResponseAssertion() //
		     .guiclass("AssertionGui") //
		     .testclass("ResponseAssertion") //
		     .testname("assert 3 results") //
		     .enabled("true") //
		     .add( //
		      new CollectionProp() //
		      .name("Asserion.test_strings") //
		      .add( //
		       new StringProp() //
		       .name("667692385") //
		      ) //
		     ,
		      new StringProp() //
		      .name("Assertion.test_field") //
		     ,
		      new BoolProp() //
		      .name("Assertion.assume_success") //
		     ,
		      new IntProp() //
		      .name("Assertion.test_type") //
		     ) //
		    ,
		     new HashTree() //
		    ,
		     new RegexExtractor() //
		     .guiclass("RegexExtractorGui") //
		     .testclass("RegexExtractor") //
		     .testname("extract edit admin id") //
		     .enabled("true") //
		     .add( //
		      new StringProp() //
		      .name("RegexExtractor.useHeaders") //
		     ,
		      new StringProp() //
		      .name("RegexExtractor.refname") //
		     ,
		      new StringProp() //
		      .name("RegexExtractor.regex") //
		     ,
		      new StringProp() //
		      .name("RegexExtractor.template") //
		     ,
		      new StringProp() //
		      .name("RegexExtractor.default") //
		     ,
		      new StringProp() //
		      .name("RegexExtractor.match_number") //
		     ) //
		    ,
		     new HashTree() //
		    ,
		     new RegexExtractor() //
		     .guiclass("RegexExtractorGui") //
		     .testclass("RegexExtractor") //
		     .testname("extract view admin id") //
		     .enabled("true") //
		     .add( //
		      new StringProp() //
		      .name("RegexExtractor.useHeaders") //
		     ,
		      new StringProp() //
		      .name("RegexExtractor.refname") //
		     ,
		      new StringProp() //
		      .name("RegexExtractor.regex") //
		     ,
		      new StringProp() //
		      .name("RegexExtractor.template") //
		     ,
		      new StringProp() //
		      .name("RegexExtractor.default") //
		     ,
		      new StringProp() //
		      .name("RegexExtractor.match_number") //
		     ) //
		    ,
		     new HashTree() //
		    ) //
		   ,
		    new HTTPSamplerProxy() //
		    .guiclass("HttpTestSampleGui") //
		    .testclass("HTTPSamplerProxy") //
		    .testname("click view admin") //
		    .enabled("true") //
		    .add( //
		     new ElementProp() //
		     .name("HTTPsampler.Arguments") //
		     .elementType("Arguments") //
		     .guiclass("HTTPArgumentsPanel") //
		     .testclass("Arguments") //
		     .enabled("true") //
		     .add( //
		      new CollectionProp() //
		      .name("Arguments.arguments") //
		      .add( //
		       new ElementProp() //
		       .name("form") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ,
		       new ElementProp() //
		       .name("_cid") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ,
		       new ElementProp() //
		       .name("javax.faces.ViewState") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ,
		       new ElementProp() //
		       .name("${adminViewId}") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ) //
		     ) //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.domain") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.port") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.connect_timeout") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.response_timeout") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.protocol") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.contentEncoding") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.path") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.method") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.follow_redirects") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.auto_redirects") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.use_keepalive") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.DO_MULTIPART_POST") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.monitor") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.embedded_url_re") //
		    ) //
		   ,
		    new HashTree() //
		    .add( //
		     new ResponseAssertion() //
		     .guiclass("AssertionGui") //
		     .testclass("ResponseAssertion") //
		     .testname("assert title") //
		     .enabled("true") //
		     .add( //
		      new CollectionProp() //
		      .name("Asserion.test_strings") //
		      .add( //
		       new StringProp() //
		       .name("-1199898641") //
		      ) //
		     ,
		      new StringProp() //
		      .name("Assertion.test_field") //
		     ,
		      new BoolProp() //
		      .name("Assertion.assume_success") //
		     ,
		      new IntProp() //
		      .name("Assertion.test_type") //
		     ) //
		    ,
		     new HashTree() //
		    ,
		     new RegexExtractor() //
		     .guiclass("RegexExtractorGui") //
		     .testclass("RegexExtractor") //
		     .testname("extract cid") //
		     .enabled("true") //
		     .add( //
		      new StringProp() //
		      .name("RegexExtractor.useHeaders") //
		     ,
		      new StringProp() //
		      .name("RegexExtractor.refname") //
		     ,
		      new StringProp() //
		      .name("RegexExtractor.regex") //
		     ,
		      new StringProp() //
		      .name("RegexExtractor.template") //
		     ,
		      new StringProp() //
		      .name("RegexExtractor.default") //
		     ,
		      new StringProp() //
		      .name("RegexExtractor.match_number") //
		     ) //
		    ,
		     new HashTree() //
		    ,
		     new RegexExtractor() //
		     .guiclass("RegexExtractorGui") //
		     .testclass("RegexExtractor") //
		     .testname("extract jsfViewState") //
		     .enabled("true") //
		     .add( //
		      new StringProp() //
		      .name("RegexExtractor.useHeaders") //
		     ,
		      new StringProp() //
		      .name("RegexExtractor.refname") //
		     ,
		      new StringProp() //
		      .name("RegexExtractor.regex") //
		     ,
		      new StringProp() //
		      .name("RegexExtractor.template") //
		     ,
		      new StringProp() //
		      .name("RegexExtractor.default") //
		     ,
		      new StringProp() //
		      .name("RegexExtractor.match_number") //
		     ) //
		    ,
		     new HashTree() //
		    ) //
		   ,
		    new HTTPSamplerProxy() //
		    .guiclass("HttpTestSampleGui") //
		    .testclass("HTTPSamplerProxy") //
		    .testname("click quit view admin") //
		    .enabled("true") //
		    .add( //
		     new ElementProp() //
		     .name("HTTPsampler.Arguments") //
		     .elementType("Arguments") //
		     .guiclass("HTTPArgumentsPanel") //
		     .testclass("Arguments") //
		     .enabled("true") //
		     .add( //
		      new CollectionProp() //
		      .name("Arguments.arguments") //
		      .add( //
		       new ElementProp() //
		       .name("form") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ,
		       new ElementProp() //
		       .name("form:back") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ,
		       new ElementProp() //
		       .name("_cid") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ,
		       new ElementProp() //
		       .name("javax.faces.ViewState") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ) //
		     ) //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.domain") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.port") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.connect_timeout") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.response_timeout") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.protocol") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.contentEncoding") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.path") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.method") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.follow_redirects") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.auto_redirects") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.use_keepalive") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.DO_MULTIPART_POST") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.monitor") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.embedded_url_re") //
		    ) //
		   ,
		    new HashTree() //
		    .add( //
		     new ResponseAssertion() //
		     .guiclass("AssertionGui") //
		     .testclass("ResponseAssertion") //
		     .testname("assert title") //
		     .enabled("true") //
		     .add( //
		      new CollectionProp() //
		      .name("Asserion.test_strings") //
		      .add( //
		       new StringProp() //
		       .name("83441520") //
		      ) //
		     ,
		      new StringProp() //
		      .name("Assertion.test_field") //
		     ,
		      new BoolProp() //
		      .name("Assertion.assume_success") //
		     ,
		      new IntProp() //
		      .name("Assertion.test_type") //
		     ) //
		    ,
		     new HashTree() //
		    ,
		     new RegexExtractor() //
		     .guiclass("RegexExtractorGui") //
		     .testclass("RegexExtractor") //
		     .testname("extract cid") //
		     .enabled("true") //
		     .add( //
		      new StringProp() //
		      .name("RegexExtractor.useHeaders") //
		     ,
		      new StringProp() //
		      .name("RegexExtractor.refname") //
		     ,
		      new StringProp() //
		      .name("RegexExtractor.regex") //
		     ,
		      new StringProp() //
		      .name("RegexExtractor.template") //
		     ,
		      new StringProp() //
		      .name("RegexExtractor.default") //
		     ,
		      new StringProp() //
		      .name("RegexExtractor.match_number") //
		     ) //
		    ,
		     new HashTree() //
		    ) //
		   ,
		    new HTTPSamplerProxy() //
		    .guiclass("HttpTestSampleGui") //
		    .testclass("HTTPSamplerProxy") //
		    .testname("click edit admin") //
		    .enabled("true") //
		    .add( //
		     new ElementProp() //
		     .name("HTTPsampler.Arguments") //
		     .elementType("Arguments") //
		     .guiclass("HTTPArgumentsPanel") //
		     .testclass("Arguments") //
		     .enabled("true") //
		     .add( //
		      new CollectionProp() //
		      .name("Arguments.arguments") //
		      .add( //
		       new ElementProp() //
		       .name("form") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ,
		       new ElementProp() //
		       .name("_cid") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ,
		       new ElementProp() //
		       .name("javax.faces.ViewState") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ,
		       new ElementProp() //
		       .name("${adminEditId}") //
		       .elementType("HTTPArgument") //
		       .add( //
		        new BoolProp() //
		        .name("HTTPArgument.always_encode") //
		       ,
		        new StringProp() //
		        .name("Argument.name") //
		       ,
		        new StringProp() //
		        .name("Argument.value") //
		       ,
		        new StringProp() //
		        .name("Argument.metadata") //
		       ,
		        new BoolProp() //
		        .name("HTTPArgument.use_equals") //
		       ) //
		      ) //
		     ) //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.domain") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.port") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.connect_timeout") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.response_timeout") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.protocol") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.contentEncoding") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.path") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.method") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.follow_redirects") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.auto_redirects") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.use_keepalive") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.DO_MULTIPART_POST") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.monitor") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.embedded_url_re") //
		    ) //
		   ,
		    new HashTree() //
		    .add( //
		     new ResponseAssertion() //
		     .guiclass("AssertionGui") //
		     .testclass("ResponseAssertion") //
		     .testname("assert title") //
		     .enabled("true") //
		     .add( //
		      new CollectionProp() //
		      .name("Asserion.test_strings") //
		      .add( //
		       new StringProp() //
		       .name("-1875976556") //
		      ) //
		     ,
		      new StringProp() //
		      .name("Assertion.test_field") //
		     ,
		      new BoolProp() //
		      .name("Assertion.assume_success") //
		     ,
		      new IntProp() //
		      .name("Assertion.test_type") //
		     ) //
		    ,
		     new HashTree() //
		    ) //
		   ,
		    new HTTPSamplerProxy() //
		    .guiclass("HttpTestSampleGui") //
		    .testclass("HTTPSamplerProxy") //
		    .testname("logout") //
		    .enabled("true") //
		    .add( //
		     new ElementProp() //
		     .name("HTTPsampler.Arguments") //
		     .elementType("Arguments") //
		     .guiclass("HTTPArgumentsPanel") //
		     .testclass("Arguments") //
		     .enabled("true") //
		     .add( //
		      new CollectionProp() //
		      .name("Arguments.arguments") //
		     ) //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.domain") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.port") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.connect_timeout") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.response_timeout") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.protocol") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.contentEncoding") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.path") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.method") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.follow_redirects") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.auto_redirects") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.use_keepalive") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.DO_MULTIPART_POST") //
		    ,
		     new BoolProp() //
		     .name("HTTPSampler.monitor") //
		    ,
		     new StringProp() //
		     .name("HTTPSampler.embedded_url_re") //
		    ) //
		   ,
		    new HashTree() //
		   ,
		    new ResultCollector() //
		    .guiclass("ViewResultsFullVisualizer") //
		    .testclass("ResultCollector") //
		    .testname("Results") //
		    .enabled("false") //
		    .add( //
		     new BoolProp() //
		     .name("ResultCollector.error_logging") //
		    ,
		     new StringProp() //
		     .name("filename") //
		    ) //
		   ,
		    new HashTree() //
		   ,
		    new ResultCollector() //
		    .guiclass("GraphVisualizer") //
		    .testclass("ResultCollector") //
		    .testname("Result graph") //
		    .enabled("true") //
		    .add( //
		     new BoolProp() //
		     .name("ResultCollector.error_logging") //
		    ,
		     new StringProp() //
		     .name("filename") //
		    ) //
		   ,
		    new HashTree() //
		   ,
		    new ResultCollector() //
		    .guiclass("StatGraphVisualizer") //
		    .testclass("ResultCollector") //
		    .testname("Agreggate graph") //
		    .enabled("true") //
		    .add( //
		     new BoolProp() //
		     .name("ResultCollector.error_logging") //
		    ,
		     new StringProp() //
		     .name("filename") //
		    ) //
		   ,
		    new HashTree() //
		   ) //
		  ) //
		 ) //
		 ) //
		 ;
	}
}
