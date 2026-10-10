<h1 align="center">☕ Projetos de Prática de POO em Java</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white" alt="Java"/>
  <img src="https://img.shields.io/badge/POO-6A0DAD?style=flat&logo=hackthebox&logoColor=white" alt="POO"/>
  <img src="https://img.shields.io/badge/Eclipse-2C2255?style=flat&logo=eclipseide&logoColor=white" alt="Eclipse"/>
  <img src="https://img.shields.io/badge/Git-F05032?style=flat&logo=git&logoColor=white" alt="Git"/>
</p>

<p align="center">
  Projetos e exercícios práticos desenvolvidos para consolidar os conceitos de <b>Programação Orientada a Objetos</b> utilizando a linguagem <b>Java</b>.
</p>

---

## 🧩 O que você vai encontrar aqui

- **Classes e objetos** — modelagem de problemas do dia a dia
- **Encapsulamento** — atributos protegidos, getters e setters
- **Herança e polimorfismo** — classes abstratas e especializações
- **Lógica e controle de fluxo** — laços, condicionais e menus no console
- **Coleções** — arrays e `ArrayList` para gerenciar objetos
- **Jogos e simulações** — regras de negócio aplicadas na prática

## Visão geral

| # | Projeto | Conceitos praticados |
|:-:|---------|----------------------|
| 1 | Agente de Importação | Encapsulamento, métodos de cálculo |
| 2 | Banco | Arrays de objetos, validação, menu interativo |
| 3 | Batalha de Exércitos | Herança, classe abstrata, polimorfismo, `ArrayList` |
| 4 | Calculadora de IMC | Enumerações, estruturas condicionais |
| 5 | Doação de Sangue | Lógica booleana, regras de negócio |
| 6 | Dominó (Uno-minó) | Coleções, embaralhamento, laço interativo |
| 7 | Jogo da Forca | `StringBuilder`, aleatoriedade, arrays |
| 8 | Jogo Matemático | Números pseudoaleatórios, controle de fluxo |
| 9 | Par ou Ímpar | Operador módulo, placar, laços |
| 10 | Planejador de Viagens | Composição de objetos, cálculo matemático |
| 11 | Porteiro Automático | Objetos como parâmetro, condicionais compostas |
| 12 | Projeto Pontos | Comparação de estado, plano cartesiano |
| 13 | Retângulos e Quadrados | Laços aninhados, renderização no console |
| 14 | Vinte e Um | Múltiplas classes coesas, lógica de regras |

## 📂 Projetos Implementados

### 1. Agente de Importação
Sistema financeiro focado no cálculo de viabilidade e custo final para a compra de produtos importados. A aplicação é estruturada em torno da classe `ProdutoImportado`, que armazena atributos fundamentais como a descrição do item e seu valor original em dólares. A lógica principal de conversão e taxação fica encapsulada na classe `AgenteDeImportacao`. Esta classe possui métodos específicos para aplicar a taxa de câmbio atual e adicionar os encargos tributários de 60% sobre o valor aduaneiro, retornando o preço final em reais para o usuário.

---

### 2. Banco
Sistema para gerenciar a abertura e consulta de contas bancárias de uma cooperativa. O projeto implementa a classe `Conta Corrente`, responsável por armazenar os dados de saldo, titular e número. O gerenciamento é feito pela classe `Banco`, que armazena até 10 contas em um array e inclui métodos para salvar e recuperar as contas criadas. A lógica de negócio impede o cadastro de contas com números repetidos, utilizando o método `eIgual` para fazer essa validação. O programa exibe um menu interativo no console com opções para cadastrar uma conta, consultar o saldo a partir do seu número ou sair.

---

