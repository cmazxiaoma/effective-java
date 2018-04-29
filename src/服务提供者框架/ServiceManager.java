package 服务提供者框架;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 服务提供者注册类
 * @author Administrator
 *
 */
public class ServiceManager {
	
	private ServiceManager(){
		
	}
	
	private static final  Map<String,UserProvider> providers=new ConcurrentHashMap<String,UserProvider>();
	
	public static void  registerProvider(String name,UserProvider provider){
		
		providers.put(name, provider);
		
	}
	
	public static UserService getService(String name){
		UserProvider provider=providers.get(name);
		if(provider==null){
			throw new IllegalArgumentException("No provider registered with name="+name);
		
		}
		return provider.getUserService();
	}
	
	
	

}
