package live.xiaoxu.config;

//@Configuration
public class DataSourceConfig {
//    //主数据源，用于写数据,特殊情况下也可用于读
//    @Bean
//    @ConfigurationProperties("spring.shardingsphere.datasource")
//    public DataSource masterDataSource(){
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean
//    @ConfigurationProperties("spring.datasource.slave1")
//    public DataSource slave1DataSource(){
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean
//    @ConfigurationProperties("spring.datasource.slave2")
//    public DataSource slave2DataSource(){
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean
//    public DataSource routingDataSource(@Qualifier("masterDataSource") DataSource masterDataSource,
//                                        @Qualifier("slave1DataSource") DataSource slave1DataSource,
//                                        @Qualifier("slave2DataSource") DataSource slave2DataSource){
//        Map<Object,Object> targetDataSource=new HashMap<>();
//        targetDataSource.put(DbEnum.MASTER,masterDataSource);
//        targetDataSource.put(DbEnum.SLAVE1,slave1DataSource);
//        targetDataSource.put(DbEnum.SLAVE2,slave2DataSource);
//        RoutingDataSource routingDataSource=new RoutingDataSource();
//        routingDataSource.setDefaultTargetDataSource(masterDataSource);
//        routingDataSource.setTargetDataSources(targetDataSource);
//
//        return routingDataSource;
//    }

}