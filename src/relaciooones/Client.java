 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciooones;

/**
 *
 * @author Estudiante
 */
public class Client {
    private String CC;
    private String firstName;
    private String lastName;
    private int age;
    private int phone;
    private Asset[] assets;
    private int numAsset;

    public Client(String CC, String firstName, String lastName, int age, int phone, Asset[] assets) {
        this.CC = CC;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
        this.assets = new Asset[10];
    }
    
    public double sumProfit(){
        double profitValue = 0;
        for(int i=0 ; i<this.numAsset ; i++){
            Asset asset = this.assets[i];
            profitValue+=asset.getProfit();
        }
        return profitValue;
    }
    public double sumMarket(){
        double marketValue = 0;
        for(int i=0 ; i<this.numAsset ; i++) {
            Asset asset =this.assets[i];
            marketValue+=asset.getMarketValue();
        }
        return marketValue;
    }
    
    public boolean addAsset(Asset asset){
        if(this.numAsset<10){
            this.assets[this.numAsset]=asset;
            this.numAsset++;
        }else{
            throw  new IllegalArgumentException("Max 10 activos");
        }
        return true;
    }

    public String getCC() {
        return CC;
    }

    public void setCC(String CC) {
        this.CC = CC;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Asset[] getAssets() {
        return assets;
    }

    public void setAssets(Asset[] assets) {
        this.assets = assets;
    }

    public int getNumAsset() {
        return numAsset;
    }

    public void setNumAsset(int numAsset) {
        this.numAsset = numAsset;
    }
    
   
    
    
}
