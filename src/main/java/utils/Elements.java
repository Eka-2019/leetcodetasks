package utils;

import lombok.Getter;

@Getter
public class Elements {
    private int numOfDeletedElements;
    private int[] updatedArray;

    public Elements(int numOfDeletedElements, int[] updatedArray) {
        this.numOfDeletedElements = numOfDeletedElements;
        this.updatedArray = updatedArray;
    }

    // getters and setters
}
