public class Test {
    public static void main(String[] args) {
        // Criando alguns produtos
        produto produto1 = new produto( "Camiseta",  29.90);
        produto produto2 = new produto(  "Calça jeans",  89.90);
        produto produto3 = new produto(  "Tênis",  159.90);

        // Criando um cliente
        cliente cliente = new cliente("João Silva", "joao.s@email.com");

        // Criando um carrinho e adicionando produtos
        carrinho carrinho = new carrinho();
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.adicionarProduto(produto3);

        // Exibindo informações
        System.out.println(cliente);
        System.out.println(carrinho);
    }
}
