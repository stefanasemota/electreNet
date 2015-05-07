/*
 * StringIterator
 */
package ch.albertlegrand.business.utility;

import java.util.Iterator;

/**
 * Iterates the characters of a given string.
 *
 * @author Asemota Stefan
 */
public class StringIterator implements Iterable<Character> {

    private final String string;

    public StringIterator(final String string) {
        this.string = string;
    }

    public Iterator<Character> iterator() {
        return new Iterator<Character>() {
            private int position = 0;

            public boolean hasNext() {
                return (this.position < string.length());
            }

            public Character next() {
                if (this.position >= string.length()) return null; // for dummies
                return string.charAt(this.position++);
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public String getString() {
        return string;
    }
}