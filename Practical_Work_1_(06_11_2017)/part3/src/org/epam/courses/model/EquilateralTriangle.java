package org.epam.courses.model;

public class EquilateralTriangle {

    private int width;
    private int height;
    private int middleIndex;

    private int[][] triangleArray;

    public EquilateralTriangle(int triangleSize) {
        this.width = triangleSize + 1;
        height = (width * 2) - 1;
        middleIndex = height / 2;
        triangleArray = new int[width][height];
        setTriangleArray();
    }


    /**
     * method fills empty two-dimensional array with values
     */
    public void setTriangleArray(){
        for (int i = 1; i < width; i++) {
            setRowInTriangleArray(i);
        }
    }

    private void setRowInTriangleArray(int i) {
        for (int j = 1; j < height; j++) {
            triangleArray[i][middleIndex] = i;
            for (int k = 1; k < i; k++) {
                triangleArray[i][middleIndex + k] = i - k;
                triangleArray[i][middleIndex - k] = i - k;
            }
        }
    }

    /**
     *
     * @return two-dimensional array that consist equilateral triangle
     */
    public int[][] getTriangleArray() {
        return triangleArray;
    }
}
