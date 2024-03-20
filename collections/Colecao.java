O Collections Framework é uma estrutura bem definida composta por um conjunto de interfaces e classes que servem para representar 
  e tratar grupos de dados como uma única entidade, que é comumente chamada de coleção. Dentro do Collections Framework, encontramos 
  os seguintes elementos:

Interfaces: Permitem a manipulação das coleções seguindo o princípio de “Programar para interfaces e não para implementações”,
  o que significa que o acesso aos objetos deve ser feito apenas por meio dos métodos definidos nessas interfaces.
Implementações: Referem-se às implementações concretas das interfaces. Estas são as classes que fornecem uma implementação 
  real das interfaces e são usadas para criar instâncias específicas de coleções.
Algoritmos: São métodos que executam diversas operações sobre os objetos contidos nas coleções, incluindo operações 
  como busca e ordenação.

  Interfaces
Collection: Encontra-se no topo da hierarquia. Não existem implementações diretas desta interface, mas ela define as operações fundamentais para as coleções, como adição, remoção, esvaziamento, entre outras.
Set: Esta interface define uma coleção que não permite a inclusão de elementos duplicados. A interface SortedSet, que herda de Set, permite a ordenação natural dos elementos, como por exemplo, em ordem alfabética.
List: Define uma coleção ordenada, onde elementos duplicados são permitidos. Esta interface é a mais apropriada quando é necessária a realização de acesso aleatório aos elementos, usando seus índices.
Queue: É um tipo de coleção que mantém uma lista de prioridades, onde a ordem dos elementos é determinada pela implementação de Comparable ou Comparator. Através da interface Queue, é possível criar filas e pilhas.
Map: Cada elemento contém, na verdade, dois objetos: uma chave e um valor. Valores podem ser duplicados, mas chaves não podem. A interface SortedMap estende Map e permite a classificação ascendente das chaves. Um exemplo de aplicação dessa interface é a classe Properties, que é utilizada para armazenar configurações e propriedades de um sistema.
