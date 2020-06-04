# mybatis-generator
mybatis-generator

两种操作方式:

一. 执行命令：

java -jar mybatis-generator-core-1.3.7.jar -configfile generator.xml -overwrite


二. 点击 maven -> plugins -> mybatis-generator

执行之前需要制定 pom.xml中的配置文件路径
<configurationFile>src/main/resources/generator.xml</configurationFile>