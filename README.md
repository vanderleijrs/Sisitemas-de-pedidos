# Sisitemas-de-pedidos
Primeiro programa da aceleradora de Métodos Ágeis

Especificação:

Fazer um sistema de pedidos
Uma loja tem items a venda
Cada item tem um valor e uma descrição
Um Item pode ou não ter uma descrição de categoria: Ex: "Perecível", "Eletrodoméstico", "Eletrônico"
Um pedido tem um código(string), um conjunto de itens e um valor final
Represente em uma função main
A instancia de 5 itens
O pedido com estes itens
 Pedido numero: 002
    Item: "Arroz" Valor: R$ 3,00
    Item: "Feijão" Valor: R$ 4,00
 Total do pedido: R$ 7,00

Requisitos:

O Item deve ter dois construtores considerando o com e sem categoria
O somatório dos itens deve ser feito usando composição dentro do Pedido
Criar um segundo objeto de pedido chamado PedidoComDesconto que deve ser uma extensão do Pedido
O Pedido Com Desconto deve sobrecarregar o somatório dos itens aplicando um desconto específico sobre o valor final
