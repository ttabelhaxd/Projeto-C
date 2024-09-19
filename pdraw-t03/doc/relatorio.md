# Relatório do Projeto PDRAW

Este relatório detalha o projeto PDRAW, uma linguagem de programação desenvolvida para facilitar a criação de desenhos gráficos. O PDRAW foi desenvolvido como parte da cadeira Compiladores.
O projeto PDRAW foi concebido com o objetivo de fornecer uma linguagem de programação simples e intuitiva para a criação de desenhos gráficos. Ele permite aos utilizadores descreverem formas geométricas, aplicar cores e especificar propriedades como a espessura de linha. O projeto também aborda a análise semântica para garantir a correta interpretação do código fornecido.

## Características Minimas

Todas as características minimas foram implementadas com sucesso, tendo sido testadas com varios inputs.

### Instrução para definir os atributos de um tipo de caneta (pen)

O PDRAW permite a definição de tipos de canetas com atributos como cor, posição, orientação, espessura de linha e pressão. Cada definição de caneta deve ter uma identificação única no programa, garantindo a distinção entre diferentes tipos de canetas.

```
define pen PenType1 {
   color = green;
   position = (10,10);
   orientation = 45º;
   thickness = 10;
   pressure = -1;
};
```

### Tipos de dados inteiro, string, real e ponto

São suportados tipos de dados inteiro, string, real e ponto. Esses tipos de dados permitem ao utilizador realizar operações aritméticas e manipular informações de texto.

```
int x = 5;
string message = "Hello, world!";
real pi = 3.14;
point p = (10, 20);
```

### Expressões aritméticas e concatenação de texto

O PDRAW aceita expressões aritméticas padrão para tipos de dados numéricos, permitindo aos utilizadores realizar operações como soma, subtração, multiplicação e divisão.

```
int a = 5;
int b = 10;
int result = a + b;

string name = "John";
```

### Instrução de escrita no standard output e leitura de texto a partir do standard input

É permitida a escrita de informações no terminal padrão (standard output) e a leitura de texto do terminal padrão (standard input). Isso possibilita a interação do utilizador com o programa durante a execução.

```
"Hello, world!" <- stdout;
string input = string (stdin "Enter your name: ");
```

### Operadores de conversão entre tipos de dados

O PDRAW oferece operadores de conversão entre tipos de dados, permitindo aos utilizadores converter valores de um tipo para outro. Isso é útil para realizar operações específicas ou manipular dados de forma adequada.

```
int x = int("10");
real y = real("3.14");
string z = string(10);
```

### Instruções para movimentar e rodar canetas

O PDRAW fornece instruções para movimentar e rotacionar canetas, permitindo aos utilizadores desenhar formas complexas e realizar operações de desenho precisas.

```
p1 forward 10;
p1 left 90º;
```

### Instruções para mudar atributos de canetas

Os utilizadores podem alterar os atributos de canetas em tempo de execução, ajustando propriedades como cor, posição e espessura de linha conforme necessário.

```
p1 <- color blue;
p1 <- position (20, 30);
```

### Instrução de pausa

Está também incluída uma instrução de pausa que permite aos utilizadores adicionar atrasos na execução do programa. Isto é útil para controlar o tempo entre operações de desenho.

```
pause 1000000; % pausa por 1 segundo
```

### Verificação semântica do sistema de tipos

A verificação semântica garante a integridade do código verificando a correção dos tipos de dados, a existência de variáveis e a validade das operações. Nesta etapa, erros comuns como declarações duplicadas de variáveis, atribuições de tipos incompatíveis e definições inválidas de propriedades de canetas são identificados e reportados.

**Espessura inválida de caneta:**
```
define pen p1 {
    thickness = "invalid";
};
```
Erro esperado: "Thickness must be an integer."

**Declaração de variável duplicada:**
```
int x = 10;
int x = 20;
```
Erro esperado: "Variable 'x' is already declared."

**Cor inválida de caneta:**
```
define pen PenType1 {
    color = 12345;
};
```
Erro esperado: "Color must be a valid color."

**Espessura de caneta não é um número inteiro:**
```
define pen PenType2 {
    thickness = "thick";
};
```
Erro esperado: "Thickness must be an integer."

**Pressão de caneta não é um número inteiro:**
```
define pen PenType3 {
    pressure = "high";
};
```
Erro esperado: "Pressure must be an integer."

**Ângulo inválido para orientação:**
```
define pen PenType4 {
    orientation = 45;
};
```
Erro esperado: "Orientation must be a valid angle."

**Posição de caneta com valores não inteiros:**
```
define pen PenType5 {
    position = (10.5, 20.3);
};
```
Erro esperado: "Position must be an integer."

**Atribuição de tipo incompatível:**
```
int a = 10;
a = "hello";
```
Erro esperado: "Variable 'a' is of type 'int'."

## Funcionalidades da Linguagem Interpretada

Além dos requisitos mínimos, a versão interpretada do PDRAW inclui as seguintes funcionalidades adicionais:

### Definição de expressões booleanas, instrução condicional e instrução de iteração

Suporta a definição de expressões booleanas, instruções condicionais e instruções de iteração.

```
int i;
for (i = 0; i < 10; i = i + 1) {
    i <- stdout;
}
```

## Características Desejáveis

### Operações sobre canetas como parte integrante de uma expressão

O PDRAW permite que operações sobre canetas, como movimento e rotação, bem como a instrução de pausa, sejam tratadas como parte integrante de uma expressão. Isso permite que múltiplas operações sejam realizadas na mesma instrução, facilitando a criação de desenhos mais complexos de forma mais eficiente.

```
p1 forward 10 pause 1000000 left 90º forward 20;
```

### Definição de expressões booleanas

O PDRAW suporta a definição de expressões booleanas, permitindo a utilização de operadores de ordem e operadores booleanos, como conjunção (and) e disjunção (or). Isso possibilita a criação de condições complexas para controlar o fluxo do programa.

```
bool condition = (x > 0) and (y < 10);
```

### Instruções condicionais e iterativas

São incluídas instruções condicionais e iterativas que permitem executar diferentes blocos de código com base em expressões booleanas. A nossa linguagem tem os loops for e until, que permitem a repetição de blocos de código com base em condições booleanas.

```
int i;
for (i = 0; i < 10; i = i + 1) {
    i <- stdout;
}

bool done = false;
until (done) {
    int length = int(stdin "Enter length: ");
    p1 forward length;
    string t = stdin "Finish (y/n)?: ";
    done = (t == "y") or (t == "Y");
}

```

# Conclusão
O nosso projeto PDRAW atende às necessidades requisitadas. Ajudou-nos a melhorar o nosso trabalho de equipa, assim como, ao longo da sua relização, ajudou-nos a entender melhor a matéria lecionada em Compiladores, mais propriamente Antlr4.
