package memo;

public class TestMemo {
    public static void main(String[] args) {
        MemotoCare mMementoCaretaker = new MemotoCare();
        Original mOriginator = new Original();

        System.out.println("*****Original*****");
        mOriginator.test1();
        mMementoCaretaker
                .saveMemo("Originator", mOriginator.createMemo());
        mOriginator.show();
        mOriginator.test2();
        mOriginator.show();
        mOriginator.retrieve(mMementoCaretaker
                .retrieveMemo("Originator"));
        mOriginator.show();
    }
}
