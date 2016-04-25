**_Connecting to Mysql using Java._**

MysqlConnVersion1.java uses _DriverManager_ to connect.  MysqlConnVersion2.java implements the _DataSource_ interface to connect, and requires  _com.mysql.jdbc.jdbc2.optional.MysqlDataSource_ to be imported.  Both methods have the following requirements:

For Linux, _export CLASSPATH=$CLASSPATH:/usr/share/java/mysql-connector-java.jar_ is required in ~/.bashrc.  For netbeans, the _mysql-connector-java.jar_ file needs to be added, via right clicking on 'libraries' of your project.

Without this extra 'jar', _MysqlDataSource_ won't be found for use in MysqlConnVersion2, and the _Driver_ interface won't be found for use in MysqlConnVersion1.
