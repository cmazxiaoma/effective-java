package 服务提供者框架;


/**
 * 测试类
 * @author Administrator
 *
 */
public class test {

	public static void main(String[] args){
		
		try {
			Class.forName("服务提供者框架.UserProviderImpl");
			UserService userService=ServiceManager.getService("登录注册");
			userService.register();
			userService.login();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
