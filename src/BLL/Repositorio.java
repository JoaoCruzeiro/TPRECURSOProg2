/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author PW
 */
public class Repositorio implements Serializable {
    
    private Map<Integer, ParqueContentores> parques;
    private List<Contentor> contentores;
    private List<Trabalhadores> trabalhadores;
    private List<OrdensServico> ordens;
    private List<Utilizador> utilizadores;
    private List<Administrador> administradores;
    private List<Municipio> municipios;
    private List<Gestor> gestores;
    private List<Equipa> equipas;
    private List<TiposResiduos> tiposResiduos;
    
    public Repositorio(){
        
        preencherListas();
        
        this.parques = new HashMap();
        contentores = new ArrayList();
        trabalhadores = new ArrayList();
        ordens = new ArrayList();
        utilizadores = new ArrayList();
        administradores = new ArrayList();
        municipios = new ArrayList();
        gestores = new ArrayList();
        equipas = new ArrayList();
        tiposResiduos = new ArrayList();
        
    }

    private void preencherListas() {
        
       //Administrador
       Administrador admin  = new Administrador();
       admin.setNome("Manuel");
       admin.setnCC(23649856);
       admin.setNif(259634526);
       admin.setTelefone(963544852);
       admin.setMorada("Rua Henrique Lopes");
       admin.setLocalidade("Viana do Castelo");
       admin.setUsername("admin");
       admin.setPassword("admin");
       getAdministradores().add(admin);
       
       
       //Tipos de Residuos
       TiposResiduos tipo1 = new TiposResiduos();
       tipo1.setNomeTipo("Vidro");
        getTiposResiduos().add(tipo1);
       
       TiposResiduos tipo2 = new TiposResiduos();
       tipo2.setNomeTipo("Plástico");
        getTiposResiduos().add(tipo2);
       
       TiposResiduos tipo3 = new TiposResiduos();
       tipo3.setNomeTipo("Papel");
        getTiposResiduos().add(tipo3);
       
       TiposResiduos tipo4 = new TiposResiduos();
       tipo4.setNomeTipo("Metal");
        getTiposResiduos().add(tipo4);
       
       
       //Gestor
       Gestor gestor1 = new Gestor();
       gestor1.setNome("Luis");
       gestor1.setnCC(26559756);
       gestor1.setNif(365489632);
       gestor1.setTelefone(932665986);
       gestor1.setMorada("Rua Lopes");
       gestor1.setLocalidade("Viana do Castelo");
       gestor1.setUsername("luis");
       gestor1.setPassword("1234");
        getGestores().add(gestor1);
       
       Gestor gestor2 = new Gestor();
       gestor2.setNome("Ana");
       gestor2.setnCC(63224896);
       gestor2.setNif(254789632);
       gestor2.setTelefone(964552365);
       gestor2.setMorada("Rua Luis Azevedo");
       gestor2.setLocalidade("Lisboa");
       gestor2.setUsername("ana");
       gestor2.setPassword("0000");
        getGestores().add(gestor2);
       
       
       //Equipa
       Equipa equipa1 = new Equipa();
       equipa1.setNome("Rui");
       equipa1.setnCC(30226547);
       equipa1.setNif(965423665);
       equipa1.setTelefone(912336504);
       equipa1.setMorada("Rua Cidade Nova");
       equipa1.setLocalidade("Viana do Castelo");
       equipa1.setUsername("rui");
       equipa1.setPassword("1478");
        getEquipas().add(equipa1);
       
       Equipa equipa2 = new Equipa();
       equipa2.setNome("Carlos");
       equipa2.setnCC(78995632);
       equipa2.setNif(741258963);
       equipa2.setTelefone(921456302);
       equipa2.setMorada("Rua da Vila Verde");
       equipa2.setLocalidade("Braga");
       equipa2.setUsername("carlos");
       equipa2.setPassword("1236");
        getEquipas().add(equipa2);
       
       
       //Município
       Municipio municipio1 = new Municipio();
       municipio1.setNome("Clara");
       municipio1.setnCC(12336548);
       municipio1.setNif(125639456);
       municipio1.setTelefone(925634586);
       municipio1.setMorada("Rua de Faro");
       municipio1.setLocalidade("Faro");
       municipio1.setUsername("clara");
       municipio1.setPassword("4569");
        getMunicipios().add(municipio1);
       
       Municipio municipio2 = new Municipio();
       municipio2.setNome("Julio");
       municipio2.setnCC(56148963);
       municipio2.setNif(365489632);
       municipio2.setTelefone(967009206);
       municipio2.setMorada("Rua de Coimbra");
       municipio2.setLocalidade("Coimbra");
       municipio2.setUsername("julio");
       municipio2.setPassword("4569");
        getMunicipios().add(municipio2);
       
       
       //Ordens de Serviço
       OrdensServico ordem1 = new OrdensServico();
       ordem1.setDescricao("Contentor Cheio.");
       ordem1.setDataOrdem("20/02/2020");
        getOrdens().add(ordem1);
       
       OrdensServico ordem2 = new OrdensServico();
       ordem2.setDescricao("Contentor Meio-Cheio. Limpar Contentor.");
       ordem2.setDataOrdem("18/03/2019");
        getOrdens().add(ordem2);
       
       OrdensServico ordem3 = new OrdensServico();
       ordem3.setDescricao("Limpar Contentor.");
       ordem3.setDataOrdem("15/02/2020");
        getOrdens().add(ordem3);
       
       //Contentor
       Contentor contentor1 = new Contentor();
       contentor1.setIdContentor(1);
        getContentores().add(contentor1);
       
       Contentor contentor2 = new Contentor();
       contentor2.setIdContentor(2);
        getContentores().add(contentor2);
       
       Contentor contentor3 = new Contentor();
       contentor3.setIdContentor(3);
        getContentores().add(contentor3);
       
       
       //Parques de Contentores
       ParqueContentores parque1 = new ParqueContentores();
       parque1.setNome("Parque das Giesteiras");
       parque1.setMorada("Rua Cidade Nova");
       parque1.setLocalidade("Viana do Castelo");
        getParques().put(1, parque1);
       
       ParqueContentores parque2 = new ParqueContentores();
       parque2.setNome("Parque das Nações");
       parque2.setMorada("Rua Luis Azevedo");
       parque2.setLocalidade("Lisboa");
        getParques().put(2, parque2);
       
       
       //Trabalhadores
       Trabalhadores trabalhador1 = new Trabalhadores();
       trabalhador1.setNome("António Marques");
       trabalhador1.setNifTrabalhador(268753696);
       trabalhador1.setnSegSocial(123);
       trabalhador1.setContacto(964393807);
       trabalhador1.setSalario(900);
        getTrabalhadores().add(trabalhador1);
       
       Trabalhadores trabalhador2 = new Trabalhadores();
       trabalhador2.setNome("Inês Antunes");
       trabalhador2.setNifTrabalhador(259631456);
       trabalhador2.setnSegSocial(456);
       trabalhador2.setContacto(921563208);
       trabalhador2.setSalario(895);
        getTrabalhadores().add(trabalhador2);
       
       Trabalhadores trabalhador3 = new Trabalhadores();
       trabalhador3.setNome("Ana Guiomar");
       trabalhador3.setNifTrabalhador(259631478);
       trabalhador3.setnSegSocial(789);
       trabalhador3.setContacto(963014536);
       trabalhador3.setSalario(950);
        getTrabalhadores().add(trabalhador3);
    }

   
    //Adicionar administrador
    public boolean addAdministrador (Administrador admin) throws Exception{
        boolean found=false;
        
        for(Administrador a: getAdministradores())
            if (a.getNif() == admin.getNif()){  // O nif é único
                found = true;
                break;
            }
        if(!found){
            getAdministradores().add(admin);
            return true;
        }
        throw new Exception("Erro: Administrador já existe em sistema!");
        
    }
    
    
    //Adicionar Gestor
    public boolean addGestor (Gestor gestor) throws Exception{
        boolean found=false;
        System.out.println("Enter Function REP Cliente" + getGestores().size());
        try{
        for(Gestor g: getGestores())
            if (g.getNif() == gestor.getNif()){
                found = true;
                break;
            }
        if(!found){
                getGestores().add(gestor);
            return true;
        }
      
        }catch(NullPointerException e){
            System.out.println("Adicione novo gestor.");
            getGestores().add(gestor);
        }
             
        System.out.println("Size Gestores " + getGestores().size());
        throw new Exception("Erro: Gestor já existe em sistema!");  
        
    }
    
