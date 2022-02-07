
package models;

import java.util.Vector;

public class ViewModel {

    public ViewModel() {
    }
    
    public Vector<String> getMemberColumnNames(){
        
        Vector<String> columnNames = new Vector<>();
        
        columnNames.add( "Név" );
        columnNames.add( "Email" );
        columnNames.add( "Telefon" );
        columnNames.add( "Cím" );
        columnNames.add( "Ig. szám" );
        
        return columnNames;
    }
    
    public Vector<String> getBikeColumnNames(){
    
        Vector<String> columnNames = new Vector<>();
        
        columnNames.add( "Stílus" );
        columnNames.add( "Méret" );
        columnNames.add( "Márka" );
        columnNames.add( "Sebesség" );
        columnNames.add( "Fék" );
        columnNames.add( "Váz szám" );
        
        return columnNames;
    }
    
    public Vector<String> getRentColumnNames(){
        
        Vector<String> columnNames = new Vector<>();
        
        columnNames.add( "Név" );
        columnNames.add( "Kerékpár" );
        columnNames.add( "Ki dátum" );
        columnNames.add( "Be dátum" );
        columnNames.add( "Letét" );
        
        return columnNames;
    }
}
