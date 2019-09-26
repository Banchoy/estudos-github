/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício.de.listas;

import entities.Propriedades;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Duo13
 */
public class ExercícioDeListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Propriedades> list = new ArrayList<>();

        // PARTE 1 - LEITURA DE DADOS:
        
        System.out.println("How many employees will be registered ?");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("");
            System.out.println("Emplyoee #" + i + ": ");
            System.out.println("Id: ");
            int id = sc.nextInt();
            System.out.println("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Salary: ");
            double salary = sc.nextDouble();
            
            list.add(new Propriedades(name, id, salary));
        }

        // PARTE 2 - ATUALIZAÇÃO DO SALÁRIO DO EMPREGADO:
        
        System.out.println("");
        System.out.println("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Propriedades emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();

        // PARTE 3 - LISTA DE FUNCIONÁRIOS:
        
            System.out.println();
            System.out.println("List of employees:");
            for (Propriedades obj : list) {
                System.out.println(obj);
            }

            sc.close();
        }

    }
}
