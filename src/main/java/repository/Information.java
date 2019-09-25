package repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class Information {

    @Autowired
    JdbcTemplate jdbcTemplate;

//    public void save(String username, String lastname) {
//        jdbcTemplate.execute(String.format("insert into temptest values('%s','%s')" , username, lastname));
//    }
    public Map read(){
      String query = "SELECT * from productlist";
       SqlRowSet sqlRowSet = jdbcTemplate.queryForRowSet(query);
       sqlRowSet.next();
       String productname = sqlRowSet.getString("productname");
       String info = sqlRowSet.getString("info");

//       List list = new ArrayList();
//       list.add(productname);
//       list.add(info);


       Map map = new HashMap();
       map.put("productname" ,productname);
       map.put("info" , info);
      return  map;


}
   public  void save(String productname , String  info){
        jdbcTemplate.update(String.format("insert into producylist values('%s','%s')" , productname , info));
   }
}