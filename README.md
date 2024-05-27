# DesafioControleFluxo

## Descrição

Este projeto foi desenvolvido como um exercício para praticar o conteúdo apresentado no módulo de Controle de Fluxo. O objetivo é criar um sistema que receba dois números inteiros via terminal e realize a impressão dos números incrementados, conforme as regras definidas abaixo.

## Funcionalidades

1. **Recebimento de Parâmetros:**
   - O sistema recebe dois números inteiros como parâmetros via terminal.

2. **Incremento e Impressão:**
   - O sistema realiza a impressão dos números incrementados a partir do primeiro número até o segundo número.
   - Exemplo: Se os números fornecidos forem 12 e 30, o sistema imprimirá os números de 12 a 30.

3. **Tratamento de Exceção:**
   - Se o primeiro número for maior que o segundo, o sistema lança uma exceção customizada `ParametrosInvalidosException`.

## Estrutura do Projeto

- `src/main/java/org/example/controledefluxodesafio/Contador.java`: Classe principal que contém a lógica para receber os parâmetros, verificar a validade e imprimir os números incrementados.
- `src/main/java/org/example/controledefluxodesafio/ParametrosInvalidosException.java`: Classe que representa a exceção customizada para tratar casos onde o primeiro número é maior que o segundo.

## Como Executar

1. **Clone o Repositório:**
   ```bash
   git clone https://github.com/seu-usuario/DesafioControleFluxo.git
   cd DesafioControleFluxo
## Autora
Jamile Sales
