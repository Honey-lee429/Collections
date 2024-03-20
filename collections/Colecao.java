O Collections Framework é uma estrutura bem definida composta por um conjunto de interfaces e classes que servem para representar e tratar grupos de dados como uma única entidade, que é comumente chamada de coleção. Dentro do Collections Framework, encontramos os seguintes elementos:

Interfaces: Permitem a manipulação das coleções seguindo o princípio de “Programar para interfaces e não para implementações”,
  o que significa que o acesso aos objetos deve ser feito apenas por meio dos métodos definidos nessas interfaces.
Implementações: Referem-se às implementações concretas das interfaces. Estas são as classes que fornecem uma implementação 
  real das interfaces e são usadas para criar instâncias específicas de coleções.
Algoritmos: São métodos que executam diversas operações sobre os objetos contidos nas coleções, incluindo operações 
  como busca e ordenação.

  Interfaces
Collection: Encontra-se no topo da hierarquia. Não existem implementações diretas desta interface, mas ela define as operações
  fundamentais para as coleções, como adição, remoção, esvaziamento, entre outras.
Set: Esta interface define uma coleção que não permite a inclusão de elementos duplicados. A interface SortedSet, 
  que herda de Set, permite a ordenação natural dos elementos, como por exemplo, em ordem alfabética.
List: Define uma coleção ordenada, onde elementos duplicados são permitidos. Esta interface é a mais apropriada 
  quando é necessária a realização de acesso aleatório aos elementos, usando seus índices.
Queue: É um tipo de coleção que mantém uma lista de prioridades, onde a ordem dos elementos é determinada pela implementação de
  Comparable ou Comparator. Através da interface Queue, é possível criar filas e pilhas.
Map: Cada elemento contém, na verdade, dois objetos: uma chave e um valor. Valores podem ser duplicados, mas chaves não podem. 
  A interface SortedMap estende Map e permite a classificação ascendente das chaves. Um exemplo de aplicação dessa interface é a 
  classe Properties, que é utilizada para armazenar configurações e propriedades de um sistema.

  Implementações
ArrayList: Funciona como um array que pode crescer em tamanho. A busca por um elemento é rápida, mas a inserção e a exclusão de elementos   são mais lentas e proporcionais ao tamanho da estrutura. É a escolha ideal quando o acesso rápido aos elementos é prioritário. Por        exemplo, ao criar um catálogo de sua biblioteca pessoal, onde cada livro recebe um número sequencial para acesso.
LinkedList: Implementa uma lista ligada, em que cada nó contém dados e uma referência para o próximo nó. Ao contrário do ArrayList, a       busca é mais lenta, mas as inserções e exclusões são rápidas. Portanto, prefira LinkedList quando houver a necessidade frequente de       inserir e excluir itens, como ao gerenciar compras mensais de supermercado.
HashSet: Oferece acesso rápido aos dados, mas não garante que eles estejam ordenados. É a escolha adequada quando a solução requer          elementos únicos, e a ordem não é relevante. Por exemplo, ao criar um catálogo de suas músicas.
TreeSet: Os dados são ordenados, mas o acesso é mais lento que no HashSet. Use TreeSet quando for necessário um conjunto de elementos       únicos em ordem natural. É recomendado para as mesmas aplicações do HashSet, com a vantagem da ordenação natural.
LinkedHashSet: Derivado do HashSet, mantém uma lista duplamente ligada de seus elementos. Os elementos são iterados na ordem de inserção     ou na ordem em que foram acessados na última iteração. É útil para registrar a chegada de corredores em uma maratona.
HashMap: Baseado em tabela de espalhamento, permite chaves e valores nulos. Não garante ordenação dos dados. Escolha quando a ordenação     não é relevante e é necessário um identificador, como o ISBN em um catálogo de biblioteca pessoal.
TreeMap: Implementa SortedMap e garante a ordenação ascendente das chaves. Pode especificar uma ordem personalizada. Use quando precisar     de um mapa ordenado. Similar ao HashMap, mas com menor desempenho.
LinkedHashMap: Mantém uma lista duplamente ligada de elementos, com iteração na ordem de inserção das chaves. Útil quando a ordem de       inserção é importante, como registrar corredores em uma maratona.
