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
	public class TestPlan extends BaseProp<TestPlan>{
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

		public T add(String name, String value) {
			return (T) this;
		}

		public T add(String name, boolean value) {
			return (T) this;
		}

		public T add(String name, long value) {
			return (T) this;
		}

		public T add(String name, int value) {
			return (T) this;
		}

		public T add(String name, double value) {
			return (T) this;
		}

		public T add(String name, Number value) {
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
		  .add("TestPlan.comments", "") //
		  .add("TestPlan.functional_mode", false) //
		  .add("TestPlan.serialize_threadgroups", false) //
		  .add("TestPlan.user_define_classpath", "") //
		  .add( //
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
		  ) ,//
		   new HashTree() //
		  .add( //
		     new ThreadGroup() //
		   .guiclass("ThreadGroupGui") //
		   .testclass("ThreadGroup") //
		   .testname("Groupe d'unit?s") //
		   .enabled("true") //
		   .add("ThreadGroup.on_sample_error", "continue") //
		   .add("ThreadGroup.num_threads", "1") //
		   .add("ThreadGroup.ramp_time", "1") //
		   .add("ThreadGroup.start_time", 1368454742000) //
		   .add("ThreadGroup.end_time", 1368454742000) //
		   .add("ThreadGroup.scheduler", false) //
		   .add("ThreadGroup.duration", "") //
		   .add("ThreadGroup.delay", "") //
		   .add( //
		       new ElementProp() //
		    .name("ThreadGroup.main_controller") //
		    .elementType("LoopController") //
		    .guiclass("LoopControlPanel") //
		    .testclass("LoopController") //
		    .testname("Contr?leur Boucle") //
		    .enabled("true") //
		    .add("LoopController.continue_forever", false) //
		    .add("LoopController.loops", "3") //
		   ) ,//
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
		      .add("Argument.name", "CONTEXT") //
		      .add("Argument.value", "tioiuyt") //
		      .add("Argument.metadata", "=") ,//
		           new ElementProp() //
		      .name("username") //
		      .elementType("Argument") //
		      .add("Argument.name", "username") //
		      .add("Argument.value", "admin") //
		      .add("Argument.metadata", "=") ,//
		           new ElementProp() //
		      .name("password") //
		      .elementType("Argument") //
		      .add("Argument.name", "password") //
		      .add("Argument.value", "admin") //
		      .add("Argument.metadata", "=") //
		     ) //
		    ) ,//
		       new HashTree() ,//
		       new CookieManager() //
		    .guiclass("CookiePanel") //
		    .testclass("CookieManager") //
		    .testname("HTTP Cookies") //
		    .enabled("true") //
		    .add("CookieManager.clearEachIteration", true) //
		    .add( //
		         new CollectionProp() //
		     .name("CookieManager.cookies") //
		    ) ,//
		       new HashTree() ,//
		       new ConfigTestElement() //
		    .guiclass("HttpDefaultsGui") //
		    .testclass("ConfigTestElement") //
		    .testname("HTTP Configuration") //
		    .enabled("true") //
		    .add("HTTPSampler.domain", "localhost") //
		    .add("HTTPSampler.port", "8080") //
		    .add("HTTPSampler.connect_timeout", "") //
		    .add("HTTPSampler.response_timeout", "") //
		    .add("HTTPSampler.protocol", "http") //
		    .add("HTTPSampler.contentEncoding", "UTF-8") //
		    .add("HTTPSampler.path", "/${CONTEXT}/") //
		    .add("HTTPSampler.concurrentPool", "4") //
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
		    ) ,//
		       new HashTree() ,//
		       new HTTPSamplerProxy() //
		    .guiclass("HttpTestSampleGui") //
		    .testclass("HTTPSamplerProxy") //
		    .testname("home anonymous") //
		    .enabled("true") //
		    .add("HTTPSampler.domain", "") //
		    .add("HTTPSampler.port", "") //
		    .add("HTTPSampler.connect_timeout", "") //
		    .add("HTTPSampler.response_timeout", "") //
		    .add("HTTPSampler.protocol", "") //
		    .add("HTTPSampler.contentEncoding", "") //
		    .add("HTTPSampler.path", "/${CONTEXT}/home.faces") //
		    .add("HTTPSampler.method", "GET") //
		    .add("HTTPSampler.follow_redirects", true) //
		    .add("HTTPSampler.auto_redirects", false) //
		    .add("HTTPSampler.use_keepalive", true) //
		    .add("HTTPSampler.DO_MULTIPART_POST", false) //
		    .add("HTTPSampler.monitor", false) //
		    .add("HTTPSampler.embedded_url_re", "") //
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
		       .add("HTTPArgument.always_encode", false) //
		       .add("Argument.value", "en") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) //
		       .add("Argument.name", "locale") //
		      ) //
		     ) //
		    ) ,//
		       new HashTree() //
		    .add( //
		         new ResponseAssertion() //
		     .guiclass("AssertionGui") //
		     .testclass("ResponseAssertion") //
		     .testname("assert title") //
		     .enabled("true") //
		     .add("Assertion.test_field", "Assertion.response_data") //
		     .add("Assertion.assume_success", false) //
		     .add("Assertion.test_type", 16) //
		     .add( //
		           new CollectionProp() //
		      .name("Asserion.test_strings") //
		      .add("-1734538928", "<title>Application ${CONTEXT}</title>") //
		     ) ,//
		         new HashTree() //
		    ) ,//
		       new HTTPSamplerProxy() //
		    .guiclass("HttpTestSampleGui") //
		    .testclass("HTTPSamplerProxy") //
		    .testname("login page") //
		    .enabled("true") //
		    .add("HTTPSampler.domain", "") //
		    .add("HTTPSampler.port", "") //
		    .add("HTTPSampler.connect_timeout", "") //
		    .add("HTTPSampler.response_timeout", "") //
		    .add("HTTPSampler.protocol", "") //
		    .add("HTTPSampler.contentEncoding", "") //
		    .add("HTTPSampler.path", "/${CONTEXT}/login.faces") //
		    .add("HTTPSampler.method", "GET") //
		    .add("HTTPSampler.follow_redirects", true) //
		    .add("HTTPSampler.auto_redirects", false) //
		    .add("HTTPSampler.use_keepalive", true) //
		    .add("HTTPSampler.DO_MULTIPART_POST", false) //
		    .add("HTTPSampler.monitor", false) //
		    .add("HTTPSampler.embedded_url_re", "") //
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
		    ) ,//
		       new HashTree() //
		    .add( //
		         new ResponseAssertion() //
		     .guiclass("AssertionGui") //
		     .testclass("ResponseAssertion") //
		     .testname("assert title") //
		     .enabled("true") //
		     .add("Assertion.test_field", "Assertion.response_data") //
		     .add("Assertion.assume_success", false) //
		     .add("Assertion.test_type", 16) //
		     .add( //
		           new CollectionProp() //
		      .name("Asserion.test_strings") //
		      .add("-936022144", "<title>Login</title>") //
		     ) ,//
		         new HashTree() ,//
		         new RegexExtractor() //
		     .guiclass("RegexExtractorGui") //
		     .testclass("RegexExtractor") //
		     .testname("extract jsfViewState") //
		     .enabled("true") //
		     .add("RegexExtractor.useHeaders", "false") //
		     .add("RegexExtractor.refname", "jsfViewState") //
		     .add("RegexExtractor.regex", "<input type=\"hidden\" name=\"javax\\.faces\\.ViewState\" id=\"javax\\.faces\\.ViewState\" value=\"([^\"]+)\".*/>") //
		     .add("RegexExtractor.template", "$1$") //
		     .add("RegexExtractor.default", "") //
		     .add("RegexExtractor.match_number", "0") ,//
		         new HashTree() //
		    ) ,//
		       new HTTPSamplerProxy() //
		    .guiclass("HttpTestSampleGui") //
		    .testclass("HTTPSamplerProxy") //
		    .testname("post login") //
		    .enabled("true") //
		    .add("HTTPSampler.domain", "") //
		    .add("HTTPSampler.port", "") //
		    .add("HTTPSampler.connect_timeout", "") //
		    .add("HTTPSampler.response_timeout", "") //
		    .add("HTTPSampler.protocol", "") //
		    .add("HTTPSampler.contentEncoding", "") //
		    .add("HTTPSampler.path", "/${CONTEXT}/login.faces") //
		    .add("HTTPSampler.method", "POST") //
		    .add("HTTPSampler.follow_redirects", true) //
		    .add("HTTPSampler.auto_redirects", false) //
		    .add("HTTPSampler.use_keepalive", true) //
		    .add("HTTPSampler.DO_MULTIPART_POST", false) //
		    .add("HTTPSampler.monitor", false) //
		    .add("HTTPSampler.embedded_url_re", "") //
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
		       .add("HTTPArgument.always_encode", false) //
		       .add("Argument.name", "javax.faces.partial.ajax") //
		       .add("Argument.value", "true") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) ,//
		             new ElementProp() //
		       .name("javax.faces.source") //
		       .elementType("HTTPArgument") //
		       .add("HTTPArgument.always_encode", false) //
		       .add("Argument.name", "javax.faces.source") //
		       .add("Argument.value", "login") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) ,//
		             new ElementProp() //
		       .name("javax.faces.partial.execute") //
		       .elementType("HTTPArgument") //
		       .add("HTTPArgument.always_encode", true) //
		       .add("Argument.name", "javax.faces.partial.execute") //
		       .add("Argument.value", "@all") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) ,//
		             new ElementProp() //
		       .name("javax.faces.partial.render") //
		       .elementType("HTTPArgument") //
		       .add("HTTPArgument.always_encode", false) //
		       .add("Argument.name", "javax.faces.partial.render") //
		       .add("Argument.value", "loginMessages") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) ,//
		             new ElementProp() //
		       .name("login") //
		       .elementType("HTTPArgument") //
		       .add("HTTPArgument.always_encode", false) //
		       .add("Argument.name", "login") //
		       .add("Argument.value", "login") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) ,//
		             new ElementProp() //
		       .name("form") //
		       .elementType("HTTPArgument") //
		       .add("HTTPArgument.always_encode", false) //
		       .add("Argument.name", "form") //
		       .add("Argument.value", "form") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) ,//
		             new ElementProp() //
		       .name("j_username") //
		       .elementType("HTTPArgument") //
		       .add("HTTPArgument.always_encode", false) //
		       .add("Argument.name", "j_username") //
		       .add("Argument.value", "${username}") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) ,//
		             new ElementProp() //
		       .name("j_password") //
		       .elementType("HTTPArgument") //
		       .add("HTTPArgument.always_encode", false) //
		       .add("Argument.name", "j_password") //
		       .add("Argument.value", "${password}") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) ,//
		             new ElementProp() //
		       .name("javax.faces.ViewState") //
		       .elementType("HTTPArgument") //
		       .add("HTTPArgument.always_encode", true) //
		       .add("Argument.name", "javax.faces.ViewState") //
		       .add("Argument.value", "${jsfViewState}") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) //
		      ) //
		     ) //
		    ) ,//
		       new HashTree() //
		    .add( //
		         new XMLAssertion() //
		     .guiclass("XMLAssertionGui") //
		     .testclass("XMLAssertion") //
		     .testname("assert xml") //
		     .enabled("true") ,//
		         new HashTree() ,//
		         new ResponseAssertion() //
		     .guiclass("AssertionGui") //
		     .testclass("ResponseAssertion") //
		     .testname("assert redirect") //
		     .enabled("true") //
		     .add("Assertion.test_field", "Assertion.response_data") //
		     .add("Assertion.assume_success", false) //
		     .add("Assertion.test_type", 16) //
		     .add( //
		           new CollectionProp() //
		      .name("Asserion.test_strings") //
		      .add("-698385692", "<partial-response><redirect url=\"/${CONTEXT}/home.faces\"></redirect></partial-response>") //
		     ) ,//
		         new HashTree() //
		    ) ,//
		       new HTTPSamplerProxy() //
		    .guiclass("HttpTestSampleGui") //
		    .testclass("HTTPSamplerProxy") //
		    .testname("home") //
		    .enabled("true") //
		    .add("HTTPSampler.domain", "") //
		    .add("HTTPSampler.port", "") //
		    .add("HTTPSampler.connect_timeout", "") //
		    .add("HTTPSampler.response_timeout", "") //
		    .add("HTTPSampler.protocol", "") //
		    .add("HTTPSampler.contentEncoding", "") //
		    .add("HTTPSampler.path", "/${CONTEXT}/home.faces") //
		    .add("HTTPSampler.method", "GET") //
		    .add("HTTPSampler.follow_redirects", true) //
		    .add("HTTPSampler.auto_redirects", false) //
		    .add("HTTPSampler.use_keepalive", true) //
		    .add("HTTPSampler.DO_MULTIPART_POST", false) //
		    .add("HTTPSampler.monitor", false) //
		    .add("HTTPSampler.embedded_url_re", "") //
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
		    ) ,//
		       new HashTree() //
		    .add( //
		         new ResponseAssertion() //
		     .guiclass("AssertionGui") //
		     .testclass("ResponseAssertion") //
		     .testname("assert title") //
		     .enabled("true") //
		     .add("Assertion.test_field", "Assertion.response_data") //
		     .add("Assertion.assume_success", false) //
		     .add("Assertion.test_type", 2) //
		     .add( //
		           new CollectionProp() //
		      .name("Asserion.test_strings") //
		      .add("-1734538928", "<title>Application ${CONTEXT}</title>") //
		     ) ,//
		         new HashTree() //
		    ) ,//
		       new HTTPSamplerProxy() //
		    .guiclass("HttpTestSampleGui") //
		    .testclass("HTTPSamplerProxy") //
		    .testname("click search accounts") //
		    .enabled("true") //
		    .add("HTTPSampler.domain", "") //
		    .add("HTTPSampler.port", "") //
		    .add("HTTPSampler.connect_timeout", "") //
		    .add("HTTPSampler.response_timeout", "") //
		    .add("HTTPSampler.protocol", "") //
		    .add("HTTPSampler.contentEncoding", "") //
		    .add("HTTPSampler.path", "/${CONTEXT}/home.faces") //
		    .add("HTTPSampler.method", "POST") //
		    .add("HTTPSampler.follow_redirects", true) //
		    .add("HTTPSampler.auto_redirects", false) //
		    .add("HTTPSampler.use_keepalive", true) //
		    .add("HTTPSampler.DO_MULTIPART_POST", false) //
		    .add("HTTPSampler.monitor", false) //
		    .add("HTTPSampler.embedded_url_re", "") //
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
		       .add("HTTPArgument.always_encode", false) //
		       .add("Argument.value", "form") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) //
		       .add("Argument.name", "form") ,//
		             new ElementProp() //
		       .name("javax.faces.ViewState") //
		       .elementType("HTTPArgument") //
		       .add("HTTPArgument.always_encode", true) //
		       .add("Argument.name", "javax.faces.ViewState") //
		       .add("Argument.value", "${jsfViewState}") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) ,//
		             new ElementProp() //
		       .name("form:selectAccounts") //
		       .elementType("HTTPArgument") //
		       .add("HTTPArgument.always_encode", true) //
		       .add("Argument.name", "form:selectAccounts") //
		       .add("Argument.value", "form:selectAccounts") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) //
		      ) //
		     ) //
		    ) ,//
		       new HashTree() //
		    .add( //
		         new ResponseAssertion() //
		     .guiclass("AssertionGui") //
		     .testclass("ResponseAssertion") //
		     .testname("assert title") //
		     .enabled("true") //
		     .add("Assertion.test_field", "Assertion.response_data") //
		     .add("Assertion.assume_success", false) //
		     .add("Assertion.test_type", 16) //
		     .add( //
		           new CollectionProp() //
		      .name("Asserion.test_strings") //
		      .add("83441520", "<title>Search Account</title>") //
		     ) ,//
		         new HashTree() ,//
		         new RegexExtractor() //
		     .guiclass("RegexExtractorGui") //
		     .testclass("RegexExtractor") //
		     .testname("extract cid") //
		     .enabled("true") //
		     .add("RegexExtractor.useHeaders", "false") //
		     .add("RegexExtractor.refname", "cid") //
		     .add("RegexExtractor.regex", "<input type=\"hidden\" name=\"_cid\" value=\"([^\"]+)\".*/>") //
		     .add("RegexExtractor.template", "$1$") //
		     .add("RegexExtractor.default", "") //
		     .add("RegexExtractor.match_number", "") ,//
		         new HashTree() //
		    ) ,//
		       new HTTPSamplerProxy() //
		    .guiclass("HttpTestSampleGui") //
		    .testclass("HTTPSamplerProxy") //
		    .testname("type d in username form") //
		    .enabled("true") //
		    .add("HTTPSampler.domain", "") //
		    .add("HTTPSampler.port", "") //
		    .add("HTTPSampler.connect_timeout", "") //
		    .add("HTTPSampler.response_timeout", "") //
		    .add("HTTPSampler.protocol", "") //
		    .add("HTTPSampler.contentEncoding", "") //
		    .add("HTTPSampler.path", "/${CONTEXT}/domain/accountSelect.faces") //
		    .add("HTTPSampler.method", "POST") //
		    .add("HTTPSampler.follow_redirects", true) //
		    .add("HTTPSampler.auto_redirects", false) //
		    .add("HTTPSampler.use_keepalive", true) //
		    .add("HTTPSampler.DO_MULTIPART_POST", false) //
		    .add("HTTPSampler.monitor", false) //
		    .add("HTTPSampler.embedded_url_re", "") //
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
		       .add("HTTPArgument.always_encode", false) //
		       .add("Argument.name", "javax.faces.partial.ajax") //
		       .add("Argument.value", "true") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) ,//
		             new ElementProp() //
		       .name("javax.faces.source") //
		       .elementType("HTTPArgument") //
		       .add("HTTPArgument.always_encode", true) //
		       .add("Argument.name", "javax.faces.source") //
		       .add("Argument.value", "form:username") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) ,//
		             new ElementProp() //
		       .name("javax.faces.partial.execute") //
		       .elementType("HTTPArgument") //
		       .add("HTTPArgument.always_encode", true) //
		       .add("Argument.name", "javax.faces.partial.execute") //
		       .add("Argument.value", "form:username") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) ,//
		             new ElementProp() //
		       .name("javax.faces.partial.render") //
		       .elementType("HTTPArgument") //
		       .add("HTTPArgument.always_encode", true) //
		       .add("Argument.name", "javax.faces.partial.render") //
		       .add("Argument.value", "form:username") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) ,//
		             new ElementProp() //
		       .name("form:username") //
		       .elementType("HTTPArgument") //
		       .add("HTTPArgument.always_encode", true) //
		       .add("Argument.name", "form:username") //
		       .add("Argument.value", "form:username") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) ,//
		             new ElementProp() //
		       .name("form:username_query") //
		       .elementType("HTTPArgument") //
		       .add("HTTPArgument.always_encode", true) //
		       .add("Argument.name", "form:username_query") //
		       .add("Argument.value", "d") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) ,//
		             new ElementProp() //
		       .name("form:username_input") //
		       .elementType("HTTPArgument") //
		       .add("HTTPArgument.always_encode", true) //
		       .add("Argument.name", "form:username_input") //
		       .add("Argument.value", "glouglou") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) ,//
		             new ElementProp() //
		       .name("form") //
		       .elementType("HTTPArgument") //
		       .add("HTTPArgument.always_encode", false) //
		       .add("Argument.name", "form") //
		       .add("Argument.value", "form") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) ,//
		             new ElementProp() //
		       .name("_cid") //
		       .elementType("HTTPArgument") //
		       .add("HTTPArgument.always_encode", false) //
		       .add("Argument.name", "_cid") //
		       .add("Argument.value", "${cid}") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) ,//
		             new ElementProp() //
		       .name("javax.faces.ViewState") //
		       .elementType("HTTPArgument") //
		       .add("HTTPArgument.always_encode", true) //
		       .add("Argument.name", "javax.faces.ViewState") //
		       .add("Argument.value", "${jsfViewState}") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) //
		      ) //
		     ) //
		    ) ,//
		       new HashTree() //
		    .add( //
		         new XMLAssertion() //
		     .guiclass("XMLAssertionGui") //
		     .testclass("XMLAssertion") //
		     .testname("assert xml") //
		     .enabled("true") ,//
		         new HashTree() ,//
		         new ResponseAssertion() //
		     .guiclass("AssertionGui") //
		     .testclass("ResponseAssertion") //
		     .testname("assert ajax response updates username") //
		     .enabled("true") //
		     .add("Assertion.test_field", "Assertion.response_data") //
		     .add("Assertion.assume_success", false) //
		     .add("Assertion.test_type", 16) //
		     .add( //
		           new CollectionProp() //
		      .name("Asserion.test_strings") //
		      .add("-1934985013", "<partial-response><changes><update id=\"form:username\">") //
		     ) ,//
		         new HashTree() ,//
		         new ResponseAssertion() //
		     .guiclass("AssertionGui") //
		     .testclass("ResponseAssertion") //
		     .testname("assert results") //
		     .enabled("true") //
		     .add("Assertion.test_field", "Assertion.response_data") //
		     .add("Assertion.assume_success", false) //
		     .add("Assertion.test_type", 16) //
		     .add( //
		           new CollectionProp() //
		      .name("Asserion.test_strings") //
		      .add("2063384715", ">admin<") //
		      .add("62742", ">d<") //
		      .add("510294722", ">disabled<") //
		      .add("1870476603", ">demo<") //
		     ) ,//
		         new HashTree() //
		    ) ,//
		       new HTTPSamplerProxy() //
		    .guiclass("HttpTestSampleGui") //
		    .testclass("HTTPSamplerProxy") //
		    .testname("click search with d") //
		    .enabled("true") //
		    .add("HTTPSampler.domain", "") //
		    .add("HTTPSampler.port", "") //
		    .add("HTTPSampler.connect_timeout", "") //
		    .add("HTTPSampler.response_timeout", "") //
		    .add("HTTPSampler.protocol", "") //
		    .add("HTTPSampler.contentEncoding", "") //
		    .add("HTTPSampler.path", "/${CONTEXT}/domain/accountSelect.faces") //
		    .add("HTTPSampler.method", "POST") //
		    .add("HTTPSampler.follow_redirects", true) //
		    .add("HTTPSampler.auto_redirects", false) //
		    .add("HTTPSampler.use_keepalive", true) //
		    .add("HTTPSampler.DO_MULTIPART_POST", false) //
		    .add("HTTPSampler.monitor", false) //
		    .add("HTTPSampler.embedded_url_re", "") //
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
		       .add("HTTPArgument.always_encode", false) //
		       .add("Argument.name", "javax.faces.partial.ajax") //
		       .add("Argument.value", "true") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) ,//
		             new ElementProp() //
		       .name("javax.faces.source") //
		       .elementType("HTTPArgument") //
		       .add("HTTPArgument.always_encode", true) //
		       .add("Argument.name", "javax.faces.source") //
		       .add("Argument.value", "form:search") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) ,//
		             new ElementProp() //
		       .name("javax.faces.partial.execute") //
		       .elementType("HTTPArgument") //
		       .add("HTTPArgument.always_encode", false) //
		       .add("Argument.name", "javax.faces.partial.execute") //
		       .add("Argument.value", "form") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) ,//
		             new ElementProp() //
		       .name("javax.faces.partial.render") //
		       .elementType("HTTPArgument") //
		       .add("HTTPArgument.always_encode", true) //
		       .add("Argument.name", "javax.faces.partial.render") //
		       .add("Argument.value", "form:messages form:searchResults") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) ,//
		             new ElementProp() //
		       .name("form:search") //
		       .elementType("HTTPArgument") //
		       .add("HTTPArgument.always_encode", true) //
		       .add("Argument.name", "form:search") //
		       .add("Argument.value", "form:search") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) ,//
		             new ElementProp() //
		       .name("form") //
		       .elementType("HTTPArgument") //
		       .add("HTTPArgument.always_encode", false) //
		       .add("Argument.name", "form") //
		       .add("Argument.value", "form") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) ,//
		             new ElementProp() //
		       .name("_cid") //
		       .elementType("HTTPArgument") //
		       .add("HTTPArgument.always_encode", false) //
		       .add("Argument.name", "_cid") //
		       .add("Argument.value", "${cid}") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) ,//
		             new ElementProp() //
		       .name("form:username_hinput") //
		       .elementType("HTTPArgument") //
		       .add("HTTPArgument.always_encode", true) //
		       .add("Argument.name", "form:username_hinput") //
		       .add("Argument.value", "d") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) ,//
		             new ElementProp() //
		       .name("javax.faces.ViewState") //
		       .elementType("HTTPArgument") //
		       .add("HTTPArgument.always_encode", true) //
		       .add("Argument.name", "javax.faces.ViewState") //
		       .add("Argument.value", "${jsfViewState}") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) //
		      ) //
		     ) //
		    ) ,//
		       new HashTree() //
		    .add( //
		         new XMLAssertion() //
		     .guiclass("XMLAssertionGui") //
		     .testclass("XMLAssertion") //
		     .testname("assert xml") //
		     .enabled("true") ,//
		         new HashTree() ,//
		         new ResponseAssertion() //
		     .guiclass("AssertionGui") //
		     .testclass("ResponseAssertion") //
		     .testname("assert ajax response updates messages") //
		     .enabled("true") //
		     .add("Assertion.test_field", "Assertion.response_data") //
		     .add("Assertion.assume_success", false) //
		     .add("Assertion.test_type", 16) //
		     .add( //
		           new CollectionProp() //
		      .name("Asserion.test_strings") //
		      .add("-1678136383", "<partial-response><changes><update id=\"form:messages\">") //
		     ) ,//
		         new HashTree() ,//
		         new ResponseAssertion() //
		     .guiclass("AssertionGui") //
		     .testclass("ResponseAssertion") //
		     .testname("assert 3 results") //
		     .enabled("true") //
		     .add("Assertion.test_field", "Assertion.response_data") //
		     .add("Assertion.assume_success", false) //
		     .add("Assertion.test_type", 16) //
		     .add( //
		           new CollectionProp() //
		      .name("Asserion.test_strings") //
		      .add("667692385", "There are 3 results") //
		     ) ,//
		         new HashTree() ,//
		         new RegexExtractor() //
		     .guiclass("RegexExtractorGui") //
		     .testclass("RegexExtractor") //
		     .testname("extract edit admin id") //
		     .enabled("true") //
		     .add("RegexExtractor.useHeaders", "false") //
		     .add("RegexExtractor.refname", "adminEditId") //
		     .add("RegexExtractor.regex", "<a id=\"([^\"]+)\" href=\"#\" class=\"ui-commandlink ui-widget ui-button\" aria-label=\"Edit admin\"") //
		     .add("RegexExtractor.template", "$1$") //
		     .add("RegexExtractor.default", "") //
		     .add("RegexExtractor.match_number", "0") ,//
		         new HashTree() ,//
		         new RegexExtractor() //
		     .guiclass("RegexExtractorGui") //
		     .testclass("RegexExtractor") //
		     .testname("extract view admin id") //
		     .enabled("true") //
		     .add("RegexExtractor.useHeaders", "false") //
		     .add("RegexExtractor.refname", "adminViewId") //
		     .add("RegexExtractor.regex", "<a id=\"([^\"]+)\" href=\"#\" class=\"ui-commandlink ui-widget ui-button\" aria-label=\"View admin\"") //
		     .add("RegexExtractor.template", "$1$") //
		     .add("RegexExtractor.default", "") //
		     .add("RegexExtractor.match_number", "0") ,//
		         new HashTree() //
		    ) ,//
		       new HTTPSamplerProxy() //
		    .guiclass("HttpTestSampleGui") //
		    .testclass("HTTPSamplerProxy") //
		    .testname("click view admin") //
		    .enabled("true") //
		    .add("HTTPSampler.domain", "") //
		    .add("HTTPSampler.port", "") //
		    .add("HTTPSampler.connect_timeout", "") //
		    .add("HTTPSampler.response_timeout", "") //
		    .add("HTTPSampler.protocol", "") //
		    .add("HTTPSampler.contentEncoding", "") //
		    .add("HTTPSampler.path", "/${CONTEXT}/domain/accountSelect.faces") //
		    .add("HTTPSampler.method", "POST") //
		    .add("HTTPSampler.follow_redirects", true) //
		    .add("HTTPSampler.auto_redirects", false) //
		    .add("HTTPSampler.use_keepalive", true) //
		    .add("HTTPSampler.DO_MULTIPART_POST", false) //
		    .add("HTTPSampler.monitor", false) //
		    .add("HTTPSampler.embedded_url_re", "") //
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
		       .add("HTTPArgument.always_encode", false) //
		       .add("Argument.name", "form") //
		       .add("Argument.value", "form") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) ,//
		             new ElementProp() //
		       .name("_cid") //
		       .elementType("HTTPArgument") //
		       .add("HTTPArgument.always_encode", false) //
		       .add("Argument.name", "_cid") //
		       .add("Argument.value", "${cid}") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) ,//
		             new ElementProp() //
		       .name("javax.faces.ViewState") //
		       .elementType("HTTPArgument") //
		       .add("HTTPArgument.always_encode", true) //
		       .add("Argument.name", "javax.faces.ViewState") //
		       .add("Argument.value", "${jsfViewState}") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) ,//
		             new ElementProp() //
		       .name("${adminViewId}") //
		       .elementType("HTTPArgument") //
		       .add("HTTPArgument.always_encode", true) //
		       .add("Argument.name", "${adminViewId}") //
		       .add("Argument.value", "${adminViewId}") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) //
		      ) //
		     ) //
		    ) ,//
		       new HashTree() //
		    .add( //
		         new ResponseAssertion() //
		     .guiclass("AssertionGui") //
		     .testclass("ResponseAssertion") //
		     .testname("assert title") //
		     .enabled("true") //
		     .add("Assertion.test_field", "Assertion.response_data") //
		     .add("Assertion.assume_success", false) //
		     .add("Assertion.test_type", 16) //
		     .add( //
		           new CollectionProp() //
		      .name("Asserion.test_strings") //
		      .add("-1199898641", "<title>View admin</title>") //
		     ) ,//
		         new HashTree() ,//
		         new RegexExtractor() //
		     .guiclass("RegexExtractorGui") //
		     .testclass("RegexExtractor") //
		     .testname("extract cid") //
		     .enabled("true") //
		     .add("RegexExtractor.useHeaders", "false") //
		     .add("RegexExtractor.refname", "cid") //
		     .add("RegexExtractor.regex", "<input type=\"hidden\" name=\"_cid\" value=\"([^\"]+)\".*/>") //
		     .add("RegexExtractor.template", "$1$") //
		     .add("RegexExtractor.default", "") //
		     .add("RegexExtractor.match_number", "0") ,//
		         new HashTree() ,//
		         new RegexExtractor() //
		     .guiclass("RegexExtractorGui") //
		     .testclass("RegexExtractor") //
		     .testname("extract jsfViewState") //
		     .enabled("true") //
		     .add("RegexExtractor.useHeaders", "false") //
		     .add("RegexExtractor.refname", "jsfViewState") //
		     .add("RegexExtractor.regex", "<input type=\"hidden\" name=\"javax\\.faces\\.ViewState\" id=\"javax\\.faces\\.ViewState\" value=\"([^\"]+)\".*/>") //
		     .add("RegexExtractor.template", "$1$") //
		     .add("RegexExtractor.default", "") //
		     .add("RegexExtractor.match_number", "0") ,//
		         new HashTree() //
		    ) ,//
		       new HTTPSamplerProxy() //
		    .guiclass("HttpTestSampleGui") //
		    .testclass("HTTPSamplerProxy") //
		    .testname("click quit view admin") //
		    .enabled("true") //
		    .add("HTTPSampler.domain", "") //
		    .add("HTTPSampler.port", "") //
		    .add("HTTPSampler.connect_timeout", "") //
		    .add("HTTPSampler.response_timeout", "") //
		    .add("HTTPSampler.protocol", "") //
		    .add("HTTPSampler.contentEncoding", "") //
		    .add("HTTPSampler.path", "/${CONTEXT}/domain/accountEdit.faces") //
		    .add("HTTPSampler.method", "POST") //
		    .add("HTTPSampler.follow_redirects", true) //
		    .add("HTTPSampler.auto_redirects", false) //
		    .add("HTTPSampler.use_keepalive", true) //
		    .add("HTTPSampler.DO_MULTIPART_POST", false) //
		    .add("HTTPSampler.monitor", false) //
		    .add("HTTPSampler.embedded_url_re", "") //
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
		       .add("HTTPArgument.always_encode", false) //
		       .add("Argument.name", "form") //
		       .add("Argument.value", "form") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) ,//
		             new ElementProp() //
		       .name("form:back") //
		       .elementType("HTTPArgument") //
		       .add("HTTPArgument.always_encode", true) //
		       .add("Argument.name", "form:back") //
		       .add("Argument.value", "") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) ,//
		             new ElementProp() //
		       .name("_cid") //
		       .elementType("HTTPArgument") //
		       .add("HTTPArgument.always_encode", false) //
		       .add("Argument.name", "_cid") //
		       .add("Argument.value", "${cid}") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) ,//
		             new ElementProp() //
		       .name("javax.faces.ViewState") //
		       .elementType("HTTPArgument") //
		       .add("HTTPArgument.always_encode", true) //
		       .add("Argument.name", "javax.faces.ViewState") //
		       .add("Argument.value", "${jsfViewState}") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) //
		      ) //
		     ) //
		    ) ,//
		       new HashTree() //
		    .add( //
		         new ResponseAssertion() //
		     .guiclass("AssertionGui") //
		     .testclass("ResponseAssertion") //
		     .testname("assert title") //
		     .enabled("true") //
		     .add("Assertion.test_field", "Assertion.response_data") //
		     .add("Assertion.assume_success", false) //
		     .add("Assertion.test_type", 16) //
		     .add( //
		           new CollectionProp() //
		      .name("Asserion.test_strings") //
		      .add("83441520", "<title>Search Account</title>") //
		     ) ,//
		         new HashTree() ,//
		         new RegexExtractor() //
		     .guiclass("RegexExtractorGui") //
		     .testclass("RegexExtractor") //
		     .testname("extract cid") //
		     .enabled("true") //
		     .add("RegexExtractor.useHeaders", "false") //
		     .add("RegexExtractor.refname", "cid") //
		     .add("RegexExtractor.regex", "<input type=\"hidden\" name=\"_cid\" value=\"([^\"]+)\".*/>") //
		     .add("RegexExtractor.template", "$1$") //
		     .add("RegexExtractor.default", "") //
		     .add("RegexExtractor.match_number", "0") ,//
		         new HashTree() //
		    ) ,//
		       new HTTPSamplerProxy() //
		    .guiclass("HttpTestSampleGui") //
		    .testclass("HTTPSamplerProxy") //
		    .testname("click edit admin") //
		    .enabled("true") //
		    .add("HTTPSampler.domain", "") //
		    .add("HTTPSampler.port", "") //
		    .add("HTTPSampler.connect_timeout", "") //
		    .add("HTTPSampler.response_timeout", "") //
		    .add("HTTPSampler.protocol", "") //
		    .add("HTTPSampler.contentEncoding", "") //
		    .add("HTTPSampler.path", "/${CONTEXT}/domain/accountSelect.faces") //
		    .add("HTTPSampler.method", "POST") //
		    .add("HTTPSampler.follow_redirects", true) //
		    .add("HTTPSampler.auto_redirects", false) //
		    .add("HTTPSampler.use_keepalive", true) //
		    .add("HTTPSampler.DO_MULTIPART_POST", false) //
		    .add("HTTPSampler.monitor", false) //
		    .add("HTTPSampler.embedded_url_re", "") //
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
		       .add("HTTPArgument.always_encode", false) //
		       .add("Argument.name", "form") //
		       .add("Argument.value", "form") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) ,//
		             new ElementProp() //
		       .name("_cid") //
		       .elementType("HTTPArgument") //
		       .add("HTTPArgument.always_encode", false) //
		       .add("Argument.name", "_cid") //
		       .add("Argument.value", "${cid}") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) ,//
		             new ElementProp() //
		       .name("javax.faces.ViewState") //
		       .elementType("HTTPArgument") //
		       .add("HTTPArgument.always_encode", false) //
		       .add("Argument.name", "javax.faces.ViewState") //
		       .add("Argument.value", "${jsfViewState}") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) ,//
		             new ElementProp() //
		       .name("${adminEditId}") //
		       .elementType("HTTPArgument") //
		       .add("HTTPArgument.always_encode", false) //
		       .add("Argument.name", "${adminEditId}") //
		       .add("Argument.value", "${adminEditId}") //
		       .add("Argument.metadata", "=") //
		       .add("HTTPArgument.use_equals", true) //
		      ) //
		     ) //
		    ) ,//
		       new HashTree() //
		    .add( //
		         new ResponseAssertion() //
		     .guiclass("AssertionGui") //
		     .testclass("ResponseAssertion") //
		     .testname("assert title") //
		     .enabled("true") //
		     .add("Assertion.test_field", "Assertion.response_data") //
		     .add("Assertion.assume_success", false) //
		     .add("Assertion.test_type", 2) //
		     .add( //
		           new CollectionProp() //
		      .name("Asserion.test_strings") //
		      .add("-1875976556", "<title>Edit admin</title>") //
		     ) ,//
		         new HashTree() //
		    ) ,//
		       new HTTPSamplerProxy() //
		    .guiclass("HttpTestSampleGui") //
		    .testclass("HTTPSamplerProxy") //
		    .testname("logout") //
		    .enabled("true") //
		    .add("HTTPSampler.domain", "") //
		    .add("HTTPSampler.port", "") //
		    .add("HTTPSampler.connect_timeout", "") //
		    .add("HTTPSampler.response_timeout", "") //
		    .add("HTTPSampler.protocol", "") //
		    .add("HTTPSampler.contentEncoding", "") //
		    .add("HTTPSampler.path", "/${CONTEXT}/logout.faces") //
		    .add("HTTPSampler.method", "GET") //
		    .add("HTTPSampler.follow_redirects", true) //
		    .add("HTTPSampler.auto_redirects", false) //
		    .add("HTTPSampler.use_keepalive", true) //
		    .add("HTTPSampler.DO_MULTIPART_POST", false) //
		    .add("HTTPSampler.monitor", false) //
		    .add("HTTPSampler.embedded_url_re", "") //
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
		    ) ,//
		       new HashTree() ,//
		       new ResultCollector() //
		    .guiclass("ViewResultsFullVisualizer") //
		    .testclass("ResultCollector") //
		    .testname("Results") //
		    .enabled("false") //
		    .add("ResultCollector.error_logging", false) //
		    .add("filename", "") ,//
		       new HashTree() ,//
		       new ResultCollector() //
		    .guiclass("GraphVisualizer") //
		    .testclass("ResultCollector") //
		    .testname("Result graph") //
		    .enabled("true") //
		    .add("ResultCollector.error_logging", false) //
		    .add("filename", "") ,//
		       new HashTree() ,//
		       new ResultCollector() //
		    .guiclass("StatGraphVisualizer") //
		    .testclass("ResultCollector") //
		    .testname("Agreggate graph") //
		    .enabled("true") //
		    .add("ResultCollector.error_logging", false) //
		    .add("filename", "") ,//
		       new HashTree() //
		   ) //
		  ) //
		 ) //
		 ) //
		;
	}
}
