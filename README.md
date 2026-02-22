# 📚 BiblioTech - Sistema de Gestão de Biblioteca

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

## 📌 Sobre o Projeto
O **BiblioTech** é um sistema de gerenciamento de biblioteca desenvolvido 100% em Java Puro (Core Java) via linha de comando (CLI). O objetivo do projeto foi construir um CRUD completo na memória e aplicar a persistência de dados em arquivos de texto (`.txt`), simulando o comportamento de um banco de dados real.

## 🚀 Funcionalidades
* **CRUD Completo:** Criação, leitura, atualização (status de empréstimo) e exclusão de livros.
* **Sistema de IDs Inteligente:** Geração automática e sequencial de IDs únicos para cada livro.
* **Persistência de Dados:** O sistema salva e carrega automaticamente o acervo em um arquivo `banco_de_dados.txt`, garantindo que os dados não sejam perdidos ao fechar o programa.
* **Menu Interativo (CLI):** Navegação amigável via console para o usuário final.
* **Blindagem de Erros (QA):** Tratamento de exceções global no Scanner para impedir que o sistema "quebre" caso o usuário digite letras em vez de números.

## 🛠️ Tecnologias e Conceitos Aplicados
* **Java Core**
* **Orientação a Objetos (POO):** Classes, Instâncias, Encapsulamento (Getters/Setters) e Sobrecarga de Construtores.
* **Estruturas de Dados:** Uso de coleções dinâmicas (`ArrayList`).
* **Manipulação de Arquivos (File I/O):** Leitura e escrita de dados utilizando `BufferedReader`, `FileReader`, `BufferedWriter` e `FileWriter`.
* **Tratamento de Exceções:** Uso de blocos `try-catch` para lidar com `IOException` e `InputMismatchException`.
* **Clean Code:** Refatoração de métodos para garantir o Princípio de Responsabilidade Única dentro do possível para esta arquitetura inicial.

## ⚙️ Como Executar
1. Clone este repositório:
   ```bash
   git clone [https://github.com/DaniloDev0/BiblioTech.git](https://github.com/DaniloDev0/BiblioTech.git)
