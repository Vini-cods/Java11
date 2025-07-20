# Calculadora Java

Uma calculadora implementada em Java com interface de linha de comando (CLI) que realiza operações matemáticas básicas através de um menu interativo.

## 📋 Funcionalidades

- **Interface de linha de comando**: Menu interativo via terminal/console
- **Soma**: Adição de números decimais
- **Subtração**: Subtração de números decimais
- **Multiplicação**: Multiplicação de números decimais
- **Divisão**: Divisão de números decimais com proteção contra divisão por zero
- **Resto da divisão (Módulo)**: Calcula o resto da divisão entre dois números
- **Menu numerado**: Sistema de opções numeradas para facilitar a navegação
- **Tratamento de erros**: Validação para divisão por zero e opções inválidas

## 🚀 Como usar

### Pré-requisitos

- Java JDK 8 ou superior instalado
- Terminal/Prompt de comando

### Compilação

```bash
javac Calculadora.java
```

### Execução

```bash
java Calculadora
```

Após executar, um menu interativo será exibido no terminal.

## 📁 Estrutura do projeto

```
projeto/
├── Calculadora.java   # Classe principal com todas as funcionalidades
└── README.md          # Este arquivo
```

## 🔧 Estrutura da Classe

### `Calculadora`

Classe principal que implementa todos os métodos matemáticos e a interface de usuário via console.

#### Métodos matemáticos:

- `somar(double a, double b)`: Retorna a soma de dois números
- `subtrair(double a, double b)`: Retorna a subtração de dois números
- `multiplicar(double a, double b)`: Retorna a multiplicação de dois números
- `dividir(double a, double b)`: Retorna a divisão de dois números (com validação)
- `restoDivisao(double a, double b)`: Retorna o resto da divisão (operador módulo)

#### Método de interface:

- `exibirMenu()`: Exibe o menu interativo e processa as escolhas do usuário
- `main(String[] args)`: Método principal que inicia a aplicação

## 💡 Como usar a interface

### Menu principal:
```
===CALCULADORA===
1 - Somar
2 - Subtrair
3 - Divisão
4 - Multiplicação
5 - Resto da divisão
Escolha uma opção
```

### Sequência de uso:
1. **Execute o programa** para ver o menu
2. **Digite o número** da operação desejada (1-5)
3. **Pressione Enter**
4. **Digite o primeiro número** quando solicitado
5. **Digite o segundo número** quando solicitado
6. **Veja o resultado** exibido na tela

### Exemplo de execução:
```
===CALCULADORA===
1 - Somar
2 - Subtrair
3 - Divisão
4 - Multiplicação
5 - Resto da divisão
Escolha uma opção
1
Digite o primeiro número
15.5
Digite o segundo número
4.5
Resultado: 20.0
```

## ⚠️ Tratamento de erros

- **Divisão por zero**: Exibe "Erro: Divisão por zero!" e retorna 0
- **Opção inválida**: Mostra "Opção inválida!!" quando escolhida uma opção fora do range 1-5
- **Entrada de dados**: Utiliza Scanner para capturar entrada do usuário de forma segura

## 🖥️ Características da interface

- **Menu estruturado**: Layout limpo com separadores visuais
- **Entrada sequencial**: Solicita dados passo a passo
- **Feedback imediato**: Exibe resultados instantaneamente
- **Validação**: Verifica condições de erro antes de calcular
- **Suporte a decimais**: Aceita números com casas decimais

## 📝 Notas técnicas

- Utiliza **Scanner** para entrada de dados via console
- Trabalha exclusivamente com números decimais (`double`) para maior precisão
- Implementa **switch-case** para processamento das opções do menu
- **Método main** integrado na própria classe Calculadora
- Gerenciamento adequado de recursos com `scanner.close()`
- Validação condicional para evitar divisão por zero


## 🔄 Fluxo de execução

1. Programa inicia → `main()` é chamado
2. Instância da `Calculadora` é criada
3. `exibirMenu()` é executado
4. Menu é exibido no console
5. Usuário escolhe uma opção (1-5)
6. Programa solicita os dois números
7. Operação correspondente é executada
8. Resultado é exibido
9. Scanner é fechado e programa termina
