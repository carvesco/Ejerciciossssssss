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
public class DividendStock extends Stock{
    private double dividend;

    public DividendStock(double dividend, int totalShares, String symbol, double totalCost, double currentPrice) {
        super(totalShares, symbol, totalCost, currentPrice);
        this.dividend = dividend;
    }
    
    @Override
    public double getMarketValue(){
        return  this.totalShares*this.currentPrice;
    }
    @Override
    public double getProfit(){
        return (this.totalShares*this.currentPrice);
    }    
}
