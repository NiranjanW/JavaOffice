import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/your/resource/package/your-spring-config.xml" })
public class LocationDAOTest{

    //this will inject an instance of the class that access and manages your JDBC resources
    @Autowired
    YourJdbcClass yourJdbcClass;

    //test the database connection
    @Test
    public void testGetConnection() throws SQLException {
        Connection con = yourJdbcClass.getConnection();
        Assert.assertNotNull(con);
        Assert.assertTrue(con.isValid(0));
        con.close();
    }
private TestedClass tested;
    private Connection connection;
    private static Driver driver;

    @BeforeClass
    public static void setUpClass() throws Exception {
        // (Optional) Print DriverManager logs to system out
        DriverManager.setLogWriter(new PrintWriter((System.out)));

        // (Optional) Sometimes you need to get rid of a driver (e.g JDBC-ODBC Bridge)
        Driver configuredDriver = DriverManager.getDriver("jdbc:odbc:url");

        System.out.println("De-registering the configured driver: " + configuredDriver);
        DriverManager.deregisterDriver(configuredDriver);

        // Register the mocked driver
        driver = mock(Driver.class);
        System.out.println("Registering the mock driver: " + driver);
        DriverManager.registerDriver(driver);
    }

    @AfterClass
    public static void tearDown() throws Exception {
        // Let's cleanup the global state
        System.out.println("De-registering the mock driver: " + driver);
        DriverManager.deregisterDriver(driver);
    }

    @Before
    public void setUp() throws Exception {
        // given
        tested = new TestedClass();

        connection = mock(Connection.class);

        given(driver.acceptsURL(anyString())).willReturn(true);
        given(driver.connect(anyString(), Matchers.<Properties>any()))
                .willReturn(connection);

        given(connection.prepareCall(anyString())).willReturn(statement);        
    }
}
}