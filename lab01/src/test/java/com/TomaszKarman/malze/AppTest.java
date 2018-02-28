package com.TomaszKarman.malze;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

class CheckMalzaTest {
    @Test
    public void testCheckMalza() {
        Malza malza1 = new Malza("Czesiu",3);
        Malza malza2 = new Malza("Zbychu", 7);
        List<Malza> malze = new ArrayList<Malza>();
        malze.add(malza1);
        malze.add(malza2);

        Integer quantity = malze.size();
        Enum status = malza2.getStatus();
        assertNotNull(malze);
        assertEquals(status, Malza.Status.Dead);
        assertEquals(quantity, 2);
    }
}