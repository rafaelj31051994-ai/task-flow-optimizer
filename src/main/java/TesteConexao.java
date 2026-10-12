import java.sql.Connection;

public class TesteConexao {

    public static void main(String[] args) {

        Connection conexao = Conexao.conectar();

        if (conexao != null) {
            System.out.println("CONEXÃO COM O MYSQL REALIZADA COM SUCESSO!");
        } else {
            System.out.println("ERRO AO CONECTAR AO MYSQL.");
        }
    }
}