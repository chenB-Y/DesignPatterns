package flyweight_Builder;

public class Test {
    public static void main(String[] args) {
        FlyWeightFactory f = new FlyWeightFactory();

        Character doc[][] = new Character[100][100];

        doc[10][5] = f.get("A,David,red,3");
        doc[13][2] = f.get("A,David,red,3");
        doc[15][5] = f.get("A,david,red,3");// the font is different

       // doc[13][2] = f.get(doc[13][2]).setSize(4).setColor("blue").build(f);

        System.out.println(doc[10][5]==doc[13][2]); // check the reference, return true because it's the same object
        System.out.println(doc[10][5]==doc[15][5]);// this is not the same object so return false
        System.out.println(doc[10][5].getSize());

        doc[13][2] = f.get(doc[13][2]).setSize(4).setColor("blue").build(f);
        System.out.println(doc[10][5]==doc[13][2]);

        doc[14][4] = f.get("A,David,blue,4");
        System.out.println(doc[14][4]==doc[13][2]);



        for(int i =0;i< doc.length;i++)
            for(int j = 0;j<doc[i].length;j++)
                if (doc[i][j] != null)
                    doc[i][j].paint(i,j);
    }
}
