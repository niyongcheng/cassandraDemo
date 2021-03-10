package com.herbalife.gts.model;

import com.datastax.driver.mapping.annotations.Table;
import lombok.ToString;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;

import java.util.UUID;

@Table(name = "User")
@ToString
public class User {

    @PrimaryKey
    private UUID id;

    private String userName;
}
