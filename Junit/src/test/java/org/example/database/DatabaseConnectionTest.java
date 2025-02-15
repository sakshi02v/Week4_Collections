package org.example.database;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseConnectionTest {

    private DatabaseConnection dbConnection;

    @BeforeEach
    void setUp() {
        dbConnection = new DatabaseConnection();
        dbConnection.connect();  // Simulate database connection before each test
    }

    @AfterEach
    void tearDown() {
        dbConnection.disconnect();  // Simulate disconnecting after each test
    }

    @Test
    void testConnectionIsEstablished() {
        assertTrue(dbConnection.isConnected(), "Database should be connected");
    }

    @Test
    void testConnectionIsClosedAfterEachTest() {
        dbConnection.disconnect();  // Explicitly close connection
        assertFalse(dbConnection.isConnected(), "Database should be disconnected");
    }
}
