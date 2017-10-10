package server;

import org.grain.httpserver.HttpManager;

import protobuf.http.UserGroupProto.GetTokenC;
import protobuf.http.UserGroupProto.GetTokenS;
import test.TestHttpService;

public class ExpandServer {
	public ExpandServer() throws Exception {
		HttpManager.addMapping("1", GetTokenC.class, GetTokenS.class);
		HttpManager.addMapping("2", GetTokenC.class, GetTokenS.class);
		HttpManager.addMapping("3", GetTokenC.class, GetTokenS.class);
		HttpManager.addMapping("4", GetTokenC.class, GetTokenS.class);
		HttpManager.addMapping("5", GetTokenC.class, GetTokenS.class);
		TestHttpService testHttpService = new TestHttpService();
		HttpManager.addHttpListener(testHttpService);
	}
}
