package org.example;

public class Solve {
    // Class representing a face of the pyramid puzzle
    public static class Face {
        // Row one will be the top tip (1 color)
        Color[] rowOne = new Color[1];
        // Row two is the middle section (3 colors across)
        Color[] rowTwo = new Color[3];
        // Row three is the bottom section (5 colors across)
        Color[] rowThree = new Color[5];
    }

    // Class representing an edge of the pyramid, connecting two different colors
    public static class Edge {
        Color color1; // First color of the edge
        Color color2; // Second color of the edge

        // Constructor to initialize an edge with two colors
        public Edge(Color color1, Color color2) {
            this.color1 = color1;
            this.color2 = color2;
        }
    }

    // Class representing the full pyramid puzzle, consisting of four faces
    public static class Pyramid {
        // Four faces of the pyramid
        Face faceOne = new Face();
        Face faceTwo = new Face();
        Face faceThree = new Face();
        Face faceFour = new Face();

        // Initializes the pyramid by setting the colors for each face
        public Pyramid initializeFaces() {
            Pyramid returnPyramid = new Pyramid();

            // Assigns green color to all rows of faceOne
            returnPyramid.faceOne.rowOne = initializeRow(returnPyramid.faceOne.rowOne, Color.green);
            returnPyramid.faceOne.rowTwo = initializeRow(returnPyramid.faceOne.rowTwo, Color.green);
            returnPyramid.faceOne.rowThree = initializeRow(returnPyramid.faceOne.rowThree, Color.green);

            // Assigns red color to all rows of faceTwo
            returnPyramid.faceTwo.rowOne = initializeRow(returnPyramid.faceTwo.rowOne, Color.red);
            returnPyramid.faceTwo.rowTwo = initializeRow(returnPyramid.faceTwo.rowTwo, Color.red);
            returnPyramid.faceTwo.rowThree = initializeRow(returnPyramid.faceTwo.rowThree, Color.red);

            // Assigns yellow color to all rows of faceThree
            returnPyramid.faceThree.rowOne = initializeRow(returnPyramid.faceThree.rowOne, Color.yellow);
            returnPyramid.faceThree.rowTwo = initializeRow(returnPyramid.faceThree.rowTwo, Color.yellow);
            returnPyramid.faceThree.rowThree = initializeRow(returnPyramid.faceThree.rowThree, Color.yellow);

            // Assigns blue color to all rows of faceFour
            returnPyramid.faceFour.rowOne = initializeRow(returnPyramid.faceFour.rowOne, Color.blue);
            returnPyramid.faceFour.rowTwo = initializeRow(returnPyramid.faceFour.rowTwo, Color.blue);
            returnPyramid.faceFour.rowThree = initializeRow(returnPyramid.faceFour.rowThree, Color.blue);

            return returnPyramid;
        }

        // Initializes a row of the pyramid face with the specified color
        public Color[] initializeRow(Color[] arrayForSize, Color color) {
            Color[] returnArray = new Color[arrayForSize.length];
            for (int i = 0; i < arrayForSize.length; i++) {
                returnArray[i] = color;
            }
            return returnArray;
        }

        // Initializes and returns an array of edges representing the connections between different colors
        public Edge[] initializeEdges() {
            Edge edgeRG = new Edge(Color.red, Color.green);   // Red-Green edge
            Edge edgeRB = new Edge(Color.red, Color.blue);    // Red-Blue edge
            Edge edgeRY = new Edge(Color.red, Color.yellow);  // Red-Yellow edge
            Edge edgeGB = new Edge(Color.green, Color.blue);  // Green-Blue edge
            Edge edgeGY = new Edge(Color.green, Color.yellow);// Green-Yellow edge
            Edge edgeBY = new Edge(Color.blue, Color.yellow); // Blue-Yellow edge

            return new Edge[]{edgeRG, edgeRY, edgeRB, edgeGB, edgeGY, edgeBY};
        }
    }
}

