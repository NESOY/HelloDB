package csemall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;


/**
 * Created by NESOY on 2017-01-29.
 */
@Component("offerDAO")
public class OfferDAO {
    private JdbcTemplate jdbcTemplateObject;

    @Autowired
    public void setDataSource(DataSource dataSource){
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    public int getRowCount(){
        String sqlStatement = "select count(*) from offers";
        return jdbcTemplateObject.queryForObject(sqlStatement,Integer.class);
    }
    
}
