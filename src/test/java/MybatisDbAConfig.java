

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@MapperScan(basePackages = {"com.lvzhang.master.mapper"}, sqlSessionFactoryRef = "masterSqlSessionFactory")
public class MybatisDbAConfig {
    @Autowired
    @Qualifier("masterDataSource")
    private DataSource ds1;
    @Bean
    public SqlSessionFactory masterSqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(ds1); // 使用masterDataSource数据源, 连接masterDataSource库
        return factoryBean.getObject();

    }
  
    @Bean
    public SqlSessionTemplate sqlSessionTemplate1() throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(masterSqlSessionFactory()); // 使用上面配置的Factory
        return template;
    }
}