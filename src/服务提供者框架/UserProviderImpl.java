package 服务提供者框架;

/**
 * 服务提供者具体实现类
 * @author Administrator
 *
 */
public class UserProviderImpl implements UserProvider{

	@Override
	public UserService getUserService() {
		// TODO Auto-generated method stub
		return new UserServiceImpl();
	}
	
	
	static{
		ServiceManager.registerProvider("登录注册",new UserProviderImpl());
	}

}
