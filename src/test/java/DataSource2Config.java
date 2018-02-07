

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration// 注册到springboot容器中
@MapperScan(basePackages="com.lvzhang.db.mapper",sqlSessionFactoryRef="dbSqlSessionFactory")
public class DataSource2Config{
	/**
	 * 配置db的数据源
	 * @return
	 */
	@Bean(name = "dbDataSource")
	@Primary
	@ConfigurationProperties(prefix = "spring.datasource.db")
	public DataSource dbDataSource() {
		return DataSourceBuilder.create().build();
	}
	
	/**
	 * db sql会话工厂
	 * @param dataSource
	 * @return
	 * @throws Exception
	 */
	@Bean(name = "dbSqlSessionFactory")
	@Primary
	public SqlSessionFactory testSqlSessionFactory(@Qualifier("dbDataSource") DataSource dataSource)
			throws Exception {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
//		bean.setMapperLocations(
//				new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/test1/*.xml"));
		return bean.getObject();
	}
	/**
	 * db数据源事物管理
	 * @param dataSource
	 * @return
	 */
	@Bean(name = "dbTransactionManager")
	@Primary
	public DataSourceTransactionManager testTransactionManager(@Qualifier("dbDataSource") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}
	@Bean(name = "dbSqlSessionTemplate")
	public SqlSessionTemplate testSqlSessionTemplate(
			@Qualifier("dbSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory);
	}

} 
