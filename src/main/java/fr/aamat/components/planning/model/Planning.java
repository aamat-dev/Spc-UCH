package fr.aamat.components.planning.model;

import fr.aamat.model.Production;

public class Planning {

    private final int width;
    private final int height;
    private final Production[][] planning;

    public Planning(int width, int height, Production[][] planning) {
        this.width = width;
        this.height = height;
        this.planning = planning;

        for (int y = 0; y < this.height; y++) {
            for (int x = 0; x < this.width; x++) {
                setProduction(x, y, new Production());
            }
        }
    }

    public Production getProduction(int x, int y) {
        if (x < 0 || x >= this.width) {
            return null;
        }

        if (y < 0 || y >= this.height) {
            return null;
        }

        return this.planning[x][y];
    }

    private void setProduction(int x, int y, Production production) {
        if (x < 0 || x >= this.width) {
            return;
        }

        if (y < 0 || y >= this.height) {
            return;
        }

        this.planning[x][y] = production;
    }

}
