package com.crest.backend.service.nosql;

import com.crest.backend.dao.sql.DatabaseConnection;
import com.crest.backend.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static com.crest.backend.dao.TableNameConstants.*;

/**
 * Created by Arun on 11/29/16.
 */
@Service
public class UserServiceV2 {
    protected final Logger log = LoggerFactory.getLogger(getClass());

    public void updateUserLocation(String userId,String busNumber,String tripStatus){

    }

}
