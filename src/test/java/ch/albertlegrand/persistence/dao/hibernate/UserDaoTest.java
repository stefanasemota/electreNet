package ch.albertlegrand.persistence.dao.hibernate;

public class UserDaoTest {

/*	User user = new User();
	private static String userName = "one4Test";
	private static String firstName = "Hilde";
	private static String lastName = "Halde";
	private IUserDao userDao;


	@BeforeClass

	public void contextInit(){

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });
		userDao = (IUserDao) ctx.getBean("userDao");

		user.setId(null);
		user.setSex(Boolean.TRUE);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail("hilde@gmx.de");
		user.setUserName(userName);
		user.setPassword("reiz");
		user.setEnabled(Boolean.TRUE);
		userDao.makePersistent(user);
	}


	@Test
    @Ignore
	public void testfindPersisted(){
		user = userDao.getByUserName(userName);
		assertNotNull(user);
		assertNotNull(user.getId());
	}


	@Test(dependsOnMethods = {"testfindPersisted"})
    @Ignore
	public void getByLoginInformation(){
		User u = userDao.getByLoginInformation(userName, "reiz");
		assertNotNull(u);
	}

	@Test(dependsOnMethods = {"getByLoginInformation"})
    @Ignore
	public void saveUser(){
		User u = userDao.getByLoginInformation(userName, "reiz");
		u.setEnabled(Boolean.FALSE);
		u = userDao.makePersistent(u);
		assertNotNull(u);
	}

	@Test(dependsOnMethods = {"saveUser"})
    @Ignore
	public void getByLoginInformation2(){
		User u = userDao.getByLoginInformation(userName, "reiz");
		assertNull(u);
	}

	@Test(dependsOnMethods = {"getByLoginInformation2"})
    @Ignore
	public void getByLoginInformation3(){
		User u = userDao.getByLoginInformation(null, null);
		assertNull(u);
	}*/


}
