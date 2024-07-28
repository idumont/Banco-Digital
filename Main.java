public class Main {

    public static void main(String[] args) {
        Banco bancoInicial = new Banco(); 
        bancoInicial.setNome("First Bank"); 

        Cliente carla = new Cliente("Ieda", bancoInicial);  
        carla.setNome("Ieda Duarte"); //insere o nome do cliente

        Conta ccorrente = new ContaCorrente(ieda);

        ccorrente.depositar(100);

        Cliente alisson = new Cliente("Jose", bancoInicial);
        Conta cpoupanca = new ContaPoupanca(jose);

        ccorrente.imprimirExtrato();  
        cpoupanca.imprimirExtrato(); 

        ccorrente.transferir(48, cpoupanca);  

        ccorrente.imprimirExtrato(); 
        cpoupanca.imprimirExtrato();
        bancoInicial.mostrarClientes();

        Cliente carolina = new Cliente("Joao", bancoInicial); 
        Conta ccorrente2 = new ContaCorrente(joao); 
        ccorrente2.imprimirExtrato();  
        bancoInicial.mostrarClientes(); 
    }

}
