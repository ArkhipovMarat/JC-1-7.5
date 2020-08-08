import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class MapCheking {
    @Test
    void mapCheking () {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Ivan");
        map.put(2,"Petr");
        map.put(3,"Vasiliy");

//        Assertions.assertTrue(map.containsKey(1));
//        Assertions.assertTrue(map.containsValue("Petr"));
//        Assertions.assertEquals(map.get(3), "Vasiliy");

        assertThat(map, hasKey(1));
        assertThat(map, hasValue("Petr"));
        assertThat(map, hasEntry(3,"Vasiliy"));

    }
}
