package com.grigri.fishery.repository.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.grigri.fishery.domain.Carp;
import com.grigri.fishery.repository.CarpRepository;

public class JdbcCarpRepository implements CarpRepository {
    
    private final NamedParameterJdbcOperations jdbcOperations;
    private final String insertSql;
    private final String selectSql;
    
    public JdbcCarpRepository(NamedParameterJdbcOperations jdbcOperations) {
        this.jdbcOperations = jdbcOperations;
        this.insertSql =
                "insert into carp (" +
                    "age, " +
                    "length_in_cm, " +
                    "weight_in_kg " +
                ") values (" +
                    ":age, " +
                    ":lengthInCms, " +
                    ":weightInKilo " +
                ")";
        this.selectSql =
                "select " +
                    "age, " +
                    "length_in_cms " +
                    "weight_in_kg ";
                
    }

    public Carp save(Carp carp) {
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("age", carp.getAge());
        params.addValue("lengthInCms", carp.getLengthInCms());
        params.addValue("weightInKilo", carp.getWeightInKilo());
        
        
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcOperations.update(insertSql, params, keyHolder);
        
        carp.setId(keyHolder.getKey().longValue());
        return carp;
    }

    public List<Carp> findAll() {
        return jdbcOperations.query(selectSql, new CarpRowMapper());
    }
    
    private static class CarpRowMapper implements RowMapper<Carp> {

        public Carp mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Carp(
                    rs.getLong("id"),
                    rs.getInt("age"),
                    rs.getInt("length_in_cms"),
                    rs.getInt("weight_in_kg"));
        }
        
    }

}
