/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taskflowoptimizer;

/**
 *
 * @author rafae_l6j
 */
public class TaskFlowOptimizer {

    public static void main(String[] args) {

        Usuario usuario = new Usuario();
        Categoria categoria = new Categoria();
        Tarefa tarefa = new Tarefa();

        usuario.cadastrar();
        categoria.cadastrar();
        tarefa.cadastrar();

        System.out.println("Protótipo do sistema TaskFlow Optimizer");
    }
}