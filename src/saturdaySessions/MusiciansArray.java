package saturdaySessions;

import saturdaySessions.Musician;

public class MusiciansArray {
    public static Musician[] findAll() {
        return new Musician[] {
                new Musician("Julian", "Lage", "Jazz", "Guitar", true, 33),
                new Musician("Art", "Tatum", "Jazz", "Piano", false),
                new Musician("John", "Coltrane", "Jazz", "Saxophone", false),
                new Musician("Bill", "Evans", "Jazz", "Piano", false),

                new Musician("B.B.", "King", "Blues", "Guitar", false),
                new Musician("Stevie Ray", "Vaughan", "Blues", "Guitar", false),
                new Musician("Leyla", "McCalla", "Blues", "Vocals/Cello/Guitar/Banjo", true, 35),

                new Musician("Uli Jon", "Roth", "Rock", "Guitar", true, 66),
                new Musician("Jimi", "Hendrix", "Rock", "Guitar", false),
                new Musician("Duane", "Allman", "Rock", "Guitar/Slide", false),

                new Musician("Adele",  "Pop", "Vocals/Bass", true, 33),
                new Musician("Sam", "Smith", "Pop", "Vocals", true, 29),
                new Musician("Bruno", "Mars", "Pop", "Vocals/Keyboard", true, 35),

                new Musician("Scarface","Hip-Hop/Rap", "Vocals", true, 50),
                new Musician("J.", "Cole", "Hip-Hop/Rap", "Vocals", true, 36),
                new Musician("ODB","Hip-Hop/Rap", "Vocals", false),

        };
    }
}