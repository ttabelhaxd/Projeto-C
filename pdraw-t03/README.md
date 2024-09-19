# Tema **PDraw**, grupo **pdraw-t03**
-----

## Constituição dos grupos e participação individual global

| NMec | Nome | Participação |
|:---:|:---|:---:|
| 113655 | ABEL JOSÉ ENES TEIXEIRA | 30.0% |
| 112733 | HUGO FILIPE CAETANO DE SOUSA | 25.0% |
| 108045 | JOÃO RAFAEL MACÁRIO RODRIGUES | 5.0% |
| 114429 | JOSÉ MARIA MENDES | 15.0% |
| 112901 | TIAGO JOSÉ SOARES DE ALBUQUERQUE | 25.0% |

## Relatório

O objetivo geral deste trabalho era o desenvolvimento de uma linguagem de programação interpretada chamada PDRAW, voltada para a manipulação gráfica usando canetas virtuais em um canvas. Esta linguagem permite a definição de canetas com atributos personalizados, movimentação e manipulação dessas canetas, além de interação com o usuário por meio de entrada e saída de dados.

Neste trabalho, foram desenvolvidas todas as características da linguagem para alcançar os objetivos definidos, incluindo os requisitos mínimos e alguns requisitos desejáveis. 

    Definição de canetas: Permite a criação de canetas com atributos como cor, posição, orientação, espessura e pressão.

    Tipos de dados: Suporte para tipos de dados inteiros, reais, strings e pontos.

    Expressões aritméticas: Suporte para operações aritméticas standard.

    Instruções de I/O: Instruções para leitura e escrita no standard input e output.

    Conversão de tipos: Operadores de conversão entre tipos de dados, como conversão de string para inteiro e vice-versa.

    Movimentação e rotação de canetas: Instruções para mover e rotacionar canetas no canvas.

    Manipulação de atributos de canetas: Instruções para alterar atributos das canetas.

    Instrução de pausa: Pausa a execução por um determinado tempo em microssegundos.

    Verificação semântica: Análise semântica para garantir a consistência do sistema de tipos e a validade das operações.

Além disso, foram implementadas características desejáveis, como:

    Expressões booleanas: Suporte para expressões booleanas com operadores de ordem e booleanos.

    Instruções condicionais e loops: Suporte para instruções condicionais com 'for' e 'until', permitindo iterações e execução condicional de blocos de código.

Para isto, foram desenvolvidas as seguintes componentes do compilador:

**Gramática principal** da linguagem: Desenvolvida em ANTLR4, a gramática principal é responsável por definir a estrutura sintática da linguagem. Esta gramática descreve como os diferentes elementos da linguagem (como instruções, expressões, tipos de dados, etc.) são organizados e reconhecidos. O ANTLR4 gera automaticamente um Lexer e um Parser a partir dessa gramática, que são utilizados para converter o código-fonte em uma série de tokens (unidades lexicais) e, em seguida, construir uma árvore sintática abstrata (AST). A árvore sintática representa a estrutura hierárquica do código-fonte, facilitando a análise posterior.

**Análise Semântica**: A análise semântica é uma fase crucial que ocorre após a análise sintática. Nesta fase, o analisador semântico verifica a correção dos tipos de dados, a existência de variáveis e a validade das operações. Por exemplo, ele garante que operações aritméticas são realizadas entre tipos compatíveis, que variáveis são declaradas antes de serem usadas, e que as expressões respeitam as regras semânticas da linguagem. A análise semântica ajuda a detectar e reportar erros que não podem ser capturados apenas pela análise sintática, assegurando a integridade do código antes de sua execução.

**Geração de código**: A geração de código é a fase final do processo de compilação. Utilizando o padrão visitor do ANTLR4, o gerador de código itera sobre a árvore sintática construída pelo parser, visitando cada nó e produzindo o código executável correspondente. Neste projeto, o código gerado é transcrito para Python, utilizando a biblioteca Graphics  para desenhar. A ferramenta StringTemplate4 foi utilizada para facilitar a criação de templates de código, permitindo a geração de código de forma eficiente e organizada. Este processo garante que o código de entrada seja transformado em um programa executável correto e eficiente.

Além da gramática principal, foi desenvolvida uma **gramática específica para a linguagem interpretada**, que permite a execução de programas diretamente, facilitando o desenvolvimento e teste de scripts.
No Documento REPORT.md (presente na pasta doc) é explicado com mais pormenor cada uma destas fases e cada requisito implementado e respetivos detalhes.

## Estrutura do repositório

  - **src** - Contém todo o código fonte do projeto.

  - **examples** - Contém exemplos da linguagem compilada <u>PDraw</u>, exemplos da linguagem secundária, interpretada, <u>IPDraw</u>, alguns scripts *bash*, que facilitam a complilação e execução do código e ainda contém também um ficheiro com erros para testar o Analisador Semântico "ex1.pdraw". 

  - **results** - Contém os códigos em *Python* resultantes da compilação dos exemplos da linguagem <u>PDraw</u>.

  - **doc** - Contém o relatório com documentação adicional a este **README** sobre o projeto.

## Como executar o programa

No diretório **./examples**, os scripts:

  - [build.sh](/examples/build.sh) --> Compila todas as classes e gramáticas do ANTLR4 utilizadas necessárias para a execução.

Exemplo de utilização: *source ./build.sh*

  - [compile.sh](/examples/compile.sh) --> Compila um exemplo específico da linguagem <u>PDraw</u> para *Python*.

Exemplo de utilização: *source ./compile.sh p1.pdraw*

  - [run.sh](/examples/run.sh) --> Executa um ficheiro *Python* resultante da compilação de um exemplo.

Exemplo de utilização: *source ./run.sh p1Compiled.py*

**NOTA**: Todos os exemplos compilados são guardados na pasta **./results.**

## Contribuições

- ABEL JOSÉ ENES TEIXEIRA
  - Gramática Primária(PDraw.g4)
  - Geração de Código(Compilador)
  - Gramática Secundária(IPDraw.g4)
  - Interpretador
  - Exemplos
  - Documentação adicional

- HUGO FILIPE CAETANO DE SOUSA
  - Gramática Principal(PDraw.g4)
  - Análise Semântica
  - Exemplos
  - Relatório

- JOÃO RAFAEL MACÁRIO RODRIGUES
  - Análise Semântica

- JOSÉ MARIA MENDES
  - Análise Semântica
  - Exemplos
  - Relatório

- TIAGO JOSÉ SOARES DE ALBUQUERQUE
  - Geração de Código(Compilador)
  - Gramática Secundária(IPDraw.g4)
  - Interpretador
  - Exemplos
  - Documentação adicional