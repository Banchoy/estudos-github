/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Duo13
 */
public class Propriedades {
    
    private String name;
    private Integer id ;
    private Double salary;

    public Propriedades(String nome, Integer id, Double salary) {
        this.name = nome;
        this.id = id;
        this.salary = salary;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public void increaseSalary(double percentage){
        salary += salary * percentage / 100.0;
    }
    public String toString(){
        
       return id + ", " + name + ", " + String.format("%.2f",salary);
    }
    
}
