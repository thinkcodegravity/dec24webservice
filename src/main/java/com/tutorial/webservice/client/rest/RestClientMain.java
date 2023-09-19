package com.tutorial.webservice.client.rest;
import org.springframework.web.client.RestTemplate;

public class RestClientMain {

	public static void main(String[] args) {
		testJsonRes();
	}
/*	
	Get Http client - browser, postman , RestTemplate
	URL = ? includes url and input both
	Response = what output is expected from rest services
		int/string/float etc.. if response is json an object(json compliant)
*/
	
	public static void testAdd() {
		RestTemplate getClient=new RestTemplate(); // similar to soap stub program
		int res=getClient.getForObject(
				"http://localhost/additionService/35/5",
				Integer.class);
		System.out.println("Add rest service result :"+res);
	}
	// get method
	// URL = url include http part + input
	// output = resonse
	public static void testArea() {
		RestTemplate getTest=new RestTemplate();
		int res=getTest.getForObject
				("http://localhost/areaOfRectangle?breadth=25&length=10", Integer.class);
		System.out.println("Sub rest service result :"+res);
	}
/*
	Post Http client
	URL = ? includes url 
	Request = if sending json input pass object(json compliant) 
	Response = what output is expected from rest services
		int/string/float etc.. object(json compliant) if response is json
*/
	public static void testSimInt()
	{
		PostWsJsonInput si=new PostWsJsonInput ();
		si.principal=250000; si.time=10; si.rate=6;
		RestTemplate post=new RestTemplate();
	int res=post.postForObject(
			
			"http://localhost/simpleInt", 
						si ,
					Integer.class);
	
	System.out.println(res );
	}
	public static void testJsonRes()
	{
		RestTemplate restClient=new RestTemplate();
		ComplexOutput res=restClient.getForObject("http://localhost/allMath/100/10", ComplexOutput.class);
		/*
		{
		    "sum": 15,
		    "sub": 5,
		    "mul": 50,
		    "div": 2
		}
		*/
		System.out.println(res.sum);
		System.out.println(res.sub);
		System.out.println(res.mul);
		System.out.println(res.div);
		
		
	}
	/*
	 
	public static void testSubP() {
		RestTemplate getTest=new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		map.add("x", "20");
		map.add("y", "10");
		HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);
   
		int res=getTest.postForObject
				("http://localhost:8888/subCalP",request,
						Integer.class);
		System.out.println("Sub rest service result :"+res);
	}
	 */
}
