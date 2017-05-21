package ru.itpark;


public class FiguresTool {
    public void scale(int koeff, Scalable[] scalables) {
        for (int i = 0; i < scalables.length; i++) {
            scalables[i].scale(koeff);
        }
    }
}
