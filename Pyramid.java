package org.example;


public class Solve{
   public static class Face{
       //Row one will be top tip
       //row two is the middle section the 3 across
       //row three is the bottom 5 long row

       Color[] rowOne = new Color[1];
       Color[] rowTwo = new Color[3];
       Color[] rowThree = new Color[5];
   }
   public static class Edge{
       Color color1;
       Color color2;

       public Edge(Color color1, Color color2) {
           this.color1 = color1;
           this.color2 = color2;
       }
   }
   public static class Pyramid{
       //Building the pyramid of four faces
       Face faceOne = new Face();
       Face faceTwo = new Face();
       Face faceThree = new Face();
       Face faceFour = new Face();

       public Pyramid initializeFaces(){
           Pyramid returnPyramid = new Pyramid();
           returnPyramid.faceOne.rowOne = initializeRow(returnPyramid.faceOne.rowOne,Color.green);
           returnPyramid.faceOne.rowTwo = initializeRow(returnPyramid.faceOne.rowTwo,Color.green);
           returnPyramid.faceOne.rowThree = initializeRow(returnPyramid.faceOne.rowThree,Color.green);

           returnPyramid.faceTwo.rowOne = initializeRow(returnPyramid.faceTwo.rowOne,Color.red);
           returnPyramid.faceTwo.rowTwo = initializeRow(returnPyramid.faceTwo.rowTwo,Color.red);
           returnPyramid.faceTwo.rowThree = initializeRow(returnPyramid.faceTwo.rowThree,Color.red);

           returnPyramid.faceThree.rowOne= initializeRow(returnPyramid.faceThree.rowOne,Color.yellow);
           returnPyramid.faceThree.rowTwo = initializeRow(returnPyramid.faceThree.rowTwo,Color.yellow);
           returnPyramid.faceThree.rowThree = initializeRow(returnPyramid.faceThree.rowThree,Color.yellow);

           returnPyramid.faceFour.rowOne = initializeRow(returnPyramid.faceFour.rowOne, Color.blue);
           returnPyramid.faceFour.rowTwo = initializeRow(returnPyramid.faceFour.rowTwo, Color.blue);
           returnPyramid.faceFour.rowThree = initializeRow(returnPyramid.faceFour.rowThree, Color.blue);

           return returnPyramid;
       }

       public Color[] initializeRow(Color[] arrayForSize, Color color){
           Color[] returnArray = new Color[arrayForSize.length];
           for(int i = 0; i < arrayForSize.length ; i++){
               returnArray[i] = color;
           }
           return returnArray;
       }
       public Edge[] initializeEdges(){
           Edge edgeRG = new Edge(Color.red,Color.green);
           Edge edgeRB = new Edge(Color.red,Color.blue);
           Edge edgeRY = new Edge(Color.red,Color.yellow);
           Edge edgeGB = new Edge(Color.green,Color.blue);
           Edge edgeGY = new Edge(Color.green,Color.yellow);
           Edge edgeBY = new Edge(Color.blue,Color.yellow);
           
           return new Edge[]{edgeRG,edgeRY,edgeRB,edgeGB,edgeGY,edgeBY};
       }

   }

}
