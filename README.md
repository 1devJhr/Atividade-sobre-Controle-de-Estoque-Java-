# Controle de Estoque (Java)

Projeto em Java que demonstra **herança**, **classes abstratas** e **polimorfismo**
aplicados a um controle de estoque com dois métodos de valoração de custo.

## Estrutura

| Arquivo | Descrição |
|---|---|
| `Produto.java` | Classe abstrata com os dados do produto (código, nome, quantidade, custo) e operações de reposição e baixa |
| `ProdutoCustoAtual.java` | Ao repor, o custo do produto passa a ser o custo da última compra |
| `ProdutoCustoMedio.java` | Ao repor, o custo é recalculado pela média ponderada entre o estoque atual e a nova compra |
| `MovimentoEstoque.java` | Classe principal que demonstra o funcionamento |

## Regras de negócio

- **Reposição (`repor`)**: aumenta a quantidade em estoque.
  - *Custo atual*: o custo é substituído pelo novo valor.
  - *Custo médio*: `(qtdAtual * custoAtual + qtdNova * custoNovo) / (qtdAtual + qtdNova)`
- **Baixa (`baixar`)**: reduz a quantidade, desde que haja saldo suficiente. Caso contrário, exibe `erro saldo`.
- **Valor do estoque**: `quantidade * custo`.

## Como executar

Requer o JDK instalado.

```bash
javac *.java
java MovimentoEstoque
```

## Exemplo de execução

O programa cria dois produtos:

- Feijão (custo atual): 60 unidades a R$ 1,50
- Tomate (custo médio): 120 unidades a R$ 2,50

Em seguida repõe 100 unidades de cada (a R$ 1,60 e R$ 2,60), baixa 30 e 50
unidades, e tenta baixar 300 unidades do tomate, o que gera o erro de saldo.

## Conceitos praticados

- Classes abstratas
- Herança e sobrescrita de métodos (`@Override`)
- Encapsulamento (atributos privados com getters e setters)
- Polimorfismo

## Autor

Seu nome
