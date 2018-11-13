package yait.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import yait.web.model.Interval;

import javax.inject.Singleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Singleton
public class IntervalRepository {

    Logger logger = LoggerFactory.getLogger(IntervalRepository.class);

    Map<Integer, Interval> intervalStore = new ConcurrentHashMap<>();

    public Map<Integer, Interval> read() {
        return new HashMap<>(intervalStore);
    }

    public Optional<Interval> read(Integer id) {
        return Optional.ofNullable(intervalStore.get(id));
    }

    public int create(Interval interval) {
        int id = getRandomId();
        intervalStore.put(id, interval);
        return id;
    }

    public boolean update(Integer id, Interval interval) {
        if (!intervalStore.containsKey(id)) {
            return false;
        }

        intervalStore.put(id, interval);
        return true;
    }

    public boolean delete(Integer id) {
        return intervalStore.remove(id) != null;
    }

    private int getRandomId() {
        int id;

        do {
            id = (int) (Math.random() * Integer.MAX_VALUE);
            logger.info("{}", id);
        } while (intervalStore.containsKey(id));

        return id;
    }
}