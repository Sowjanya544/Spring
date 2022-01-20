import java.sql.DriverManager;

Public class Teacher{

 Public Static Void main(String[] args) {
    String URL="jdbc:mysql://local host:3307/aliens":
    String U name="root";
    String Password="Souji";
    String U id="3";
    Class.for Name("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection(url,U name,Password,U id );
    Statement st=Con.CreateStatement();
    Result Set  rs=st.executeQuery(query);
    rs.next();
    String nsame=rs.getString("Username");
    System.Out.Println(name);st.Close();
    Con.Close();   
    }
}