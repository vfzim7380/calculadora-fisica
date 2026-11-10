# Calculadora de Física

Projeto educacional em Java com 15 fórmulas de cinco áreas da Física. A aplicação funciona pelo terminal: o usuário escolhe uma área, seleciona uma fórmula, informa os valores e recebe o resultado com unidade.

## Fórmulas disponíveis

- **Cinemática:** velocidade média, aceleração média, movimento uniforme, movimento uniformemente variado e equação de Torricelli.
- **Dinâmica:** Segunda Lei de Newton, força peso e força de atrito.
- **Trabalho e Energia:** trabalho de uma força constante, energia cinética e energia potencial gravitacional.
- **Termologia:** calor sensível e calor latente.
- **Eletricidade:** Primeira Lei de Ohm e potência elétrica.

## Requisitos

- JDK 21 (ou outra versão compatível com os recursos básicos utilizados).
- Terminal ou IDE como Eclipse e VS Code.

## Como executar

Na pasta raiz do projeto:

```bash
javac -d out src/main.java src/util/*.java src/formulas/*.java
java -cp out main
```

No Windows PowerShell, os mesmos comandos funcionam. No VS Code, também é possível abrir a pasta do projeto e executar `src/main.java` com a extensão Java.

## Organização

```text
calculadora-fisica/
├── src/
│   ├── main.java
│   ├── formulas/
│   │   ├── cinematica.java
│   │   ├── dinamica.java
│   │   ├── energia.java
│   │   ├── termologia.java
│   │   └── eletricidade.java
│   └── util/
│       ├── Menu.java
│       └── input.java
└── README.md
```

## Observações

- Informe valores usando as unidades solicitadas no terminal.
- Para gravidade terrestre, pode ser utilizado `9.8 m/s²`.
- Na equação de Torricelli, o programa apresenta o módulo da velocidade final.
- O projeto é didático; confira as unidades e os sinais físicos dos valores utilizados.

Desenvolvido para praticar Java, organização em classes e métodos e aplicação de fórmulas de Física.
