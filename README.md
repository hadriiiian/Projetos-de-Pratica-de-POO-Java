# Projetos de Prática de POO em Java

Este repositório contém projetos e exercícios práticos desenvolvidos para consolidar os conceitos de Programação Orientada a Objetos utilizando a linguagem Java.

## Projetos Implementados

### 1. Agente de Importação
Sistema financeiro focado no cálculo de viabilidade e custo final para a compra de produtos importados. A aplicação é estruturada em torno da classe `ProdutoImportado`, que armazena atributos fundamentais como a descrição do item e seu valor original em dólares. A lógica principal de conversão e taxação fica encapsulada na classe `AgenteDeImportacao`. Esta classe possui métodos específicos para aplicar a taxa de câmbio atual e adicionar os encargos tributários de 60% sobre o valor aduaneiro, retornando o preço final em reais para o usuário.

### 2. Banco
Sistema para gerenciar a abertura e consulta de contas bancárias de uma cooperativa. O projeto implementa a classe `Conta Corrente`, responsável por armazenar os dados de saldo, titular e número. O gerenciamento é feito pela classe `Banco`, que armazena até 10 contas em um array e inclui métodos para salvar e recuperar as contas criadas. A lógica de negócio impede o cadastro de contas com números repetidos, utilizando o método `eIgual` para fazer essa validação. O programa exibe um menu interativo no console com opções para cadastrar uma conta, consultar o saldo a partir do seu número ou sair.

### 3. Calculadora de IMC
Ferramenta de avaliação antropométrica voltada para o acompanhamento de saúde. O projeto divide as responsabilidades entre as classes `Paciente`, que guarda os dados biométricos de peso e altura, e `Nutricionista`, que contém os métodos de diagnóstico. A aplicação calcula o Índice de Massa Corporal e utiliza uma estrutura de controle baseada em tipos enumerados para classificar o resultado do paciente em categorias médicas oficiais, como Baixo peso, Normal, Sobrepeso ou Obesidade, facilitando a leitura do laudo final.

### 4. Doação de Sangue
Plataforma de triagem hospitalar desenvolvida para validar a elegibilidade de candidatos à doação biológica. O modelo de dados utiliza a classe `Pessoa` para registrar informações demográficas e o histórico recente de saúde do voluntário. O núcleo da regra de negócio reside na classe `AtendenteDaEnfermaria`, que executa o método de avaliação de aptidão. Este método processa múltiplas validações lógicas simultâneas, garantindo que o doador atenda aos requisitos legais de idade entre 19 e 69 anos, peso mínimo de 50 kg e restrições temporais referentes a tatuagens e consumo de álcool.

### 5. Dominó (Uno-minó)
O projeto implementa o "Uno-minó", uma variação single-player que funde a lógica de conexão matemática do Dominó com a mecânica de descarte contínuo do Uno, onde o objetivo é esvaziar a mão conectando suas peças a uma única "peça da vez" na mesa, que é integralmente substituída a cada jogada bem-sucedida. A modelagem orientada a objetos é dividida na classe `Peca`, que encapsula os valores numéricos e valida as conexões; na classe `Jogo`, responsável por inicializar, embaralhar e distribuir as 28 peças tradicionais; e na classe `Jogador`, que gerencia dinamicamente o inventário com a mão de peças do usuário. Toda essa dinâmica é orquestrada pela classe principal `Unomino`, que executa um laço interativo no console, processando as entradas do jogador, validando as regras de compatibilidade em tempo real e definindo o encerramento da partida — seja com a vitória ao esvaziar a mão ou com a derrota imediata ao tentar uma jogada incompatível.

### 5. Jogo Matemático
Software educacional interativo desenhado para o treinamento prático de aritmética. O motor lógico funciona através da classe `JogoMatematico`, que emprega geradores de números pseudoaleatórios para montar equações dinâmicas envolvendo as quatro operações fundamentais com valores entre zero e cem. O sistema gerencia o estado da partida validando a entrada numérica do usuário contra o resultado real da expressão matemática, mantendo um contador de falhas que encerra a execução automaticamente assim que o limite de três respostas incorretas é atingido.

### 6. Par ou Ímpar
Aplicação de entretenimento que simula disputas de par ou ímpar contra uma inteligência artificial básica. A arquitetura orientada a objetos define a classe `Jogador` para representar tanto o usuário humano quanto o computador, encapsulando o nome e o placar individual. O laço de repetição principal gerencia turnos sucessivos, capturando a jogada do usuário e gerando um número aleatório para a máquina, determinando o vencedor da rodada por operações de módulo e interrompendo o jogo apenas quando um dos competidores atinge a condição de vitória de dez pontos.

### 7. Planejador de Viagens
Utilitário de logística de rotas criado para otimizar o planejamento de viagens rodoviárias de longa distância. O sistema exige a instanciação de um objeto da classe `Carro`, que define as características de consumo de combustível e a capacidade máxima do tanque. A inteligência do programa fica a cargo da classe `Planejador`, que recebe a distância total do trajeto e processa operações matemáticas para prever o consumo exato, retornando ao usuário o número de paradas obrigatórias para reabastecimento antes de chegar ao destino.

### 8. Porteiro Automático
Sistema de controle de acesso focado na geração de saudações dinâmicas e personalizadas. O processamento ocorre através da classe `Porteiro`, equipada com o método de boas-vindas que recebe instâncias da classe `Pessoa` como parâmetro de entrada. A lógica interna mapeia os atributos de idade e gênero do visitante através de estruturas de controle condicional compostas, devolvendo ao terminal o tratamento adequado para cada perfil, distinguindo entre crianças, homens, mulheres e formalidades adequadas ao contexto.

### 9. Projeto Pontos
Biblioteca de modelagem matemática desenvolvida para manipulação de coordenadas no plano cartesiano bidimensional. A estrutura base é a classe `Ponto`, que encapsula as posições horizontais e verticais através de atributos inteiros. O comportamento da classe inclui funções analíticas como o método de verificação de quadrante, que mapeia a localização espacial do objeto e verifica sobreposições aos eixos, além da implementação de métodos de comparação de estado, avaliando se duas instâncias distintas ocupam a exata mesma posição no espaço.

### 10. Retângulos e Quadrados
Aplicação de geometria computacional orientada à manipulação e análise de polígonos regulares. A classe `Retangulo` requer a definição de base e altura em seu construtor e disponibiliza métodos tradicionais de cálculo de área e perímetro. O diferencial arquitetural envolve algoritmos de verificação para determinar se a forma constitui um quadrado perfeito e funções de renderização textual, que utilizam laços de repetição aninhados para plotar a dimensão exata do objeto diretamente na saída do console.

### 11. Vinte e Um
Simulador completo do clássico jogo de cartas Blackjack, respeitando as regras padronizadas. O domínio do problema foi fragmentado em diversas classes coesas, como `Carta` para armazenar naipes e valores, `Baralho` para gerenciar a coleção com algoritmos de embaralhamento, e `Mao` para gerenciar as cartas ativas de cada jogador. O sistema suporta mecânicas complexas, incluindo o ajuste dinâmico do peso da carta Ás dependendo da pontuação atual, operando turnos sucessivos e autônomos contra a mesa virtual.

## Tecnologias Utilizadas

* Java JDK 17
* Eclipse IDE

## Como Executar

1. Clone este repositório para sua máquina local usando `git clone https://github.com/hadriiiian/Projetos-de-Pratica-de-POO-Java.git`.
2. Abra o diretório do projeto clonado na sua IDE de preferência.
3. Navegue até a pasta do exercício específico que deseja avaliar.
4. Execute a classe principal do projeto selecionado.
