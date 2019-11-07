package lesson2810;

public class Journal {
    private int a = 100;
    public static final int JOURNAL_CAPACITY = 1000;
    private JournalEntry [] journal = new JournalEntry[JOURNAL_CAPACITY];
    private int journalSize = 0;
}
