package csemall;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by NESOY on 2017-01-30.
 */
public class OfferMapper implements RowMapper<Offer>{
    public Offer mapRow(ResultSet resultSet, int i) throws SQLException {
        Offer offer = new Offer() ;

        offer.setId(resultSet.getInt("id"));
        offer.setName(resultSet.getString("name"));
        offer.setEmail(resultSet.getString("email"));
        offer.setText(resultSet.getString("text"));

        return offer;
    }
}
