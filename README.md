# javajdbc

jdbc 驅動程式
https://dev.mysql.com/downloads/connector/j/

要連線MySQL，必須經由幾個動作：
載入與註冊JDBC驅動程式


透過java.lang.Class類別的forName()來載入並向DriverManager註冊JDBC驅動程式（



驅動程式會自動透過DriverManager.registerDriver()方法註冊）， 

MySQL的驅動程式類別是com.mysql.jdbc.Driver，您如下載入與註冊JDBC驅動程式：



try {
    Class.forName("com.mysql.jdbc.Driver");
}
catch(ClassNotFoundException e) {
    System.out.println("找不到驅動程式類別");
}
