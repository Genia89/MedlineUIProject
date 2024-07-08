package utils;

import java.util.List;
import java.util.Random;

public class RandomGenerator {
    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
    private static final Random random;

    static {
        random = new Random();
    }

    /**
     * Generates a random integer between the specified min (inclusive) and max (inclusive).
     *
     * @param min The minimum value.
     * @param max The maximum value.
     * @return A random integer.
     */
    public static int getRandomInt(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    /**
     * Generates a random float between 0 (inclusive) and 1 (exclusive).
     *
     * @return A random float.
     */
    public static float getRandomFloat() {
        return random.nextFloat();
    }

    /**
     * Generates a random alphanumeric string of the specified length.
     *
     * @param length The length of the string.
     * @return A random alphanumeric string.
     */
    public static String getRandomString(int length) {
        StringBuilder builder = new StringBuilder();
        while (length-- != 0) {
            int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        return builder.toString();
    }

    /**
     * Randomly selects an element from a list.
     *
     * @param <T>  The type of the elements.
     * @param list from which to select an element.
     * @return A randomly selected element.
     */
    public static <T> T getRandomListElement(List<T> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }
        int index = random.nextInt(list.size());
        return list.get(index);
    }
}
