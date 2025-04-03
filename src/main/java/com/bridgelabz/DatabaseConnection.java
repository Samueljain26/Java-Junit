package com.bridgelabz;

public class DatabaseConnection {
        boolean connectedToDb;

        public void connectToDb(){
            connectedToDb=true;
        }
        public void disconnectDB(){
            connectedToDb=false;
        }
        public boolean isConnectedToDb(){
            return connectedToDb;
        }
    }
