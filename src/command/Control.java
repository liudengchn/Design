package command;

public interface Control {
    void on(int slot);
    void off(int slot);
    void undo();
}