### 3. Batalha de Exércitos
Jogo de estratégia para dois jogadores no console, inspirado na dinâmica de "pedra, papel e tesoura", em que cada participante monta seu exército com um orçamento fixo e as unidades se enfrentam em duelos sucessivos até que um dos lados fique sem tropas. A modelagem explora herança e polimorfismo a partir da classe abstrata `Unidade`, que declara o método `ganhaQuandoAtacadoPor` e sobrescreve `equals` e `hashCode` para que duas unidades sejam consideradas iguais quando pertencem à mesma classe. Dela derivam três especializações, `Cavalaria`, `Catapulta` e `Infantaria`, cada uma implementando sua própria regra de vantagem por meio do operador `instanceof`: a Cavalaria vence a Catapulta, a Catapulta vence a Infantaria e a Infantaria vence a Cavalaria. A classe `Exercito` encapsula uma lista dinâmica (`ArrayList`) de unidades, com métodos para adicionar e remover combatentes, enquanto a classe `Jogador` armazena o nome, o exército e o saldo inicial de R$ 1.200,00, descontando R$ 100,00 a cada compra e sorteando aleatoriamente a unidade enviada para cada duelo. Toda a dinâmica é orquestrada pela classe principal `Main`, que exibe um menu de compras para cada jogador até o esgotamento do saldo e, em seguida, executa um laço de combate que sorteia uma unidade de cada exército, determina o vencedor da rodada, elimina a unidade derrotada e contabiliza os pontos. Ao final, o programa exibe o placar e declara o vencedor ou o empate com base na pontuação acumulada.

---

### 4. Calculadora de IMC
Ferramenta de avaliação antropométrica voltada para o acompanhamento de saúde. O projeto divide as responsabilidades entre as classes `Paciente`, que guarda os dados biométricos de peso e altura, e `Nutricionista`, que contém os métodos de diagnóstico. A aplicação calcula o Índice de Massa Corporal e utiliza uma estrutura de controle baseada em tipos enumerados para classificar o resultado do paciente em categorias médicas oficiais, como Baixo peso, Normal, Sobrepeso ou Obesidade, facilitando a leitura do laudo final.

---

### 5. Doação de Sangue
Plataforma de triagem hospitalar desenvolvida para validar a elegibilidade de candidatos à doação biológica. O modelo de dados utiliza a classe `Pessoa` para registrar informações demográficas e o histórico recente de saúde do voluntário. O núcleo da regra de negócio reside na classe `AtendenteDaEnfermaria`, que executa o método de avaliação de aptidão. Este método processa múltiplas validações lógicas simultâneas, garantindo que o doador atenda aos requisitos legais de idade entre 19 e 69 anos, peso mínimo de 50 kg e restrições temporais referentes a tatuagens e consumo de álcool.

---

### 6. Dominó (Uno-minó)
O projeto implementa o "Uno-minó", uma variação single-player que funde a lógica de conexão matemática do Dominó com a mecânica de descarte contínuo do Uno, onde o objetivo é esvaziar a mão conectando suas peças a uma única "peça da vez" na mesa, que é integralmente substituída a cada jogada bem-sucedida. A modelagem orientada a objetos é dividida na classe `Peca`, que encapsula os valores numéricos e valida as conexões; na classe `Jogo`, responsável por inicializar, embaralhar e distribuir as 28 peças tradicionais; e na classe `Jogador`, que gerencia dinamicamente o inventário com a mão de peças do usuário. Toda essa dinâmica é orquestrada pela classe principal `Unomino`, que executa um laço interativo no console, processando as entradas do jogador, validando as regras de compatibilidade em tempo real e definindo o encerramento da partida — seja com a vitória ao esvaziar a mão ou com a derrota imediata ao tentar uma jogada incompatível.

---

### 7. Jogo da Forca
O projeto é uma implementação do clássico jogo onde o jogador deve descobrir uma palavra oculta por meio do palpite de letras, contando apenas com uma dica em texto e a quantidade de caracteres visíveis. A arquitetura do sistema é estruturada a partir da classe `Palavra`, que encapsula os textos da palavra e sua respectiva dica, e da classe `JogoDaForca`, que atua como o motor lógico gerenciando um dicionário de instâncias em formato de array. A inteligência da aplicação realiza o sorteio aleatório, isola as opções já utilizadas para evitar repetições e manipula um gabarito mascarado (com interrogações) que é revelado dinamicamente pelo método `testarLetra` a cada acerto utilizando um objeto `StringBuilder`. O fluxo de execução é orquestrado pela classe principal `Main`, que inicialmente capta as palavras digitadas pelo usuário para preencher o banco de dados e, em seguida, opera um laço interativo no terminal, processando os palpites até a conclusão da partida, calculando uma pontuação final baseada no comprimento da palavra e penalizada pelo número de falhas cometidas.

---

