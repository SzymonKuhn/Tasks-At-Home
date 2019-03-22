package pl.szymonkuhn.genericsTasks;

public class MapStringIntegerTest {
    public static void main (String[] arg) {
        MapStringIntegerTask mapStringIntegerTask = new MapStringIntegerTask();
        mapStringIntegerTask.addWord("okno");
        mapStringIntegerTask.addWord("drzwi");
        mapStringIntegerTask.addWord("okno");
        mapStringIntegerTask.addWord("dach");
        mapStringIntegerTask.addWord("okno");
        mapStringIntegerTask.addWord("okno");
        mapStringIntegerTask.addWord("dach");

        System.out.println(mapStringIntegerTask.getStringIntegerMap());

        System.out.println("ilość słów drzwi " + mapStringIntegerTask.getWordCount("drzwi"));
        System.out.println("ilość słów okno " + mapStringIntegerTask.getWordCount("okno"));
        System.out.println("ilość słów ściana " + mapStringIntegerTask.getWordCount("ściana"));


    }
}
