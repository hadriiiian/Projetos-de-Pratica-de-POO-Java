# Projetos de Prática de POO em Java

Este repositório contém projetos e exercícios práticos desenvolvidos para consolidar os conceitos de Programação Orientada a Objetos utilizando a linguagem Java.

## Projetos Implementados

### 1. Agente de Importação
Programa que calcula o custo final de produtos importados. O sistema possui a classe ProdutoImportado com o tipo do item e o preço em dólar, além da classe AgenteDeImportacao, responsável por converter o valor para reais e aplicar uma taxa de imposto de 60%.

### 2. Calculadora de IMC
Sistema de avaliação física estruturado através das classes Paciente e Nutricionista. O programa calcula o Índice de Massa Corporal a partir do peso e da altura e retorna a classificação oficial utilizando tipos enumerados, como Baixo peso, Normal, Sobrepeso ou Obesidade.

### 3. Doação de Sangue
Sistema criado para ajudar a organizar os doadores de um hospital. O programa utiliza a classe `Pessoa` para armazenar os dados físicos e a classe `Atendente da Enfermaria`, que possui um método que avalia se a pessoa está apta para a doação. Para ser aprovado, o doador deve ter entre 19 e 69 anos, pesar ao menos 50 kg, não ter feito tatuagem no último ano e não ter ingerido álcool nas últimas 12 horas.

### 4. Jogo Matemático
Aplicativo educacional para treino das quatro operações básicas. A classe JogoMatematico sorteia equações aleatórias com valores de zero a cem e avalia as respostas do usuário, encerrando a partida caso o jogador cometa três erros.

### 5. Par ou Ímpar
Simulação do clássico jogo disputado entre o usuário e o computador. A classe Jogador gerencia o nome e a pontuação, incrementando os pontos do vencedor de cada rodada até que um dos participantes alcance a marca de dez pontos.

### 6. Planejador de Viagens
Ferramenta para ajudar motoristas a organizarem paradas em trajetos longos. Com base na classe Carro, que armazena a autonomia e a capacidade do tanque, a classe Planejador calcula e estima a quantidade de abastecimentos necessários para atingir o destino informado.

### 7. Projeto Pontos
Representação matemática de um ponto no plano cartesiano a partir do encontro de duas coordenadas. O projeto possui a classe `Ponto` que armazena as coordenadas x e y como números inteiros. A classe conta com o método "quadrante", que identifica a qual quadrante o ponto pertence (ou se ele está localizado nos eixos ou na origem), e também com o método "eIgual", que compara as coordenadas de dois objetos diferentes para verificar se eles possuem exatamente o mesmo estado.

### 8. Retângulos e Quadrados
Modelagem geométrica focada no cálculo de área e perímetro. A classe Retângulo identifica se as dimensões formam um quadrado, avalia se duas instâncias são idênticas e conta com o método autodesenhar, que imprime a representação visual da forma no console utilizando letras.

### 9. Vinte e Um
Implementação do jogo de baralho com as regras tradicionais. O projeto estrutura a lógica de negócio nas classes Carta, Baralho e Mão, incluindo mecânicas de embaralhamento, cálculo dinâmico do valor do Ás e disputa por turnos contra o computador.

## Tecnologias Utilizadas

* Java JDK 17
* Eclipse IDE

## Como Executar

1. Clone este repositório para sua máquina local usando `git clone https://github.com/hadriiiian/Projetos-de-Pratica-de-POO-Java.git`.
2. Abra o diretório do projeto clonado na sua IDE de preferência.
3. Navegue até a pasta do exercício específico que deseja avaliar.
4. Execute a classe principal do projeto selecionado.
