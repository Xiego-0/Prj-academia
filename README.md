[README.md](https://github.com/user-attachments/files/31820569/README.md)
# 🏋️ Sistema de Academia

Sistema desktop desenvolvido em **Java com Java Swing**, criado para simular o gerenciamento e atendimento de clientes de uma academia.

O projeto permite realizar o **cadastro e login de clientes**, escolher modalidades de treino, visualizar seus respectivos valores e acessar a área de pagamento. A aplicação também está sendo estruturada para permitir a compra de produtos e utensílios relacionados à academia.

> 🚧 **Status:** Em desenvolvimento

---

## 📌 Sobre o Projeto

O **Sistema de Academia** foi desenvolvido com o objetivo de aplicar, na prática, conceitos fundamentais da programação em **Java** e da construção de interfaces gráficas para aplicações desktop.

A aplicação utiliza múltiplas telas para representar o fluxo de utilização de um sistema de academia, desde o cadastro do cliente até a escolha de um plano ou produto.

### 🎯 Objetivos

* Praticar o desenvolvimento de aplicações desktop em Java.
* Utilizar componentes gráficos do **Java Swing**.
* Trabalhar com eventos e interações do usuário.
* Implementar navegação entre diferentes telas.
* Utilizar estruturas condicionais para definição de valores.
* Organizar um projeto Java em diferentes classes.
* Simular o funcionamento básico de uma academia.

---

## ✨ Funcionalidades

### 👤 Cadastro

A tela de cadastro permite inserir informações básicas do cliente:

* Nome
* CPF
* E-mail
* Telefone
* Senha

Após o preenchimento, os dados podem ser exibidos para confirmação.

---

### 🔐 Login

A aplicação possui uma tela de login utilizando:

* CPF
* Senha

Após realizar o login, o usuário é direcionado para a área principal do sistema.

---

### 🏋️ Modalidades

O sistema possui diferentes modalidades de treino:

| Modalidade          |     Valor |
| ------------------- | --------: |
| 🏋️ Musculação      | R$ 100,00 |
| 🥊 Crossfit         | R$ 150,00 |
| 🤸 Funcional        | R$ 120,00 |
| 👤 Personal Trainer | R$ 200,00 |
| 🏊 Natação          | R$ 130,00 |
| 🧘 Pilates          | R$ 140,00 |
| 💃 Zumba            |  R$ 90,00 |
| 🧘‍♂️ Yoga          | R$ 110,00 |
| 🥊 Boxe             | R$ 150,00 |
| 🥋 Muay Thai        | R$ 160,00 |

O valor é atualizado de acordo com a modalidade selecionada pelo usuário.

---

### 🛒 Produtos e Utensílios

O projeto também possui uma área planejada para a compra de produtos e utensílios relacionados à academia, como:

* Creatina
* Whey Protein
* Barras de proteína
* Armário
* Camiseta
* Garrafa
* Luvas para treino

> 🚧 Essa parte do sistema ainda está em desenvolvimento.

---

### 💳 Pagamento

O projeto possui uma tela destinada ao pagamento dos planos e, posteriormente, dos produtos selecionados.

> 🚧 A implementação completa do processo de pagamento ainda está em desenvolvimento.

---

## 🔄 Fluxo da Aplicação

```text
                    ┌─────────────┐
                    │   Cadastro  │
                    └──────┬──────┘
                           │
                           ▼
                    ┌─────────────┐
                    │    Login    │
                    └──────┬──────┘
                           │
                           ▼
                    ┌─────────────┐
                    │   Opções    │
                    └──────┬──────┘
                           │
              ┌────────────┴────────────┐
              │                         │
              ▼                         ▼
      ┌───────────────┐         ┌───────────────┐
      │ Comprar Plano │         │  Utensílios   │
      └───────┬───────┘         └───────┬───────┘
              │                         │
              ▼                         ▼
      ┌───────────────┐         ┌───────────────┐
      │  Modalidades  │         │   Produtos    │
      └───────┬───────┘         └───────┬───────┘
              │                         │
              └────────────┬────────────┘
                           ▼
                    ┌─────────────┐
                    │  Pagamento  │
                    └─────────────┘
```

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia               | Utilização                             |
| ------------------------ | -------------------------------------- |
| ☕ **Java**               | Linguagem principal do projeto         |
| 🖥️ **Java Swing**       | Criação da interface gráfica           |
| 🪟 **JFrame**            | Estrutura das janelas                  |
| 🏷️ **JLabel**           | Exibição de textos e informações       |
| ⌨️ **JTextField**        | Entrada de dados                       |
| 🔘 **JButton**           | Ações e navegação                      |
| 📋 **JComboBox**         | Seleção de modalidades e produtos      |
| 💬 **JOptionPane**       | Mensagens e confirmações               |
| ⚡ **ActionListener**     | Tratamento de eventos                  |
| λ **Lambda Expressions** | Simplificação do tratamento de eventos |

---

## 📂 Estrutura do Projeto

A estrutura atual do projeto segue uma organização baseada em telas:

prj_academia/
│
├── src/
│   └── prj_academia/
        ├── Aplicacao.java
│       ├── Cadastro.java
        ├── Desenvolvedores.java
│       ├── Login.java
│       ├── Opcao.java
│       ├── Pagamento.java
│       ├── TelaPrincipal.java
│       └── Utensilios.java
│
└── README.md
```

> **Observação:** ajuste os nomes dos arquivos acima caso suas classes tenham nomes diferentes no projeto.

---

## 🚧 Status do Projeto

O projeto está atualmente em **desenvolvimento**.

### ✅ Já implementado

* [x] Tela de cadastro
* [x] Tela de login
* [x] Navegação entre telas
* [x] Seleção de modalidades
* [x] Exibição dos valores
* [x] Área de pagamento
* [x] Tela de Desenvolvedores

### 🔨 Em desenvolvimento

* [ ] Sistema completo de pagamento
* [ ] Compra de produtos
* [ ] Carrinho de compras
* [ ] Validação dos dados
* [ ] Armazenamento dos clientes
* [ ] Integração com banco de dados

---

## 🎓 Objetivo Acadêmico

Este projeto foi desenvolvido como uma forma de praticar conceitos aprendidos durante o curso de **Análise e Desenvolvimento de Sistemas**, principalmente relacionados à programação Java e desenvolvimento de aplicações desktop.

---

## 👨‍💻 Autores
**Diego do Amaral**
**Jefferson Freitas**
**Leonardo Gaiguer**
**Miguel Angelo**


Estudante de **Análise e Desenvolvimento de Sistemas**.

---

⭐ **Projeto desenvolvido para fins acadêmicos e de aprendizado.**
