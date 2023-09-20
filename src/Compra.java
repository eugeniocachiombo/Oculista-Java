
import Dao.CadastroDao;
import Dao.CompraDao;
import Oculista.Compr;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eugenio
 */
public class Compra extends javax.swing.JFrame {
             
         
             
    public void quadro(){  
        
        
              
        if (jTextField2.getText().isEmpty() && jTextField1.getText().isEmpty()){
         
        
        
            JOptionPane.showMessageDialog(null, "Há um campo vazio no 1º quadro");
        }else{
             String tipo = jTextField2.getText();
             int preco = Integer.parseInt(jTextField1.getText());
             int Qd =  Integer.parseInt(jTextField14.getText());
            
            
              if ("Óculo graduado acetato".equals(tipo) && preco == 5000){

            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
            compra.setQd(Qd);

            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");
                
                 
           

        }
              
        else  if ("Óculo graduado metal".equals(tipo) && preco == 3000){

            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
            compra.setQd(Qd);
            
            CompraDao dao = new CompraDao();
            dao.inserir(compra);

            JOptionPane.showMessageDialog(null, "Produto comprado");
                   
           
        }
        else  if ( "Óculo graduado titânio".equals(tipo) && preco == 2000){

            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
            compra.setQd(Qd);
            
            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");
          
        }
        else  if ( "Óculo graduado madeira".equals(tipo) && preco == 8000){
            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
            compra.setQd(Qd);
            
            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");
          
        }
        else  if ( preco == 8000 && "Óculo de sol".equals(tipo)){
            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
            compra.setQd(Qd); 
            
            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");
           
        }

        else  if ( "Óculo sem graduação".equals(tipo) && preco == 1000){
            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
            compra.setQd(Qd);
            
            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");
            
         
        }

        else  if ( preco == 1000 && "Óculo com lentes fotomáticas".equals(tipo)){
            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
            compra.setQd(Qd);
            
            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");
         
        }

        else  if ( "Óculo com lentes polarizadas".equals(tipo) && preco == 1000){
            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
            compra.setQd(Qd);
            
            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");
            
             
        }
        else  if ( preco == 1000 && "Óculo com lentes coloridas".equals(tipo)){
            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
            compra.setQd(Qd); 
            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");
           
        }
       
        else{
            JOptionPane.showMessageDialog(null, "Verifique o tipo e o preço se foi inserido correctamente no 1º campo");
            
       } 
          
         //FIM DA PRIMEIRA CASA
        }
       
    }
    public void quadro2(){
        
              if (jTextField5.getText().isEmpty() || jTextField9.getText().isEmpty() ){
          
           
            JOptionPane.showMessageDialog(null, "Há um campo vazio no 2º quadro");
        }else{
        String tipo = jTextField5.getText();
        int preco = Integer.parseInt(jTextField9.getText());
        int Qd =  Integer.parseInt(jTextField14.getText());      
              if ("Óculo graduado acetato".equals(tipo) && preco == 5000){
                    
            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
            compra.setQd(Qd);

            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");
            
        
        }

        else  if ("Óculo graduado metal".equals(tipo) && preco == 3000){

            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
            compra.setQd(Qd);
            CompraDao dao = new CompraDao();
            dao.inserir(compra);

            JOptionPane.showMessageDialog(null, "Produto comprado");
            
          
        }
        else  if ( "Óculo graduado titânio".equals(tipo) && preco == 2000){

            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
            compra.setQd(Qd); 
            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");

        }
        else  if ( "Óculo graduado madeira".equals(tipo) && preco == 8000){
            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
            compra.setQd(Qd);
            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");

        }
        else  if ( preco == 8000 && "Óculo de sol".equals(tipo)){
            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
            compra.setQd(Qd); 
            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");
        }

        else  if ( "Óculo sem graduação".equals(tipo) && preco == 1000){
            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
            compra.setQd(Qd);
            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");
        }

        else  if ( preco == 1000 && "Óculo com lentes fotomáticas".equals(tipo)){
            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
            compra.setQd(Qd);
            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");
        }

        else  if ( "Óculo com lentes polarizadas".equals(tipo) && preco == 1000){
            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
            compra.setQd(Qd);
            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");
        }
        else  if ( preco == 1000 && "Óculo com lentes coloridas".equals(tipo)){
            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
            compra.setQd(Qd); 
            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");
           
        }
       
        else{
            JOptionPane.showMessageDialog(null, "Verifique o tipo e o preço se foi inserido correctamente no 2º campo");
            
       } 
         //FIM DA PRIMEIRA CASA
        }
          
           
    }
    public void quadro3(){
        
       
     
        
        
             if (jTextField6.getText().isEmpty() || jTextField10.getText().isEmpty() ){
          
            JOptionPane.showMessageDialog(null, "Há um campo vazio no 3º quadro");
        }else{
                 String tipo = jTextField6.getText();
        int preco = Integer.parseInt(jTextField10.getText());
                 int Qd =  Integer.parseInt(jTextField14.getText());
              if ("Óculo graduado acetato".equals(tipo) && preco == 5000){
                   
            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
             compra.setQd(Qd); 

            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");
        }

        else  if ("Óculo graduado metal".equals(tipo) && preco == 3000){

            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
             compra.setQd(Qd); 
            CompraDao dao = new CompraDao();
            dao.inserir(compra);

            JOptionPane.showMessageDialog(null, "Produto comprado");

        }
        else  if ( "Óculo graduado titânio".equals(tipo) && preco == 2000){

            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
              compra.setQd(Qd); 
            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");

        }
        else  if ( "Óculo graduado madeira".equals(tipo) && preco == 8000){
            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
             compra.setQd(Qd); 
            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");

        }
        else  if ( preco == 8000 && "Óculo de sol".equals(tipo)){
            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
              compra.setQd(Qd); 
            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");
        }

        else  if ( "Óculo sem graduação".equals(tipo) && preco == 1000){
            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
            compra.setQd(Qd); 
            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");
        }

        else  if ( preco == 1000 && "Óculo com lentes fotomáticas".equals(tipo)){
            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
             compra.setQd(Qd); 
            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");
        }

        else  if ( "Óculo com lentes polarizadas".equals(tipo) && preco == 1000){
            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
             compra.setQd(Qd); 
            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");
        }
        else  if ( preco == 1000 && "Óculo com lentes coloridas".equals(tipo)){
            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
             compra.setQd(Qd);  
            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");
           
        }
       
        else{
            JOptionPane.showMessageDialog(null, "Verifique o tipo e o preço se foi inserido correctamente no 3º campo");
            
       } 
         //FIM DA PRIMEIRA CASA
        }
        
    }
    public void quadro4(){
        
        

              if (jTextField7.getText().isEmpty() || jTextField11.getText().isEmpty() ){
          
            JOptionPane.showMessageDialog(null, "Há um campo vazio no 4º quadro");
        }else{
                  
                  
              String tipo = jTextField7.getText();
        int preco = Integer.parseInt(jTextField11.getText());
        int Qd =  Integer.parseInt(jTextField14.getText());
        
              if ("Óculo graduado acetato".equals(tipo) && preco == 5000){

            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
            compra.setQd(Qd); 

            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");
        }

        else  if ("Óculo graduado metal".equals(tipo) && preco == 3000){

            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
             compra.setQd(Qd); 
            CompraDao dao = new CompraDao();
            dao.inserir(compra);

            JOptionPane.showMessageDialog(null, "Produto comprado");

        }
        else  if ( "Óculo graduado titânio".equals(tipo) && preco == 2000){

            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
              compra.setQd(Qd); 
            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");

        }
        else  if ( "Óculo graduado madeira".equals(tipo) && preco == 8000){
            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
             compra.setQd(Qd); 
            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");

        }
        else  if ( preco == 8000 && "Óculo de sol".equals(tipo)){
            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
              compra.setQd(Qd); 
            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");
        }

        else  if ( "Óculo sem graduação".equals(tipo) && preco == 1000){
            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
            compra.setQd(Qd); 
            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");
        }

        else  if ( preco == 1000 && "Óculo com lentes fotomáticas".equals(tipo)){
            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
             compra.setQd(Qd); 
            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");
        }

        else  if ( "Óculo com lentes polarizadas".equals(tipo) && preco == 1000){
            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
             compra.setQd(Qd); 
            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");
        }
        else  if ( preco == 1000 && "Óculo com lentes coloridas".equals(tipo)){
            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
              compra.setQd(Qd); 
            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");
           
        }
       
        else{
            JOptionPane.showMessageDialog(null, "Verifique o tipo e o preço se foi inserido correctamente no 4º campo");
            
       } 
         //FIM DA PRIMEIRA CASA
        }
        
    }
    public void quadro5(){
         
              if (jTextField8.getText().isEmpty() || jTextField12.getText().isEmpty() ){
          
            JOptionPane.showMessageDialog(null, "Há um campo vazio no 5º quadro");
        }else{
                  
                  String tipo = jTextField8.getText();
        int preco = Integer.parseInt(jTextField12.getText());
        int Qd =  Integer.parseInt(jTextField14.getText());
              if ("Óculo graduado acetato".equals(tipo) && preco == 5000){

            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
            compra.setQd(Qd); 

            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");
        }

        else  if ("Óculo graduado metal".equals(tipo) && preco == 3000){

            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
             compra.setQd(Qd); 
            CompraDao dao = new CompraDao();
            dao.inserir(compra);

            JOptionPane.showMessageDialog(null, "Produto comprado");

        }
        else  if ( "Óculo graduado titânio".equals(tipo) && preco == 2000){

            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
              compra.setQd(Qd); 
            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");

        }
        else  if ( "Óculo graduado madeira".equals(tipo) && preco == 8000){
            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
             compra.setQd(Qd); 
            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");

        }
        else  if ( preco == 8000 && "Óculo de sol".equals(tipo)){
            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
              compra.setQd(Qd); 
            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");
        }

        else  if ( "Óculo sem graduação".equals(tipo) && preco == 1000){
            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
            compra.setQd(Qd); 
            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");
        }

        else  if ( preco == 1000 && "Óculo com lentes fotomáticas".equals(tipo)){
            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
             compra.setQd(Qd); 
            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");
        }

        else  if ( "Óculo com lentes polarizadas".equals(tipo) && preco == 1000){
            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
             compra.setQd(Qd); 
            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");
        }
        else  if ( preco == 1000 && "Óculo com lentes coloridas".equals(tipo)){
            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);
              compra.setQd(Qd); 
            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");
           
        }
       
        else{
            JOptionPane.showMessageDialog(null, "Verifique o tipo e o preço se foi inserido correctamente no 5º campo");
            
       } 
         //FIM DA PRIMEIRA CASA
        }
        
        
    }
  
   
    /**
     * Creates new form Compra
     */
    public Compra() {
        initComponents();
     
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField14 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        Acetato2 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Tipo", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable2);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Tipo", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Lentes");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Óculos");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Produtos");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compra");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 102, 255));
        jLabel6.setText("Produtos");
        jDesktopPane2.add(jLabel6);
        jLabel6.setBounds(370, 0, 210, 29);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Tipos:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Preço:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel12KeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Óculo graduado acetato");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Óculo graduado metal ");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("5.000.00 (kz)");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setText(" 3.000.00 (kz)");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setText("Óculo graduado titânio");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setText(" 2.000.00 (kz)");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel26.setText("8.000.00 (kz)");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel28.setText("Óculo graduado madeira");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setText("Óculo de sol ");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setText(" 8.000.00 (kz)");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel30.setText("Óculo sem graduação");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel31.setText("1.000.00 (kz)");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel32.setText("Óculo com lentes fotomáticas");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel33.setText("1.000.00 (kz)");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel34.setText("Óculo com lentes polarizadas");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel35.setText("1.000.00 (kz)");

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel36.setText("Óculo com lentes coloridas");

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel37.setText("1.000.00 (kz)");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });

        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });

        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });

        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8KeyTyped(evt);
            }
        });

        jTextField13.setEnabled(false);
        jTextField13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField13MouseClicked(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel48.setText("TOTAL A PAGAR:");

        jToggleButton1.setText("Comprar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Comprar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Comprar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Comprar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Comprar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel49.setText("Quantidade:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(217, 217, 217))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel23)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(95, 95, 95)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel22)
                                        .addComponent(jLabel8))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel25))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel27))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel35))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 46, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel48)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField9)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField15)
                    .addComponent(jTextField16)
                    .addComponent(jTextField17)
                    .addComponent(jTextField18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jDesktopPane2.add(jPanel1);
        jPanel1.setBounds(10, 30, 590, 500);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Tipos:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Preço:");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });

        Acetato2.setText("Comprar");
        Acetato2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Acetato2ActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel38.setText("5.000.00 (kz)");

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel39.setText("Lentes oftálmicas monofocais");

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel40.setText("Lentes oftálmicas bifocais");

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel41.setText("2.000.00 (kz)");

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel42.setText("Lentes progressivas");

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel43.setText("3.000.00 (kz)");

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel44.setText("Lentes para trabalho");

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel45.setText("8.000.00 (kz)");

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel46.setText("Lentes de contacto");

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel47.setText("8.000.00 (kz)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel38)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel43)
                                    .addComponent(jLabel45)
                                    .addComponent(jLabel47)))
                            .addComponent(Acetato2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(77, 77, 77))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(jLabel45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jLabel47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Acetato2)
                .addGap(136, 136, 136))
        );

        jDesktopPane2.add(jPanel2);
        jPanel2.setBounds(610, 30, 250, 347);

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jDesktopPane2.add(jButton1);
        jButton1.setBounds(10, 4, 61, 23);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1500.jpg"))); // NOI18N
        jDesktopPane2.add(jLabel15);
        jLabel15.setBounds(0, 0, 850, 870);

        jScrollPane1.setViewportView(jDesktopPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        new Inicio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Acetato2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Acetato2ActionPerformed
        // TODO add your handling code here:

        String tipo = jTextField4.getText();
        int preco = Integer.parseInt(jTextField3.getText());

        if ( "Lentes oftálmicas monofocais".equals(tipo) && preco == 5000){

            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);

            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");

        }

        else  if ("Lentes oftálmicas bifocais".equals(tipo) && preco == 2000){

            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);

            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");
        }

        else  if ( "Lentes progressivas".equals(tipo) && preco == 3000){

            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);

            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");
        }

        else  if ( "Lentes para trabalho".equals(tipo) && preco == 8000){
            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);

            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");
        }

        else  if ( preco == 8000 && "Lentes de contacto".equals(tipo)){
            Compr compra = new Compr();
            compra.setTipo(tipo);
            compra.setPreco(preco);

            CompraDao dao = new CompraDao();
            dao.inserir(compra);
            JOptionPane.showMessageDialog(null, "Produto comprado");
        }

        else{

            JOptionPane.showMessageDialog(null, "Verifique o tipo e o preço se foi inserido correctamente");
        }
    }//GEN-LAST:event_Acetato2ActionPerformed

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        // TODO add your handling code here:
        char digit =  evt.getKeyChar();

        if(Character.isDigit(digit)){

            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Admite apenas letras");
        }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        // TODO add your handling code here:

        char digit =  evt.getKeyChar();

        if(Character.isLetter(digit)){
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Admite apenas números");
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8KeyTyped

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7KeyTyped

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jLabel12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel12KeyTyped
        // TODO add your handling code here:
        char limite = evt.getKeyChar();

        if (Character.isLetter(limite)){
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Admite apenas números");
        }
    }//GEN-LAST:event_jLabel12KeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        char digit =  evt.getKeyChar();

        if(Character.isLetter(digit)){
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Admite apenas números");
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:

        char digit =  evt.getKeyChar();

        if(Character.isDigit(digit)){

            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Admite apenas letras");
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField13MouseClicked
        // TODO add your handling code here:
             
        
    }//GEN-LAST:event_jTextField13MouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
        
       
        
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
         if(jTextField2.getText().trim().equals(jTextField5.getText().trim())){
            JOptionPane.showMessageDialog(rootPane, "Compos 1 e 2 com tipos repetidos ");
        }
         
         else if( jTextField2.getText().trim().equals(jTextField6.getText().trim())   ){
            JOptionPane.showMessageDialog(rootPane, "Compos 1 e 3 com tipos repetidos");     
                 }
          else if( jTextField2.getText().trim().equals(jTextField7.getText().trim())   ){
            JOptionPane.showMessageDialog(rootPane, "Compos 1 e 4 com tipos repetidos");     
                 }
           else if( jTextField2.getText().trim().equals(jTextField8.getText().trim())   ){
            JOptionPane.showMessageDialog(rootPane, "Compos 1 e 5 com tipos repetidos");     
                 } 
            else{
            quadro();
         }
         
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         if(jTextField5.getText().trim().equals(jTextField2.getText().trim())){
            JOptionPane.showMessageDialog(rootPane, "Compos 2 e 1 com tipos repetidos ");
        }
         
         else if( jTextField5.getText().trim().equals(jTextField6.getText().trim())   ){
            JOptionPane.showMessageDialog(rootPane, "Compos 2 e 3 com tipos repetidos");     
                 }
          else if( jTextField5.getText().trim().equals(jTextField7.getText().trim())   ){
            JOptionPane.showMessageDialog(rootPane, "Compos 2 e 4 com tipos repetidos");     
                 }
           else if( jTextField5.getText().trim().equals(jTextField8.getText().trim())   ){
            JOptionPane.showMessageDialog(rootPane, "Compos 2 e 5 com tipos repetidos");     
                 } 
            else{
            quadro2();
         }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
          if(jTextField6.getText().trim().equals(jTextField2.getText().trim())){
            JOptionPane.showMessageDialog(rootPane, "Compos 3 e 1 com tipos repetidos ");
        }
         
         else if( jTextField6.getText().trim().equals(jTextField5.getText().trim())   ){
            JOptionPane.showMessageDialog(rootPane, "Compos 3 e 2 com tipos repetidos");     
                 }
          else if( jTextField6.getText().trim().equals(jTextField7.getText().trim())   ){
            JOptionPane.showMessageDialog(rootPane, "Compos 3 e 4 com tipos repetidos");     
                 }
           else if( jTextField6.getText().trim().equals(jTextField8.getText().trim())   ){
            JOptionPane.showMessageDialog(rootPane, "Compos 3 e 5 com tipos repetidos");     
                 } 
            else{
            quadro3();
         }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
          if(jTextField7.getText().trim().equals(jTextField2.getText().trim())){
            JOptionPane.showMessageDialog(rootPane, "Compos 4 e 1 com tipos repetidos ");
        }
         
         else if( jTextField7.getText().trim().equals(jTextField5.getText().trim())   ){
            JOptionPane.showMessageDialog(rootPane, "Compos 4 e 2 com tipos repetidos");     
                 }
          else if( jTextField7.getText().trim().equals(jTextField6.getText().trim())   ){
            JOptionPane.showMessageDialog(rootPane, "Compos 4 e 3 com tipos repetidos");     
                 }
           else if( jTextField7.getText().trim().equals(jTextField8.getText().trim())   ){
            JOptionPane.showMessageDialog(rootPane, "Compos 4 e 5 com tipos repetidos");     
                 } 
            else{
            quadro4();
         }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         if(jTextField8.getText().trim().equals(jTextField2.getText().trim())){
            JOptionPane.showMessageDialog(rootPane, "Compos 5 e 1 com tipos repetidos ");
        }
         
         else if( jTextField8.getText().trim().equals(jTextField5.getText().trim())   ){
            JOptionPane.showMessageDialog(rootPane, "Compos 5 e 2 com tipos repetidos");     
                 }
          else if( jTextField8.getText().trim().equals(jTextField6.getText().trim())   ){
            JOptionPane.showMessageDialog(rootPane, "Compos 5 e 3 com tipos repetidos");     
                 }
           else if( jTextField8.getText().trim().equals(jTextField7.getText().trim())   ){
            JOptionPane.showMessageDialog(rootPane, "Compos 5 e 4 com tipos repetidos");     
                 } 
            else{
            quadro5();
         }
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acetato2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables

    private void setTipo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setTipo(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setPreco(int preco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
