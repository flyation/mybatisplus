package com.example.mybatisplus;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * MyBatis-Plus 的代码生成器
 */
public class Main {

    public static void main(String[] args) {
        // 1.创建generator对象
        AutoGenerator autoGenerator = new AutoGenerator();
        // 2.数据源配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL);
        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("123456");
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        autoGenerator.setDataSource(dataSourceConfig);
        // 2.全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setOutputDir(System.getProperty("user.dir")+"/src/main/java");
//        globalConfig.setOpen(false);                                        // 生成后自动打开文件夹，默认true
        globalConfig.setAuthor("fly");
//        globalConfig.setServiceName("%sService");                           // 生成的service接口的名字没有前面的I
        autoGenerator.setGlobalConfig(globalConfig);
        // 3.包配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.example.mybatisplus");                 // 父包名
        packageConfig.setModuleName("generator");                           // 父包模块名
//        packageConfig.setController("controller");                          // 各层包名,有默认值
//        packageConfig.setService("service");                                // 各层包名,有默认值
//        packageConfig.setServiceImpl("service.impl");                       // 各层包名,有默认值
//        packageConfig.setMapper("mapper");                                  // 各层包名,有默认值
//        packageConfig.setEntity("entity");                                  // 各层包名,有默认值
        autoGenerator.setPackageInfo(packageConfig);
        // 4.数据库表配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setInclude("student");                               // 只生成部分表
        strategyConfig.setEntityLombokModel(true);                          // 实体类加上lombok注解
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);        // 数据库表映射到实体的命名策略
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);  // 数据库表字段映射到实体的命名策略
        autoGenerator.setStrategy(strategyConfig);

        autoGenerator.execute();
    }

}
