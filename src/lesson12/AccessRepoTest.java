package src.lesson12;

import static org.junit.jupiter.api.Assertions.*;

class AccessRepoTest {

    @org.junit.jupiter.api.Test
    void getAccessLine() {
        AccessRepo testRepo = new AccessRepo("login=admin; pass=admin", "TokenDB");
        assertEquals("login=admin; pass=admin", testRepo.getAccessLine());
    }

    @org.junit.jupiter.api.Test
    void setAccessLine() {
        AccessRepo testRepo = new AccessRepo("login=admin; pass=admin", "TokenDB");
        testRepo.setAccessLine("login=admin; pass=admin");
        assertEquals("login=admin; pass=admin", testRepo.getAccessLine());
    }

    @org.junit.jupiter.api.Test
    void getAddressDB() {
        AccessRepo testRepo = new AccessRepo("login=admin; pass=admin", "TokenDB");
        assertEquals("TokenDB", testRepo.getAddressDB());
    }


    @org.junit.jupiter.api.Test
    void setAddressDB() {
        AccessRepo testRepo = new AccessRepo("login=admin; pass=admin", "TokenDB");
        testRepo.setAddressDB("NewTokenDB");
        assertEquals("TokenDB", testRepo.getAddressDB());
    }
}