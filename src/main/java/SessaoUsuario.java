/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rafae_l6j
 */
public class SessaoUsuario {

    private static int idUsuario;
    private static String nomeUsuario;
    private static String emailUsuario;

    public static void iniciarSessao(int id, String nome, String email) {
        idUsuario = id;
        nomeUsuario = nome;
        emailUsuario = email;
    }

    public static int getIdUsuario() {
        return idUsuario;
    }

    public static String getNomeUsuario() {
        return nomeUsuario;
    }

    public static String getEmailUsuario() {
        return emailUsuario;
    }

    public static void encerrarSessao() {
        idUsuario = 0;
        nomeUsuario = null;
        emailUsuario = null;
    }
}