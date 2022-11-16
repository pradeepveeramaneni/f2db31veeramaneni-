public class ShapesDriver {

    /**
     * @param args command line arguments
     * @throws java.io.FileNotFoundException exception message
     */
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Polygon> st = new ArrayList<Polygon>();
        
 
        Scanner in = new Scanner(new File("shapes.txt"));
        while (in.hasNext()) {
            String strg = in.next();
            double dlm;
            int str1;
            int m;
            int l1;
            if ("cube".equals(strg) || "tetrahedron".equals(strg) ) {
                dlm = in.nextDouble();
                if ("cube".equals(strg)) {
                    Square cube = new Cube(dlm);
                    st.add(cube);
                } else if ("tetrahedron".equals(strg)) {
                    Polygon Tetrahedron = new Tetrahedron(dlm);
                    st.add(Tetrahedron); 
                } 
            } else if (strg.contains("gon")) {
                str1 = in.nextInt();
                m = in.nextInt();
                Polygon polys = new RegularPolygon(strg, str1, m);
                st.add(polys);

            } else {
                l1 = in.nextInt();
                if ("triangle".equals(strg)) {
                    Polygon Etriangle = new EquilateralTriangle(l1);
                    st.add(Etriangle);
                } else if ("square".equals(strg)) {
                    Polygon sq = new Square(l1);
                    st.add(sq);
                } else {
                    Polygon p1 = new Polygon(strg, l1);
                    st.add(p1);
                }
            }
        }
        System.out.println("***************");
        for (Polygon P : st) {
            System.out.println(P.toString());
            System.out.println("***************");
        }
        double max = 0.0, min = st.get(0).getArea();
        String maxName = "";
        String minName = "";

        for (Polygon P1 : st) {
            if (P1.getArea() > max) {
                max = P1.getArea();
                maxName = P1.getName();

            }
            if (P1.getArea() < min) {
                min = P1.getArea();
                minName = P1.getName();

            }
        }
        System.out.println("The polygon with largest area is " + maxName.toUpperCase().charAt(0) + maxName.substring(1) + " with area of " + String.format("%.2f", max) + "cm\u00b2");
        System.out.println("The polygon with smallest area is " + minName.toUpperCase().charAt(0) + minName.substring(1) + " with area of " + String.format("%.2f", min) + "cm\u00b2");

        double maxp = 0.0, minp = st.get(0).getPerimeter();
        String maxPerName = "", minPerName = "";
        for (Polygon P2 : st) {
            if (P2.getPerimeter() > maxp) {
                maxp = P2.getPerimeter();
                maxPerName = P2.getName();
            }
            if (P2.getPerimeter() < minp) {
                minp = P2.getPerimeter();
                minPerName = P2.getName();
            }
        }
        System.out.println("The polygon with largest perimeter is " + maxPerName.toUpperCase().charAt(0) + maxPerName.substring(1) + " with perimeter of " + String.format("%.2f", maxp) + "cms");
        System.out.println("The polygon with smallest perimeter is " + minPerName.toUpperCase().charAt(0) + minPerName.substring(1) + " with perimeter of " + String.format("%.2f", minp) + "cms");

        System.out.println("***************");

        System.out.println("Surface area to Volume ratio of given solids are:");
        for (Polygon P3 : st) {
            if (P3.getName().equals("Cube")) {
                Cube DU = (Cube) P3;
                System.out.println(P3.getName() + ":");
                System.out.println("\tSurface area: " + String.format("%.2f", P3.getArea()) + "cm\u00b2");
                System.out.println("\tVolume: " + String.format("%.2f", DU.getVolume()) + "cm\u00b3");
            } else if (P3.getName().equals("Tetrahedron")) {
                Tetrahedron te = (Tetrahedron) P3;
                System.out.println(P3.getName() + ":");
                System.out.println("\tSurface area: " + String.format("%.2f", P3.getArea()) + "cm\u00b2");
                System.out.println("\tVolume: " + String.format("%.2f", te.getVolume()) + "cm\u00b3");
            }
        }
        System.out.println("**************");
        System.out.println("In this project, where did you apply polymorphic substitution?");
        System.out.println("You can use a subclass object wherever a superclass object is valid when there is a relationship between the two classes. In other words, a polymorphic variable in a subclass loop substitution is a superclass where the reference variable is used everywhere, whereas a supertype reference variable can really store a reference to an instance of subclassIn. I have used the polymorphic substitution in the lines 42,45,51,57,60,63 of the code in this project.");
        System.out.println("**************");
        System.out.println("Where did you use late binding polymorphism in this project?");
        System.out.println("Late binding polymorphism refers to the ability to override method and decide which method to call at the runtime. Late binding polymorphism has been used in the cube file for the methods getarea and tostring, as well as in the equilateral triangle file for the method tostring.In the polygon file for the method tostring, the regular polygon for the methods getarea, getperimeter, getinternalangle, getIncircleradius, and getcircumcircleradius.As well as the tetrahedron file for getheight, getarea, and tostring.");
        System.out.println("**************"); 

    }
     
  
    
}