    //Adicionar Municipio
    public boolean addMunicipio (Municipio municipio) throws Exception{
        boolean found=false;
        System.out.println("Enter Function REP Municipio" + getMunicipios().size());
        try{
        for(Municipio m: getMunicipios())
            if (m.getNif() == municipio.getNif()){
                found = true;
                break;
            }
        if(!found){
                getMunicipios().add(municipio);
            return true;
        }
      
        }catch(NullPointerException e){
            System.out.println("Adicione novo municipio.");
            getMunicipios().add(municipio);
        }
             
        System.out.println("Size Municipios " + getMunicipios().size());
        throw new Exception("Erro: Municipio já existe em sistema!");  
        
    }
    
    
    //Adicionar Equipa
    public boolean addEquipa (Equipa equipa) throws Exception{
        boolean found=false;
        System.out.println("Enter Function REP Equipa" + getEquipas().size());
        try{
        for(Equipa e: getEquipas())
            if (e.getNif() == equipa.getNif()){
                found = true;
                break;
            }
        if(!found){
                getEquipas().add(equipa);
            return true;
        }
      
        }catch(NullPointerException e){
            System.out.println("Adicione nova equipa.");
            getEquipas().add(equipa);
        }
             
        System.out.println("Size Equipas " + getEquipas().size());
        throw new Exception("Erro: Equipa já existe em sistema!");  
        
    }
    
