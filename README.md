**_Connecting to Mysql using Java._**

MysqlConnVersion1.java uses DriverManager to connect.  MysqlConnVersion2.java implements the DataSource interface to connect, and requires  com.mysql.jdbc.jdbc2.optional.MysqlDataSource to be imported.  Both methods have the following requirements:

For Linux, _export CLASSPATH=$CLASSPATH:/usr/share/java/mysql-connector-java.jar_ is required in ~/.bashrc.  For netbeans, the mysql-connector-java.jar file needs to be added, via right clicking on 'libraries' of your project.

Without this extra 'jar', MysqlDataSource won't be found for use in MysqlConnVersion2, and the Driver interface won't be found for use in MysqlConnVersion1.
