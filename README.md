# dubbo-demo-springboot
springboot整合dubbo
项目运行前,需要先运行zookeeper


工具中有zookeeper,zookeeper监控平台,dubbo监控平台



zokeeper监控平台dubbo-admin-0.0.1-SNAPSHOT.jar
可以用命令启动 java -jar dubbo-admin-0.0.1-SNAPSHOT.jar
访问地址 localhost:7001


dubbo监控平台dubbo-monitor-simple-2.0.0
要在conf中配置注册中心地址,然后在assembly.bin中启动;

访问地址是localhost:8080