### 8. Jogo Matemático
Software educacional interativo desenhado para o treinamento prático de aritmética. O motor lógico funciona através da classe `JogoMatematico`, que emprega geradores de números pseudoaleatórios para montar equações dinâmicas envolvendo as quatro operações fundamentais com valores entre zero e cem. O sistema gerencia o estado da partida validando a entrada numérica do usuário contra o resultado real da expressão matemática, mantendo um contador de falhas que encerra a execução automaticamente assim que o limite de três respostas incorretas é atingido.

---

### 9. Par ou Ímpar
Aplicação de entretenimento que simula disputas de par ou ímpar contra uma inteligência artificial básica. A arquitetura orientada a objetos define a classe `Jogador` para representar tanto o usuário humano quanto o computador, encapsulando o nome e o placar individual. O laço de repetição principal gerencia turnos sucessivos, capturando a jogada do usuário e gerando um número aleatório para a máquina, determinando o vencedor da rodada por operações de módulo e interrompendo o jogo apenas quando um dos competidores atinge a condição de vitória de dez pontos.

---

### 10. Planejador de Viagens
Utilitário de logística de rotas criado para otimizar o planejamento de viagens rodoviárias de longa distância. O sistema exige a instanciação de um objeto da classe `Carro`, que define as características de consumo de combustível e a capacidade máxima do tanque. A inteligência do programa fica a cargo da classe `Planejador`, que recebe a distância total do trajeto e processa operações matemáticas para prever o consumo exato, retornando ao usuário o número de paradas obrigatórias para reabastecimento antes de chegar ao destino.

---

### 11. Porteiro Automático
Sistema de controle de acesso focado na geração de saudações dinâmicas e personalizadas. O processamento ocorre através da classe `Porteiro`, equipada com o método de boas-vindas que recebe instâncias da classe `Pessoa` como parâmetro de entrada. A lógica interna mapeia os atributos de idade e gênero do visitante através de estruturas de controle condicional compostas, devolvendo ao terminal o tratamento adequado para cada perfil, distinguindo entre crianças, homens, mulheres e formalidades adequadas ao contexto.

---

### 12. Projeto Pontos
Biblioteca de modelagem matemática desenvolvida para manipulação de coordenadas no plano cartesiano bidimensional. A estrutura base é a classe `Ponto`, que encapsula as posições horizontais e verticais através de atributos inteiros. O comportamento da classe inclui funções analíticas como o método de verificação de quadrante, que mapeia a localização espacial do objeto e verifica sobreposições aos eixos, além da implementação de métodos de comparação de estado, avaliando se duas instâncias distintas ocupam a exata mesma posição no espaço.

---

### 13. Retângulos e Quadrados
Aplicação de geometria computacional orientada à manipulação e análise de polígonos regulares. A classe `Retangulo` requer a definição de base e altura em seu construtor e disponibiliza métodos tradicionais de cálculo de área e perímetro. O diferencial arquitetural envolve algoritmos de verificação para determinar se a forma constitui um quadrado perfeito e funções de renderização textual, que utilizam laços de repetição aninhados para plotar a dimensão exata do objeto diretamente na saída do console.

---

### 14. Vinte e Um
Simulador completo do clássico jogo de cartas Blackjack, respeitando as regras padronizadas. O domínio do problema foi fragmentado em diversas classes coesas, como `Carta` para armazenar naipes e valores, `Baralho` para gerenciar a coleção com algoritmos de embaralhamento, e `Mao` para gerenciar as cartas ativas de cada jogador. O sistema suporta mecânicas complexas, incluindo o ajuste dinâmico do peso da carta Ás dependendo da pontuação atual, operando turnos sucessivos e autônomos contra a mesa virtual.

---

## Tecnologias Utilizadas

<img src="https://img.shields.io/badge/Java_JDK_17-ED8B00?style=flat&logo=openjdk&logoColor=white" alt="Java JDK 17"/>
<img src="https://img.shields.io/badge/Eclipse_IDE-2C2255?style=flat&logo=eclipseide&logoColor=white" alt="Eclipse IDE"/>

## Como Executar

1. Clone este repositório para sua máquina local usando `git clone https://github.com/hadriiiian/Projetos-de-Pratica-de-POO-Java.git`.
2. Abra o diretório do projeto clonado na sua IDE de preferência.
3. Navegue até a pasta do exercício específico que deseja avaliar.
4. Execute a classe principal do projeto selecionado.
