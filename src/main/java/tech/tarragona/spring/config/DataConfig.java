package tech.tarragona.spring.config;

import java.util.Hashtable;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.EclipseLinkJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = "tech.tarragona.spring.repository")
@EnableTransactionManagement
public class DataConfig {

	@Bean
	public DataSource dataSource() {
		JndiDataSourceLookup lookup = new JndiDataSourceLookup();
		return lookup.getDataSource("jdbc/caravaning");
	}

	@Bean
	public EclipseLinkJpaVendorAdapter getEclipseLinkJpaVendorAdapter() {
		EclipseLinkJpaVendorAdapter vendorAdapter = new EclipseLinkJpaVendorAdapter();
		vendorAdapter.setDatabasePlatform("org.eclipse.persistence.platform.database.MySQLPlatform");
		vendorAdapter.setGenerateDdl(false);
		vendorAdapter.setShowSql(true);
		return vendorAdapter;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();
		entityManagerFactory.setJpaVendorAdapter(getEclipseLinkJpaVendorAdapter());
		Map<String, Object> jpaProperties = new Hashtable<>();
		jpaProperties.put("eclipselink.logging.level", "fine");
		jpaProperties.put("eclipselink.weaving", "false");
		entityManagerFactory.setJpaPropertyMap(jpaProperties);
		entityManagerFactory.setPackagesToScan("tech.tarragona.spring.model");
		entityManagerFactory.setDataSource(dataSource());
		entityManagerFactory.afterPropertiesSet();
		return entityManagerFactory;
	}

	@Bean
	public PlatformTransactionManager transactionManager() {
		JpaTransactionManager txManager = new JpaTransactionManager();
		txManager.setEntityManagerFactory(entityManagerFactory().getObject());
		return txManager;
	}

}
