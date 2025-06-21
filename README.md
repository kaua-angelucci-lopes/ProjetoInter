# Projeto Loja Java

Este é um projeto simples em Java para representar o cadastro de produtos, clientes e pedidos de uma Distribuidora de suco.

## 📂 Estrutura de Classes

O projeto contém as seguintes classes:

- **Produto**: Representa um produto com atributos como id, descrição, imagem, preço e estoque.
- **Cliente**: Representa um cliente com nome, telefone, email, endereço e id.
- **Pedido**: Representa um pedido com data, status, valor total e o cliente associado.
- **ItemPedido**: Representa os itens dentro de um pedido, com quantidade, valor e referência ao produto e pedido.

## 🚀 Como executar

1. Abra o projeto no Visual Studio Code ou em outra IDE Java.
2. Compile os arquivos `.java`.
3. Crie um método `main` (em outra classe ou em uma classe de teste) para testar os objetos.

Exemplo de código de teste:

```java
public class Teste {
    public static void main(String[] args) {
        Produto produto = new Produto(1, "Suco de Laranja", "imagem.jpg", 5.99f, 100);
        Cliente cliente = new Cliente("João", "11999999999", "joao@gmail.com", "Rua A", 1);
        Pedido pedido = new Pedido("21/06/2025", 1, 1, 0);
        ItemPedido item = new ItemPedido(2, 11.98f);

        System.out.println("Pedido criado para o cliente: " + cliente.getNome());
    }
}
