package level2.lessonNumber3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map;

public class PhoneBook {

    private final Map<String, Set<String>> records = new TreeMap<>();

    public void add(String family, String phone) {
        Set<String> phones = getPhones(family);
        phones.add(phone);
    }

    private Set<String> getPhones(String family) {
        return records.computeIfAbsent(family, key -> new HashSet<>());
    }

    public Set<String> get(String family) {
        return getPhones(family);
    }
}
