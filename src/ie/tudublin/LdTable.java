package ie.tudublin;


import java.util.ArrayList;
import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;


public class LdTable
{
   private PApplet ui;
   LdTable table;
   private float Ldata;
    private String string;


	public LdTable(UI ui2, String string2, String string3) {
	}


	public void LoadTable(PApplet ui,LdTable table,float Ldata)
   {
       this.ui = ui;
       this.table = table;
       this.Ldata = Ldata;
   }


   public void render()
    {
       // Ldata();
    }
   /* public void Ldata()
         {
            LdTable table = LoadTable("Planets.csv","header");
            System.out.println("rows");
            
            for(TableRow row : table.rows())
             {
                    LdTable l = new LdTable(row);
                    colours.add(l);   
             }
        }
        */
    private Object rows() {
        return null;
    }

    private LdTable LoadTable(String string, String string2) {
        return null;
    }
   

}
