class FluxoCaixa{
    private double saldo;

    FluxoCaixa(double saldo){
        this.saldo = saldo;
    }
       public void adicionarSaldo(double dinheiro){
        saldo += dinheiro;
        System.out.printLn("Saldo atual é:" + saldo);

       }
       public void retirarSaldo(double valor){
        if(dinheiro<= saldo){
            saldo -= dinheiro;
            System.out.println("Saldo atual:"+ saldo)
        }
        else {
            System.out.println("Saldo insuficiente. A operação não foi realizada")
    }
        public double getsaldo(){
            return saldo;
        }
}