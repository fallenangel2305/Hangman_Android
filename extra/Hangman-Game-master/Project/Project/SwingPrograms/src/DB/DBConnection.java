
package DB;

import java.sql.*;

/**
 *
 * @author user
 */
public class DBConnection {
    Connection daba1=null;
    Statement st=null;
    ResultSet rs=null;
    boolean b;
    int i=0;
    public DBConnection()
    {
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        daba1=DriverManager.getConnection("jdbc:mysql://localhost/db_windowsappln","root","root");
        st=daba1.createStatement();
        System.out.println("connected");
    }
        catch(Exception e)
                {
                 System.out.println(e)  ;
                }
    }
    
public int ExecuteQuery(String query)
{
    try
    {
        i=st.executeUpdate(query);
    }
    catch(Exception e)
    {
       System.out.println(e)  ; 
    }
    return i;
}
public ResultSet SelectData(String query)
{
    try
    {
        rs=st.executeQuery(query);
                }
    catch(Exception e)
            {
              System.out.println(e)  ;   
            }
    return rs;
    }

    public static void main(String args[])       
{
new DBConnection();
}

    /*public int update(String upd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int insert(boolean ins) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
    
}