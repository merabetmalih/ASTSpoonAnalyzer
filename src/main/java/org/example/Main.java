package org.example;

import spoon.reflect.CtModel;

public class Main {
    public static void main(String[] args) {
         String projectPath= "/home/su/Desktop/evo/spoon Projcet __Git/TP3_ERL-tp3_exo1/src/main/resources/Calculator";

        //public static String projectPath = "" ;//= "C:\\Users\\gm_be\\IdeaProjects\\chain_of_responsibility";

         String jrePath="/home/su/.jdks/openjdk-18.0.2.1";

         ///////////howa///
        Graph graph=null;
        //graph=SpoonStatic
        //SpoonParser spoonParser = new SpoonParser( projectPath, jrePath);
       // graph = SpoonStaticCallGraphStrategy.getInstance(spoonAarser).createCallGraph();
       // return graph;
        /////////////

        SpoonParser spoonParser = new SpoonParser( projectPath, jrePath);
     //   Graph graph = null;
      //  graph = SpoonStaticCallGraphStrategy.getInstance(spoonParser).createCallGraph();
        CtModel model=spoonParser.createFAMIXModel();
        String comments=spoonParser.getJREPath();
        System.out.println(comments);
        //System.out.println("1");
        //System.out.println(model.getAllTypes().toString());
        //System.out.println("1");
        //System.out.println(model.getAllPackages().toString());
        //System.out.println("1");
        //System.out.println(model.getElements(null).toString());
        //System.out.println("1");
//        System.out.println((CtType)model.getAllPackages().toArray()[3].getType());
        System.out.println(model.getAllTypes());

        //System.out.println("1");
        //System.out.println(model.toString());
       System.out.println("malih");
    }
}
