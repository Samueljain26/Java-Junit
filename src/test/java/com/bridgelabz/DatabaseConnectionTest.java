package com.bridgelabz;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseConnectionTest {
        private DatabaseConnection db;
        @BeforeEach
        void initializeConnection(){
            db=new DatabaseConnection();
            db.connectToDb();
        }

        @AfterEach
        void disconnectDBConnection(){
            db.disconnectDB();
        }

        @Test
        void testingConnectionToDB(){
            Assertions.assertTrue(db.isConnectedToDb());
        }

        @Test
        void testingDisconnectToDB(){
            db.disconnectDB();
            Assertions.assertFalse(db.isConnectedToDb());
        }
    }
