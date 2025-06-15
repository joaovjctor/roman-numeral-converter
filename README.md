# 🏛️ Roman Numerals em Java usando TDD

Este repositório apresenta uma implementação do desafio **Roman Numerals Kata**, desenvolvido em **Java** com testes escritos em **JUnit 5**, utilizando a metodologia de **TDD (Test-Driven Development)**.

---

## 📌 Descrição do Desafio

O objetivo do Roman Numerals Kata é construir uma função que converta um número inteiro (de 1 a 3999) para sua representação em números romanos.

### ✅ Regras Implementadas

| Decimal | Romano  |
|--------:|---------|
| 1       | I       |
| 4       | IV      |
| 9       | IX      |
| 40      | XL      |
| 90      | XC      |
| 400     | CD      |
| 900     | CM      |
| 3999    | MMMCMXCIX |

> A conversão deve seguir a notação romana clássica e validar apenas números entre **1 e 3999**.

---

## 💡 Conceitos Aplicados

- **TDD (Test-Driven Development)**: cada nova regra foi desenvolvida a partir de testes escritos antes da implementação.
- **Design Incremental**: implementação orientada a pequenos passos com testes de regressão.
- **Validação de Entrada**: lançando exceções para valores inválidos (ex: negativos ou acima de 3999).
- **Estrutura enxuta e eficiente**: uso de arrays ordenados para mapear pares decimal-romano.

---

## 🧪 Como Rodar os Testes

### 1. ✅ Pré-requisitos

- **Java 11+**
- **JUnit 5**
- **Maven** ou qualquer sistema de build compatível
- IDE como IntelliJ IDEA, Eclipse ou VS Code

### 2. ▶️ Executando os testes
Usando IDE, com o botão direito na classe RomanNumeralConverterTest > "Run Tests".

### 3. 🧪 Testes Criados
- testConvertOne() – converte 1 para "I".
- testConvertFour() – converte 4 para "IV".
- testConvertNine() – converte 9 para "IX".
- testConvertFifty() – converte 50 para "L".
- testConvertNinetyFour() – converte 94 para "XCIV".
- testConvertFourHundredFortyFour() – converte 444 para "CDXLIV".
- testConvertMaxValue() – converte 3999 para "MMMCMXCIX".
- testConvertZeroThrowsException() – lança exceção para 0.
- testConvertNegativeThrowsException() – lança exceção para números negativos.
- testConvertAbove3999ThrowsException() – lança exceção para números maiores que 3999.

---
Desenvolvido por João Victor, como parte do estágio supervisionado do programa LabTech – UDF