    //Adicionar Tipos de Resíduos
    public boolean addTiposResiduos (TiposResiduos tipoResiduo) throws Exception{
        boolean found=false;
        
        for(TiposResiduos tr: getTiposResiduos())
            if (tr.getNomeTipo().equals((tipoResiduo.getNomeTipo()))){
                found = true;
                break;
            }
        if(!found){
            getTiposResiduos().add(tipoResiduo);
            return true;
        }
        throw new Exception("Erro: Tipo de Resíduo já exite!");
    }    
        
    //Adicionar Trabalhador
    public boolean addTrabalhador (Trabalhadores trabalhador) throws Exception{
        boolean found=false;
        System.out.println("Enter Function REP Trabalhadores" + getTrabalhadores().size());
        try{
        for(Trabalhadores t: getTrabalhadores())
            if (t.getNifTrabalhador() == trabalhador.getNifTrabalhador()){
                found = true;
                break;
            }
        if(!found){
                getTrabalhadores().add(trabalhador);
            return true;
        }
      
        }catch(NullPointerException e){
            System.out.println("Adicione novo trablhador.");
            getTrabalhadores().add(trabalhador);
        }
             
        System.out.println("Size Trabalhadores " + getTrabalhadores().size());
        throw new Exception("Erro: Trabalhador já existe em sistema!");  
        
    }
     
    
    //Adicionar Ordens de Serviço
    public boolean addOrdensServico (OrdensServico ordem) throws Exception{
        boolean found=false;
        
        for(OrdensServico os: getOrdens())
            if (os.getDescricao() == ordem.getDescricao()){
                found = true;
                break;
            }
        if(!found){
            getOrdens().add(ordem);
            return true;
        }
        throw new Exception("Erro: Ordem de Serviço já exite!");
    }  
    
    //Adicionar Contentor
    public boolean addContentor (Contentor contentor) throws Exception{
        boolean found=false;
        
        for(Contentor cn: getContentores())
            if (cn.getIdContentor() == contentor.getIdContentor()){
                found = true;
                break;
            }
        if(!found){
            getContentores().add(contentor);
            return true;
        }
        throw new Exception("Erro: Contentor já exite!");
    }  
    
    //Adicionar Parques de Contentores
    //Map<String, ParqueContentores> parque;
    
    
    /*public boolean addParquesContentores (ParqueContentores parqueContentor) throws Exception{
        boolean found=false;
        
        for(ParqueContentores pc: parque.entrySet()){
            if (cn.getIdContentor() == contentor.getIdContentor()){
                found = true;
                break;
            }
            if(!found){
                contentores.add(contentor);
                return true;
            }
            throw new Exception("Erro: Contentor já exite!");
        }
    } */ 

    
    
    public void put(ParqueContentores parqueContentores) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the parques
     */
    public Map<Integer, ParqueContentores> getParques() {
        return parques;
    }

    /**
     * @return the contentores
     */
    public List<Contentor> getContentores() {
        return contentores;
    }

    /**
     * @return the trabalhadores
     */
    public List<Trabalhadores> getTrabalhadores() {
        return trabalhadores;
    }

    /**
     * @return the ordens
     */
    public List<OrdensServico> getOrdens() {
        return ordens;
    }

    /**
     * @return the utilizadores
     */
    public List<Utilizador> getUtilizadores() {
        return utilizadores;
    }

    /**
     * @return the administradores
     */
    public List<Administrador> getAdministradores() {
        return administradores;
    }

    /**
     * @return the municipios
     */
    public List<Municipio> getMunicipios() {
        return municipios;
    }

    /**
     * @return the gestores
     */
    public List<Gestor> getGestores() {
        return gestores;
    }

    /**
     * @return the equipas
     */
    public List<Equipa> getEquipas() {
        return equipas;
    }

    /**
     * @return the tiposResiduos
     */
    public List<TiposResiduos> getTiposResiduos() {
        return tiposResiduos;
    }
    
    
    
}
