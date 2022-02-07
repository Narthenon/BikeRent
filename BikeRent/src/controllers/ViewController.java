
package controllers;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import models.BikeModel;
import models.ViewModel;
import views.BikeForm;


public class ViewController {
    
    private BikeForm bikeFrm;
    private ViewModel viewMdl;
    private BikeModel bikeMdl;
    private Vector<Vector<Object>> tableData;
    private DataBaseController dbCtr;
    
    public ViewController(DataBaseController dbCtr) {
        
        this.dbCtr = dbCtr;
        bikeFrm = new BikeForm();
        viewMdl = new ViewModel();
        initComponents();
        initListeners();
        start();
    }
            
    private void initComponents() {
        if(dbCtr.setDataBase())
                bikeFrm.setStatusLbl("kapcsolat ok");
        }
    

    
    private void initListeners() {
        bikeFrm.getExitBtn().addActionListener( event -> { exit(); });
        bikeFrm.getDeleteBtn().addActionListener(event -> { delete(); });
        bikeFrm.getEditBtn().addActionListener(event -> { edit(); });
        bikeFrm.getSaveBtn().addActionListener(event -> { save(); });
        bikeFrm.getSearchBtn().addActionListener(event -> { search(); }); 
        bikeFrm.getTableTb().addChangeListener(event -> { initTables(); });
    }

    private void start(){
        initTables();
        bikeFrm.setVisible( true );
    }
    
    private void initTables(){
        Vector<String> columnNames = new Vector<>();
        tableData = new Vector<>();
        
        if(bikeFrm.getTableTb().getSelectedIndex()==0){
            
            columnNames = viewMdl.getMemberColumnNames();
            tableData = dbCtr.getMembers();
            TableModel tableMdl = new DefaultTableModel(tableData, columnNames);
            bikeFrm.getMemberTbl().setModel(tableMdl);
            
        }else if(bikeFrm.getTableTb().getSelectedIndex()==1){
            
            columnNames = viewMdl.getBikeColumnNames();
            TableModel tableMdl = new DefaultTableModel(tableData, columnNames);
            bikeFrm.getBikeTbl().setModel(tableMdl);

        }else if(bikeFrm.getTableTb().getSelectedIndex()==2){
            
            columnNames = viewMdl.getRentColumnNames(); 
            TableModel tableMdl = new DefaultTableModel(tableData, columnNames);
            bikeFrm.getRentTbl().setModel(tableMdl);
        }
    }
    
    private void setTablesColumns(Vector<Vector<Object>>tableData, Vector<String>columnNames){
    
    }
    
    private void exit() {
        System.exit( 0 );
    }
    private void delete() {
        
    }
    private void edit() {
        
    }
    private void save() {
        
    }
    private void search() {
    }

}
