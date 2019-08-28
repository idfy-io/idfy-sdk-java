package io.idfy;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.idfy.internal.infastructure.PackageClassLoader;
import io.idfy.internal.utils.Mapper;
import io.idfy.signature.models.Advanced;
import org.junit.jupiter.api.Test;

import java.net.URLEncoder;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class DeserializationTests {
    @Test
    void canDeserialize(){
        final List<String> packages = Arrays.asList("io.idfy.signature.models");
        for(final String pck : packages) {
            Class[] classes = null;
            try {
                classes = PackageClassLoader.getClasses(pck);
            } catch (Exception e) {
                e.printStackTrace();
                fail(String.format("Fail to load -> %s", pck));
            }
            int ok = deserialize(classes);
            assertTrue(ok > 0, String.format("No classes in %s could be deserialized", pck));
            System.out.println(String.format("number of deserialized classes in %s => %s", pck, ok));
        }
    }

    /**
     *
     * @param classes
     * @return number of classes that was successfully deserialized
     */
    @SuppressWarnings("unchecked")
    private int deserialize(Class[] classes) {
        Advanced adv = new Advanced.Builder()
                .withCreatedByApplication("test")
                .build();
        String json = null;
        try {
            json = Mapper.toJson(adv);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            fail("Failed to create a random dummy class");
        }

        Map<String, Exception> failed = new HashMap<>();
        List<String> succeeded = new ArrayList<>();
        for (final Class c : classes) {
            // Skip builders, inner classes and enums
            if (c.getName().endsWith("$Builder") || c.getName().endsWith("$1") || c.isEnum())
                continue;

            try {
                Object mapped = Mapper.fromJson(json, c);
                succeeded.add(c.getName());
            } catch (Exception e) {
                failed.put(c.getName(), e);
                System.out.println("Failed: " + c.getName());
            }
        }


        assertNotNull(classes);
        assertTrue(failed.isEmpty());
        assertFalse(succeeded.isEmpty());
        return succeeded.size();
    }
}
